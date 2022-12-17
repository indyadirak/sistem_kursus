package controller;

import entity.Kursus;
import model.ModelObject;

public class KursusController {

    public KursusController() {

    }

    public void Kursus() {
        String kelas[] = { "A101", "A102", "A103", "B101" };
        String jadwal[] = { "08:00", "10:00", "15:00", "20:00" };
        String modul[] = { "nodeJS", "phyton", "dart", "php" };

        for (int i = 0; i < modul.length; i++) {
            ModelObject.modelKursus.insert(new Kursus(modul[i], jadwal[i], kelas[i]));
        }
    }

    public Kursus getData(int index) {
        Kursus();
        return ModelObject.modelKursus.getListKursus(index);
    }

}
