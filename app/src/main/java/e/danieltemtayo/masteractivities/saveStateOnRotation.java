package e.danieltemtayo.masteractivities;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class saveStateOnRotation extends AppCompatActivity {

//    public static final String TAG=saveStateOnRotation.class.getSimpleName();
    private EditText editText;
    private Button button;
    private TextView textView;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_state_on_rotation);

        button=findViewById(R.id.btnSubmit);
        editText=findViewById(R.id.etName);
        textView=findViewById(R.id.txvMessage);
//        Log.i(TAG,"onCreate");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Welcome"+editText.getText().toString());
                button.setText("Logout");
            }
        });

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(savedInstanceState!=null){
            textView.setText(savedInstanceState.getString("message"));
            button.setText(savedInstanceState.getString("button_m"));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);

        outState.putString("message",textView.getText().toString());
        outState.putString("btn_m",button.getText().toString());
    }
}
