package hr.android.prvi;



import hr.android.prvi.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import hr.android.ShowableActivity;

public class RelativeLayout extends Activity implements ShowableActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_relative_layout);
	}

	@Override
	public String getDisplayName() {
		return "RelativeLayout" ;
	}

	@Override
	public String getDescription() {
		return "Layout";
	}
}
