package org.example;

import org.examples.Forme;
import org.examples.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class TestRectangle {

    @Test
    public void testAire() {
        // Préparation
        int resultatAttendu = 50;
        Forme monRectangle = new Rectangle(10, 5);


        // Exécution
        int resultatObtenu = monRectangle.aire();
        String couleurObtenu = ((Rectangle) monRectangle ).couleur();

        // Vérification
        Assert.assertEquals(resultatAttendu, resultatObtenu);
    }

    @Test
    public void testPerimitre() {

        // Préparation
        int resultatAttendu = 30;
        Forme monRectangle = new Rectangle(10, 5);


        // Exécution
        int resultatObtenu = monRectangle.perimetre();
        String couleurObtenu = ((Rectangle) monRectangle ).couleur();

        // Vérification
        Assert.assertEquals(resultatAttendu, resultatObtenu);
    }
}
