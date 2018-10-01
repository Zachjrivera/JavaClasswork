package superhero;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.lang.reflect.Array;

public class SuperHeroes {
    protected String name;

    private String[] superPowers = {};

    public SuperHeroes(String name, String[] superPowers) {
        this.name = name;
        this.superPowers = superPowers;
    }

    public String printSuperPower() {
        String superp = "";
        for (String s:superPowers
             ) {
            superp += s;
            return s;
        }

return " something";
    }







    //=============================================================
}