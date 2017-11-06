package hundredthirtythree.sessionmanagerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import hundredthirtythree.sessionmanager.SessionManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView helloWorld = (TextView) findViewById(R.id.helloWorld);

        SessionManager.putString(SessionKeys.TEST.getKey(), "I'm SessionManager");

        helloWorld.setText(SessionManager.getString(SessionKeys.TEST.getKey(), "1"));

        Log.d("MainActivity ", "onCreate: "+ SessionManager.getString(SessionKeys.TEST.getKey(), "1"));
    }

}
