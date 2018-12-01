package e.danieltemtayo.masteractivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IntentReciever extends AppCompatActivity {


    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView=findViewById(R.id.textView);

        StringBuilder msg = new StringBuilder("Welcome \n");

        Intent intent = getIntent();
//        Bundle b = intent.getExtras();
//    if (b.containsKey(Constants.KEY_NAME)) { // Just to be Safe
//          String name = b.getString(Constants.KEY_NAME, "my default name");
//           msg.append(name);
//      }
//       if (b.containsKey(Constants.KEY_AGE)) { // Just to be safe
//           int age = b.getInt(Constants.KEY_AGE, 30);
//          msg.append("\n").append(age).append(" years old");
//        }
//        assert textView != null;
//        textView.setText(msg);
    }

}
