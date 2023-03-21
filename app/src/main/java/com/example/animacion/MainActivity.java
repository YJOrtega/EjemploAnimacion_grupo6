package com.example.animacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivLogo;
    Button btnMover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivLogo = findViewById(R.id.ivLogo);
        btnMover = findViewById(R.id.btnMover);

        btnMover.setOnClickListener(view -> {
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_mover);
                ivLogo.startAnimation(animation);
    });
}
}