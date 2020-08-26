 package co.example.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

 public class FormularioActivity extends AppCompatActivity {

     private TextView txtNombre;
     private TextView txtApellido;
     private TextView txtTelefono;
     private Button ButtonDiligenciar;
     private EditText Nombre;
     private EditText Apellido;
     private EditText Telefono;

     public FormularioActivity() {
     }
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
         this.setTitle(R.string.titulo_formulario);

        ButtonDiligenciar = findViewById(R.id.buttonDiligenciar);
        txtNombre = findViewById(R.id.textViewNombre);
        txtApellido = findViewById(R.id.textViewApellido);
        txtTelefono = findViewById(R.id.textViewTelefono);
        Nombre = findViewById(R.id.editTextNombre);
        Apellido = findViewById(R.id.editTextApellido);
        Telefono = findViewById(R.id.editTextTelefono);
    }
     public void pulsar_Diligenciar(View view) {
         int cuenta = 0;
         String nombre = Nombre.getText().toString();
         String apellido = Apellido.getText().toString();
         String telefono = Telefono.getText().toString();
         if ("".equals(nombre)){
             txtNombre.setError(getString(R.string.requerido));
             cuenta++;
         }
         else
             txtNombre.setError(null);

         if ("".equals(apellido)){
             txtApellido.setError(getString(R.string.requerido));
             cuenta++;
         }
         else
             txtApellido.setError(null);

         if ("".equals(telefono)){
             txtTelefono.setError(getString(R.string.requerido));
             cuenta++;
         }
         else
             txtTelefono.setError(null);

         if(cuenta>0){
             Toast.makeText(getApplicationContext(),"Diligenciar todos los campos.",Toast.LENGTH_LONG).show();
         }
         else {
             Toast.makeText(getApplicationContext(),"Hola " + nombre + " "+ apellido + ". Tu teléfono es: " + telefono,Toast.LENGTH_LONG).show();
         }
     }
 }