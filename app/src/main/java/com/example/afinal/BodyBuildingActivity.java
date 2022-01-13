package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class BodyBuildingActivity extends AppCompatActivity {

    class Data{
        int photo;
        String name;
    }
    private Button btn_f,btn_ff;
    private TextView textView;

    public class MyAdapter extends BaseAdapter{
        private BodyBuildingActivity.Data[] data;
        private int view;
        private RadioGroup rg1;




        public MyAdapter(BodyBuildingActivity.Data[] data,int view){
            this.data=data;
            this.view=view;
        }

        @Override
        public int getCount() {return data.length;}

        @Override
        public Object getItem(int position) {
            return 0;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){

            convertView = getLayoutInflater().inflate(view, parent, false);
            TextView name = convertView.findViewById(R.id.name);
            name.setText(data[position].name);
            return convertView;
        }


    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_building);


        btn_f = findViewById(R.id.btn_f);
        btn_ff = findViewById(R.id.btn_ff);
        textView=findViewById(R.id.textView);
        btn_f.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivityForResult(new Intent(BodyBuildingActivity.this,
                        MainActivity.class), 1);


            }
        });
        btn_ff.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivityForResult(new Intent(BodyBuildingActivity.this,
                        Congratulation.class), 1);
            }
        });




    }
}