package com.corenetworks.presentacion;

import com.corenetworks.modelo.*;

public class ProbarInterfaces {
    public static void main(String[] args) {
        //Instanciamos un avion con nombre del objecto ax2
        Avion ax2 = new Avion("obsidiana");
        //polimorfismo
        IobjectoVolador ax3 = new Avion("rojo");
        IobjectoVolador ave1 = new Ave();
        IobjectoVolador s1 = new Superman();
        IobjectoVolador ha1 = new HidroAvion();


        IobjectoVolador[] voladores = {ax2, ax3, ave1, s1, ha1};

        for (IobjectoVolador elemento : voladores) {
            System.out.println(elemento.despegar());
            System.out.println(elemento.aterizar());
            System.out.println(elemento.volar());
            System.out.println(elemento.toString());
            if (elemento instanceof Ave) {
                System.out.println(((Ave) elemento).ponerHuevos());
                System.out.println(((Ave) elemento).hacerNido());
                System.out.println(elemento.toString());
            }

            if (elemento instanceof Superman) {
                System.out.println(((Superman) elemento).saltaEdificios());
                System.out.println(((Superman) elemento).saltaEdificios());
                System.out.println(elemento.toString());
            }
            if (elemento instanceof HidroAvion) {
                System.out.println(((HidroAvion) elemento).navegar());
                System.out.println(((HidroAvion) elemento).atracar());
                System.out.println(elemento.toString());
            }
        }


        Barcaza b1 = new Barcaza();

        Inautico[] nauticos = {b1, (Inautico) ha1};

        for (Inautico elemento : nauticos) {
            System.out.println(elemento.navegar());
            System.out.println(elemento.atracar());
            System.out.println(elemento.toString());
            if (elemento instanceof HidroAvion){
                System.out.println(((HidroAvion) elemento).despegar());
                System.out.println(((HidroAvion) elemento).volar());
                System.out.println(((HidroAvion) elemento).aterizar());
            }


        }
    }
}