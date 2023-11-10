package com.corenetworks.modelo;

public class Barcaza implements Inautico{
    @Override
    public String navegar() {
        return "El barco esta navegando";
    }

    @Override
    public String atracar() {
        return "El barco atraca";
    }

    @Override
    public String toString() {
        return "Barcaza{}";
    }
}



