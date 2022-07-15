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

            Random random = new Random();

            int v = random.nextInt(1000);

            String s = String.valueOf(v);










            return "s";
        }
    }
}
