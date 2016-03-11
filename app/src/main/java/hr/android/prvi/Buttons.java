package hr.android.prvi;

import hr.android.ShowableActivity;

import hr.android.prvi.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Buttons extends Activity implements ShowableActivity {

    Button btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        btnTest = (Button) findViewById(R.id.gumbic);

    }




    public void klikMetoda(View v) {
        Toast.makeText(this, "Kliknuo si me!", Toast.LENGTH_SHORT).show();
        btnTest.setText("Neki drugi tekst");
    }

    @Override
    public String getDisplayName() {
        return "Buttons";
    }

    @Override
    public String getDescription() {
        return "Widgets";
    }
}
