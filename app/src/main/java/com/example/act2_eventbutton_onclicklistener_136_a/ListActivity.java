package com.example.act2_eventbutton_onclicklistener_136_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class ListActivity extends AppCompatActivity {

    //declare variables with data type EditText
    EditText edtName, edtAddress, edtEmail, edtPassword, edtRepass;

    //declare variable with data type Floating Action Button
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // connect variable
        edtName = findViewById(R.id.edName);
        edtAddress = findViewById(R.id.edAddress);
        edtEmail = findViewById(R.id.edEmail);
        edtPassword = findViewById(R.id.edPassword);
        edtRepass = findViewById(R.id.edrepass);
        fab = findViewById(R.id.fabSave);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                // make condition to check EditText empty or not
                if (edtName.getText().toString().isEmpty() ||
                edtAddress.getText().toString().isEmpty() ||
                edtEmail.getText().toString().isEmpty() ||
                edtPassword.getText().toString().isEmpty() ||
                edtRepass.getText().toString().isEmpty())
                {
                    // display notification if all EditText is required to be filled
                    Snackbar.make(view, "All data is required to be filled!", Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    // make condition to check is EditText password and repassword same or not
                    if (edtPassword.getText().toString().equals(edtRepass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(), "Successfully Register!", Toast.LENGTH_LONG).show();

                        // method to return to Main Activity
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);

                        startActivity(i);
                    }
                    else
                    {
                        // display message that EditText password and repassword aren't same
                        Snackbar.make(view, "Password and Repassword must be same!", Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}