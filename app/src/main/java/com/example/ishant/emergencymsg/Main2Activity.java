package com.example.ishant.emergencymsg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
Spinner s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(getBaseContext(),"Surprise Motherfucker",Toast.LENGTH_SHORT).show();
        s1= (Spinner)findViewById(R.id.funcspinner);
        s2= (Spinner)findViewById(R.id.grpspinner);
        s1.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String sp1=String.valueOf(s1.getSelectedItem());
        if(sp1.contentEquals("Fire")) {
            List<String> l1=new ArrayList<String>();
            l1.add("Security");
            l1.add("Maintenance");
            l1.add("Admin");
            ArrayAdapter<String> aa=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,l1);
            aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            aa.notifyDataSetChanged();
            s2.setAdapter(aa);
        }
        if(sp1.contentEquals("System crash")) {
            List<String> l1=new ArrayList<String>();
            l1.add("IT");
            l1.add("Maintenance");

            ArrayAdapter<String> aa1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,l1);
            aa1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            aa1.notifyDataSetChanged();
            s2.setAdapter(aa1);
        }
        }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
