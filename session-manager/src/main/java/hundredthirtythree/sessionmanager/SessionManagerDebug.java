package hundredthirtythree.sessionmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by chingizh on 7/20/17.
 */

public class SessionManagerDebug {

    private SharedPreferences pref;

    SharedPreferences.Editor editor;

    private static final String INIT = "init";

    public SessionManagerDebug(Context context){
        int PRIVATE_MODE = 0;
        pref = context.getSharedPreferences(INIT, PRIVATE_MODE);
    }

    public void setString(final String key, final String newValue) {
        editor = pref.edit();
        editor.putString(key, newValue);
        editor.apply();
    }

    public String getString(final String key,  final String defValue) {
        return pref.getString(key, defValue);
    }

}
