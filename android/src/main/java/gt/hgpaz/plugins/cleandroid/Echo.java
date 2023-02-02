package gt.hgpaz.plugins.cleandroid;

import android.util.Log;

public class Echo {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
