package com.example.shinji_kubota.farmnotes;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void search(View v) {

        Intent intent = new Intent(getApplication(), searchp.class);
        startActivity(intent);

    }



    public void now(View v) {

        Intent intent = new Intent(getApplication(), now.class);
        startActivity(intent);

    }



    public void prof(View v) {

        Intent intent = new Intent(getApplication(), prof.class);
        startActivity(intent);

    }


    //アプリの終了
    public void tofin(View v) {


        Toast toast = Toast.makeText(this, "-----アプリを終了します。-----", Toast.LENGTH_SHORT);
        toast.show();


        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {



                //System.exit(0);
                moveTaskToBack(true);
                finish();
                //android.os.Process.killProcess(android.os.Process.myPid());
//                ActivityManager activityManager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
//                activityManager.restartPackage(getPackageName());


            }
        }, 3000);



    }



}
