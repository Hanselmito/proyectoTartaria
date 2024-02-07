package Vista;

import Ivew.Iview;

public class View implements Iview {
    @Override
    public void MuestraMenuPrincipal(){
        System.out.println("***********************************");
        System.out.println("1- añadir película. ");
        System.out.println("2- añadir videojuego. ");
        System.out.println("3- añadir musica. ");
        System.out.println("4- listar librería. ");
        System.out.println("5- salir. ");
        System.out.println("***********************************");
    }
}