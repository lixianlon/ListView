package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class simple extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap<String,Object>>list;
    int[] icon={R.drawable.icon1,R.drawable.icon2,R.drawable.icon3};
    String[] xingming={"小李","小胡","小刘"};
    String[] gongzuo={"摄影师","画家","工程师"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        listView = (ListView) findViewById(R.id.op);
        list = initDatas();

        SimpleAdapter adapter = new SimpleAdapter(this, list, R.layout.thing, new String[]{"img", "name", "job"}, new int[]{R.id.img, R.id.name, R.id.job});
        listView.setAdapter(adapter);
    }

        private ArrayList<HashMap<String,Object>> initDatas(){
            ArrayList<HashMap<String,Object>> tmplist=new ArrayList<>();

            for(int i=0;i<3;i++){
                HashMap<String,Object> map= new HashMap<>();
                map.put("img",icon[i]);
                map.put("name",xingming[i]);
                map.put("job",gongzuo[i]);
                tmplist.add(map);
            }
            return tmplist;
        }
    }