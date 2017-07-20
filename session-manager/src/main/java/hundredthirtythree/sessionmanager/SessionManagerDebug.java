package hundredthirtythree.sessionmanager;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/**
 * Created by chingizh on 7/20/17.
 */

public class SessionManagerDebug {

    private SharedPreferences pref;

    private SharedPreferences.Editor editor;

    private static final String INIT = "init";

    public SessionManagerDebug(Context context){
        int PRIVATE_MODE = 0;
        pref = context.getSharedPreferences(INIT, PRIVATE_MODE);
    }

    public void putString(final String key, final String newValue) {
        editor = pref.edit();
        editor.putString(key, newValue);
        editor.apply();
    }

    public String getString(final String key,  final String defValue) {
        return pref.getString(key, defValue);
    }

    public void putInt(final String key, final int newValue) {
        editor = pref.edit();
        editor.putInt(key, newValue);
        editor.apply();
    }

    public int getInt(final String key, final int defValue) {
        return pref.getInt(key, defValue);
    }

    public void putFloat(final String key, final float newValue) {
        editor = pref.edit();
        editor.putFloat(key, newValue);
        editor.apply();
    }

    public void putLong(final String key, final long newValue) {
        editor = pref.edit();
        editor.putLong(key, newValue);
        editor.apply();
    }

    public long getLong(final String key, final long defValue) {
        return pref.getLong(key, defValue);
    }

    public float getFloat(final String key, final float defValue) {
        return pref.getFloat(key, defValue);
    }

    public void putBoolean(final String key, final Boolean newValue) {
        editor = pref.edit();
        editor.putBoolean(key, newValue);
        editor.apply();
    }

    public boolean getBoolean(final String key, final Boolean defValue) {
        return pref.getBoolean(key, defValue);
    }

    public void putStringSet(final String key, final Set<String> newValue) {
        editor = pref.edit();
        editor.putStringSet(key, newValue);
        editor.apply();
    }

    public Set<String> getStringSet(final String key, final Set<String> defValue) {
        return pref.getStringSet(key, defValue);
    }

}
