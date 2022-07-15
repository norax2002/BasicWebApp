package de.tum.in.ase.eist;

public class main {

    public static void main(String[] args) {

        String s = "36583240: which of the following numbers is the largest: 78, 510, 74, 451";


        int x = s.lastIndexOf(":");
        String y = s.substring(x);
        String [] z = y.split(", ");

        String biggerFish = "";

        for(int i = 0; i < z.length; i++){

            if(Integer.valueOf(z [i]) < Integer.valueOf(biggerFish)) {


                biggerFish = z [i];


            }



        }

        System.out.println(biggerFish);


    }


}
