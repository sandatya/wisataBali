package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WisataKuliner extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_kuliner);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Warung D’Sawah","Warung Mak Beng","Nasi Ayam Kedewatan Bu Mangku","Warung Nasi Bali Men Weti","Warung Wardani Bali","Warung Mami Jimbaran","Green Kubu Cafe ","La Laguna Canggu"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Dsawah.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), MakBeng.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), AyamKedewatan.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), MenWeti.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), WardaniBali.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), MamiJimbaran.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), GreenKubu.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), Lalaguna.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
    public void Back(View view) {
        Intent intent = new Intent(WisataKuliner.this, MenuUtama.class);
        startActivity(intent);
    }
}