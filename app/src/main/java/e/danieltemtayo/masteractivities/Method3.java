package e.danieltemtayo.masteractivities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Method3 extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method3);

        relativeLayout = findViewById(R.id.relative);
        button = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
    }

    public void changeToGreen(View view) {
        relativeLayout.setBackgroundColor(Color.RED);
    }

    public void changeColor(View view)
    {
        relativeLayout.setBackgroundColor(Color.YELLOW);
    }
}
