package view.homepageview;

import controller.SiswaController;

import java.util.Scanner;

public class RegistrationPage {

    public void reg() {
        SiswaController sC = new SiswaController();
        Scanner input = new Scanner(System.in);
        try {
            // System.out.println("Debug test");
            System.out.print("nama     : ");
            String nama = input.nextLine();
            System.out.print("alamat   : ");
            String alamat = input.nextLine();
            System.out.print("no telp  : ");
            String noTlp = input.nextLine();
            System.out.print("password : ");
            String password = input.nextLine();
            sC.reg(nama, alamat, noTlp, password);
        } catch (Exception e) {
            System.out.println("Format yang anda masukkan gagal");
        }
    }
}
