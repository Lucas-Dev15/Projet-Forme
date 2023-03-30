package org.examples;

public class Carre implements Forme {
    int cote_x;


    public Carre(int cote_x){
        this.cote_x = cote_x;
    }

    @Override
    public void scale(float factor) {
        float cote_x = this.cote_x;
       cote_x = cote_x * factor;
    }

    @Override
    public int aire() {
        return cote_x * cote_x;
    }

    @Override
    public int perimetre() {
        return cote_x * 4;
    }

    @Override
    public String toString() {
        return ("La longeur d'un de mes côté est de : " + this.cote_x);
    }

}
