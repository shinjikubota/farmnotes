package com.example.shinji_kubota.farmnotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by shinji_kubota on 2017/10/26.
 */

public class searchp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchp);
    }


    public void tsugi(View v) {

        Intent intent = new Intent(getApplication(), searchg.class);
        startActivity(intent);

    }

}
