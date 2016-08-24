package com.example.angad.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    private static final String KEY_FACT = "KEY_FACT";
    private static final String KEY_COLOR = "KEY_COLOR";
    private FactBook factBook=new FactBook();
private ColorBook colorBook=new ColorBook();
private TextView mFactTextView;
private Button mFactButton;
private RelativeLayout relative;
    private String mFact=factBook.mFacts[0];
    private int mColor= Color.parseColor(colorBook.mColors[8]);

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mFact=savedInstanceState.getString(KEY_FACT);
        mFactTextView.setText(mFact);
        mColor=savedInstanceState.getInt(KEY_COLOR);
        relative.setBackgroundColor(mColor);
        mFactButton.setTextColor(mColor);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        //TODO:We will assign views to the respective mfeilds from the layout file

        mFactTextView= (TextView) findViewById(R.id.FunFacttextView);
        mFactButton= (Button) findViewById(R.id.button);
        relative=(RelativeLayout)findViewById(R.id.relative);
       // Toast.makeText(FunFactsActivity.this,"Yay we created our first activity",Toast.LENGTH_SHORT).show();
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO:facts must change whenever we click the button
               mFact=factBook.getFacts();
                mColor=colorBook.getColors();
                mFactTextView.setText(mFact);
                relative.setBackgroundColor(mColor);
                mFactButton.setTextColor(mColor);
            }
        };
        mFactButton.setOnClickListener(listener);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_FACT,mFact);
        outState.putInt(KEY_COLOR,mColor);
    }
}
