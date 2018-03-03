package axisimski.diceflip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class p0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p0);

        ImageButton nextPage = (ImageButton) findViewById(R.id.NextPage);
                nextPage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent myIntent = new Intent(p0.this, p1.class);
                startActivity(myIntent);

            }
        });

        ImageButton nextPage2 = (ImageButton) findViewById(R.id.NextCoin);
        nextPage2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent myIntent = new Intent(p0.this, p2.class);
                startActivity(myIntent);

            }
        });

        ImageButton nextPage3 = (ImageButton) findViewById(R.id.NextCard);
        nextPage3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent myIntent = new Intent(p0.this, p3.class);
                startActivity(myIntent);

            }
        });

       Button randButton = (Button) findViewById(R.id.randButton);
        randButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent myIntent = new Intent(p0.this, p4.class);
                startActivity(myIntent);

            }
        });

    }
}
