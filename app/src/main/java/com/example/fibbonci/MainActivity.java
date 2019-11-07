package com.example.fibbonci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int n1=0;
        int n2=1;
        int n3;
        int i;
        int count=10;
        System.out.print(n1+""+n2);
        for (i=2;i<count;++i){
            n3=n1+n2;
            System.out.print(n3);
            n1=n2;
            n2=n3;
        }
    }
}
