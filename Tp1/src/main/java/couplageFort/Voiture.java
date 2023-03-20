package couplageFort;

public class Voiture {
    Batterie b;
    public void bouger(){
        b = new Batterie();
        b.demmarrer();
        System.out.println("Vitesse 10km/h");
    }
}
