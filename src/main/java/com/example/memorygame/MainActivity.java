package com.example.memorygame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView tv_P1,tv_P2;
    ImageView iv_11,iv_12,iv_13,iv_14,iv_21,iv_22,iv_23,iv_24,iv_31,iv_32,iv_33,iv_34;
    //array for the images
    Integer[] cardsArray = {101,102,103,104,105,106,201,202,203,204,205,206};
    //actual images
    int image101, image102,image103,image104,image105,image106,
            image201, image202,image203,image204,image205,image206;

    int firstCard,secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber =1;
    int turn = 1;
    int playerPoint=0, cpuPoints=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_P1 = (TextView) findViewById(R.id.tv_P1);
        tv_P2 = (TextView) findViewById(R.id.tv_P2);

        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);
        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);
        iv_23 = (ImageView) findViewById(R.id.iv_23);
        iv_24 = (ImageView) findViewById(R.id.iv_24);
        iv_31 = (ImageView) findViewById(R.id.iv_31);
        iv_32 = (ImageView) findViewById(R.id.iv_32);
        iv_33 = (ImageView) findViewById(R.id.iv_33);
        iv_34 = (ImageView) findViewById(R.id.iv_34);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");

        //load the card images
        frontOfCardResources();
        //shuffle the images
        Collections.shuffle(Arrays.asList(cardsArray));
        //changing the color of the second player(inactive).
       tv_P2.setTextColor(Color.GRAY);

       iv_11.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int theCard = Integer.parseInt((String) view.getTag());
               doSuff(iv_11, theCard);           }
       });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doSuff(iv_12, theCard);
            }
        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doSuff(iv_13, theCard);
            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doSuff(iv_14, theCard);
            }
        });
        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doSuff(iv_21, theCard);
            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doSuff(iv_22, theCard);
            }
        });
        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doSuff(iv_23, theCard);
            }
        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doSuff(iv_24, theCard);
            }
        });
        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doSuff(iv_31, theCard);
            }
        });
        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doSuff(iv_32, theCard);
            }
        });
        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doSuff(iv_33, theCard);
            }
        });
        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doSuff(iv_34, theCard);
            }
        });

        }

        private void doSuff(ImageView iv,int card) {
        //set the correct image to the imageview
            if (cardsArray[card] == 101) {
                iv.setImageResource(image101);
            } else if (cardsArray[card] == 102) {
                iv.setImageResource(image102);
            } else if (cardsArray[card] == 103) {
                iv.setImageResource(image103);
            } else if (cardsArray[card] == 104) {
                iv.setImageResource(image104);
            } else if (cardsArray[card] == 105) {
                iv.setImageResource(image105);
            } else if (cardsArray[card] == 106) {
                iv.setImageResource(image106);
            } else if (cardsArray[card] == 201) {
                iv.setImageResource(image201);
            } else if (cardsArray[card] == 202) {
                iv.setImageResource(image202);
            } else if (cardsArray[card] == 203) {
                iv.setImageResource(image203);
            } else if (cardsArray[card] == 204) {
                iv.setImageResource(image204);
            } else if (cardsArray[card] == 205) {
                iv.setImageResource(image205);
            } else if (cardsArray[card] == 206) {
                iv.setImageResource(image206);
            }

            //check which image is selected and save it to temporary variable
            if (cardNumber==1){
                firstCard = cardsArray[card];
                if(firstCard>200){
                    firstCard=firstCard-100;
                }
                cardNumber = 2;
                clickedFirst= card;
                iv.setEnabled(false);
            }else if(cardNumber==2){
                secondCard = cardsArray[card];
                if(secondCard>200){
                    secondCard=secondCard-100;
                }
                cardNumber = 1;
                clickedSecond= card;
                iv_11.setEnabled(false);
                iv_12.setEnabled(false);
                iv_13.setEnabled(false);
                iv_14.setEnabled(false);
                iv_12.setEnabled(false);
                iv_22.setEnabled(false);
                iv_23.setEnabled(false);
                iv_24.setEnabled(false);
                iv_31.setEnabled(false);
                iv_32.setEnabled(false);
                iv_33.setEnabled(false);
                iv_34.setEnabled(false);

                Handler handler=new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //check if the selected images are equal
                        calculate();
                    }
                }, 1000);

            }
        }
        private void calculate(){
        //if images are equal remove tgen and addpoints
        if (firstCard==secondCard){
            if(clickedFirst==0){
                iv_11.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==1){
                iv_12.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==2){
                iv_13.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==3){
                iv_14.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==4){
                iv_21.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==5){
                iv_22.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==6){
                iv_23.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==7){
                iv_24.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==8){
                iv_31.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==9){
                iv_32.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==10){
                iv_33.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==11){
                iv_34.setVisibility(View.INVISIBLE);
            }

            if(clickedSecond==0){
                iv_11.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==1){
                iv_12.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==2){
                iv_13.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==3){
                iv_14.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==4){
                iv_21.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==5){
                iv_22.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==6){
                iv_23.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==7){
                iv_24.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==8){
                iv_31.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==9){
                iv_32.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==10){
                iv_33.setVisibility(View.INVISIBLE);
            }else if(clickedSecond==11){
                iv_34.setVisibility(View.INVISIBLE);
            }
            if(turn ==1){
                playerPoint++;
                tv_P1.setText("P1:"+playerPoint);
            }else  if(turn ==2){
                cpuPoints++;
                tv_P2.setText("P2:"+cpuPoints);
            }
        }else {
            iv_11.setImageResource(R.drawable.ic_back);
            iv_12.setImageResource(R.drawable.ic_back);
            iv_13.setImageResource(R.drawable.ic_back);
            iv_14.setImageResource(R.drawable.ic_back);
            iv_21.setImageResource(R.drawable.ic_back);
            iv_22.setImageResource(R.drawable.ic_back);
            iv_23.setImageResource(R.drawable.ic_back);
            iv_24.setImageResource(R.drawable.ic_back);
            iv_31.setImageResource(R.drawable.ic_back);
            iv_32.setImageResource(R.drawable.ic_back);
            iv_33.setImageResource(R.drawable.ic_back);
            iv_34.setImageResource(R.drawable.ic_back);
            //change the player turn
            if(turn==1){
                turn = 2;
                tv_P1.setTextColor(Color.GRAY);
                tv_P2.setTextColor(Color.BLACK);
            }else  if(turn==2){
                turn = 1;
                tv_P2.setTextColor(Color.GRAY);
                tv_P1.setTextColor(Color.BLACK);
            }
        }
            iv_11.setEnabled(true);
            iv_12.setEnabled(true);
            iv_13.setEnabled(true);
            iv_14.setEnabled(true);
            iv_21.setEnabled(true);
            iv_22.setEnabled(true);
            iv_23.setEnabled(true);
            iv_24.setEnabled(true);
            iv_31.setEnabled(true);
            iv_32.setEnabled(true);
            iv_33.setEnabled(true);
            iv_34.setEnabled(true);
            //check if the game is over
            checkEnd();
    }
    private void checkEnd(){
        if(iv_11.getVisibility()==View.INVISIBLE &&
                iv_12.getVisibility()==View.INVISIBLE &&
                iv_13.getVisibility()==View.INVISIBLE &&
                iv_14.getVisibility()==View.INVISIBLE &&
                iv_21.getVisibility()==View.INVISIBLE &&
                iv_22.getVisibility()==View.INVISIBLE &&
                iv_23.getVisibility()==View.INVISIBLE &&
                iv_24.getVisibility()==View.INVISIBLE &&
                iv_31.getVisibility()==View.INVISIBLE &&
                iv_32.getVisibility()==View.INVISIBLE &&
                iv_33.getVisibility()==View.INVISIBLE &&
                iv_34.getVisibility()==View.INVISIBLE){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder
                    .setMessage("GAME OVER!\nP1:"+playerPoint+"\nP2:"+cpuPoints)
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    private void frontOfCardResources(){

        image101=R.drawable.ic_image101;
        image102=R.drawable.ic_image102;
        image103=R.drawable.ic_image103;
        image104=R.drawable.ic_image104;
        image105=R.drawable.ic_image105;
        image106=R.drawable.ic_image106;
        image201=R.drawable.ic_image201;
        image202=R.drawable.ic_image202;
        image203=R.drawable.ic_image203;
        image204=R.drawable.ic_image204;
        image205=R.drawable.ic_iamge205;
        image206=R.drawable.ic_image206;

    }
}
