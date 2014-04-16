package nl.han.mad.rascal.rascal_android_example_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by rubenernst on 16-04-14.
 */
public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String zipcode = "1111 AA";
        String city = "Arnhem";

        Intent intent; //@@Intent ThirdActivity [zipcode, city]
    }
}
