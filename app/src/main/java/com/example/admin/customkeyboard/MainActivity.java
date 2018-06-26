package com.example.admin.customkeyboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {
    ImageView imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView29,imageView28,imageView11,imageView12,imageView13,
            imageView14,imageView15,imageView16,imageView17,imageView30,imageView19,imageView31,imageView21,imageView22,imageView23,imageView24,imageView25,
            imageView27,imageView26;
    String TAG=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        setContentView(R.layout.activity_main);
        imageView2=findViewById(R.id.imageView2);
        imageView3=findViewById(R.id.imageView3);
        imageView4=findViewById(R.id.imageView4);
        imageView5=findViewById(R.id.imageView5);
        imageView6=findViewById(R.id.imageView6);
        imageView7=findViewById(R.id.imageView7);
        imageView8=findViewById(R.id.imageView8);
        imageView28=findViewById(R.id.imageView28);
        imageView29=findViewById(R.id.imageView29);
        imageView11=findViewById(R.id.imageView11);
        imageView12=findViewById(R.id.imageView12);
        imageView13=findViewById(R.id.imageView13);
        imageView14=findViewById(R.id.imageView14);
        imageView15=findViewById(R.id.imageView15);
        imageView16=findViewById(R.id.imageView16);
        imageView17=findViewById(R.id.imageView17);
        imageView30=findViewById(R.id.imageView30);
        imageView19=findViewById(R.id.imageView19);
        imageView31=findViewById(R.id.imageView31);
        imageView21=findViewById(R.id.imageView21);
        imageView22=findViewById(R.id.imageView22);
        imageView23=findViewById(R.id.imageView23);
        imageView24=findViewById(R.id.imageView24);
        imageView26=findViewById(R.id.imageView26);
        imageView25=findViewById(R.id.imageView25);
        imageView27=findViewById(R.id.imageView27);


        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);
        imageView29.setOnClickListener(this);
        imageView28.setOnClickListener(this);
        imageView11.setOnClickListener(this);
        imageView12.setOnClickListener(this);
        imageView13.setOnClickListener(this);
        imageView14.setOnClickListener(this);
        imageView15.setOnClickListener(this);
        imageView16.setOnClickListener(this);
        imageView17.setOnClickListener(this);
        imageView30.setOnClickListener(this);
        imageView19.setOnClickListener(this);
        imageView31.setOnClickListener(this);
        imageView21.setOnClickListener(this);
        imageView22.setOnClickListener(this);
        imageView23.setOnClickListener(this);
        imageView24.setOnClickListener(this);
        imageView25.setOnClickListener(this);
        imageView26.setOnClickListener(this);
        imageView27.setOnClickListener(this);











    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView2:
                Log.i(TAG,"A");
                Toast.makeText(this,"A",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView3:
                Log.i(TAG,"S");
                Toast.makeText(this,"S",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView4:
                Log.i(TAG,"D");
                Toast.makeText(this,"D",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView5:
                Log.i(TAG,"F");
                Toast.makeText(this,"F",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView6:
                Log.i(TAG,"G");
                Toast.makeText(this,"G",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView7:
                Log.i(TAG,"H");
                Toast.makeText(this,"H",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView8:
                Log.i(TAG,"J");
                Toast.makeText(this,"J",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView28:
                Log.i(TAG,"V");
                Toast.makeText(this,"V",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView29:
                Log.i(TAG,"B");
                Toast.makeText(this,"B",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView11:
                Log.i(TAG,"Q");
                Toast.makeText(this,"Q",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView12:
                Log.i(TAG,"W");
                Toast.makeText(this,"W",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView13:
                Log.i(TAG,"E");
                Toast.makeText(this,"E",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView14:
                Log.i(TAG,"R");
                Toast.makeText(this,"R",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView15:
                Log.i(TAG,"T");
                Toast.makeText(this,"T",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView16:
                Log.i(TAG,"Y");
                Toast.makeText(this,"Y",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView17:
                Log.i(TAG,"K");
                Toast.makeText(this,"K",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView30:
                Log.i(TAG,"N");
                Toast.makeText(this,"N",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView19:
                Log.i(TAG,"L");
                Toast.makeText(this,"L",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView31:
                Log.i(TAG,"M");
                Toast.makeText(this,"M",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView21:
                Log.i(TAG,"U");
                Toast.makeText(this,"U",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView22:
                Log.i(TAG,"I");
                Toast.makeText(this,"I",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView23:
                Log.i(TAG,"O");
                Toast.makeText(this,"O",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView24:
                Log.i(TAG,"P");
                Toast.makeText(this,"P",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView25:
                Log.i(TAG,"Z");
                Toast.makeText(this,"Z",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView26:
                Log.i(TAG,"X");
                Toast.makeText(this,"X",Toast.LENGTH_SHORT).show();break;
            case R.id.imageView27:
                Log.i(TAG,"C");
                Toast.makeText(this,"C",Toast.LENGTH_SHORT).show();break;

        }
    }
}
