package com.hexcreators.sample_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText et_user_name;
    private EditText et_password;
    private Button btn_register;
    private Button btn_login;
    private AppHelper appHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        appHelper = AppHelper.getInstance();

        et_user_name = findViewById(R.id.et_user_name);
        et_password = findViewById(R.id.et_password);
        btn_register = findViewById(R.id.btn_register);
        btn_login = findViewById(R.id.btn_login);


        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  openRegisterPage    =   new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(openRegisterPage);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s_name = et_user_name.getText().toString();
                String s_pass = et_password.getText().toString();
                if (s_name.length() > 0 && s_pass.length() > 0) {
                    if (!s_name.equals(appHelper.getUserName())) {
                        et_user_name.setError("Invalid User Name");
                    } else if (!s_pass.equals(appHelper.getPassword())) {
                        et_password.setError("Invalid Password");
                    }else {
                        Toast.makeText(LoginActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(LoginActivity.this, "Please Enter All Details", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
