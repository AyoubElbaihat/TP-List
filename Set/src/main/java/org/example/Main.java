package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Rouge");
        colors.add("Cyan");
        colors.add("Bleu");
        colors.add("Vert");
        System.out.println("Initialialisation de la HashSet colors :"+colors);
        colors.remove("Rouge");
        System.out.println("HashSet colors après suppression de la couleur Rouge : :"+colors);
        Set<String> others = new HashSet<>();
        others.add("Jaune");
        others.add("Magenta");
        colors.addAll(others);
        System.out.println("HashSet colors après ajout de la 2nd Hashset (others):"+colors);
        colors.removeIf(e -> e.equals("Vert"));
        System.out.println("HashSet colors après suppression de Vert SI colors contient Vert:"+colors);
        colors.removeAll(others);
        System.out.println("HashSet colors après suppression de tous éléments contenus dans others:"+colors);
        others.removeAll(others);
        System.out.println("HashSet other après avoir vidé les éléments:"+others);
        colors.removeAll(colors);
        System.out.println("HashSet colors après avoir vidé les éléments:"+colors);


    }
}