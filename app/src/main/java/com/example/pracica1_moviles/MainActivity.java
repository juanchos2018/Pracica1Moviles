package com.example.pracica1_moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  int contador=0;
    private TextView txtview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtview1=(TextView)findViewById(R.id.txt1);

    }
    public void Mostrar(View view ){
        Toast.makeText(this, getString(R.string.mensaje).toString() +" " + txtview1.getText().toString(), Toast.LENGTH_SHORT).show();
    }
    public void Contar(View view ){
        contador++;
        txtview1.setText(String.valueOf(contador));
    }

}
