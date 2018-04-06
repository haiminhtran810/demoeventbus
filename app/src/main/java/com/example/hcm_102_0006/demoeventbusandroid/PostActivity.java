package com.example.hcm_102_0006.demoeventbusandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import org.greenrobot.eventbus.EventBus;

public class PostActivity extends AppCompatActivity {
    private Button mSend;
    private EditText mValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        mSend = findViewById(R.id.btnSend);
        mValues = findViewById(R.id.txtPassValues);
        mSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(mValues.getText().toString().trim())) {
                    EventBus.getDefault()
                            .post(new CustomEvent(
                                    new CustomItem(mValues.getText().toString().trim())));
                    finish();
                } else {
                    Toast.makeText(PostActivity.this, "Please enter values", Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });
    }
}
