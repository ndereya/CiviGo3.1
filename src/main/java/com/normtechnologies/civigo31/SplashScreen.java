package com.normtechnologies.civigo31;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.renderscript.Int2;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Capt.Ndereya on 13/02/2019.
 */

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

//       Handler handler= new Handler().postDelayed(new Runnable() {
//           @Override
//           public void run() {
//               Intent intent = new Intent(SplashScreen.this,LoginActivity.class);
//               startActivity(intent);
//           }
//       },);


    }
}
