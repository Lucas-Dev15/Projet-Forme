package org.examples;

import org.junit.Assert;
import org.junit.Test;

public class TestListeFormes {

    @Test
    public void AjouterFormes_DeuxCarres_TailleEgalDeux() {

        // Préparation
        int resultatAttendu = 2;
        ListeFormes listeatester = new ListeFormes();
        listeatester.ajouter(5);
        listeatester.ajouter(2);

        // Exécution
        int resultatObtenu = listeatester.taille();

        // Vérification
        Assert.assertEquals(resultatAttendu, resultatObtenu);
    }


    @Test
    public void AjouterFormes_ListeVide_TailleEgalZero(){

        // Préparation
        int resultatAttendu = 0;
        ListeFormes listevide = new ListeFormes();


        // Exécution
        int resultatObtenu = listevide.taille();

        // Vérification
        Assert.assertEquals(resultatAttendu, resultatObtenu);
    }

    @Test
    public void SupprimerFormes_ParIndex_TailleEgalUn(){

        // Préparation
        int resultatAttendu = 2;
        ListeFormes listeunelement = new ListeFormes();
        listeunelement.ajouter(2);
        listeunelement.ajouter(6);
        Forme f = listeunelement.ajouter(4);


        // Exécution
        listeunelement.supprimer(0);


        int resultatObtenu = listeunelement.taille();

        // Vérification
        Assert.assertEquals(resultatAttendu, resultatObtenu);
    }
    @Test
    public void SupprimerFormes_ParObjet_TailleEgalUn(){

        // Préparation
        int resultatAttendu = 2;
        ListeFormes listeunelement = new ListeFormes();
        listeunelement.ajouter(2);
        listeunelement.ajouter(6);
        Forme f = listeunelement.ajouter(4);


        // Exécution
        listeunelement.supprimer(f);

        int resultatObtenu = listeunelement.taille();

        // Vérification
        Assert.assertEquals(resultatAttendu, resultatObtenu);
    }
}
