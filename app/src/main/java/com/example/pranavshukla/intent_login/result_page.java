package com.example.pranavshukla.intent_login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Pranav Shukla on 2/28/2017.
 */

public class result_page extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_layout);
        TextView my_msg=(TextView)findViewById(R.id.textView3);
        Intent result = getIntent();
        String User_detail = result.getExtras().getString("BundleUserNAme");
        String welcome_msg = result.getExtras().getString("Welcome_msg");
        my_msg.setText(welcome_msg+User_detail);
        Toast.makeText(getApplicationContext(),welcome_msg, Toast.LENGTH_SHORT).show();
    }
}
