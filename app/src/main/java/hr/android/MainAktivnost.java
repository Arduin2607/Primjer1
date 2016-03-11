package hr.android;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

/**
 * Glavna aktivnost koja sadr�i listu aktivnosti koje implementiraju ShowableActivity.
 *
 * @author Tin
 *
 */
public class MainAktivnost extends ListActivity {

	List<Class<?>> classes;
	
	@Override
	protected void onCreate( Bundle savedInstanceState ) {
		super.onCreate(savedInstanceState);

		setListAdapter(new SimpleAdapter(this, getData(),
				android.R.layout.two_line_list_item, new String[] { "name","description" },
				new int[] {android.R.id.text1, android.R.id.text2}));
		getListView().setTextFilterEnabled(true);		
	}

	protected List<HashMap<String, String>> getData() {
		classes = DexClassLoader.getClasses(getPackageResourcePath(), this.getPackageName(), ShowableActivity.class);
		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> item;
		for (int i = 0; i < classes.size(); i++) {
			try {
				item = new HashMap<String, String>();

				Object object = classes.get(i).getConstructor().newInstance();
				item.put("name", ((ShowableActivity)object).getDisplayName() );
				item.put("description", "   " + ((ShowableActivity)object).getDescription() );

				list.add(item);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

    @Override
    protected void onListItemClick( ListView listView, View view, int position, long id ) {
    	startActivity(new Intent(getApplicationContext(), classes.get(position)));
    }

	

}
