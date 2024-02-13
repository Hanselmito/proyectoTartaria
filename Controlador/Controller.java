package Controlador;

import Ivew.IController;
import Ivew.ILibrary;
import Ivew.Iview;
import Modelo.Favorite;

public class Controller implements IController {
    Iview View;
    ILibrary Library;
    @Override
    public void Star(){
        View.MuestraMenuPrincipal();
        int opcion = View.leeEntero("elige una opcion");
        ControllerMuestraMenuPrincipal(opcion);
    }

    @Override
    public void ControllerMuestraMenuPrincipal (int o){
        switch (o){
            case 1:
                break;
        }
    }
}
