package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WisataEdukasi extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_edukasi);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Bali Safari","Pulau Penyu","Taman Nusa","Bajra Sandi", "Kertha Gosa","Bali Bird Park","Desa Penglipuran","Taro Elephant Park","Taman Ujung"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), BaliSafari.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), PulauPenyu.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), TamanNusa.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), BajraSandi.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), KerthaGosa.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), BaliBird.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), Penglipuran.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), Taro.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), TamanUjung.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
    public void Back(View view) {
        Intent intent = new Intent(WisataEdukasi.this, MenuUtama.class);
        startActivity(intent);
    }
}