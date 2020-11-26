package com.app.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CustomDialog customDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customDialog = new CustomDialog(MainActivity.this, false);
        customDialog.setHeading("Congratulations");
        customDialog.setDescription("You subscription is successfully.. You can continue to enjoy by watching videos");
        customDialog.setImageUrl("https://i.pinimg.com/originals/67/ac/a8/67aca82baa85cdbc23f501aa921f362a.png");
        customDialog.setLottieAnimation("https://assets7.lottiefiles.com/packages/lf20_fpxnx6ry.json");
        customDialog.createDialog();
    }
}