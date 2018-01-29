package com.example.chiriku711.mycustomlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;


    //isi data

    String data[] = {

            "data 1",
            "data 2",
            "data 3",
            "data 4",
            "data 5",
            "data 6",
            "data 7",
            "data 8",
            "data 9",
            "data 10",
            "data 11",
            "data 12",
            "data 13",
            "data 14",
            "data 15",
    };

    Integer images[]={

                    R.mipmap.ic_launcher_round,
                    R.mipmap.ic_launcher_round,
                    R.mipmap.ic_launcher_round,
                    R.mipmap.ic_launcher_round,
                    R.mipmap.ic_launcher_round,
                    R.mipmap.ic_launcher_round,
                    R.mipmap.ic_launcher_round,
                    R.mipmap.ic_launcher_round,
                    R.mipmap.ic_launcher_round,
                    R.mipmap.ic_launcher_round,
                    R.mipmap.ic_launcher_round,
                    R.mipmap.ic_launcher_round,
                    R.mipmap.ic_launcher_round,
                    R.mipmap.ic_launcher_round,
                    R.mipmap.ic_launcher_round


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter adapter = new CustomListAdapter(this,data,images);
        listView = findViewById(R.id.list_view);

        listView.setAdapter(adapter);
        
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = data[+position];
                Toast.makeText(MainActivity.this, selectedItem, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
