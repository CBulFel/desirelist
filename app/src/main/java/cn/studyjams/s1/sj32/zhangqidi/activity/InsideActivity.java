package cn.studyjams.s1.sj32.zhangqidi.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import cn.studyjams.s1.sj32.zhangqidi.R;

public class InsideActivity extends AppCompatActivity {
    private TextView textView,textView2,textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_inside);

        Intent it=super.getIntent();
        String type=it.getStringExtra("type");
        String date=it.getStringExtra("date");
        String detail=it.getStringExtra("detail");

        textView=(TextView)findViewById(R.id.textView2);
        textView2=(TextView)findViewById(R.id.textView4);
        textView3=(TextView)findViewById(R.id.textView6);

        textView.setText(type);
        textView2.setText(date);
        textView3.setText(detail);
    }
}
