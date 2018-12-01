package e.danieltemtayo.masteractivities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ExplicitIntent extends AppCompatActivity {


    private RelativeLayout rLayout;
    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        rLayout = findViewById(R.id.relative);
        button = findViewById(R.id.push);
        editText = findViewById(R.id.Enter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExplicitIntent.this, IntentReciever.class);
//                Bundle b=new Bundle();
//                b.putString(Constants.KEY_NAME,editText.getText().toString());
//                b.putInt(Constants.KEY_AGE,22);
//                intent.putExtras(b);
                startActivity(intent);
            }
        });

    }
//
//    private void moveToIntentReciever() {
//
//
//    }
//
    //This is another way of passing intent directly
//    private void moveToIntentAnotherWay(){
//
//        Intent intent=new Intent(ExplicitIntent.this,IntentReciever.class);
//        intent.putExtra(Constants.KEY_NAME,editText.getText().toString());
//        intent.putExtra(Constants.KEY_AGE,22);
//        startActivity(intent);
//
//    }
}
