package com.example.linearlayoutasexpandable;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout student1Parent,student2Parent,student3Parent,student4Parent,student5Parent,student6Parent;
    ImageButton imgStudent1,imgStudent2,imgStudent3,imgStudent4,imgStudent5,imgStudent6;
    LinearLayout student1Child,student2Child,student3Child,student4Child,student5Child,student6Child;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeWidgets();
    }

    private void initializeWidgets() {

        //Parent Linear Layout Mapping
        student1Parent = findViewById(R.id.student1Parent);
        student2Parent = findViewById(R.id.student2Parent);
        student3Parent = findViewById(R.id.student3Parent);
        student4Parent = findViewById(R.id.student4Parent);
        student5Parent = findViewById(R.id.student5Parent);
        student6Parent = findViewById(R.id.student6Parent);

        //Child Linear Layout Mapping
        student1Child = findViewById(R.id.student1Child);
        student2Child = findViewById(R.id.student2Child);
        student3Child = findViewById(R.id.student3Child);
        student4Child = findViewById(R.id.student4Child);
        student5Child = findViewById(R.id.student5Child);
        student6Child = findViewById(R.id.student6Child);

        //Image Button Mapping
        imgStudent1 = findViewById(R.id.imgStudent1);
        imgStudent2 = findViewById(R.id.imgStudent2);
        imgStudent3 = findViewById(R.id.imgStudent3);
        imgStudent4 = findViewById(R.id.imgStudent4);
        imgStudent5 = findViewById(R.id.imgStudent5);
        imgStudent6 = findViewById(R.id.imgStudent6);

        student1Parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (student1Child.isShown()) {
                    imgStudent1.setImageResource(R.drawable.ic_keyboard_arrow_down);
                    student1Child.setVisibility(View.GONE);
                } else {
                    imgStudent1.setImageResource(R.drawable.ic_keyboard_arrow_up);
                    student1Child.setVisibility(View.VISIBLE);
                }
            }
        });

        student2Parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (student2Child.isShown()) {
                    imgStudent2.setImageResource(R.drawable.ic_keyboard_arrow_down);
                    student2Child.setVisibility(View.GONE);
                } else {
                    imgStudent2.setImageResource(R.drawable.ic_keyboard_arrow_up);
                    student2Child.setVisibility(View.VISIBLE);
                }
            }
        });

        student3Parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (student3Child.isShown()) {
                    imgStudent3.setImageResource(R.drawable.ic_keyboard_arrow_down);
                    student3Child.setVisibility(View.GONE);
                } else {
                    imgStudent3.setImageResource(R.drawable.ic_keyboard_arrow_up);
                    student3Child.setVisibility(View.VISIBLE);
                }
            }
        });

        student4Parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (student4Child.isShown()) {
                    imgStudent4.setImageResource(R.drawable.ic_keyboard_arrow_down);
                    student4Child.setVisibility(View.GONE);
                } else {
                    imgStudent4.setImageResource(R.drawable.ic_keyboard_arrow_up);
                    student4Child.setVisibility(View.VISIBLE);
                }
            }
        });

        student5Parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (student5Child.isShown()) {
                    imgStudent5.setImageResource(R.drawable.ic_keyboard_arrow_down);
                    student5Child.setVisibility(View.GONE);
                } else {
                    imgStudent5.setImageResource(R.drawable.ic_keyboard_arrow_up);
                    student5Child.setVisibility(View.VISIBLE);
                }
            }
        });

        student6Parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (student6Child.isShown()) {
                    imgStudent6.setImageResource(R.drawable.ic_keyboard_arrow_down);
                    student6Child.setVisibility(View.GONE);
                } else {
                    imgStudent6.setImageResource(R.drawable.ic_keyboard_arrow_up);
                    student6Child.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
