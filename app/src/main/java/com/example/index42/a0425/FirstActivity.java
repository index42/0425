package com.example.index42.a0425;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        /*Intent intent=getIntent();
        String data=intent.getStringExtra("d1036");
        Log.d("FirstActivity",data);*/
        Button button1 =(Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data="我tr息.";
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("d1027",data);
                startActivityForResult(intent,1);
            }
        });
        Button button11=(Button)findViewById(R.id.button_11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*String p="123";
                String m="miamia";
                Uri smstoUri=Uri.parse("smsto:");*/
                Intent intent1=new Intent(Intent.ACTION_VIEW);
                /*intent.putExtra("address",p);
                intent.putExtra("sms_body",m);*/
                intent1.setType("vnd.android-dir/mms-sms");
                startActivity(intent1);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("FirstActivity", returnedData);
                }
                break;
            default:
        }
    }


}