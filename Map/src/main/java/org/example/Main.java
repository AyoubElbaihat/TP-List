package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> carnet = new HashMap<>();
        carnet.put("Boris", "0680000000");
        carnet.put("Arthur","0607070606");
        carnet.put("Thibault","0605000005");
        carnet.put("Estelle","0700000700");
        HashMap<String,User> carnet1 = new HashMap<>();
        carnet1.put("0799999907",new User("Boris",Region.France));
        carnet1.put("0607070606",new User("Arthur",Region.Suisse));
        carnet1.put("0605000005",new User("Thibault",Region.Indonesie));
        carnet1.put("0700000700",new User("Estelle",Region.Polynesie));



        System.out.println("Téléphone d'Arthur :"+carnet.get("Arthur"));
        for (String i: carnet.keySet()) {
            System.out.println("Nom : "+i+" => Téléphone : "+carnet.get(i));
        }
        carnet.replace("Boris","0680000000","0799999907");
        System.out.println("Carnet à jour :");
        for (String i: carnet.keySet()) {
            System.out.println("Nom : "+i+" => Téléphone : "+carnet.get(i));
        }
        System.out.println("************");
        DisplayContact(carnet);
        System.out.println("************");
        DisplayContact1(carnet1);
    }
    private static void DisplayContact1(HashMap<String,User> carnet1){
        for (String i: carnet1.keySet()) {
            User user = carnet1.get(i);
            String phoneNumber = AddPoint1(i);
            System.out.println("Nom : " + user.getName() + " => Téléphone : " +user.getRegion().getIndicatif()+ phoneNumber);
        }
    }
    private static String AddPoint1(String phoneNumber) {
        StringBuilder addpoint = new StringBuilder(phoneNumber);
        for (int i = 2; i < addpoint.length(); i += 3) {
            addpoint.insert(i, ".");
        }
        addpoint.insert(0, "(");
        addpoint.insert(2, ")");
        return addpoint.toString();
    }

    private static void DisplayContact(HashMap<String,String> carnet){
        for (String i: carnet.keySet()) {
            String num = carnet.get(i);
            num = AddPoint(num);
            System.out.println("Nom : "+i+" => Téléphone : "+num);
        }
    }
    private static String AddPoint(String num){
        StringBuilder addpoint = new StringBuilder(num);
        for (int i = 2; i < addpoint.length(); i+= 3) {
            addpoint.insert(i, ".");
        }
        return addpoint.toString();

    }
}