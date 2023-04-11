package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Country france = new Country("France");
        Country spain = new Country("Spain");
        Country singapore = new Country("Singapore");
        Country italy = new Country("Italy");
        List<Country> countries = new ArrayList<Country>();
        countries.add(france);
        countries.add(spain);
        countries.add(singapore);
        countries.add(italy);
        System.out.println("La collection créée contient "+countries.size()+" pays !");
        for (Country country: countries) {
            System.out.println(country.getName());
        }
//        countries.clear();
//        for (Country country: countries) {
//            System.out.println(country.getName());
//        }
//        System.out.println("Liste vide");
        countries.set(1,new Country("Maroc"));
        System.out.println("La collection créée contient "+countries.size()+" pays !");
        for (Country country: countries) {
            System.out.println(country.getName());
        }
//        List<String> test = new ArrayList<>();
//        test.add("frjnd");
//        test.add("jqwend");
//        test.add("ljwend");
//        test.add("ajbsd");
//        Collections.sort(test);
//        for (String e: test) {
//            System.out.println(e);
//        }
        System.out.println("Country par ordre alphabétique croissant :");
        Collections.sort(countries,new CountryComparator(true));
        for (Country country: countries) {
            System.out.println(country.getName());
        }
        System.out.println("Country par ordre alphabétique decroissant :");
        Collections.sort(countries, new CountryComparator(false));
        for (Country country: countries) {
            System.out.println(country.getName());
        }
        System.out.println("Country par length :");
        Collections.sort(countries, new CountryComparatorLength());
        for (Country country: countries) {
            System.out.println(country.getName());
        }
        System.out.println("*************************");
//        for (int i = 0; i < countries.size(); i++) {
//            if (countries.get(i).getName().length()>5){
//                countries.remove(i);
//                i--;
//            }
//        }
        Iterator<Country> iterator = countries.iterator();
        while (iterator.hasNext()) {
            Country country = iterator.next();
            if (country.getName().length() > 5) {
                iterator.remove();
            }
        }
        for (Country country: countries) {
            System.out.println(country.getName());
        }


    }
}