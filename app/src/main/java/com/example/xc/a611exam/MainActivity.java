package com.example.xc.a611exam;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import net.sourceforge.pinyin4j.PinyinHelper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> name = new ArrayList<>();

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name.add("啊红");
        name.add("吧红");
        name.add("成红");
        name.add("的红");
        name.add("额红");
        name.add("分红");
        name.add("个红");
        name.add("好红");
        name.add("i红");
        name.add("就红");
        name.add("看红");
        name.add("了红");
        name.add("吗红");
        name.add("你红");
        name.add("哦红");
        name.add("票红");
        name.add("去红");
        name.add("人红");
        name.add("是红");
        name.add("他红");
        ListAdapter listAdapter = new ListAdapter(this, name);
        ListView view = (ListView) findViewById(R.id.list);
        view.setAdapter(listAdapter);
        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        new WindowManager() {
            @Override
            public void addView(View view, ViewGroup.LayoutParams params) {

            }

            @Override
            public void updateViewLayout(View view, ViewGroup.LayoutParams params) {

            }

            @Override
            public void removeView(View view) {

            }

            @Override
            public Display getDefaultDisplay() {
                return null;
            }

            @Override
            public void removeViewImmediate(View view) {

            }
        };
    }
}

class ListAdapter extends BaseAdapter {
    private Context context;
    private List<String> name;
    private TextView tv1;
    private TextView tv2;

    public ListAdapter(Context context, List<String> name) {
        this.context = context;
        this.name = name;
    }

    @Override
    public int getCount() {
        return name.size();
    }

    @Override
    public Object getItem(int position) {
        return name.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false);

        tv1 = convertView.findViewById(R.id.one);
        tv2 = convertView.findViewById(R.id.two);



        String s = name.get(position);
        String[] strings = PinyinHelper.toHanyuPinyinStringArray(s.charAt(position));
        tv1.setText(strings.toString());

        tv2.setText(s);
        return convertView;
    }


}
