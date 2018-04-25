package com.app.sans.formapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText inputName=(EditText)findViewById(R.id.Name);
        Button submitButton = (Button) findViewById(R.id.Submit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    CheckBox Write=(CheckBox)findViewById(R.id.Writing);
                    CheckBox Read=(CheckBox)findViewById(R.id.Reading);
                    CheckBox Watch=(CheckBox)findViewById(R.id.Watching);
                    StringBuffer listHobby=new StringBuffer();
                    listHobby.append("Writing").append(Write.isChecked()).append("\n");
                    listHobby.append("Reading").append(Read.isChecked()).append("\n");
                    listHobby.append("Watching").append(Watch.isChecked()).append("\n");
                    RadioGroup groupSelectGender=(RadioGroup)findViewById(R.id.Gender);
                    int selectedGen=groupSelectGender.getCheckedRadioButtonId();
                    RadioButton select=(RadioButton)findViewById(selectedGen);
                Toast.makeText(MainActivity.this, inputName.getText()+ select.getText().toString()+listHobby.toString(),Toast.LENGTH_SHORT).show();
            }
        });


    }
}