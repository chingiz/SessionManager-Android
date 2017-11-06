# SessionManager-Android [![](https://jitpack.io/v/Chingiz/SessionManager-Android.svg)](https://jitpack.io/#Chingiz/SessionManager-Android)
Small Shared Preference Library for Android

# Download

You can download a source code from Github's [releases page](https://github.com/Chingiz/SessionManager-Android/releases/tag/1.1).

Or use Gradle

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
Step 2. Add the dependency

	dependencies {
	        compile 'com.github.Chingiz:SessionManager-Android:1.1'
	}
	
# How do I use SessionManager?
Before using SessionManager initialize the SessionManager on your Application class.

```
public class SessionManagerApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new SessionManager.Builder()
                        .setContext(getApplicationContext())
                        .setPrefsName("test")
                        .build();
    }
}
```

Step 2:

```
public enum SessionKeys {

    TEST("test");

    private String key;

    SessionKeys(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
```

Step 3:

```
@Override
protected void onCreate(Bundle savedInstanceState) {
	...
	SessionManager.putString("test", "I'm SessionManager");  
	Log.d("Main ", "onCreate: "+SessionManager.getString("test", "1"));
}
```
# License

MIT licensed, (c) [@hchingiz](http://twitter.com/hchingiz) 

