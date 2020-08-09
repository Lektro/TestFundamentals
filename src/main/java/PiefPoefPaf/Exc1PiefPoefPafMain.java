package PiefPoefPaf;

import java.util.Random;


public class Exc1PiefPoefPafMain {

    public static void main(String[] args) {
        Random random = new Random();

        /** Create random ints below 1000 for 25 times */
        for (int i = 0; i < 24; i++) {
            int x = random.nextInt(1000);

            /** if statements to find the correct response */

            /*
             * Why not if (x < 250) { } else if (x < 500) { } else { } ?
             */
            if (x <= 500 && x >= 250) {
                    System.out.println(x);
                    System.out.println("Poef");
                } // Should be on the same tab as 'if' that it closes
            if (x <= 250) {
                    System.out.println(x);
                    System.out.println("Pief");
                } // should be on the same tab as 'if'
            if (x >= 500) {
                System.out.println(x);
                System.out.println("Paf");
            } // This is how it should be
        }
    }
}


