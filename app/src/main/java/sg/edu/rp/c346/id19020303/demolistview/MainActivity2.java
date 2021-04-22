package sg.edu.rp.c346.id19020303.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textViewFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // get the text from MainActivity
        Intent intent = getIntent();
        String text = intent.getStringExtra("key");

        // use the text in a TextView
        textViewFood = (TextView) findViewById(R.id.tvFood);
        textViewFood.setText(text);
    }
}