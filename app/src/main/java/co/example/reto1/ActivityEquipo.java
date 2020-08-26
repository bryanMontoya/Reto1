package co.example.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityEquipo extends AppCompatActivity {

    private ImageView imageViewJ;
    private ImageView imageViewB;
    private TextView textViewJ;
    private TextView textViewB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipo);
        this.setTitle(R.string.titulo_Equipo);

        imageViewJ = findViewById(R.id.imageViewJ);
        textViewJ = findViewById(R.id.textViewJ);
        textViewJ.setText(R.string.NombreJ);
        imageViewB = findViewById(R.id.imageViewB);
        textViewB = findViewById(R.id.textViewB);
        textViewB.setText(R.string.NombreB);
    }
}