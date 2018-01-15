package com.example.elis.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = findViewById(R.id.precoAlcoolId);
        precoGasolina = findViewById(R.id.precoGasolinaId);
        botaoVerificar = findViewById(R.id.botaoVerificarId);
        textoResultado = findViewById(R.id.textoResultadoId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //recuperandoo os valores digitados

                String textoPrecoAlcool =  precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                double resultado = valorAlcool / valorGasolina;


                if(textoPrecoAlcool.isEmpty() || textoPrecoGasolina.isEmpty()){

                    textoResultado.setText("Digite um valor!!!");

                }else if(resultado >= 0.7){

                    textoResultado.setText("É melhor abastecer com a gasolina !");

                }else{

                    textoResultado.setText("É melhor abastecer com o álcool !");
                }

            }
        });

    }
}
