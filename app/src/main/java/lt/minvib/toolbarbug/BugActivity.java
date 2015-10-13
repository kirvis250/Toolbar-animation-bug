package lt.minvib.toolbarbug;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.CheckBox;
import android.widget.CompoundButton;

/**
 * Created by minda on 2015-10-13.
 */
public class BugActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bug);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        CheckBox toggle = (CheckBox) findViewById(R.id.toggleBack);

        setSupportActionBar(toolbar);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(getSupportActionBar() != null) {
                    if(isChecked) {
                        getSupportActionBar().
                                setDisplayHomeAsUpEnabled(true);
                    } else {
                        getSupportActionBar().
                                setDisplayHomeAsUpEnabled(false);
                    }
                }

            }
        });

    }
}
