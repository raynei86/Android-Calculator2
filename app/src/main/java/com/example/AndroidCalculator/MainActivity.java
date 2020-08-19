package com.example.AndroidCalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//operation setup
        final Button Addition = findViewById(R.id.Addition);
        final Button Subtraction = findViewById(R.id.Subtraction);
        final Button Division = findViewById(R.id.Division);
        final Button Multiplication = findViewById(R.id.Multiplication);
        final Button Delete = findViewById(R.id.Delete);
        final Button Equal = findViewById(R.id.Equals);
//number setup
        Button NumPad1 = findViewById(R.id.NumPad1);
        Button NumPad2 = findViewById(R.id.NumPad2);
        final Button NumPad3 = findViewById(R.id.NumPad3);
        final Button NumPad4 = findViewById(R.id.NumPad4);
        Button NumPad5 = findViewById(R.id.NumPad5);
        Button NumPad6 = findViewById(R.id.NumPad6);
        Button NumPad7 = findViewById(R.id.NumPad7);
        Button NumPad8 = findViewById(R.id.NumPad8);
        Button NumPad9 = findViewById(R.id.NumPad9);
        Button NumPad0 = findViewById(R.id.NumPad0);
//output setup
        final TextView Output = findViewById(R.id.Output);
//arraylist for deleting
        final ArrayList<String> display = new ArrayList<String>();
//arraylist for calculations
        final int[] placeCounter = {1};
        final int[] firstNumber = {0};
        final int[] secondNumber = {0};
        final boolean[] ifOperationDetected = {false};
        final char[] operation = {' '};
        final int[] result = new int[1];

