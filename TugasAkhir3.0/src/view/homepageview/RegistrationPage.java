package view.homepageview;

import controller.SiswaController;
import view.dashboardpageview.DaftarKelasPage;

import java.util.Scanner;

public class RegistrationPage {
    SiswaController sC = new SiswaController();
    Scanner inp = new Scanner(System.in);

    public void reg() {

        try {
            System.out.print("nama     : ");
            String nama = inp.next();
            System.out.print("alamat   : ");
            String alamat = inp.next();
            System.out.print("no telp  : ");
            String noTlp = inp.next();
            System.out.print("password : ");
            String password = inp.next();
            new DaftarKelasPage().pilihKursus(nama, alamat, noTlp, password);
        } catch (Exception e) {
            System.out.println("Format yang anda masukkan gagal");
        }
    }
}
