package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        } else {


            String [] z = query.split("%");


            String biggerFish = "";

            for(int i = 0; i < z.length; i++){

                if(Integer.valueOf(z [i]) < Integer.valueOf(biggerFish)) {


                    biggerFish = z [i];


                }



            }

            int [] arr = {256,9, 3,  18, 106,20, 0, 0, 0,13,795,523, 924, 9,11, 522, 18*18, 0, 15625, 40, 729, 66, 768, 72, 7, 117, 771, 18, 54, 70, 35 , 34, 196, 28 , 12 , 0, 0 , 0, 0, 512};



                int rnd = new Random().nextInt(arr.length);










            String s = String.valueOf(rnd);










            return "0";
        }
    }
}
