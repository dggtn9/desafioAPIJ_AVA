package com.alura.desafio.desafio.principal;

import com.alura.desafio.desafio.service.ConsumoAPI;
import com.alura.desafio.desafio.service.ConvierteDatos;

public class Principal {
    private static final String URL_BASE = "https://gutendex.com/books/";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    public void muestraElMenu(){
        var json = consumoAPI.obtenerDatos(URL_BASE);
        System.out.println(json);

    }
}
