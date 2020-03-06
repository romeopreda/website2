package domain;

import java.util.ArrayList;

public class AutoDb {
    public static void main(String[] args) {

        Auto Audi = new Auto("Audi","A5",180,100000,"2/10/2015");
        Auto Bmw = new Auto("BMW","Serie5",200,150000,"20/10/2018");

        ArrayList<Auto> Autos = new ArrayList<Auto>();
        Autos.add(Audi);
        Autos.add(Bmw);




    }





}
