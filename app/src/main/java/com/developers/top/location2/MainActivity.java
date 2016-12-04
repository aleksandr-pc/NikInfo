package com.developers.top.location2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button button_lininskiy, button_zavodskiy, button_korabelniy, button_centralniy, button_vse_rayoni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_lininskiy = (Button) findViewById(R.id.button_lininskiy);
        button_lininskiy.setOnClickListener(this);

        button_zavodskiy = (Button) findViewById(R.id.button_zavodskiy);
        button_zavodskiy.setOnClickListener(this);

        button_korabelniy = (Button) findViewById(R.id.button_korabelniy);
        button_korabelniy.setOnClickListener(this);

        button_centralniy = (Button) findViewById(R.id.button_centralniy);
        button_centralniy.setOnClickListener(this);


        button_vse_rayoni = (Button) findViewById(R.id.button_vse_rayoni);
        button_vse_rayoni.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_lininskiy:
                Intent intent_lininskiy = new Intent(this, Vibor_uslugi_lininskiy.class);
                startActivity(intent_lininskiy);
                break;

            case R.id.button_zavodskiy:
                Intent intent_zavodskiy = new Intent(this, Vibor_uslugi_zavodskiy.class);
                startActivity(intent_zavodskiy);
                break;

            case R.id.button_korabelniy:
                Intent intent_korabelniy = new Intent(this, Vibor_uslugi_korabelniy.class);
                startActivity(intent_korabelniy);
                break;

            case R.id.button_centralniy:
                Intent intent_centralniy = new Intent(this, Vibor_uslugi_centralniy.class);
                startActivity(intent_centralniy);
                break;

            case R.id.button_vse_rayoni:
                Intent intent_vse_rayoni = new Intent(this, Vibor_uslugi_vse_rayoni.class);
                startActivity(intent_vse_rayoni);
                break;
        }
    }
}