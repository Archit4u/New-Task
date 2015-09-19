package com.jaaga.newtask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by vaio on 19-09-2015.
 */
public class Activity_b extends AppCompatActivity {
    final String TAG = "States";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b);
        Button button1=(Button)findViewById(R.id.b_button1);
        Button button2=(Button)findViewById(R.id.b_button2);
        Button button3=(Button)findViewById(R.id.b_button3);
        Button button4=(Button)findViewById(R.id.b_button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message="Button 1 of activity was clicked";
                Intent intent=new Intent();
                intent.putExtra("MESSAGE",message);
                setResult(2, intent);
                finish();//finishing activity

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message="Button 2 of activity was clicked";
                Intent intent=new Intent();
                intent.putExtra("MESSAGE",message);
                setResult(2, intent);
                finish();//finishing activity
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message="Button 3 of activity was clicked";
                Intent intent=new Intent();
                intent.putExtra("MESSAGE",message);
                setResult(2, intent);
                finish();//finishing activity
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message="Button 4 of activity was clicked";
                Intent intent=new Intent();
                intent.putExtra("MESSAGE",message);
                setResult(2, intent);
                finish();//finishing activity
            }
        });
        }



    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Activity_b: onStop()");
        Toast.makeText(getApplicationContext(), "onStop of Activity B", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Activity_b: onDestroy()");
        Toast.makeText(getApplicationContext(), "onDestroy of Activity B", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Activity_b: onPause()");
        Toast.makeText(getApplicationContext(), "onPause of Activity B", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activity_b: onResume()");
        Toast.makeText(getApplicationContext(), "onResume of Activity B", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Activity_b: onStart()");
        Toast.makeText(getApplicationContext(), "onStart of Activity B", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Activity_b: onRestart()");
        Toast.makeText(getApplicationContext(), "onRestart of Activity B", Toast.LENGTH_SHORT).show();
    }
}