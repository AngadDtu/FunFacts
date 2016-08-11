package com.example.angad.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
private FactBook factBook=new FactBook();
private ColorBook colorBook=new ColorBook();
private TextView mFactTextView;
private Button mFactButton;
private RelativeLayout relative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        //TODO:We will assign views to the respective mfeilds from the layout file

        mFactTextView= (TextView) findViewById(R.id.FunFacttextView);
        mFactButton= (Button) findViewById(R.id.button);
        relative=(RelativeLayout)findViewById(R.id.relative);
        Toast.makeText(FunFactsActivity.this,"Yay we created our first activity",Toast.LENGTH_SHORT).show();
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO:facts must change whenever we click the button
               String fact=factBook.getFacts();
                int color=colorBook.getColors();
                mFactTextView.setText(fact);
                relative.setBackgroundColor(color);
                mFactButton.setTextColor(color);
            }
        };
        mFactButton.setOnClickListener(listener);

    }
}
