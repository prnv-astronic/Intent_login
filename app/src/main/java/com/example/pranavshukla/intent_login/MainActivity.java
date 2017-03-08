package com.example.pranavshukla.intent_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // create and register edit text items
        final EditText user_name = (EditText)findViewById(R.id.editText);
        final EditText passphrase = (EditText)findViewById(R.id.editText2);
        // create and register button
        Button login_command =(Button)findViewById(R.id.button);
        // set on click listner for button



        login_command.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on click button , get entered data from edittext field
                user=user_name.getText().toString();
                pass=passphrase.getText().toString();
               // Toast.makeText(getApplicationContext(),user,Toast.LENGTH_SHORT).show();

                if(user.equals("prnv.shukla@gmail.com"))// check if user name maches
                {
                   if ((pass.equals("1234")))// check if passkey matches
                    {
                       // if both field matches, go for activity

                        //create data bundle

                        Bundle data_bundle =new Bundle();
                        // put string data to bundle
                        data_bundle.putString("BundleUserNAme","Pranav Shukla");
                        data_bundle.putString("Welcome_msg",user+" Welcom");

                        // create intent
                        Intent open_result_avtivity = new Intent(getApplicationContext(),result_page.class);
                        // pass data bundle
                        open_result_avtivity.putExtras(data_bundle);
                        // start activity
                        startActivity(open_result_avtivity);
                    }
                    else    // passkey invalid
                    {
                        Toast.makeText(getApplicationContext(),"Invalid Password",Toast.LENGTH_SHORT).show();
                    }
                }
                else // username invalid make toast
                {
                        Toast.makeText(getApplicationContext(),"Invalid Username",Toast.LENGTH_SHORT).show();
                }




            }
        });

    }
}
