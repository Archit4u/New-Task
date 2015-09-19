package com.jaaga.newtask;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final Context context = this;
    final String TAG = "States";
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textView);
        Button A=(Button)findViewById(R.id.button);
        Button b=(Button)findViewById(R.id.button2);

        Log.d(TAG, "MainActivity: onCreate()");
        Toast.makeText(getApplicationContext(), "onCreate of ActivityA", Toast.LENGTH_SHORT).show();

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                // set title for your alert dialog box
                alertDialogBuilder.setTitle("Dismiss the dialog???");
                //tv.setText("Dialog has been dismissed");
                // set alert dialog message
                /*alertDialogBuilder
                        .setMessage("Click yes to exit!")  // Set the message to display.
                        .setCancelable(false) //  Sets whether the dialog is cancelable or not.
// Set a listener to be invoked when the positive button of the dialog is pressed.
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // if yes button is clicked, close current activity
                                MainActivity.this.finish();
                            }
                        })
//Set a listener to be invoked when the negative button of the dialog is pressed
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // if no button is clicked, just close the dialog box and do nothing
                                dialog.cancel();
                            }
                        });*/
                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();
                // Display alert dialog
                alertDialog.show();
                alertDialog.setCanceledOnTouchOutside(true);

                    tv.setText("Dialog has been dismissed");



            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_b.class);
                startActivityForResult(intent, 2);

            }

        });


    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if(requestCode==2)
        {
            String message=data.getStringExtra("MESSAGE");
            tv.setText(message);
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity: onDestroy()");
        Toast.makeText(getApplicationContext(), "onDestroy of ActivityA", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity: onStop()");
        Toast.makeText(getApplicationContext(), "onStop of ActivityA", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "MainActivity: onResume()");
        Toast.makeText(getApplicationContext(), "onResume of ActivityA", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "MainActivity: onStart()");
        Toast.makeText(getApplicationContext(), "onStart of ActivityA", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity: onPause()");
        Toast.makeText(getApplicationContext(), "onPause of ActivityA", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();


        Log.d(TAG, "MainActivity: onRestart()");
        Toast.makeText(getApplicationContext(), "onRestart of ActivityA", Toast.LENGTH_SHORT).show();
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
}