//This is amazing i cant read my own code
//numberpad display
        NumPad0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String zero = "0";
                display.add(zero);

                int Zero = 0;
                if (ifOperationDetected[0] == false) {
                    firstNumber[0] += (Zero * placeCounter[0]);
                    placeCounter[0] += placeCounter[0] * 10;

                } else if (ifOperationDetected[0] == true) {
                    secondNumber[0] += (Zero * placeCounter[0]);
                    placeCounter[0] += (placeCounter[0] * 10);
                }

                for (int x = 0; x < display.size(); x++) {
                    String stringDisplay = display.toString();
                    if (stringDisplay.charAt(x) == '+' || stringDisplay.charAt(x) == '-' || stringDisplay.charAt(x) == 'x' || stringDisplay.charAt(x) == '÷') {
                        operation[0] = (char) (' ' + stringDisplay.charAt(x));
                    }
                }
                String stringDisplay = display.toString();

                Calculator calculate = new Calculator();
                switch (operation[0]) {
                    case '+':
                        result[0] = calculate.add(firstNumber, secondNumber);
                        break;
                    case '-':
                        result[0] = calculate.subtract(firstNumber, secondNumber);
                        break;
                    case 'x':
                        result[0] = calculate.multiply(firstNumber, secondNumber);
                        break;
                    case '÷':
                        result[0] = calculate.divide(firstNumber, secondNumber);
                        break;
                }

                Output.setText(Output.getText() + "0");
            }
        });


        NumPad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String one = "1";
                display.add(one);

                int One = 1;
                if (ifOperationDetected[0] == false) {
                    firstNumber[0] += (One * placeCounter[0]);
                    placeCounter[0] += placeCounter[0] * 10;

                } else if (ifOperationDetected[0] == true) {
                    secondNumber[0] += (One * placeCounter[0]);
                    placeCounter[0] += (placeCounter[0] * 10);
                }

                for (int x = 0; x < display.size(); x++) {
                    String stringDisplay = display.toString();
                    if (stringDisplay.charAt(x) == '+' || stringDisplay.charAt(x) == '-' || stringDisplay.charAt(x) == 'x' || stringDisplay.charAt(x) == '÷') {
                        operation[0] = (char) (' ' + stringDisplay.charAt(x));
                    }
                }
                String stringDisplay = display.toString();

                Calculator calculate = new Calculator();
                switch (operation[0]) {
                    case '+':
                        result[0] = calculate.add(firstNumber, secondNumber);
                        break;
                    case '-':
                        result[0] = calculate.subtract(firstNumber, secondNumber);
                        break;
                    case 'x':
                        result[0] = calculate.multiply(firstNumber, secondNumber);
                        break;
                    case '÷':
                        result[0] = calculate.divide(firstNumber, secondNumber);
                        break;
                }

                Output.setText(Output.getText() + "1");
            }
        });


        NumPad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String two = "2";
                display.add(two);

                int Two = 2;
                if (ifOperationDetected[0] == false) {
                    firstNumber[0] += (Two * placeCounter[0]);
                    placeCounter[0] += placeCounter[0] * 10;

                } else if (ifOperationDetected[0] == true) {
                    secondNumber[0] += (Two * placeCounter[0]);
                    placeCounter[0] += (placeCounter[0] * 10);
                }

                for (int x = 0; x < display.size(); x++) {
                    String stringDisplay = display.toString();
                    if (stringDisplay.charAt(x) == '+' || stringDisplay.charAt(x) == '-' || stringDisplay.charAt(x) == 'x' || stringDisplay.charAt(x) == '÷') {
                        operation[0] = (char) (' ' + stringDisplay.charAt(x));
                    }
                }
                String stringDisplay = display.toString();

                Calculator calculate = new Calculator();
                switch (operation[0]) {
                    case '+':
                        result[0] = calculate.add(firstNumber, secondNumber);
                        break;
                    case '-':
                        result[0] = calculate.subtract(firstNumber, secondNumber);
                        break;
                    case 'x':
                        result[0] = calculate.multiply(firstNumber, secondNumber);
                        break;
                    case '÷':
                        result[0] = calculate.divide(firstNumber, secondNumber);
                        break;
                }

                Output.setText(Output.getText() + "2");
            }
        });


        NumPad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String three = "3";
                display.add(three);

                int Three = 3;
                if (ifOperationDetected[0] == false) {
                    firstNumber[0] += (Three * placeCounter[0]);
                    placeCounter[0] += placeCounter[0] * 10;

                } else if (ifOperationDetected[0] == true) {
                    secondNumber[0] += (Three * placeCounter[0]);
                    placeCounter[0] += (placeCounter[0] * 10);
                }

                for (int x = 0; x < display.size(); x++) {
                    String stringDisplay = display.toString();
                    if (stringDisplay.charAt(x) == '+' || stringDisplay.charAt(x) == '-' || stringDisplay.charAt(x) == 'x' || stringDisplay.charAt(x) == '÷') {
                        operation[0] = (char) (' ' + stringDisplay.charAt(x));
                    }
                }
                String stringDisplay = display.toString();

                Calculator calculate = new Calculator();
                switch (operation[0]) {
                    case '+':
                        result[0] = calculate.add(firstNumber, secondNumber);
                        break;
                    case '-':
                        result[0] = calculate.subtract(firstNumber, secondNumber);
                        break;
                    case 'x':
                        result[0] = calculate.multiply(firstNumber, secondNumber);
                        break;
                    case '÷':
                        result[0] = calculate.divide(firstNumber, secondNumber);
                        break;
                }

                Output.setText(Output.getText() + "3");
            }
        });


        NumPad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String four = "4";
                display.add(four);

                int Four = 4;
                if (ifOperationDetected[0] == false) {
                    firstNumber[0] += (Four * placeCounter[0]);
                    placeCounter[0] += placeCounter[0] * 10;

                } else if (ifOperationDetected[0] == true) {
                    secondNumber[0] += (Four * placeCounter[0]);
                    placeCounter[0] += (placeCounter[0] * 10);
                }

                for (int x = 0; x < display.size(); x++) {
                    String stringDisplay = display.toString();
                    if (stringDisplay.charAt(x) == '+' || stringDisplay.charAt(x) == '-' || stringDisplay.charAt(x) == 'x' || stringDisplay.charAt(x) == '÷') {
                        operation[0] = (char) (' ' + stringDisplay.charAt(x));
                    }
                }
                String stringDisplay = display.toString();

                Calculator calculate = new Calculator();
                switch (operation[0]) {
                    case '+':
                        result[0] = calculate.add(firstNumber, secondNumber);
                        break;
                    case '-':
                        result[0] = calculate.subtract(firstNumber, secondNumber);
                        break;
                    case 'x':
                        result[0] = calculate.multiply(firstNumber, secondNumber);
                        break;
                    case '÷':
                        result[0] = calculate.divide(firstNumber, secondNumber);
                        break;
                }

                Output.setText(Output.getText() + "4");
            }
        });


        NumPad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String five = "5";
                display.add(five);

                int Five = 5;
                if (ifOperationDetected[0] == false) {
                    firstNumber[0] += (Five * placeCounter[0]);
                    placeCounter[0] += placeCounter[0] * 10;

                } else if (ifOperationDetected[0] == true) {
                    secondNumber[0] += (Five * placeCounter[0]);
                    placeCounter[0] += (placeCounter[0] * 10);
                }

                for (int x = 0; x < display.size(); x++) {
                    String stringDisplay = display.toString();
                    if (stringDisplay.charAt(x) == '+' || stringDisplay.charAt(x) == '-' || stringDisplay.charAt(x) == 'x' || stringDisplay.charAt(x) == '÷') {
                        operation[0] = (char) (' ' + stringDisplay.charAt(x));
                    }
                }
                String stringDisplay = display.toString();

                Calculator calculate = new Calculator();
                switch (operation[0]) {
                    case '+':
                        result[0] = calculate.add(firstNumber, secondNumber);
                        break;
                    case '-':
                        result[0] = calculate.subtract(firstNumber, secondNumber);
                        break;
                    case 'x':
                        result[0] = calculate.multiply(firstNumber, secondNumber);
                        break;
                    case '÷':
                        result[0] = calculate.divide(firstNumber, secondNumber);
                        break;
                }

                Output.setText(Output.getText() + "5");
            }
        });


        NumPad6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String six = "6";
                display.add(six);

                int Six = 0;
                if (ifOperationDetected[0] == false) {
                    firstNumber[0] += (Six * placeCounter[0]);
                    placeCounter[0] += placeCounter[0] * 10;

                } else if (ifOperationDetected[0] == true) {
                    secondNumber[0] += (Six * placeCounter[0]);
                    placeCounter[0] += (placeCounter[0] * 10);
                }

                for (int x = 0; x < display.size(); x++) {
                    String stringDisplay = display.toString();
                    if (stringDisplay.charAt(x) == '+' || stringDisplay.charAt(x) == '-' || stringDisplay.charAt(x) == 'x' || stringDisplay.charAt(x) == '÷') {
                        operation[0] = (char) (' ' + stringDisplay.charAt(x));
                    }
                }
                String stringDisplay = display.toString();

                Calculator calculate = new Calculator();
                switch (operation[0]) {
                    case '+':
                        result[0] = calculate.add(firstNumber, secondNumber);
                        break;
                    case '-':
                        result[0] = calculate.subtract(firstNumber, secondNumber);
                        break;
                    case 'x':
                        result[0] = calculate.multiply(firstNumber, secondNumber);
                        break;
                    case '÷':
                        result[0] = calculate.divide(firstNumber, secondNumber);
                        break;
                }

                Output.setText(Output.getText() + "6");
            }
        });


        NumPad7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String seven = "7";
                display.add(seven);

                int Seven = 7;
                if (ifOperationDetected[0] == false) {
                    firstNumber[0] += (Seven * placeCounter[0]);
                    placeCounter[0] += placeCounter[0] * 10;

                } else if (ifOperationDetected[0] == true) {
                    secondNumber[0] += (Seven * placeCounter[0]);
                    placeCounter[0] += (placeCounter[0] * 10);
                }

                for (int x = 0; x < display.size(); x++) {
                    String stringDisplay = display.toString();
                    if (stringDisplay.charAt(x) == '+' || stringDisplay.charAt(x) == '-' || stringDisplay.charAt(x) == 'x' || stringDisplay.charAt(x) == '÷') {
                        operation[0] = (char) (' ' + stringDisplay.charAt(x));
                    }
                }
                String stringDisplay = display.toString();

                Calculator calculate = new Calculator();
                switch (operation[0]) {
                    case '+':
                        result[0] = calculate.add(firstNumber, secondNumber);
                        break;
                    case '-':
                        result[0] = calculate.subtract(firstNumber, secondNumber);
                        break;
                    case 'x':
                        result[0] = calculate.multiply(firstNumber, secondNumber);
                        break;
                    case '÷':
                        result[0] = calculate.divide(firstNumber, secondNumber);
                        break;
                }

                Output.setText(Output.getText() + "7");
            }
        });


        NumPad8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String eight = "8";
                display.add(eight);

                int Eight = 8;
                if (ifOperationDetected[0] == false) {
                    firstNumber[0] += (Eight * placeCounter[0]);
                    placeCounter[0] += placeCounter[0] * 10;

                } else if (ifOperationDetected[0] == true) {
                    secondNumber[0] += (Eight * placeCounter[0]);
                    placeCounter[0] += (placeCounter[0] * 10);
                }

                for (int x = 0; x < display.size(); x++) {
                    String stringDisplay = display.toString();
                    if (stringDisplay.charAt(x) == '+' || stringDisplay.charAt(x) == '-' || stringDisplay.charAt(x) == 'x' || stringDisplay.charAt(x) == '÷') {
                        operation[0] = (char) (' ' + stringDisplay.charAt(x));
                    }
                }
                String stringDisplay = display.toString();

                Calculator calculate = new Calculator();
                switch (operation[0]) {
                    case '+':
                        result[0] = calculate.add(firstNumber, secondNumber);
                        break;
                    case '-':
                        result[0] = calculate.subtract(firstNumber, secondNumber);
                        break;
                    case 'x':
                        result[0] = calculate.multiply(firstNumber, secondNumber);
                        break;
                    case '÷':
                        result[0] = calculate.divide(firstNumber, secondNumber);
                        break;
                }

                Output.setText(Output.getText() + "8");
            }
        });


        NumPad9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nine = "9";
                display.add(nine);

                int Nine = 9;
                if (ifOperationDetected[0] == false) {
                    firstNumber[0] += (Nine * placeCounter[0]);
                    placeCounter[0] += placeCounter[0] * 10;

                } else if (ifOperationDetected[0] == true) {
                    secondNumber[0] += (Nine * placeCounter[0]);
                    placeCounter[0] += (placeCounter[0] * 10);
                }

                for (int x = 0; x < display.size(); x++) {
                    String stringDisplay = display.toString();
                    if (stringDisplay.charAt(x) == '+' || stringDisplay.charAt(x) == '-' || stringDisplay.charAt(x) == 'x' || stringDisplay.charAt(x) == '÷') {
                        operation[0] = stringDisplay.charAt(x);
                    }
                }
                String stringDisplay = display.toString();

                Calculator calculate = new Calculator();
                switch (operation[0]) {
                    case '+':
                        result[0] = calculate.add(firstNumber, secondNumber);
                        break;
                    case '-':
                        result[0] = calculate.subtract(firstNumber, secondNumber);
                        break;
                    case 'x':
                        result[0] = calculate.multiply(firstNumber, secondNumber);
                        break;
                    case '÷':
                        result[0] = calculate.divide(firstNumber, secondNumber);
                        break;
                }

                Output.setText(Output.getText() + "9");
            }
        });


//operations display
        Delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Output.setText("");
                display.clear();
            }
        });


        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifOperationDetected[0] = true;
                placeCounter[0] = 1;
                String addition = "+";
                display.add(addition);
                Output.setText(Output.getText() + "+");
            }
        });


        Subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifOperationDetected[0] = true;
                placeCounter[0] = 1;
                String subtraction = "-";
                display.add(subtraction);
                Output.setText(Output.getText() + "-");
            }
        });


        Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifOperationDetected[0] = true;
                placeCounter[0] = 1;
                String multiplication = "x";
                display.add(multiplication);
                Output.setText(Output.getText() + "x");
            }
        });


        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifOperationDetected[0] = true;
                placeCounter[0] = 1;
                String division = "÷";
                display.add(division);
                Output.setText(Output.getText() + "÷");
            }
        });


        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String finalAnswer = Integer.toString(result[0]);
                Output.setText(finalAnswer);

            }
        });

    }

}
