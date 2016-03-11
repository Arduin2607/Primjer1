package hr.android.prvi;



import hr.android.prvi.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import hr.android.ShowableActivity;

public class EditText extends Activity implements ShowableActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_text);
	}


	@Override
	public String getDisplayName() {
		return "EditText" ;
	}

	@Override
	public String getDescription() {
		return "Widgets";
	}

}
