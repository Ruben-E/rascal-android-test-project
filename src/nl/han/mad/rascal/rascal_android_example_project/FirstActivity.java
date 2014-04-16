package nl.han.mad.rascal.rascal_android_example_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class FirstActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        String name = "Test";
        String address = "Test 11";

        Intent intent; //@@Intent ThirdActivity [name, address]
    }
}
