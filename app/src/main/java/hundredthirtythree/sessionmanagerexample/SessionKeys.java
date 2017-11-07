package hundredthirtythree.sessionmanagerexample;

/**
 * Created by chingizh on 11/7/17.
 */

public enum SessionKeys {

    PREFS_NAME("test"),
    TEST("test");

    private String key;

    SessionKeys(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}