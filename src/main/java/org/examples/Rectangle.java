package org.examples;

public class Rectangle implements Forme {
    int cote_x;
    int cote_y;

    public Rectangle(int cote_x, int cote_y){
        this.cote_x = cote_x;
        this.cote_y = cote_y;
    }

    public Rectangle(){
        this.cote_x = 2;
        this.cote_y = 1;
    }

    @Override
    public void scale(float factor) {
        float cote_x = this.cote_x;
        float cote_y = this.cote_y;
        cote_x = cote_x * factor;
        cote_y = cote_y * factor;
    }

    @Override
    public int aire() {
        return cote_x * cote_y;
    }

    @Override
    public int perimetre() {
        return (cote_x + cote_y) * 2;
    }

    @Override
    public String toString() {
        return "Les longeurs de mon rectangle sont :" + this.cote_x + " et " + this.cote_y;
    }
    public String couleur() {
        return "blanc";
    }
}

