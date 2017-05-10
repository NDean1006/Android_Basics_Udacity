package com.example.android.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.inputmethod.ExtractedTextRequest;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    int quantity = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        EditText customerName = (EditText) findViewById(R.id.customerName);
        String name = customerName.getText().toString();
        CheckBox whippedTopping = (CheckBox) findViewById(R.id.AddWhippedCream);
        Boolean hasWhippedCream = whippedTopping.isChecked();
        CheckBox chocolateTopping = (CheckBox) findViewById(R.id.AddChocolate);
        Boolean hasChocolate = chocolateTopping.isChecked();
        int price = calculatePrice(hasWhippedCream, hasChocolate);
        String Message = createOrderSummary(price,hasWhippedCream,hasChocolate,name);
        //displayMessage(Message);


        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "JustJava Order");
        intent.putExtra(intent.EXTRA_TEXT,Message);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


    }


    private String createOrderSummary(int price, boolean hasWhippedCream, boolean hasChocolate, String name) {
        String Mprice = "Name: " + name;
        Mprice += "\nQuantity: " + quantity;
        Mprice += "\nAdd Whipped Cream: " + hasWhippedCream;
        Mprice += "\nAdd Chocolate: " + hasChocolate;
        Mprice += "\nTotal: $" + (price);
        Mprice += "\nThank You!";
        return Mprice;
    }

    /**
     * Calculates the price of the order based on the current quantity
     */

    private int calculatePrice(boolean hasWhippedCream, boolean hasChocolate) {
        int pricePerCup = 5;
        if (hasWhippedCream) {
            pricePerCup += 1;
        }
        if (hasChocolate) {
            pricePerCup += 2;
        }

        return quantity * pricePerCup;
    }


    public void increment(View view) {
        if (quantity > 100) {
            Toast.makeText(MainActivity.this,
                    "Invalid Quantity", Toast.LENGTH_LONG).show();
            return;
        }
        quantity = quantity + 1;

        displayQuantity(quantity);

    }

    public void decrement(View view) {
        if (quantity < 2) {
            Toast.makeText(MainActivity.this,
                    "Invalid Quantity", Toast.LENGTH_LONG).show();
            return;
        }
        quantity = quantity - 1;

        displayQuantity(quantity);

    }

    /**
     * This method displays the given text on the screen.
     */
    //private void displayMessage(String message) {
    //    TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
     //   orderSummaryTextView.setText(message);
  //  }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }


}
