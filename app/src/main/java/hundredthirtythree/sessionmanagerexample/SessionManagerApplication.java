package hundredthirtythree.sessionmanagerexample;

import android.app.Application;

import hundredthirtythree.sessionmanager.SessionManager;

/**
 * Created by chingizh on 7/20/17.
 */

public class SessionManagerApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        new SessionManager(getApplicationContext());
    }

}
