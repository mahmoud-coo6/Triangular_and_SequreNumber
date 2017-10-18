package com.example2.acer.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String messege = "";
    class Number {

        int number;

        public boolean isSquare() {

            double squareRoot = Math.sqrt(number);

            if (squareRoot == Math.floor(squareRoot)) {

                return true;

            } else {

                return false;

            }

        }

        public boolean isTriangular() {

            int x = 1;

            int triangularNumber = 1;

            while (triangularNumber < number) {

                x++;

                triangularNumber = triangularNumber + x;

            }

            if (triangularNumber == number) {

                return true;

            } else {

                return false;

            }

        }


    }

    public void testNumber(View view) {
        EditText userNumber = (EditText) findViewById(R.id.userNumber);
        Number myNumber = new Number();
        Log.i("userNumber", userNumber.getText().toString());
        if (userNumber.getText().toString().isEmpty()) {
            messege += "Please,Enter a number !!";
        } else{
        myNumber.number = Integer.parseInt(userNumber.getText().toString());

        if (myNumber.isSquare()) {
            if (myNumber.isTriangular()) {
                messege += myNumber.number + " is both triangular and sequre";
            } else {
                messege += myNumber.number + " is sequre but not triangular";
            }
        } else {
            if (myNumber.isTriangular()) {
                messege += myNumber.number + " is triangular but not sequre";
            } else {
                messege += myNumber.number + " is neither sequre nor triangular";
            }
        }
    }
        Toast.makeText(getApplicationContext(),messege,Toast.LENGTH_LONG).show();
        System.out.println(myNumber.isSquare());
         messege ="";

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
