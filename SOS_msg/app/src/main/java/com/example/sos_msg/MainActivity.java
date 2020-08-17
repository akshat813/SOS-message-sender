package com.example.sos_msg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    SmsManager smsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.send_id);
        smsManager=SmsManager.getDefault();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=1;i<=5;i++) {
                    smsManager.sendTextMessage("+918077099542", null, "This is Text Message", null, null);
                }
            }
        });
    }
}
