package com.jeff.john.proteintracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class FragmentLayoutDaily extends Activity {

    Button entryBtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_list_daily);

        entryBtn = (Button) findViewById(R.id.addnewdaily);
        entryBtn.setOnClickListener(enterListener);
    }

    View.OnClickListener enterListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            Intent i = new Intent(FragmentLayoutDaily.this, FragmentLayoutEntry.class);
            startActivity(i);
        }
    };
}
