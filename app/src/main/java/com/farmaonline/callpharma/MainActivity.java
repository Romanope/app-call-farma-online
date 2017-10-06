package com.farmaonline.callpharma;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    static final String OPEN_APP = "com.farmaonline.farmas.OPEN_APP";

    private Button mBtnOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnOpen = (Button) findViewById(R.id.btn_send_intent);
        addEventSendIntent();
    }

    private void addEventSendIntent() {
        mBtnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.farmaonline.farmas", "com.farmaonline.farmas.view.AddUserActivity"));
                startActivity(intent);

            }
        });
    }
}
