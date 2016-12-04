package com.developers.top.location2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by tolya on 13.07.2016.
 * 46.9700914,32.0678587
 */
public class Vibor_uslugi_centralniy extends Activity implements View.OnClickListener {
    Button apteka_centralniy, trenagernie_zali_centralniy, lombards_centralniy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viboruslugizavodskiy
        );
        apteka_centralniy = (Button) findViewById(R.id.apteka_centralniy);
        apteka_centralniy.setOnClickListener(this);

        trenagernie_zali_centralniy = (Button) findViewById(R.id.trenagernie_zali_centralniy);
        trenagernie_zali_centralniy.setOnClickListener(this);

        lombards_centralniy = (Button) findViewById(R.id.lombards_centralniy);
        lombards_centralniy.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.apteka_centralniy:
                Intent intent_apteka_centralniy = new Intent(this, Pharmancy_centralniy.class);
                startActivity(intent_apteka_centralniy);

            case R.id.trenagernie_zali_centralniy:
                Intent intent_trenagernie_zali_centralniy = new Intent(this, Pharmancy_centralniy.class);
                startActivity(intent_trenagernie_zali_centralniy);

            case R.id.lombards_centralniy:
                Intent intent_lombards_centralniy = new Intent(this, Pharmancy_centralniy.class);
                startActivity(intent_lombards_centralniy);

        }
    }
}