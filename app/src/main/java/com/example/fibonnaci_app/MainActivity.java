package com.example.fibonnaci_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

        //Fibonacci or Perfect Square or both or none
        class Numbers{
            int num;
            public boolean isPerfectSquare(){
                double sqRoot = (int) Math.sqrt(num);


                return sqRoot * sqRoot == num;
            }
            public boolean isPerfectSquare(int num){
                double sqRoot = (int) Math.sqrt(num);


                return sqRoot * sqRoot == num;
            }
            public boolean isFibonaaciNumber(){
                return isPerfectSquare(5*num*num+4 )|| isPerfectSquare( 5*num*num-4);
            }
        }
    public void OnClickButton(View view){
        EditText edittext=findViewById(R.id.editTextTextPersonName);

        String message;
        if(edittext.getText().toString().isEmpty()){
            message="please Enter a number";
        }else {
            Numbers myNum = new Numbers();

            myNum.num = Integer.parseInt(edittext.getText().toString());
            message = edittext.getText().toString();

            if (myNum.isFibonaaciNumber() && myNum.isPerfectSquare()) {
                message = message + " is a perfect square and a fibonacci";
            } else if (myNum.isFibonaaciNumber()) {
                message = message + " is a fibonacci but not square ";
            } else if (myNum.isPerfectSquare()) {
                message = message + " is a perfect number but not a fibonacci";
            }

        }
            Snackbar.make(view, message, Snackbar.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}