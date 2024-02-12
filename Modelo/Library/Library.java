package Modelo.Library;

import Ivew.ILibrary;
import Modelo.Favorite;
import Modelo.Games;

public class Library implements ILibrary {
    private static final int TAM = 10;
    private Favorite[] Favorite;
    public Library(){Favorite=new Games[TAM];}

    @Override
    public Favorite[] MuestraFavorite(){
        return Favorite;
    }
    @Override
    public boolean AddFavorite(Favorite f){
        boolean result=false;
        if (addFavorite(f)==-1){
            for (int i=0;i<Favorite.length&&!result;i++){
                if (Favorite[i]==null){
                    Favorite[i]=f;
                    result=true;
                }
            }
        }
        return result;
    }
    private int addFavorite(Favorite f){
        int result=-1;
        for (int i=0;i< Favorite.length;i++){
        }
        return result;
    }
    @Override
    public Favorite KickFavorite(String F) {
        Favorite result = null;
        int pos = addFavorite(new Favorite(F,0,F));
        if (pos!=-1){
            result=Favorite[pos];
        }
        return result;
    }

}
