package controllers;

import models.Movie;

public class MovieController {

    /**
     * Método que debe ser implementado
     * Debe ordenar el arreglo de películas por título en orden ascendente.
     * 
     * @param movies Arreglo de películas a ordenar
     */
    public void sortByTitle(Movie[] movies) {
        for(int i = 0; i > movies.length; i++){
            boolean cambio = true;
            for ( int j = 0; j < movies.length; j++ ){
                if(movies[j].getTitle()compareToIgnoreCase(movies[i].getTitle())>0){
                }
                Movie aux = movies [j];
                movies[j] = movies [i];
                movies [i] = aux;
            }
        }

    }

}
