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
public class Vibor_uslugi_zavodskiy extends Activity implements View.OnClickListener {
    Button apteka_zavodskiy, trenagernie_zali_zavodskiy, lombards_zavodskiy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viboruslugizavodskiy);

        apteka_zavodskiy = (Button) findViewById(R.id.apteka_zavodskiy);
        apteka_zavodskiy.setOnClickListener(this);

        trenagernie_zali_zavodskiy = (Button) findViewById(R.id.trenagernie_zali_zavodskiy);
        trenagernie_zali_zavodskiy.setOnClickListener(this);

        lombards_zavodskiy = (Button) findViewById(R.id.lombards_zavodskiy);
        lombards_zavodskiy.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.apteka_zavodskiy:
                Intent intent = new Intent(this, Pharmancy_zavodskiy.class);
                startActivity(intent);

            case R.id.trenagernie_zali_zavodskiy:
                Intent intent_trenagernie_zali_zavodskiy = new Intent(this, Trenagorniy_zal_zavodskiy.class);
                startActivity(intent_trenagernie_zali_zavodskiy);

            case R.id.lombards_zavodskiy:
                Intent intent_lombards_zavodskiy = new Intent(this, Pharmancy_zavodskiy.class);
                startActivity(intent_lombards_zavodskiy);
        }
    }
}