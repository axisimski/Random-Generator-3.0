package axisimski.diceflip;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class p3 extends AppCompatActivity {

    Button flip;

    ImageView heads;

    Random r;

    int cardNum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p3);

        flip = (Button) findViewById(R.id.cardButton);

        heads = (ImageView)findViewById(R.id.cardback);

        r= new Random();

        flip.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                cardNum=r.nextInt(52);

                RotateAnimation rotate = new RotateAnimation(0, 360,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                rotate.setDuration(900);
                heads.startAnimation(rotate);


                if(cardNum==51){

                    heads.setImageResource(R.drawable.k4);

                }

                else if (cardNum==50){

                    heads.setImageResource(R.drawable.k3);
                }

                else if (cardNum==49){

                    heads.setImageResource(R.drawable.k2);
                }

                else if (cardNum==48){

                    heads.setImageResource(R.drawable.k1);
                }

                else if (cardNum==47){

                    heads.setImageResource(R.drawable.q4);
                }

                else if (cardNum==46){

                    heads.setImageResource(R.drawable.q3);
                }
                else if (cardNum==45){

                    heads.setImageResource(R.drawable.q2);
                }

                else if (cardNum==44){

                    heads.setImageResource(R.drawable.q1);
                }

                else if (cardNum==43){

                    heads.setImageResource(R.drawable.j4);
                }

                else if (cardNum==42){

                    heads.setImageResource(R.drawable.j3);
                }
                else if (cardNum==41){

                    heads.setImageResource(R.drawable.j2);
                }

                else if (cardNum==40){

                    heads.setImageResource(R.drawable.j1);
                }

                else if (cardNum==39){

                    heads.setImageResource(R.drawable.a10);
                }

                else if (cardNum==38){

                    heads.setImageResource(R.drawable.b10);
                }
                else if (cardNum==37){

                    heads.setImageResource(R.drawable.c10);
                }

                else if (cardNum==36){

                    heads.setImageResource(R.drawable.d10);
                }

                else if (cardNum==35){

                    heads.setImageResource(R.drawable.a9);
                }

                else if (cardNum==34){

                    heads.setImageResource(R.drawable.b9);
                }
                else if (cardNum==33){

                    heads.setImageResource(R.drawable.c9);
                }

                else if (cardNum==32){

                    heads.setImageResource(R.drawable.d9);
                }

                else if (cardNum==31){

                    heads.setImageResource(R.drawable.a8);
                }

                else if (cardNum==30){

                    heads.setImageResource(R.drawable.b8);
                }
                else if (cardNum==29){

                    heads.setImageResource(R.drawable.c8);
                }

                else if (cardNum==28){

                    heads.setImageResource(R.drawable.d8);
                }

                else if (cardNum==27){

                    heads.setImageResource(R.drawable.a7);
                }

                else if (cardNum==26){

                    heads.setImageResource(R.drawable.b7);
                }
                else if (cardNum==25){

                    heads.setImageResource(R.drawable.c7);
                }

                else if (cardNum==24){

                    heads.setImageResource(R.drawable.d7);
                }
                else if (cardNum==23){

                    heads.setImageResource(R.drawable.a6);
                }

                else if (cardNum==22){

                    heads.setImageResource(R.drawable.b6);
                }
                else if (cardNum==21){

                    heads.setImageResource(R.drawable.c6);
                }

                else if (cardNum==20){

                    heads.setImageResource(R.drawable.d6);
                }

                else if (cardNum==19){

                    heads.setImageResource(R.drawable.a5);
                }

                else if (cardNum==18){

                    heads.setImageResource(R.drawable.b5);
                }
                else if (cardNum==17){

                    heads.setImageResource(R.drawable.c5);
                }

                else if (cardNum==16){

                    heads.setImageResource(R.drawable.d5);
                }
                else if (cardNum==15){

                    heads.setImageResource(R.drawable.a4);
                }

                else if (cardNum==14){

                    heads.setImageResource(R.drawable.b4);
                }
                else if (cardNum==13){

                    heads.setImageResource(R.drawable.c4);
                }

                else if (cardNum==12){

                    heads.setImageResource(R.drawable.d4);
                }
                else if (cardNum==11){

                    heads.setImageResource(R.drawable.a3);
                }

                else if (cardNum==10){

                    heads.setImageResource(R.drawable.b3);
                }
                else if (cardNum==9){

                    heads.setImageResource(R.drawable.c3);
                }

                else if (cardNum==8){

                    heads.setImageResource(R.drawable.d3);
                }
                else if (cardNum==7){

                    heads.setImageResource(R.drawable.a2);
                }

                else if (cardNum==6){

                    heads.setImageResource(R.drawable.b2);
                }
                else if (cardNum==5){

                    heads.setImageResource(R.drawable.c2);
                }

                else if (cardNum==4){

                    heads.setImageResource(R.drawable.d2);
                }
                else if (cardNum==3){

                    heads.setImageResource(R.drawable.a1);
                }

                else if (cardNum==2){

                    heads.setImageResource(R.drawable.b1);
                }
                else if (cardNum==1){

                    heads.setImageResource(R.drawable.c1);
                }

                else if (cardNum==0){

                    heads.setImageResource(R.drawable.d1);
                }












            }
        }


        );



    }
}
