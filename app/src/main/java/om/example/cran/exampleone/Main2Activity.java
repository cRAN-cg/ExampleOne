package om.example.cran.exampleone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();
        if(extras !=null) {
            String value = extras.getString("key");
            TextView setTextView = (TextView) findViewById(R.id.name_text_view);
            setTextView.setText(value);
        }
    }
}
