package hr.android.prvi;



import hr.android.prvi.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import hr.android.ShowableActivity;

public class TextView extends Activity implements ShowableActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text_view);
	}

	@Override
	public String getDisplayName() {
		return "TextView" ;
	}

	@Override
	public String getDescription() {
		return "Widgets";
	}
}
