package cl.carlos.examen.lessons;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cl.carlos.examen.R;
import cl.carlos.examen.window.MainActivity;

import static android.os.Build.VERSION_CODES.M;

/**
 * Created by diazt on 15-02-2017.
 */

public class Input extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_input);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fabIntent = new Intent(Intent.ACTION_VIEW);
                fabIntent.setData(Uri.parse("https://nowornever3.com/2016/03/05/android-radiogroup-radiobutton-seekbar-chechkbox/"));
                startActivity(fabIntent);
            }
        });
    }
}
