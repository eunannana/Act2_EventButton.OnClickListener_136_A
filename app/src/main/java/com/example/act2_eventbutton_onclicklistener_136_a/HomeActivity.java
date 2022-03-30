package com.example.act2_eventbutton_onclicklistener_136_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.util.ArrayList;
public class HomeActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{
    private ListView list;
    private ListViewAdapter adapter;

    String[] nameList;

    public static ArrayList<ClassName> ClassNameArrayList = new ArrayList<ClassName>();

    Bundle bundle = new Bundle();

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nameList = new String[]{"Inayah","Ilham","Eris","Fikri","Maul","Intan","Vina","Gita","Lutfi", "Vian"};

        list = findViewById(R.id.contactList);

        ClassNameArrayList = new ArrayList<>();

        for (int i = 0; i < nameList.length; i++)
        {
            ClassName ClassName = new ClassName(nameList[i]);

            ClassNameArrayList.add(ClassName);
        }
        adapter = new ListViewAdapter(this);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String thename = ClassNameArrayList.get(position).getName();

                bundle.putString("a", thename.trim());

                PopupMenu pm = new PopupMenu(getApplicationContext(), view);

                pm.setOnMenuItemClickListener(HomeActivity.this);
                pm.inflate(R.menu.popup_menu);
                pm.show();
            }
        });
    }
    @Override
    public boolean onMenuItemClick(MenuItem menuItem){
        switch (menuItem.getItemId())
        {
            case R.id.mnview:
                intent = new Intent(getApplicationContext(), ViewDataActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.mnedit:
                Toast.makeText(getApplicationContext(), "this is for edit contact", Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }

}