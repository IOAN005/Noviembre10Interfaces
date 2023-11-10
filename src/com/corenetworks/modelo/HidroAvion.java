package com.corenetworks.modelo;

public class HidroAvion implements Inautico ,IobjectoVolador{
    @Override
    public String navegar() {
        return "El hidroavion navega";
    }

    @Override
    public String atracar() {
        return "El hidroavion atraca";
    }

    @Override
    public String despegar() {
        return "El hidroavion depega";
    }

    @Override
    public String volar() {
        return "El hidroavion vuela";
    }

    @Override
    public String aterizar() {
        return "El hidroavion despega";
    }

    @Override
    public String toString() {
        return "HidroAvion{}";
    }
}
