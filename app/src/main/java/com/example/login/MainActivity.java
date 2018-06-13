package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    String tstMsg= "Sorry! Wrong Password. Please Enter a Correct one";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button)findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

validateUser(Name.getText().toString(),Password.getText().toString());
            }

        });


    }

    public void validateUser(String userName, String  userPassword)
    {

        if((userName.equals("admin")) && (userPassword.equals("priya")))
        {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);

        }
        else
        {
            Toast.makeText(getApplicationContext(),tstMsg,Toast.LENGTH_LONG).show();
        }
    }
}
