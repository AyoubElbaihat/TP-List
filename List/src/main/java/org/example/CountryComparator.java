package org.example;

import java.util.Comparator;

public class CountryComparator implements Comparator<Country> {
    boolean croissant;

    public CountryComparator(boolean croissant) {
        this.croissant = croissant;
    }

    @Override
    public int compare(Country c1, Country c2) {
        int compare = c1.getName().compareTo(c2.getName());
        if (croissant == false){
            compare = -compare;
        }
        return compare;
    }
}
