package com.example.edittext_22;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //에디트텍스트3
    //버튼1
    //텍스트뷰3
    private EditText eText1;
    private EditText eText2;
    private EditText eText3;
    private Button eButton;
    private TextView eTextView1;
    private TextView eTextView2;
    private TextView eTextView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        eText1 = (EditText) findViewById(R.id.XML_editText1);
        eText2 = (EditText) findViewById(R.id.XML_editText2);
        eText3 = (EditText) findViewById(R.id.XML_editText3);

        eButton = (Button) findViewById(R.id.XML_button);

        eTextView1 = (TextView) findViewById(R.id.XML_textView1);
        eTextView2 = (TextView) findViewById(R.id.XML_textView2);
        eTextView3 = (TextView) findViewById(R.id.XML_textView3);

    }

    public void onClicked(View view) {

        String str1 = eText1.getText().toString();
        eTextView1.setText("아이디:" + str1);
        String str2 = eText2.getText().toString();
        eTextView2.setText("패스워드:" + str2);
        String str3 = eText3.getText().toString();
        eTextView3.setText("전화번호:" + str3);




    }
    }
