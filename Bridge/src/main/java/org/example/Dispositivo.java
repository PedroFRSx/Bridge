package org.example;

public abstract class Dispositivo {
    protected SistemaOperacional sistemaOperacional;

    public Dispositivo(SistemaOperacional sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public void setSistemaOperacional(SistemaOperacional sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public abstract String descrever();
}