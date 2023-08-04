package com.hq.loginscreenpolarbear;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.material.textfield.TextInputEditText;

/**
 * @author Haider Qadir
 **/
public class LoginScreenV2 extends AppCompatActivity {
    ImageView imageView;
    TextInputEditText email;
    TextInputEditText password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen_v2);

        imageView = findViewById(R.id.imageView);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.loginButton);

        Integer url = R.drawable.email;
        Glide.with(this).load(url).into(imageView);

        email.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                Integer url = R.drawable.email;
                Glide.with(getApplicationContext()).load(url)
                        .into(imageView);
            }
        });

        password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                Integer url = R.drawable.password;
                Glide.with(getApplicationContext()).load(url).into(imageView);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                email.clearFocus();
                password.clearFocus();

                if (email.getText().toString().equals("admin@admin.com") && password.getText().toString().equals("admin")) {
                    Integer url = R.drawable.email;
                    Glide.with(getApplicationContext()).load(url).into(imageView);
                } else {
                    Integer url = R.drawable.login;
                    Glide.with(getApplicationContext()).load(url).into(imageView);
                }
            }
        });
    }

}