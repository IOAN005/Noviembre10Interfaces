package com.corenetworks.modelo;

public class Superman implements IobjectoVolador{
    @Override
    public String despegar() {
        return "El superman despega";
    }

    @Override
    public String volar() {
        return "El superman vuela";
    }

    @Override
    public String aterizar() {
        return "El superman ateriza";
    }
    public String saltaEdificios(){
        return "El superman salta edicicios";

    }
    public String detenerBalas(){
        return "El superman detiene balas";
    }

    @Override
    public String toString() {
        return "Superman{}";
    }
}
