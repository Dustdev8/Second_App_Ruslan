package com.example.second_app_ruslan;



import android.os.Bundle;

import android.text.TextUtils;

import android.view.View;

import android.widget.AdapterView;

import android.widget.ArrayAdapter;

import android.widget.EditText;

import android.widget.Spinner;

import android.widget.TextView;

import android.widget.Toast;



import androidx.activity.EdgeToEdge;

import androidx.appcompat.app.AppCompatActivity;

import androidx.core.graphics.Insets;

import androidx.core.view.ViewCompat;

import androidx.core.view.WindowInsetsCompat;



import com.example.second_app_ruslan.utilities.CharCounter;

import com.example.second_app_ruslan.utilities.SpaceRemover;

import com.example.second_app_ruslan.utilities.WordCounter;



public class MainActivity extends AppCompatActivity {



    EditText user_input;

    Spinner counting_options;

    TextView count_result;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {

            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());

            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            return insets;

        });



        this.user_input = findViewById(R.id.user_input);

        this.count_result = findViewById(R.id.count_result);

        this.counting_options = findViewById(R.id.counting_options);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(

                this,

                R.array.counting_options,

                android.R.layout.simple_spinner_item

        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        counting_options.setAdapter(adapter);



        counting_options.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String selectedOption = counting_options.getSelectedItem().toString();

                String charsOption = getString(R.string.count_chars);

                String wordsOptionWarning = getString(R.string.count_words_warning);

                String charsOptionWarning = getString(R.string.count_chars_warning);



// Show a toast based on the selected option

                if (selectedOption.equals(charsOption)) {

                    Toast.makeText(MainActivity.this, charsOptionWarning, Toast.LENGTH_LONG).show();

                } else {

                    Toast.makeText(MainActivity.this, wordsOptionWarning, Toast.LENGTH_LONG).show();

                }

            }



            @Override

            public void onNothingSelected(AdapterView<?> parent) {

//nothing xd

            }

        });

    }







    public void count_on_btn_click(View view) {

        String userInput = this.user_input.getText().toString().trim();

        String emptyInput = getString(R.string.empty_input);

        String charsOption = getString(R.string.count_chars);

        TextView formattedTextView = findViewById(R.id.formatted_text);



        if (TextUtils.isEmpty(userInput)) {

            Toast.makeText(this, emptyInput, Toast.LENGTH_SHORT).show();

            this.count_result.setText(String.valueOf(0));

            formattedTextView.setText(""); // Clear the formatted text view

        } else {

// Clean the input by removing excessive spaces

            String cleanedInput = SpaceRemover.removeExcessiveSpaces(userInput);



            if (this.counting_options.getSelectedItem().toString().equals(charsOption)) {

// For character count, use the original input

                int charCount = CharCounter.GetCharsCount(userInput);

                this.count_result.setText(String.valueOf(charCount));

                formattedTextView.setText(userInput); // Show original input

            } else {

// For word count, use the cleaned input

                int wordCount = WordCounter.GetWordsCount(cleanedInput);

                this.count_result.setText(String.valueOf(wordCount));

                formattedTextView.setText(cleanedInput); // Show cleaned input

            }

        }

    }

}