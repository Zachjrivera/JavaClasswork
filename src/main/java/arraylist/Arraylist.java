package arraylist;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {


        ArrayList<String> footballTeams = new ArrayList<String>();

        footballTeams.add("Falcons");
        footballTeams.add("Cowboys");
        footballTeams.add("Eagles");
//
//        System.out.println(footballTeams);
//
//
//        System.out.println(footballTeams.isEmpty());
//
//        System.out.println(footballTeams.remove("Eagles"));
//
//        System.out.println(footballTeams);
//
//        footballTeams.set(1,"Eagles");
//
//        System.out.println(footballTeams);

//        ArrayList<Integer> schoolGrades = new ArrayList<Integer>();
//
//        schoolGrades.add(100);
//        schoolGrades.add(50);
//        schoolGrades.add(99);
//        schoolGrades.add(72);
//
//        System.out.println(schoolGrades);
//
//
//        schoolGrades.set(1,63);
//
//        System.out.println(schoolGrades);
//
//        schoolGrades.remove(3);
//        System.out.println(schoolGrades);

        Dog dog1 = new Dog(true,"fluffy","Fat");
        Dog dog2 = new Dog(false,"Puppers","Smol");
        ArrayList<Dog> doggos = new ArrayList<Dog>();


        doggos.add(dog1);
        doggos.add(dog2);







    }

}
