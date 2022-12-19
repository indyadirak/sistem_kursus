package view.dashboardpageview;

import java.util.Scanner;

import controller.KursusController;

import static view.object.sC;

public class DaftarKelasPage {
    static KursusController kursus = new KursusController();
    public int pilihKursus;
    Scanner input = new Scanner(System.in);

    public void cetak() {
        for (int i = 0; i < 4; i++) {
            System.out.println("[" + (i + 1) + "]");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Modul       : " + kursus.getData(i).getModul());
            System.out.println("Kelas       : " + kursus.getData(i).getKelas());
            System.out.println("jadwal      : " + kursus.getData(i).getJadwal());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        }
    }

    public void pilihKursus(String nama, String alamat, String noTelp, String password) {
        cetak();
        System.out.print("pilih   : ");
        pilihKursus = input.nextInt();
        pilihKursus = pilihKursus - 1;
        sC.reg(nama, alamat, noTelp, password, kursus.getData(pilihKursus).getModul(), kursus.getData(pilihKursus).getKelas(), kursus.getData(pilihKursus).getJadwal());
    }
}
