package Controlador;

import Ivew.IController;
import Ivew.ILibrary;
import Ivew.Iview;

public class Controller implements IController {
    Iview View;
    ILibrary Library;
    @Override
    public void Star(){
        View.MuestraMenuPrincipal();
        int opcion = View.leeEntero("elige una opcion");
        ControllerMuestraMenuPrincipal(opcion, View);
    }

    @Override
    public void ControllerMuestraMenuPrincipal(int o, int Iview) {

    }
}
