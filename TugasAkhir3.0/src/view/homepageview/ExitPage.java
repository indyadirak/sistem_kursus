package view.homepageview;

import controller.SiswaController;
import view.HomePage;

import java.util.Scanner;

public class ExitPage {
    Scanner input = new Scanner(System.in);
    char pilihan;

    public void exit() {
        System.out.println("Apakah anda benar - benar ingin keluar dari aplikasi?");
        System.out.print("Y/y atau N/n: ");
        pilihan = input.next().charAt(0);
        if (pilihan == 'Y' || pilihan == 'y') {
            System.out.println("=========================");
            System.out.println("Terima Kasih Kunjungannya");
            System.exit(0);
        }
        else if (pilihan == 'N' || pilihan == 'n') {
            new HomePage().home();
        }
    }
}