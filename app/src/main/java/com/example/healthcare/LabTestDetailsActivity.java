package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LabTestDetailsActivity extends AppCompatActivity {

    TextView tvPackageName, tvTotalCost;
    EditText edDetails;
    Button btnAddToCart, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_test_details);

        tvPackageName = findViewById(R.id.textViewLDPackageName);
        tvTotalCost = findViewById(R.id.textViewLDTotalCost);
        edDetails = findViewById(R.id.editTextLDTextMultiline);
        btnAddToCart = findViewById(R.id.buttonBMGoToCart);
        btnBack = findViewById(R.id.buttonBMGoBack);


        edDetails.setKeyListener(null);
        Intent it = new Intent();
        tvPackageName.setText(getIntent().getStringExtra("text1"));
        edDetails.setText(getIntent().getStringExtra("text2"));
        tvTotalCost.setText(getIntent().getStringExtra("Total Cost : "+ getIntent().getStringExtra("text3")+"/-"));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LabTestDetailsActivity.this, LabTestActivity.class));
            }
        });

        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("shared prefs", Context.MODE_PRIVATE);
                String username = sharedPreferences.getString("username", " ").toString();
                String product = tvPackageName.getText().toString();
                float price = Float.parseFloat(getIntent().getStringExtra("text3".toString()));

                Database db = new Database(getApplicationContext(), "healthcare", null, 1);

                if(db.checkCart(username, product) == 1) {
                    Toast.makeText(getApplicationContext(), "Product Already Added", Toast.LENGTH_SHORT).show();
                }else{
                    db.addCart(username, product, price, "lab");
                    Toast.makeText(getApplicationContext(), "Record Inserted To Cart", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LabTestDetailsActivity.this, LabTestActivity.class));
                }

            }
        });
    }
}