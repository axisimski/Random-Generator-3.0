package axisimski.diceflip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class p1 extends AppCompatActivity {

    Button flip;

    ImageView heads;

    Random r;

    int dieSide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p1);

        flip = (Button) findViewById(R.id.flip);

        heads = (ImageView)findViewById(R.id.diceicon);

        r= new Random();

        flip.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                dieSide=r.nextInt(6);

                RotateAnimation rotate = new RotateAnimation(0, 360,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                rotate.setDuration(900);
                heads.startAnimation(rotate);


                if(dieSide==0){

                    heads.setImageResource(R.drawable.one);
                   // Toast.makeText(p1.this, "One!",Toast.LENGTH_SHORT ).show();

                }

                else if (dieSide==1){

                    heads.setImageResource(R.drawable.two);
                    //Toast.makeText(p1.this, "Two",Toast.LENGTH_SHORT ).show();
                }

                else if (dieSide==2){

                    heads.setImageResource(R.drawable.three);
                   // Toast.makeText(p1.this, "Three!",Toast.LENGTH_SHORT ).show();
                }
                else if (dieSide==3){

                    heads.setImageResource(R.drawable.four);
                    //Toast.makeText(p1.this, "Four!",Toast.LENGTH_SHORT ).show();
                }
                else if (dieSide==4){

                    heads.setImageResource(R.drawable.five);
                    //Toast.makeText(p1.this, "Five!",Toast.LENGTH_SHORT ).show();
                }
                else if (dieSide==5){

                    heads.setImageResource(R.drawable.six);
                    //Toast.makeText(p1.this, "Six!",Toast.LENGTH_SHORT ).show();
                }



            }
        }


        );



    }
}
