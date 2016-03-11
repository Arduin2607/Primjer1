package hr.android.prvi;



import hr.android.prvi.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import hr.android.ShowableActivity;

public class LinearLayoutVertOrient extends Activity implements ShowableActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_linear_layout_vert_orient);
	}

	@Override
	public String getDisplayName() {
		return "LinearLayoutVertOrient" ;
	}

	@Override
	public String getDescription() {
		return "Layout";
	}
}
