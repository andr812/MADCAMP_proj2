package com.example.user.main2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        try{
            Thread.sleep(4000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(this,Main.class));
        finish();
    }
}
