package cl.awakelab.ejercicio7m5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import cl.awakelab.ejercicio7m5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements VistaPresentador{
private Presentador presentador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presentador = new Presentador(this);
        binding.editPass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                presentador.evaluarContrasena(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void mostrarDebil() {
        Toast.makeText(this, "DEBIL", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mostrarMedio() {
        Toast.makeText(this, "MEDIA", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mostrarFuerte() {
        Toast.makeText(this, "FUERTE", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mostrarError() {

    }
}