package com.example.android.justjava;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quantity = 0;
    /**
     * This method is called when the order button is clicked.
     * this is a new comment
     */
    public void increment(View view) {
        displayQuantity(quantity = quantity + 1);
    }
    public void decrement(View view) {
        displayQuantity(quantity = quantity - 1);
    }
    public void submitOrder(View view) {
       int price = quantity * 5;
        String priceMessage = "Total: $" + price + "\n" + "Thank You!";
       displayMessage(priceMessage);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("" + NumberFormat.getCurrencyInstance().format(number));
    }
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("" + message);
    }
}