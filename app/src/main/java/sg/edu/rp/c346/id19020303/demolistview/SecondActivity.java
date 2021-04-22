package sg.edu.rp.c346.id19020303.demolistview;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    TextView textViewFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // get the text from MainActivity
        Intent intent = getIntent();
        String text = intent.getStringExtra("key");

        // use the text in a TextView
        textViewFood = (TextView) findViewById(R.id.textView);
        textViewFood.setText(text);
    }

}
