package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class JavaMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Java Activity");
        JavaRootScope rootScope = new JavaRootScopeImpl();
        JavaMainScope mainScope = rootScope.javaMainScope("profileId", "postId");

        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);

        textView1.setText(mainScope.controller().getProfileId());
        textView2.setText(mainScope.controller().getPostId());
    }

}
