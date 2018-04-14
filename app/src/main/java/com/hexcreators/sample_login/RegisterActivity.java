package com.hexcreators.sample_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private EditText et_user_name;
    private EditText et_password;
    private Button btn_register;
    private AppHelper appHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        appHelper   =   AppHelper.getInstance();

        et_user_name = findViewById(R.id.et_user_name);
        et_password = findViewById(R.id.et_password);
        btn_register = findViewById(R.id.btn_register);


        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s_name = et_user_name.getText().toString().trim();
                String s_pass = et_password.getText().toString().trim();
                if (s_name.length() > 0 && s_pass.length() > 0) {
                    Toast.makeText(RegisterActivity.this, "Saved in AppHelper", Toast.LENGTH_SHORT).show();
                    appHelper.setUserName(s_name);
                    appHelper.setPassword(s_pass);
                }else {
                    Toast.makeText(RegisterActivity.this, "Please Enter All Details", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
