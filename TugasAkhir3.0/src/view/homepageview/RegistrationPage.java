package view.homepageview;

import controller.SiswaController;
import view.dashboardpageview.DaftarKelasPage;

import java.util.Scanner;

public class RegistrationPage {

    public void reg() {
        SiswaController sC = new SiswaController();
        Scanner inp = new Scanner(System.in);
        try {
            System.out.print("nama     : ");
            String nama = inp.next();
            System.out.print("alamat   : ");
            String alamat = inp.next();
            System.out.print("no telp  : ");
            String noTlp = inp.next();
            System.out.print("password : ");
            String password = inp.next();
            new DaftarKelasPage().pilihKursus(nama,alamat,noTlp,password);
        } catch (Exception e) {
            System.out.println("Format yang anda masukkan gagal");
        }
    }
}
