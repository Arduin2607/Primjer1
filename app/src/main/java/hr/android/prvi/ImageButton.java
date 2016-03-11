package hr.android.prvi;


import hr.android.prvi.R;
import android.os.Bundle;
import android.app.Activity;

import hr.android.ShowableActivity;


public class ImageButton extends Activity implements ShowableActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image_button);
	}

	@Override
	public String getDisplayName() {
		return "ImageButton" ;
	}

	@Override
	public String getDescription() {
		return "Widgets";
	}
}
