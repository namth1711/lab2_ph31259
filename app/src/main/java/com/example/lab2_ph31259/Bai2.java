package com.example.lab2_ph34899;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Button;

import com.example.lab2_ph31259.R;


public class Bai2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        TextView txtresult=findViewById(R.id.txtresult);
        EditText edtName=findViewById(R.id.edtName);
        EditText edtID=findViewById(R.id.edtID);
        EditText edtAge=findViewById(R.id.edtAge);
        RadioButton rdoNam=findViewById(R.id.rdoNam);
        RadioButton rdoNu=findViewById(R.id.rdoNu);
        CheckBox chkFootBall= findViewById(R.id.chkFootball);
        CheckBox chkGame= findViewById(R.id.chkGame);
        Button btnLuu= findViewById(R.id.btnLuu);

        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= edtName.getText().toString();
                String id=edtID.getText().toString();
                String age= edtAge.getText().toString();
                String gioiTinh= rdoNam.isChecked()
                        ?rdoNam.getText().toString()
                        :rdoNu.isChecked()
                        ?rdoNu.getText().toString()
                        :"Chua lua chon gioi tinh";

                String soThich=chkFootBall.isChecked()&&chkGame.isChecked()
                        ?"Da bong va choi game"
                        :chkFootBall.isChecked()
                        ?chkFootBall.getText().toString()
                        :chkGame.isChecked()
                        ?chkGame.getText().toString()
                        :"Khong thich gi ca";
                txtresult.setText("Toi ten"+name+"\n"
                        +"MSSV: "+id+"\n"
                        +"Tuoi: "+age+"\n"
                        +"Gioi tinh: "+gioiTinh+
                        "\n"+"So thich: "+soThich);

            }
        });
    }
}