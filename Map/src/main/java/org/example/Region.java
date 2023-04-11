package org.example;

public enum Region {

    France("+33"),
    Suisse("+41"),
    Polynesie("+689"),
    Martinique("+596"),
    Indonesie("+62");
    private String indicatif;

    private Region(String indicatif) {
        this.indicatif = indicatif ;
    }

    public String getIndicatif() {
        return  this.indicatif ;
    }

}
