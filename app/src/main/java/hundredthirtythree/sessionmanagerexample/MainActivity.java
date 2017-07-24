package hundredthirtythree.sessionmanagerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import hundredthirtythree.sessionmanager.SessionManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SessionManager.putString("test", "I'm SessionManager");
        Log.d("MainActivity ", "onCreate: "+ SessionManager.getString("test", "1"));
    }
}
