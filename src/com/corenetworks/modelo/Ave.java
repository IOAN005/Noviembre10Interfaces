package com.corenetworks.modelo;

public class Ave implements IobjectoVolador{

    @Override
    public String despegar() {
        return "El ave esta despegando";
    }

    @Override
    public String volar() {
        return "El ave esta volando";
    }

    @Override
    public String aterizar() {
        return "El ave esta aterizando";

    }
    public String hacerNido(){
        return "El ave esta haciendo su nido";

    }
    public String ponerHuevos(){
        return "El ave esta poniendo huevos";

    }

    @Override
    public String toString() {
        return "Ave{}";
    }
}
