package view.homepageview;

import controller.SiswaController;
import view.DashboardPage;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginPage {
    SiswaController sC = new SiswaController();
    Scanner inp = new Scanner(System.in);
    public ArrayList<String> arrNpm = new ArrayList<>();

    public void login() {
        int cekdata;
        try {
            System.out.print("Masukkan NPM anda      : ");
            String arrNpm = inp.nextLine();
            System.out.print("Masukkan password      : ");
            String password = inp.next();
            cekdata = sC.cekdataAkun(arrNpm, password);
            System.out.println("\nSelamat datang " + sC.getData(cekdata).getNama() + "\n");
            new DashboardPage().dashboard();
        } catch (Exception e) {
            System.out.println("Nama atau password salah");
        }
    }
}
