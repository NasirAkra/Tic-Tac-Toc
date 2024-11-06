package com.example.tictactoc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    int flag=0;
    int count=0;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();



    }
    private void init()
    {
        btn1=findViewById(R.id.bnt1);
        btn2=findViewById(R.id.bnt2);
        btn3=findViewById(R.id.bnt3);
        btn4=findViewById(R.id.bnt4);
        btn5=findViewById(R.id.bnt5);
        btn6=findViewById(R.id.bnt6);
        btn7=findViewById(R.id.bnt7);
        btn8=findViewById(R.id.bnt8);
        btn9=findViewById(R.id.bnt9);
    }
    public  void Check( View view) {
        count++;
        Button btnCurrent = (Button) view;
        if (flag == 0) {
            btnCurrent.setText("N");
            flag = 1;
        } else {
            btnCurrent.setText("W");
            flag = 0;
        }
        if (count > 4) {
            b1 = btn1.getText().toString();
            b2 = btn2.getText().toString();
            b3 = btn3.getText().toString();
            b4 = btn4.getText().toString();
            b5 = btn5.getText().toString();
            b6 = btn6.getText().toString();
            b7 = btn7.getText().toString();
            b8 = btn8.getText().toString();
            b9 = btn9.getText().toString();

            if (b1.equals(b2) && b2.equals(b3) && !b1.equals(" ")) {
                Toast.makeText(this, "Good You are Winner" + b1, Toast.LENGTH_SHORT).show();
            } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals(" ")) {
                Toast.makeText(this, "Good You are Winner" + b4, Toast.LENGTH_SHORT).show();
            } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals(" ")) {
                Toast.makeText(this, "Good You are Winner" + b7, Toast.LENGTH_SHORT).show();
            } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals(" ")) {
                Toast.makeText(this, "Good You are Winner" + b1, Toast.LENGTH_SHORT).show();
            } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals(" ")) {
                Toast.makeText(this, "Good You are Winner" + b2, Toast.LENGTH_SHORT).show();
            } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals(" ")) {
                Toast.makeText(this, "Good You are Winner" + b3, Toast.LENGTH_SHORT).show();
            } else if (b1.equals(b5) && b5.equals(b9) && b1.equals(" ")) {
                Toast.makeText(this, "Good You are Winner" + b1, Toast.LENGTH_SHORT).show();
            } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals(" ")) {
                Toast.makeText(this, "Good You are Winner" + b3, Toast.LENGTH_SHORT).show();
            }

        }
    }
}