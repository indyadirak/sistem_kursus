package view.homepageview;

import controller.SiswaController;
import view.DashboardPage;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginPage {
    SiswaController sC = new SiswaController();
    Scanner inp = new Scanner(System.in);
    public ArrayList<String> arrNpm = new ArrayList<>();
    public int cekdata;

    public void login() {
        
        try {
            System.out.print("Masukkan NPM anda      : ");
            String arrNpm = inp.next();
            System.out.print("Masukkan password      : ");
            String password = inp.next();
            cekdata = sC.cekdataAkun(arrNpm, password); // Login Problem, Credential is not working
            System.out.println("Debug test : " + cekdata);
            System.out.println("\nSelamat datang " + sC.getData(cekdata).getNama() + "\n");
            new DashboardPage().dashboard();
        } catch (Exception e) {
            System.out.println("Nama atau password salah");
        }
    }
}
