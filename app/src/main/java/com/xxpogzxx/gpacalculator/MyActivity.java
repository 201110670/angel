package com.xxpogzxx.gpacalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MyActivity extends Activity {
    EditText amount1;
    EditText amount2;
    EditText amount3;
    TextView tt;
    Button calculate;
    double x=0;
    double y=0;
    double z1=0;
    double z=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        initControls();
    }
    private void initControls()
    {
        amount1=(EditText)findViewById(R.id.editText);
        amount2=(EditText)findViewById(R.id.editText2);
        amount3=(EditText)findViewById(R.id.editText3);
        tt=(TextView)findViewById(R.id.textView5);
        calculate=(Button)findViewById(R.id.button);
        calculate.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v) {
                calculate();}
        });
    }
    private void calculate()
    {
        x=Double.parseDouble(amount1.getText().toString())*.25;
        y=Double.parseDouble(amount2.getText().toString())*.35;
        z1=Double.parseDouble(amount3.getText().toString())*.40;
        z=y+x+z1;
        tt.setText(Double.toString(z));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
