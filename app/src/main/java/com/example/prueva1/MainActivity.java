package com.example.prueva1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button bpress;
    public EditText name;
    public TextView mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bpress = (Button) findViewById(R.id.bpress);
        name = (EditText) findViewById(R.id.name);
        mostrar = (TextView) findViewById(R.id.mostrar);
        bpress.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                mostrar.setText(name.getText());
            }
        });
    }
}
