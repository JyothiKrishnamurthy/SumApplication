package com.example.jyothikrishnamurthy.sumapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    TextView textViewResult;
    Button result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult = (TextView)findViewById(R.id.textView);
        result = (Button)findViewById(R.id.button);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intent, 2);
            }
        });

    }

protected void onActivityResult(int requestCode, int resultCode, Intent data){

    super.onActivityResult(requestCode, resultCode, data);
    if(requestCode==2){
        String res = data.getStringExtra("MESSAGE");
        textViewResult.setText(res);

    }
}

}
