package arraylist;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {

/*
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
       fruits.add("Pears");
        fruits.add("Zhodie");

        for (String d:fruits
             ) {
            System.out.println(d);
        }


        Iterator<String> ft =fruits.iterator();
        while (ft.hasNext())
        {
            String fuck = ft.next();
            System.out.println(fuck)
      }



        System.out.println(fruits.isEmpty());

        System.out.println(fruits.remove("Eagles"));

        System.out.println(fruits);

        fruits.set(1,"Eagles");

        System.out.println(fruits);
    */

        /*
        ArrayList<Integer> schoolGrades = new ArrayList<Integer>();

        schoolGrades.add(100);
        schoolGrades.add(50);
        schoolGrades.add(99);
        schoolGrades.add(72);

        System.out.println(schoolGrades);


        schoolGrades.set(1,63);

        System.out.println(schoolGrades);

        schoolGrades.remove(3);
        System.out.println(schoolGrades);
        */

/*
//        can do this or make one on the fly to add obj to array
//        Dog dog1 = new Dog(true,"fluffy","Fat");
        Dog dog2 = new Dog(false,"Snoop","Smol");
        ArrayList<Dog> doggos = new ArrayList<Dog>();


        doggos.add(new Dog(true,"Nate Dog","Fat"));
        doggos.add(dog2);
*/

//==================================================================
        ArrayList<Artist> artist = new ArrayList<Artist>();

        artist.add(new Artist("Tupac"));
        artist.add(new Artist("Biggie"));
        artist.add(new Artist("METHOD .... MAN"));

//        for (Artist boi: artist
//             ) {
//
//            System.out.println(boi.getName());
//        }
//============================================================

        List<Artist> linkedshit = new LinkedList<Artist>();

        linkedshit.add(new Artist("Doggir "));
        linkedshit.add(new Artist("Fuck Boi"));
        linkedshit.add(new Artist("Whooty"));

        linkedshit.addAll(artist);

        Iterator<Artist> music =linkedshit.iterator();
        while (music.hasNext()){
            System.out.println(music.next().getName());

        }





        //This is an up date
        System.out.println("test");





    }

}
