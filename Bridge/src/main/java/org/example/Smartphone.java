package org.example;

import org.example.Dispositivo;

public class Smartphone extends Dispositivo {
    public Smartphone(SistemaOperacional sistemaOperacional) {
        super(sistemaOperacional);
    }

    @Override
    public String descrever() {
        return "Smartphone rodando: " + sistemaOperacional.getNome();
    }
}