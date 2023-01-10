package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WisataAlam extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_alam);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Gunung Batur","Natural Hot Spring", "Desa Pinggan",
                "Danau Batur", "Nukad Tampak Siring","Air Terjun Gitgit",
                "Bukit Tjampuhan","Sawah Jatiluwih"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Batur.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), NaturalHotSpring.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), DesaPinggan.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), DanauBatur.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), Nukad.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), Gitgit.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), Tjampuhan.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), Jatiluwih.class);
                    startActivityForResult(myIntent, 0);
                }



            }
        });
    }

    public void Back(View view) {
        Intent intent = new Intent(WisataAlam.this, MenuUtama.class);
        startActivity(intent);
    }
}