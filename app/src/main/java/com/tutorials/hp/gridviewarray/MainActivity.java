package com.tutorials.hp.gridviewarray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gv;
    String[] spacecrafts={"Juno","Hubble","Casini","WMAP","Spitzer","Pioneer","Columbia","Challenger","Apollo","Curiosity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gv = (GridView) findViewById(R.id.gv);

        //ADAPTER
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, spacecrafts);
        gv.setAdapter(adapter);

        //LISTENER
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, spacecrafts[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
