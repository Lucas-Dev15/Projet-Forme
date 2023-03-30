package org.examples;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

public class ListeFormes {
    String layerName;

     List<Forme> maListe;
     int nbFormes;

     // Constructeur
    public ListeFormes() {
        this.layerName = "default";
        this.maListe = new ArrayList<Forme>();
        this.nbFormes = 0;
    }

    // Constructeur
    public ListeFormes(Forme forme1, Forme forme2) {
        this.layerName = "default";
        this.maListe = new ArrayList<Forme>();
        maListe.add(forme1);
        maListe.add(forme2);

        this.nbFormes = 2;
    }

    // Constructeur
    public ListeFormes(String name) {
        this.maListe = new ArrayList<Forme>();
        this.layerName = name;
    }

    // Méthode
    public void ajouter(Forme forme) {
        maListe.add(forme);
        nbFormes++;
    }
    // Méthode qui permet d'ajouter une forme (carré) dans la liste en indiquand la longeur du côté en argument
    public Forme ajouter(int cote_x) {
        Forme c = new Carre(cote_x);
        maListe.add(c);
        nbFormes++;
        return c;
    }

    // Méthode qui permet d'ajouter une forme (rectangle) dans la liste en indiquand les longeurs des côtés en argument
    public void ajouter(int cote_x, int cote_y) {
       Forme r = new Rectangle(cote_x, cote_y);
        maListe.add(r);
        nbFormes++;
   }

   // Méthode supprimer en indiquant un index en argument
   public void supprimer(int i){
        maListe.remove(i);
        nbFormes--;
   }

   // Méthode supprimer en indiquant une forme en argument
   public void supprimer(Forme forme){
        maListe.remove(forme);
        nbFormes--;
   }

    public Forme recuperer(int i){
        return maListe.get(i);
    }

    public int taille(){
        return maListe.size();
    }

}

// Ne pas mêttre une classe dans une autre classe