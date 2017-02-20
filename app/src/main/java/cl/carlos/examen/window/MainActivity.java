package cl.carlos.examen.window;

import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


import cl.carlos.examen.R;
import cl.carlos.examen.lessons.AboutME;
import cl.carlos.examen.lessons.Input;



public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final RadioGroup classRg = (RadioGroup) findViewById(R.id.clasesRg);
        final RadioButton biographyRb = (RadioButton) findViewById(R.id.aboutmeRb);
        final RadioButton elementsRb = (RadioButton) findViewById(R.id.inputRb);


        Button sendBtn = (Button) findViewById(R.id.sendBtn);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int btnId = classRg.getCheckedRadioButtonId();
                if (btnId != -1) {

                    if (biographyRb.isChecked()) {

                        Intent intent = new Intent(MainActivity.this, AboutME.class);
                        startActivity(intent);

                    }else if (elementsRb.isChecked()) {


                        Intent inputIntent = new Intent(MainActivity.this, Input.class);
                        startActivity(inputIntent);
                    }


                } else {
                    Toast.makeText(MainActivity.this, "Seleccione una alternativa", Toast.LENGTH_SHORT).show();
                }


            }
        });



    }
}
