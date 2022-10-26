package com.example.user_interaction;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ActionBar actionBar;
    Button bandungBtn;
    Button baliBtn;
    Button bogBtn;
    Button jogBtn;
    Button solBtn;
    ImageView home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bandungBtn = findViewById(R.id.bandungBtn);
        baliBtn = findViewById(R.id.baliBtn);
        bogBtn = findViewById(R.id.bogorBtn);
        jogBtn = findViewById(R.id.jogjaBtn);
        solBtn = findViewById(R.id.soloBtn);
        home   = findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(kembali);
            }
        });

        bandungBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri web = Uri.parse("https://www.tiket.com/hotel/search?adult=1&id=bandung-108001534490276290&q=bandung&room=1&type=CITY");
                Intent web1 = new Intent(Intent.ACTION_VIEW,web);
                startActivity(web1);
            }
        });

        baliBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri web = Uri.parse("https://www.tiket.com/hotel/search?room=1&adult=1&page=1&id=bali-108001534490276212&type=REGION&q=Bali&checkin=2022-11-01&checkout=2022-11-02");
                Intent web2 = new Intent(Intent.ACTION_VIEW,web);
                startActivity(web2);
            }
        });

        bogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri web = Uri.parse("https://www.tiket.com/hotel/search?room=1&adult=1&page=1&id=bogor-108001534490276382&type=CITY&q=Bogor&checkin=2022-11-01&checkout=2022-11-02");
                Intent web3 = new Intent(Intent.ACTION_VIEW,web);
                startActivity(web3);
            }
        });

        jogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri web = Uri.parse("https://www.tiket.com/hotel/search?room=1&adult=1&page=1&id=yogyakarta-108001534490276494&type=CITY&q=Yogyakarta&checkin=2022-11-01&checkout=2022-11-02");
                Intent web4 = new Intent(Intent.ACTION_VIEW,web);
                startActivity(web4);
            }
        });

        solBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri web = Uri.parse("https://www.tiket.com/hotel/search?room=1&adult=1&page=1&id=solo-108001534490276270&type=CITY&q=Solo&checkin=2022-11-01&checkout=2022-11-02");
                Intent web5 = new Intent(Intent.ACTION_VIEW,web);
                startActivity(web5);
            }
        });


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

    @Override
    public void  onBackPressed(){
        super.onBackPressed();
    }
}