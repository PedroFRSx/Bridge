package org.example;

import org.example.Dispositivo;

public class Computador extends Dispositivo {
    public Computador(SistemaOperacional sistemaOperacional) {
        super(sistemaOperacional);
    }

    @Override
    public String descrever() {
        return "Computador rodando: " + sistemaOperacional.getNome();
    }
}