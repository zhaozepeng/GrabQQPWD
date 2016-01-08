package com.android.grabqqpwd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Description: #TODO
 *
 * @author zzp(zhao_zepeng@hotmail.com)
 * @since 2016-01-07
 */
public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopService(new Intent(this, BackgroundDetectService.class));
    }

    public void onclick(View v){
        Intent intent = new Intent(this, BackgroundDetectService.class);
        startService(intent);
    }
}
