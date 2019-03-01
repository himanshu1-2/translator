package com.example.himanshu.t;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText str;
TextView txt;
Button btn,btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        str=findViewById(R.id.str);
        btn=findViewById(R.id.btn);
        btn1=findViewById(R.id.btn1);
        txt=findViewById(R.id.txt);

        String  strl= str.getText().toString();
        final String send="Ur text"+strl;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,send);
                startActivity(intent);


                /* try {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_SEND);
                    intent.putExtra(Intent.EXTRA_TEXT,send);
                    intent.putExtra("key_text_input","hello");
                    //intent.putExtra("key_text_output", "");
                    //intent.putExtra("key_language_from", "en");
                    //intent.putExtra("key_language_to", "mal");
                    //intent.putExtra("key_suggest_translation", "");
                    //intent.putExtra("key_from_floating_window", false);
                    intent.setComponent(new ComponentName(
                            "com.google.android.apps.translate",
                            //Change is here
                            //"com.google.android.apps.translate.HomeActivity"));
                            "com.google.android.apps.translate.TranslateActivity"));
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    // TODO Auto-generated catch block
                    Toast.makeText(getApplication(), "Sorry, No Google Translation Installed",
                            Toast.LENGTH_SHORT).show();
                }*/


            }
        });

btn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,send);
        startActivity(intent);


    }
});

    }
}
