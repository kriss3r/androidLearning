package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {


    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        //display(this.counter);
        displayPrice(this.counter * 5);
    }

    private void display(int number) {
        this.counter+=number;
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + this.counter);
    }


    private void displayPrice(int number){
        TextView priceTextView =(TextView) findViewById(R.id.price_text_view);
    priceTextView.setText("TOTAL " +NumberFormat.getCurrencyInstance().format(number) + "\n Thank you");

    }

    public void increment(View view){
        display(1);
    }

    public void decrement(View view){
        if (this.counter>0) {
            display(-1);
        }
        }



}
