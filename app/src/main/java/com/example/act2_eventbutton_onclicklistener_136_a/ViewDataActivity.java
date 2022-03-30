package com.example.act2_eventbutton_onclicklistener_136_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ViewDataActivity extends AppCompatActivity {

    TextView tvname, tvnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_data);

        tvname = findViewById(R.id.tvContactName);
        tvnumber = findViewById(R.id.tvPhoneNumber);

        Bundle bundle = getIntent().getExtras();

        String thename = bundle.getString("a");

        switch(thename)
        {
            case "Inayah":
                tvname.setText("Inayah M");
                tvnumber.setText("08122233344");
                break;
            case "Ilham":
                tvname.setText("Ilham R");
                tvnumber.setText("08133224455");
                break;
            case "Eris":
                tvname.setText("Eris J");
                tvnumber.setText("08125533344");
                break;
            case "Fikri":
                tvname.setText("M Fikri");
                tvnumber.setText("08122453344");
                break;
            case "Maul":
                tvname.setText("Maul M");
                tvnumber.setText("08126633344");
                break;
            case "Intan":
                tvname.setText("Intan S");
                tvnumber.setText("08122555344");
                break;
            case "Vina":
                tvname.setText("Vina R");
                tvnumber.setText("08125556344");
                break;
            case "Gita":
                tvname.setText("Gita S");
                tvnumber.setText("08199233344");
                break;
            case "Lutfi":
                tvname.setText("Lutfi M");
                tvnumber.setText("08122233234");
                break;
            case "Vian":
                tvname.setText("Vian M");
                tvnumber.setText("08122969344");
                break;
        }
    }
}