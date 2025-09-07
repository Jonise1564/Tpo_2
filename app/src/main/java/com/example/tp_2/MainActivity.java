package com.example.tp_2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.example.tp_2.databinding.ActivityMainBinding;

import model.Libro;
import viewModel.MainViewModel;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainViewModel viewModel;;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
    //Escucha el evento onclick del boton Buscar de la pantalla principal
        binding.btnBuscar.setOnClickListener(v -> {
            Log.d("Boton","Boton buscar presionado");
            String texto = binding.etTituloBuscar.getText().toString();
                    Log.d("libro", texto);
                    viewModel.buscarLibro(texto);
        });

        viewModel.getlibroEncotrado().observe(this, libro -> {
            if (libro != null) {
                Log.d("libro encontrado","libroEncontrado");
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("libro", libro); // Libro implementa Serializable
                startActivity(intent);
            } else {
                binding.etTituloBuscar.setError("No se encontró el libro");
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

}