package superhero;

public class Main {
    public static void main(String[] args) {

       SuperHeroes theFlash = new Flash("The Flash", new String[]{"Superspeed"});
        SuperHeroes superman = new SuperMan("Superman", new String[]{"Super Strength","Lazer eyes"});



        SuperHeroes [] heroes ={theFlash,superman};
        for (SuperHeroes s:heroes
             ) {
            System.out.println(s.getClass().getSimpleName()+ " Uses " + s.printSuperPower());
        }




        //=============================================================
    }
}
