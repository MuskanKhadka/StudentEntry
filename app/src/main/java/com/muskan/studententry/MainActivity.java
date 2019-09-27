package com.muskan.studententry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.muskan.studententry.percentage.CalPercentage;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn;
    private TextView Tresult;
    private String name;
    private EditText Ename, Eamarks,Eimarks,Ewmarks;
    private double amarks,wmarks,imarks,per;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.BtnCal);
        Tresult = findViewById(R.id.TxtV);
        Ename = findViewById(R.id.Etname);
        Eamarks = findViewById(R.id.Etamarks);
        Eimarks = findViewById(R.id.Etimarks);
        Ewmarks = findViewById(R.id.Etwmarks);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.BtnCal:{
               if (CheckEntry()==true){

            }
        }
    }
    }
    public boolean CheckEntry(){
        if (TextUtils.isEmpty(Ename.getText().toString())){
            Ename.setError("Please enter name");
            return false;
        }
        else if(TextUtils.isEmpty(Eamarks.getText().toString())){
            Eamarks.setError("Please enter Android marks");
            return false;
        }
        else if(TextUtils.isEmpty(Eimarks.getText().toString())){
            Eimarks.setError("Please: enter IOTmarks");
        return false;
        }
        else if(TextUtils.isEmpty(Ewmarks.getText().toString())){
            Ewmarks.setError("Please enter WebMarks");
            return false;
        }
        else{
            name = Ename.getText().toString();
            wmarks = Double.parseDouble(Ewmarks.getText().toString());
            imarks = Double.parseDouble(Eimarks.getText().toString());
            amarks = Double.parseDouble(Eimarks.getText().toString());
            CalPercentage calPercentage = new CalPercentage(wmarks,imarks,amarks);
            per=calPercentage.Cal();
            SetValue(name,wmarks,imarks,amarks);

            return true;
        }


    }



private void SetValue(String name,Double amarks,Double imarks, Double wmarks){
        Tresult.append("name: "+ name + "androidmarks"+ amarks+ "Iotmarks"+ imarks+"Webmarks"+ wmarks);

}
}
