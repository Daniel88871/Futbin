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

public class Menu extends Fragment {

    Button botonPerfil;
    Button botonNotificaciones;
    Button botonCalendario;
    Button botonPartido;
    Button botonNoticia;
    NavController navController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        botonPerfil = view.findViewById(R.id.BotonSiguiente);
        botonNotificaciones = view.findViewById(R.id.BotonSiguiente);
        botonCalendario = view.findViewById(R.id.BotonSiguiente);
        botonPartido = view.findViewById(R.id.BotonSiguiente);
        botonNoticia = view.findViewById(R.id.BotonSiguiente);

        botonPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menu_to_perfil);
            }
        });

        botonNotificaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menu_to_calendario);
            }
        });

        botonCalendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menu_to_calendario);
            }
        });

        botonPartido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menu_to_resultadoPartido);
            }
        });

        botonNoticia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menu_to_noticia);
            }
        });
    }
}