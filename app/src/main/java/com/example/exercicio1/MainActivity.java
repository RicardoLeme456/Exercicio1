package com.example.exercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText editDadosDaCarne, editDadosDoPeixe;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editDadosDaCarne = findViewById(R.id.editDadosDaCarne);
        editDadosDoPeixe = findViewById(R.id.editDadosDoPeixe);
        textResultado = findViewById(R.id.textResultado);
    }

    public void clicar(View view) {
        String dadosCarne = editDadosDaCarne.getText().toString();
        String dadosPeixe = editDadosDoPeixe.getText().toString();

        Boolean camposValidados = validarCampos(dadosCarne, dadosPeixe);
        if(camposValidados){
            Double resultadoCarne = Double.parseDouble(dadosCarne);
            Double resultadoPeixe = Double.parseDouble(dadosPeixe);

            Double resultado = resultadoCarne / resultadoPeixe;
            if(resultado >= 26){
                textResultado.setText("Proteína da Carne");
            }else {
                textResultado.setText("Proteína do Peixe");
            }
        }
    }
    public Boolean validarCampos(String pCarne, String pPeixe) {
        Boolean camposValidados = true;
        if(pCarne == null || pCarne.equals("")){
            camposValidados = false;
        }else if(pPeixe == null || pPeixe.equals("")){
            camposValidados = false;

        }
        return camposValidados;
    }

}