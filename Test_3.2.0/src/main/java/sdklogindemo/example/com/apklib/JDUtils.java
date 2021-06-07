package sdklogindemo.example.com.apklib;

import android.app.Application;

import com.kepler.jd.Listener.AsyncInitListener;
import com.kepler.jd.login.KeplerApiManager;

public class JDUtils {

    public static void asyncInitSdk(Application application, String appKey, String secret, AsyncInitListener var3) {
        KeplerApiManager.asyncInitSdk(application, appKey, secret, var3);
    }
}
