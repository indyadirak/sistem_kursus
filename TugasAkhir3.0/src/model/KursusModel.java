package model;

import java.util.ArrayList;

import entity.Kursus;

public class KursusModel {
    public ArrayList<Kursus> listKursus;

    public KursusModel() {
        listKursus = new ArrayList<>();
    }

    public void insert(Kursus kursus) {
        listKursus.add(kursus);
    }

    public Kursus getListKursus(int index) {
        return listKursus.get(index);
    }
}
