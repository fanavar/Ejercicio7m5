package cl.awakelab.ejercicio7m5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.awakelab.ejercicio7m5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}