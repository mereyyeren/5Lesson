package kz.joba.l5lesson;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnDel;
    TextView tvSan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn7);
        btn2 = findViewById(R.id.btn8);
        btn3 = findViewById(R.id.btn9);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn1);
        btn8 = findViewById(R.id.btn2);
        btn9 = findViewById(R.id.btn3);
        btn0 = findViewById(R.id.btn0);
        btnDel = findViewById(R.id.btnDel);


        tvSan = findViewById(R.id.tv_san);
        View.OnClickListener button_basylganda = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aldingiSan = tvSan.getText().toString();
                String basilganSan = "";
                String songiResult = "";


                switch (view.getId()) {

                    case R.id.btn0:
                        basilganSan = "0";
                        break;


                    case R.id.btn1:
                        basilganSan = "1";
                        break;


                    case R.id.btn2:
                        basilganSan = "2";
                        break;


                    case R.id.btn3:
                        basilganSan = "3";
                        break;

                    case R.id.btn4:
                        basilganSan = "4";
                        break;

                    case R.id.btn5:
                        basilganSan = "5";
                        break;


                    case R.id.btn6:
                        basilganSan = "6";
                        break;

                    case R.id.btn7:
                        basilganSan = "7";
                        break;

                    case R.id.btn8:
                        basilganSan = "8";
                        break;


                    case R.id.btn9:
                        basilganSan = "9";
                        break;


                }
                if (!aldingiSan.equals("0")) songiResult = aldingiSan + basilganSan;
                else songiResult = basilganSan;
                tvSan.setText(songiResult);

            }


        };

        btn0.setOnClickListener(button_basylganda);
        btn1.setOnClickListener(button_basylganda);
        btn2.setOnClickListener(button_basylganda);
        btn3.setOnClickListener(button_basylganda);
        btn4.setOnClickListener(button_basylganda);
        btn5.setOnClickListener(button_basylganda);
        btn6.setOnClickListener(button_basylganda);
        btn7.setOnClickListener(button_basylganda);
        btn8.setOnClickListener(button_basylganda);
        btn9.setOnClickListener(button_basylganda);


        View.OnClickListener btnDelout = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {

                    case R.id.btnDel:

                        String santext = tvSan.getText().toString();
                        int san = Integer.parseInt(santext);
                        int sonn = san / 10;
                        tvSan.setText("" + sonn);
                        break;
                }
            }
        };
        btnDel.setOnClickListener(btnDelout);

    }
}