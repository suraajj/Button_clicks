package com.hfad.viewsandevents;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.CHANGING);
        b1=(Button)findViewById(R.id.button);
                b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        t1.setText("Button 1 DABAYA");
    }
    public void abc(View v){
        t1.setText("You clicked BUtton 2");
    }
}
