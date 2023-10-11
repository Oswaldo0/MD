package com.example.md;
import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material.textfield.TextInputEditText;
public class MainActivity extends AppCompatActivity {
    private TextInputEditText edtNombre, edtApellido, edtEdad;
    private Button btnSaveData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNombre = findViewById(R.id.edtName);
        edtApellido = findViewById(R.id.edtLastName);
        edtEdad = findViewById(R.id.edtAge);
        btnSaveData = findViewById(R.id.btnSaveData);
        btnSaveData.setOnClickListener(v -> {
            new AlertDialog.Builder(this)
                    .setTitle("Éxito")
                    .setMessage("Se han insertado los siguiente datos: " +
                            edtNombre.getText().toString() + " | " +
                            edtApellido.getText().toString() + " | " +
                            edtEdad.getText().toString())
                    .setPositiveButton(android.R.string.ok, new
                            DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which)
                                {
                                    dialog.dismiss();
                                }
                            })
                    .show();
        });
    }
}