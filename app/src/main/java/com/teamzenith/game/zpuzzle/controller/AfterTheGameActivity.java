package com.teamzenith.game.zpuzzle.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.teamzenith.game.zpuzzle.R;

/**
 * Created by memmi on 2017-03-27.
 */

public class AfterTheGameActivity extends AppCompatActivity implements View.OnClickListener {

    private Button playAgainBtn;
    private Button goToMainBtn;

    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.after_the_game);
        createComponents();
        actions();


    }

    private void createComponents() {
        playAgainBtn=(Button) findViewById(R.id.playAgain);
        goToMainBtn=(Button) findViewById(R.id.backToMain);
    }


    private void actions() {
        playAgainBtn.setOnClickListener(this);
        goToMainBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.playAgain){

        }
        else{

        }
    }
}
