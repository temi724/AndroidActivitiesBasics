package e.danieltemtayo.masteractivities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

//Implement onclick listener
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
public static final String TAG=MainActivity.class.getSimpleName();


    private RelativeLayout relativeLayout;
    private Button button,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing Components
        relativeLayout=findViewById(R.id.relative);
        button=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);

        //setting the onclick listener
        //note. the (this) simply means in this context
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button.setOnClickListener(this);
    }
//
    @Override
    public void onClick(View v) {
        //using switch cases to handle events
        switch (v.getId()){
            case R.id.button1:
                relativeLayout.setBackgroundColor(Color.GREEN);
                break;
            case R.id.button2:
                relativeLayout.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.button3:
                Log.i(TAG,"What's up na");
                //Using intent to lunch an alternative activity
                Intent intent= new Intent(this,Method_2.class);
                startActivity(intent);
                break;
            case R.id.button4:
                Intent intentA= new Intent(this,ExplicitIntent.class);
                startActivity(intentA);
                break;
            }
    }


}
