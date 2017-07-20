package hundredthirtythree.sessionmanagerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import hundredthirtythree.sessionmanager.SessionManagerDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SessionManagerDebug sessionManagerDebug = new SessionManagerDebug(getApplicationContext());
    }
}
