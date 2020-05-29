package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void clickMe(View view){
        EditText myTextField = (EditText) findViewById(R.id.Text);
        //Log.i("info",myTextField.getText().toString());
        String str = myTextField.getText().toString();
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
        Log.i("info", str);
        if(str.equals("manu")){
            ImageView iv = (ImageView) findViewById(R.id.imageViewId);
            iv.setImageResource(R.drawable.manu);
        }
        else if(str.equals("moto")){
            ImageView iv = (ImageView) findViewById(R.id.imageViewId);
            iv.setImageResource(R.drawable.moto);

        }
        else{
            ImageView iv = (ImageView) findViewById(R.id.imageViewId);
            iv.setImageResource(R.drawable.manumoto);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
