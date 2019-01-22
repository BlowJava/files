package com.example.garci.apps;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText word1;
    EditText word2;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        word1 = (EditText) findViewById(R.id.edit_text_first);
        word2 = (EditText) findViewById(R.id.edit_text_second);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = word1.getText().toString();
                String b = word2.getText().toString();
                if(a.equals(b)){
                    toasting("THE SAME!");
                }else {
                    toasting("NOT THE SAME");
                }
            }
        });

    }
    void toasting(String x){
        Toast.makeText(MainActivity.this,"" ,Toast.LENGTH_SHORT).show();
        final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Great!")
            .setMessage("IT IS \n" + x)
            .setNegativeButton(  "OK", new DialogInterface.OnClickListener() {
            @Override
                    public void onClick(DialogInterface dialog, int which){
                        dialog.dismiss();
            }
        });
        alert.show();
    }
}
