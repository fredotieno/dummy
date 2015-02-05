package com.yocto.zeiss.myservice;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.yocto.zeiss.myservice.R.id.button;
import static com.yocto.zeiss.myservice.R.id.textView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startButton = (Button) findViewById(button);
        Button startButton2 = (Button) findViewById(R.id.button2);
        Button startButton3 = (Button) findViewById(R.id.button3);
        startButton3.setOnClickListener(this);
        startButton2.setOnClickListener(this);
        startButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Button b = (Button)v;
        String buttonText = b.getText().toString();
        setContentView(R.layout.form);
        TextView formTitle = (TextView) findViewById(R.id.textView2);
        formTitle.setText(buttonText);
    }

    public void getProperties(View v) {
        EditText phoneNumber = (EditText) findViewById(R.id.editText);
        String phoneNumberText = phoneNumber.getText().toString();
        EditText amount = (EditText) findViewById(R.id.editText2);
        String amountText = amount.getText().toString();
        TextView serviceProvider = (TextView) findViewById(R.id.textView2);
        String serviceProviderText = serviceProvider.getText().toString();
        Toast message = Toast.makeText(getApplicationContext(), "You have successfully used, " + serviceProviderText + " to send " + amountText + " to " + phoneNumberText + " ! " , Toast.LENGTH_LONG);
        message.setGravity(Gravity.CENTER, 0, 0);
        message.show();
        setContentView(R.layout.activity_main);
        Button startButton = (Button) findViewById(button);
        Button startButton2 = (Button) findViewById(R.id.button2);
        Button startButton3 = (Button) findViewById(R.id.button3);
        startButton3.setOnClickListener(this);
        startButton2.setOnClickListener(this);
        startButton.setOnClickListener(this);
    }

}
