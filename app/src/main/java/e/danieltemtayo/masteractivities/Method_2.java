package e.danieltemtayo.masteractivities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Method_2 extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private Button button, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_2);

        //Initializing the android components
        relativeLayout=findViewById(R.id.relative);
        button=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);

        //Setting event listeners directly on the components
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundColor(Color.BLACK);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundColor(Color.MAGENTA);
            }
        });
    }
}
