package com.lourdinas.finalaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class login2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        Button bt_salvar = (Button) findViewById(R.id.bt_salvar);

        TextView tx_nome = findViewById(R.id.tx_nome);

        Intent intentRecebido = getIntent();
        String nome = intentRecebido.getStringExtra("nome");

        tx_nome.setText(nome);

        final EditText sobrenome = findViewById(R.id.edit_sobrenome);
        final EditText formacao = findViewById(R.id.edit_formacao);
        final EditText telefone = findViewById(R.id.edit_telefone);
        final EditText data = findViewById(R.id.edit_data);
        final EditText idade = findViewById(R.id.edit_idade);

        bt_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login2.this, MainActivity.class);
                intent.putExtra("sobrenome", sobrenome.getText().toString());
                intent.putExtra("formacao" , formacao.getText().toString());
                intent.putExtra("telefone" , telefone.getText().toString());
                intent.putExtra("data"     , data.getText().toString());
                intent.putExtra("idade"    , idade.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}
