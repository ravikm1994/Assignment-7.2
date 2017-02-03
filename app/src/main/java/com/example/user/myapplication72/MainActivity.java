package com.example.user.myapplication72;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

        public class MainActivity extends Activity {
            String[] language = {"HP Injet Printer", "Himalaya","Gmail","Google","Canon", "Shirts", "Smartphone", "Hp Laptop", "Android", "ASP.NET", "Pants"};

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>
                        (this, android.R.layout.select_dialog_item, language);
                //Getting the instance of AutoCompleteTextView
                AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autocompletetv1);
                actv.setThreshold(1);//will start working from first character
                actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
                actv.setTextColor(Color.WHITE);

            }

        }
