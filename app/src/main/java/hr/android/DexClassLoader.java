package hr.android;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import dalvik.system.DexFile;

/**
 * Klasa za izvlacenje klasa iz .dex datoteke
 * 
 * @author Tin
 * 
 */
public final class DexClassLoader {

	public static Logger logger = Logger.getLogger("DexClassLoader");

	/**
	 * Vraća listu klasa
	 * 
	 */
	public static List<Class<?>> getClasses(String apkPath, String packageName,
			Class<?> implementedInterface) {
		List<Class<?>> classList = new ArrayList<Class<?>>();
		try {
			DexFile dexFile = new DexFile(new File(apkPath));

			logger.info("Dohvacena dex datoteka unutar apk-a na: " + apkPath);

			ArrayList<String> entriesList = Collections.list(dexFile.entries());

			for (String className : entriesList) {
				if (className.startsWith(packageName)) {
					
					Class<?> clazz = Class.forName(className);

					for (Class<?> class1 : clazz.getInterfaces()) {
						if (class1.getName().equals(implementedInterface.getName())) {
							logger.info("Dohvacena aktivnost: " + className);
							classList.add(clazz);
						}
					}
				}
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Puklo je dohvacanje klasa", e);
		} 
		return classList;
	}

}
