package pres;

import dao.DaoImpl;
import ext.DaoImplV2;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        /*
         injection des dependeances statiquement
         */
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl();
        //soit d dans constteuteur sois set()
        metier.setDao(d);
        System.out.println(" RES PRES 1=> " +metier.calcule());
    }
}
