package com.sabitpkcmnr.mastercounterpro;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private int mCounter = 0;
    Button btn;
    TextView txv;

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.bt);
        txv = (TextView)findViewById(R.id.tx);

        btn.setOnClickListener(new View.setOnClickListener () {
            @Override

            public void onClick(View view) {
                mCounter++;
                txv.setText(Integer.toString(mCounter))
            }
        });
    }
}