package org.examples;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Carre c1 = new Carre(5);


        Carre c2 = new Carre(10);


        Rectangle r1 = new Rectangle(5, 10);


        Rectangle r2 = new Rectangle(50, 100);

        Rectangle r3 = new Rectangle();


        ListeFormes mesFormes = new ListeFormes();

        mesFormes.ajouter(c1);

        mesFormes.ajouter(c2);
        mesFormes.ajouter(r1);
        mesFormes.ajouter(r2);
        mesFormes.ajouter(r3);

        ListeFormes tesFormes = new ListeFormes(c1, c2);
        ListeFormes cesFormes = new ListeFormes("Background");
        cesFormes.ajouter(c1);
        cesFormes.ajouter(5);
        cesFormes.ajouter(5, 2);

        Timer chrono = new Timer();
        chrono.schedule(new TimerTask() {
            int time = 1;
            @Override
            public void run() {
                System.out.println(time);
                Random r = new Random();
                int i = r.nextInt(mesFormes.taille());
                System.out.println(mesFormes.recuperer(i).toString());
                System.out.println("Mon aire est " + mesFormes.recuperer(i).aire());
                System.out.println("Mon périmètre est " + mesFormes.recuperer(i).perimetre());
                time++;
                if(time == 5) {

                    cancel();
                }

            }
        }, 500, 1000);
    }
}
