package hr.android.prvi;


import hr.android.prvi.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import hr.android.ShowableActivity;

public class LinearLayoutUgnjezdjeni extends Activity implements ShowableActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_linear_layout_ugnjezdjeni);
	}

	@Override
	public String getDisplayName() {
		return "LinearLayoutUgnjezdjeni" ;
	}

	@Override
	public String getDescription() {
		return "Layout";
	}
}
