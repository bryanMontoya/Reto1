package co.example.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonFormulario;
    private Button buttonEdad;
    private Button buttonEquipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle(R.string.titulo_principal);

        buttonFormulario = findViewById(R.id.buttonFormulario);
        buttonEdad = findViewById(R.id.buttonEdad);
        buttonEquipo = findViewById(R.id.buttonEquipo);
    }

    public void Click_Formulario(View view) {
        //Toast.makeText( getApplicationContext(),R.string.saludo1,Toast.LENGTH_LONG).show();
        Intent intentA = new Intent(getApplicationContext(),FormularioActivity.class);
        startActivity(intentA);
    }

    public void Click_Equipo(View view) {
        Intent intentB = new Intent(getApplicationContext(),ActivityEquipo.class);
        startActivity(intentB);
    }

    public void Click_Edad(View view) {
        Intent intentC = new Intent(getApplicationContext(),EdadActivity.class);
        startActivity(intentC);
    }
}