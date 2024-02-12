package Ivew;

import Modelo.Favorite;
import Modelo.Games;
import Modelo.Movies;
import Modelo.Theme;

public interface Iview {
    void MuestraMenuPrincipal();
    void MuestraGame(Games[] g);
    void MuestraGames(Games g);
    void MuestraMovie(Movies[] m);
    void MuestraMovies(Movies m);
    void MuestraTheme(Theme[] t);
    void MuestraTheme(Theme t);
    void MuestraFavorite(Favorite[] f);
    void MuestraFavorite(Favorite f);
    Favorite MuestraMenuAnadir();
    Favorite MuestraMenuQuitar();
    void MuestraResultado(String Resultado);
    int leeEntero(String msg);
    String leestring(String msg);
}
