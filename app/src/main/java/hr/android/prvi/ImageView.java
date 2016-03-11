package hr.android.prvi;




import android.app.Activity;
import hr.android.prvi.R;
import android.os.Bundle;

import hr.android.ShowableActivity;

public class ImageView extends Activity implements ShowableActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
    }
	@Override
	public String getDisplayName() {
		return "ImageView" ;
	}

	@Override
	public String getDescription() {
		return "Widgets";
	}
}
