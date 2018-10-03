package hundredthirtythree.sessionmanager

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by chingizh on 7/20/17.
 */

object SessionManager {

    private var pref: SharedPreferences? = null

    private var editor: SharedPreferences.Editor? = null

    val all: Map<String, *>
        get() = pref!!.all

    private fun initPrefs(context: Context, prefsName: String) {
        pref = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE)
    }

    fun putString(key: String, newValue: String) {
        editor = pref!!.edit()
        editor!!.putString(key, newValue)
        editor!!.apply()
    }

    fun getString(key: String, defValue: String): String? {
        return pref!!.getString(key, defValue)
    }

    fun putInt(key: String, newValue: Int) {
        editor = pref!!.edit()
        editor!!.putInt(key, newValue)
        editor!!.apply()
    }

    fun getInt(key: String, defValue: Int): Int {
        return pref!!.getInt(key, defValue)
    }

    fun putFloat(key: String, newValue: Float) {
        editor = pref!!.edit()
        editor!!.putFloat(key, newValue)
        editor!!.apply()
    }

    fun putLong(key: String, newValue: Long) {
        editor = pref!!.edit()
        editor!!.putLong(key, newValue)
        editor!!.apply()
    }

    fun getLong(key: String, defValue: Long): Long {
        return pref!!.getLong(key, defValue)
    }

    fun getFloat(key: String, defValue: Float): Float {
        return pref!!.getFloat(key, defValue)
    }

    fun putBoolean(key: String, newValue: Boolean?) {
        editor = pref!!.edit()
        editor!!.putBoolean(key, newValue!!)
        editor!!.apply()
    }

    fun getBoolean(key: String, defValue: Boolean?): Boolean {
        return pref!!.getBoolean(key, defValue!!)
    }

    fun putStringSet(key: String, newValue: Set<String>) {
        editor = pref!!.edit()
        editor!!.putStringSet(key, newValue)
        editor!!.apply()
    }

    fun getStringSet(key: String, defValue: Set<String>): Set<String>? {
        return pref!!.getStringSet(key, defValue)
    }

    fun containsPreference(key: String): Boolean {
        return pref!!.contains(key)
    }

    fun removeKey(key: String) {
        editor = pref!!.edit()
        editor!!.remove(key)
        editor!!.apply()
    }

    class Builder {

        private var context: Context? = null
        private var prefsName: String? = null

        fun setContext(context: Context): Builder {
            this.context = context
            return this
        }

        fun setPrefsName(prefsName: String): Builder {
            this.prefsName = prefsName
            return this
        }

        fun build() {
            if (context == null) {
                throw RuntimeException("Context not set, please set context on your Application class before using it.")
            }

            if (prefsName!!.isEmpty()) {
                prefsName = context!!.packageName
            }

            SessionManager.initPrefs(context!!, this.prefsName!!)
        }

    }
}
