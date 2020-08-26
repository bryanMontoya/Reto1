package co.example.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class EdadActivity extends AppCompatActivity {
    private EditText widYear;
    private int y;
    private int m;
    private int d;

    private int yAct;
    private int mAct;
    private int dAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edad);
        this.setTitle(R.string.titulo_edad);


        widYear = findViewById(R.id.widYear);
        widYear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.widYear:
                        showDatePickerDialog();
                }
            }
        });

        //--------------Fecha del sistema.---------------
        Calendar fecActual = Calendar.getInstance();
        this.yAct = fecActual.get(Calendar.YEAR);
        this.mAct = fecActual.get(Calendar.MONTH);
        this.dAct = fecActual.get(Calendar.DAY_OF_MONTH);
        //-----------------------------------------------
    }

    private void showDatePickerDialog() {
        DatePickerFragment newFragment = DatePickerFragment.newInstance(new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                final String selectedDate = day + " / " + (month + 1) + " / " + year;
                widYear.setText(selectedDate);
                y = year;
                m = month;
                d = day;
            }
        });
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }
    public void calcularEdad(View view) {
        int res;
        if (this.y < this.yAct && this.m < this.mAct && this.y != 0) {
            res = this.yAct - this.y;
            String txt = "Edad: " + res + " años.";
            Toast.makeText(getApplicationContext(), txt, Toast.LENGTH_SHORT).show();
        }
        else if (this.y < this.yAct && this.m > this.mAct && this.y != 0){
            res = this.yAct - this.y - 1;
            String  txt =  "Edad: " + res + " años.";
            Toast.makeText(getApplicationContext(), txt, Toast.LENGTH_SHORT).show();
        }
        else if (this.y < this.yAct && this.m == this.mAct && this.d <= this.dAct && this.y != 0) {
            res = this.yAct - this.y;
            String txt = "Edad: " + res + " años.";
            Toast.makeText(getApplicationContext(), txt, Toast.LENGTH_SHORT).show();
        }
        else if (this.y < this.yAct && this.m == this.mAct && this.d > this.dAct && this.y != 0) {
            res = this.yAct - this.y - 1;
            String txt = "Edad: " + res + " años.";
            Toast.makeText(getApplicationContext(), txt, Toast.LENGTH_SHORT).show();
        }
        else if (this.y == this.yAct && this.m < this.mAct && this.y != 0) {
            res = this.yAct - this.y;
            String txt = "Edad: " + res + " años.";
            Toast.makeText(getApplicationContext(), txt, Toast.LENGTH_SHORT).show();
        }
        else if (this.y == this.yAct && this.m > this.mAct && this.y != 0) {
            Toast.makeText(getApplicationContext(), R.string.txtRech, Toast.LENGTH_SHORT).show();
        }
        else if (this.y == this.yAct && this.m == this.mAct && this.d <= this.dAct && this.y != 0) {
            res = this.yAct - this.y;
            String txt = "Edad: " + res + " años.";
            Toast.makeText(getApplicationContext(), txt, Toast.LENGTH_SHORT).show();
        }
        else if (this.y == this.yAct && this.m == this.mAct && this.d > this.dAct && this.y != 0) {
            Toast.makeText(getApplicationContext(), R.string.txtRech, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getApplicationContext(), R.string.txtRech, Toast.LENGTH_SHORT).show();
        }
    }
}