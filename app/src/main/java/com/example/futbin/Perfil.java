package com.example.futbin;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Perfil extends Fragment {

    Button botonEditarequipo;
    Button botonEditarseleccion;
    Button botonEditarCompeticion;
    NavController navController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfil, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        botonEditarequipo = view.findViewById(R.id.BotonSiguiente);

        botonEditarseleccion = view.findViewById(R.id.BotonSiguiente);

        botonEditarCompeticion = view.findViewById(R.id.BotonSiguiente);

        botonEditarequipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_perfil_to_edicionEquipo);
            }
        });

        botonEditarseleccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_perfil_to_edicionSeleccion);
            }
        });

        botonEditarCompeticion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_perfil_to_editarCompeticion);
            }
        });
    }
}