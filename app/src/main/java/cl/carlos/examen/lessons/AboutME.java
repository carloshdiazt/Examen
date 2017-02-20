package cl.carlos.examen.lessons;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cl.carlos.examen.R;

/**
 * Created by diazt on 15-02-2017.
 */

public class AboutME extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_aboutme);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fabIntent = new Intent(Intent.ACTION_VIEW);
                fabIntent.setData(Uri.parse("http://empieza.desafiolatam.com/cohorts/45/workshops/470"));
                startActivity(fabIntent);
            }
        });



    }
}

