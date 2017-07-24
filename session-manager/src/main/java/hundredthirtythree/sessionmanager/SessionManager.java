package hundredthirtythree.sessionmanager;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/**
 * Created by chingizh on 7/20/17.
 */

public class SessionManager {

    private static SharedPreferences pref;

    private static SharedPreferences.Editor editor;

    private static final String INIT = "init";

    public SessionManager(Context context){
        int PRIVATE_MODE = 0;
        pref = context.getSharedPreferences(INIT, PRIVATE_MODE);
    }

    public static void putString(final String key, final String newValue) {
        editor = pref.edit();
        editor.putString(key, newValue);
        editor.apply();
    }

    public static String getString(final String key,  final String defValue) {
        return pref.getString(key, defValue);
    }

    public static void putInt(final String key, final int newValue) {
        editor = pref.edit();
        editor.putInt(key, newValue);
        editor.apply();
    }

    public static int getInt(final String key, final int defValue) {
        return pref.getInt(key, defValue);
    }

    public static void putFloat(final String key, final float newValue) {
        editor = pref.edit();
        editor.putFloat(key, newValue);
        editor.apply();
    }

    public static void putLong(final String key, final long newValue) {
        editor = pref.edit();
        editor.putLong(key, newValue);
        editor.apply();
    }

    public static long getLong(final String key, final long defValue) {
        return pref.getLong(key, defValue);
    }

    public static float getFloat(final String key, final float defValue) {
        return pref.getFloat(key, defValue);
    }

    public static void putBoolean(final String key, final Boolean newValue) {
        editor = pref.edit();
        editor.putBoolean(key, newValue);
        editor.apply();
    }

    public static boolean getBoolean(final String key, final Boolean defValue) {
        return pref.getBoolean(key, defValue);
    }

    public static void putStringSet(final String key, final Set<String> newValue) {
        editor = pref.edit();
        editor.putStringSet(key, newValue);
        editor.apply();
    }

    public static Set<String> getStringSet(final String key, final Set<String> defValue) {
        return pref.getStringSet(key, defValue);
    }

    public static void removeKey(final String key) {
        editor = pref.edit();
        editor.remove(key);
        editor.apply();
    }

}
