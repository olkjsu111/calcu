package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtNumberA, edtNumberB;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumberA = findViewById(R.id.edtNumberA);
        edtNumberB = findViewById(R.id.edtNumberB);
        tvResult = findViewById(R.id.tvResult);

        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnSub = findViewById(R.id.btnSub);
        Button btnMul = findViewById(R.id.btnMul);
        Button btnDiv = findViewById(R.id.btnDiv);

        btnAdd.setOnClickListener(v -> calculate('+'));
        btnSub.setOnClickListener(v -> calculate('-'));
        btnMul.setOnClickListener(v -> calculate('*'));
        btnDiv.setOnClickListener(v -> calculate('/'));
    }

    private void calculate(char operator) {
        String strA = edtNumberA.getText().toString().trim();
        String strB = edtNumberB.getText().toString().trim();

        if (strA.isEmpty() || strB.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ 2 số!", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double numA = Double.parseDouble(strA);
            double numB = Double.parseDouble(strB);
            double result = 0;

            switch (operator) {
                case '+':
                    result = numA + numB;
                    break;
                case '-':
                    result = numA - numB;
                    break;
                case '*':
                    result = numA * numB;
                    break;
                case '/':
                    if (numB == 0) {
                        Toast.makeText(this, "Không thể chia cho 0!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    result = numA / numB;
                    break;
            }

            tvResult.setText("Kết quả: " + result);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Dữ liệu nhập vào không hợp lệ!", Toast.LENGTH_SHORT).show();
        }
    }
}