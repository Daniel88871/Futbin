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
import android.widget.ImageButton;

public class Menu extends Fragment {

    ImageButton botonPerfil;
    ImageButton botonNotificaciones;
    ImageButton botonCalendario;
    ImageButton botonpartidoPequeno;
    Button botonpartidoGrande;
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

        botonPerfil = view.findViewById(R.id.botonPerfil);
        botonNotificaciones = view.findViewById(R.id.botonNotificaciones);
        botonCalendario = view.findViewById(R.id.botonCalendario);
        botonpartidoPequeno = view.findViewById(R.id.botonPartidopequeno);
        botonpartidoGrande = view.findViewById(R.id.botonPartidogrande);
        botonNoticia = view.findViewById(R.id.botonNoticia);

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

        botonpartidoPequeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menu_to_resultadoPartido);
            }
        });

        botonpartidoGrande.setOnClickListener(new View.OnClickListener() {
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