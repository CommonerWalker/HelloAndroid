package com.example.administrator.helloandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.mText1)
    TextView mText1;
    @Bind(R.id.mText2)
    TextView mText2;
    @Bind(R.id.mText3)
    TextView mText3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    @OnClick({R.id.mText1, R.id.mText2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mText1:
                Toast.makeText(this, "点击了", Toast.LENGTH_SHORT).show();


                break;
            case R.id.mText2:
                Toast.makeText(this, "点击了2", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
