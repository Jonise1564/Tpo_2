package com.example.tp_2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.tp_2.databinding.ActivityDetalleBinding;

import model.Libro;
import viewModel.SecondViewModel;

public class SecondActivity extends AppCompatActivity {

    private ActivityDetalleBinding binding;
    private SecondViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflar el binding
        binding = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // ViewModel
        viewModel = new ViewModelProvider(this).get(SecondViewModel.class);

        // Recuperar libro enviado desde MainActivity
        Libro libroRecibido = (Libro) getIntent().getSerializableExtra("libro");
        viewModel.setLibro(libroRecibido);

        // Observar LiveData y actualizar la UI
        viewModel.getLibro().observe(this, libro -> {
            if (libro != null) {
                binding.tvTitulo.setText(libro.getTitulo());
                binding.tvAutor.setText(libro.getAutor());
                binding.tvDescripcion.setText(libro.getDescripcion());
                binding.tvCategoria.setText(libro.getCategoria());
                binding.tvFecha.setText(String.valueOf(libro.getFecha()));
            }
        });
    }
}


