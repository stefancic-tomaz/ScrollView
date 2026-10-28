package com.example.scrollview;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle stanje) {
        super.onCreate(stanje);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.glavni), (pogled, odmiki) -> {
            Insets robovi = odmiki.getInsets(WindowInsetsCompat.Type.systemBars());
            pogled.setPadding(robovi.left, robovi.top, robovi.right, robovi.bottom);
            return odmiki;
        });

        Button gumb = findViewById(R.id.gumb);
        gumb.setOnClickListener(pogled ->
                Toast.makeText(this, R.string.sporocilo, Toast.LENGTH_SHORT).show());
    }
}
