package om.example.cran.exampleone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void callAnotherActivity(View view){

        EditText nameEditText = (EditText) findViewById(R.id.name_edit_text);

        Intent i = new Intent(this,Main2Activity.class);
        i.putExtra("key", nameEditText.getText().toString());
        startActivity(i);
    }
}
