package axisimski.diceflip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class p2 extends AppCompatActivity {

    Button flip;

    ImageView heads;

    Random r;

    int coinSide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p2);

        flip = (Button) findViewById(R.id.flip);

        heads = (ImageView)findViewById(R.id.euro);

        r= new Random();

        flip.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                coinSide = r.nextInt(2);

                RotateAnimation rotate = new RotateAnimation(0, 360,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                rotate.setDuration(900);
                heads.startAnimation(rotate);


                if(coinSide==0){

                    heads.setImageResource(R.drawable.heads);
                    // Toast.makeText(p1.this, "One!",Toast.LENGTH_SHORT ).show();

                }

                else if (coinSide==1){

                    heads.setImageResource(R.drawable.tails);
                    //Toast.makeText(p1.this, "Two",Toast.LENGTH_SHORT ).show();
                }


            }




        }


        );



    }
}
