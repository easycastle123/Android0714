package com.example.a0714;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    Switch chkagree;
    RadioGroup rgroup1;
    RadioButton rdoo, rdop, rdoq;
    Button btnok;
    ImageView imgpet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        text1=findViewById(R.id.Text1);
        chkagree=findViewById(R.id.chkagree);
        text2=findViewById(R.id.text2);
        rgroup1=findViewById(R.id.rgroup1);
        rdoo=findViewById(R.id.rdoo);
        rdop=findViewById(R.id.rdop);
        rdoq=findViewById(R.id.rdoq);
        btnok=findViewById(R.id.btnok);
        imgpet=findViewById(R.id.imgpet);

        chkagree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkagree.isChecked()==true){
                    text2.setVisibility(View.VISIBLE);
                    rgroup1.setVisibility(View.VISIBLE);
                    btnok.setVisibility(View.VISIBLE);
                    imgpet.setVisibility(View.VISIBLE);
                }else{
                    text2.setVisibility(View.INVISIBLE);
                    rgroup1.setVisibility(View.INVISIBLE);
                    btnok.setVisibility(View.INVISIBLE);
                    imgpet.setVisibility(View.INVISIBLE);
                }
            }
        });
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rgroup1.getCheckedRadioButtonId()){
                    case R.id.rdoo:
                        imgpet.setImageResource(R.drawable.oreo);
                        break;
                    case R.id.rdop:
                        imgpet.setImageResource(R.drawable.pie);
                        break;
                    case R.id.rdoq:
                        imgpet.setImageResource(R.drawable.q10);
                        break;
                }
            }
        });
    }



}