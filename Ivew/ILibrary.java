package Ivew;

import Modelo.Favorite;

public interface ILibrary {
    Favorite[] MuestraFavorite();
    boolean AddFavorite(Favorite f);
    Favorite KickFavorite(String F);
}
