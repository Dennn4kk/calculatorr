package com.example.callllll;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //Оголошення об'єктів кнопок (які є на розмітці інтерфейсу)
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;
    EditText crunchifyEditText; //Оголошення об'єкт текстового поля з результатом та вводом прикладів

    float mValueOne, mValueTwo; // змінні для вводу
    //змінні знаків
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

    //Перевантажений метод (викликється при створені, побудови програми)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //батьківський метод, встановлюється збережений стан екземпляра
        setContentView(R.layout.activity_main); //встановлюється перший інтерфейс запуску програми
        //Кнопки. Ініціалізація даних кнопок за допомогою пошуку  по Id на формі (інтерфейсу)
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10); // 0
        buttonAdd = (Button) findViewById(R.id.buttonadd);// +
        buttonSub = (Button) findViewById(R.id.buttonsub); // -
        buttonMul = (Button) findViewById(R.id.buttonmul); // *
        buttonDivision = (Button) findViewById(R.id.buttondiv); //  /
        buttonC = (Button) findViewById(R.id.buttonC); // очищення введених даних
        buttonEqual = (Button) findViewById(R.id.buttoneql); // =
        crunchifyEditText = (EditText) findViewById(R.id.edt1); // ініціалізація текстового поля результату

// ініціалізація (оголошення) подій при натиску на кнопці та його визначення
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "1"); // встановлює цифру 1 в текстова поле
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // встановлює цифру 2 в текстова поле
                crunchifyEditText.setText(crunchifyEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // встановлює цифру 3 в текстова поле
                crunchifyEditText.setText(crunchifyEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // встановлює цифру 4 в текстова поле
                crunchifyEditText.setText(crunchifyEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // встановлює цифру 5 в текстова поле
                crunchifyEditText.setText(crunchifyEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // встановлює цифру 6 в текстова поле
                crunchifyEditText.setText(crunchifyEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // встановлює цифру 7 в текстова поле
                crunchifyEditText.setText(crunchifyEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // встановлює цифру 8 в текстова поле
                crunchifyEditText.setText(crunchifyEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // встановлює цифру 9 в текстова поле
                crunchifyEditText.setText(crunchifyEditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // встановлює цифру 0 в текстова поле
                crunchifyEditText.setText(crunchifyEditText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // встановлює знак + в текстова поле
                if (crunchifyEditText == null) { //перевірка на пустоту
                    crunchifyEditText.setText("");
                } else { // якщо не пусто
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + ""); // конвертація з стрінга в флоат
                    crunchifyAddition = true; //встановлюємо прапорець на змінній додавання
                    crunchifyEditText.setText(null); //очищення тексту
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // встановлює знак - в текстова поле
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + ""); // конвертація з стрінга в флоат
                mSubtract = true;//встановлюємо прапорець на змінній віднімання
                crunchifyEditText.setText(null);//очищення тексту
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // встановлює знак * в текстова поле
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + ""); // конвертація з стрінга в флоат
                crunchifyMultiplication = true;//встановлюємо прапорець на змінній множення
                crunchifyEditText.setText(null);//очищення тексту
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // встановлює знак / в текстова поле
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + ""); // конвертація з стрінга в флоат
                crunchifyDivision = true;//встановлюємо прапорець на змінній ділення
                crunchifyEditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // метод для формуванню розв'язку прикладу при натисканні = кнопки
                mValueTwo = Float.parseFloat(crunchifyEditText.getText() + "");

                if (crunchifyAddition == true) { //якщо прапорець на додаванні то дія додавання
                    crunchifyEditText.setText(mValueOne + mValueTwo + ""); // додаванян
                    crunchifyAddition = false;
                }

                if (mSubtract == true) { //якщо прапорець на віднімання то дія віднімання
                    crunchifyEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) { //якщо прапорець на множені то дія множені
                    crunchifyEditText.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) { //якщо прапорець на ділення то дія ділення
                    crunchifyEditText.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // метод для очистки введеного значення
                crunchifyEditText.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //кнопка з крапкою, встановлює крапку
                crunchifyEditText.setText(crunchifyEditText.getText() + ".");
            }
        });
    }
}