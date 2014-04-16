package nl.han.mad.rascal.rascal_android_example_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by rubenernst on 16-04-14.
 */
public class ThirdActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        String test = intent.getStringExtra("name");
    }
}
