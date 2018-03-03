package axisimski.diceflip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class p4 extends AppCompatActivity {

    EditText low; EditText high; TextView output; Button execute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p4);


        low =(EditText)findViewById(R.id.low);
        high =(EditText)findViewById(R.id.high);
        output=(TextView)findViewById(R.id.output);
        execute=(Button)findViewById(R.id.execute);



    }


    public void execute(View v){

        if(low.getText().toString().isEmpty()||high.getText().toString().isEmpty()){
            Toast.makeText(this, "Enter a valid range;", Toast.LENGTH_SHORT).show();
        }

        else {

            int l = Integer.parseInt(low.getText().toString());
            int h = Integer.parseInt(high.getText().toString());

            Random r = new Random();

            int ret = r.nextInt(h-l+1) + l;

            output.setText(Integer.toString(ret));
        }
    }














}
