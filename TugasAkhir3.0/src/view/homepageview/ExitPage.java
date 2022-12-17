package view.homepageview;

import controller.SiswaController;

import java.util.Scanner;

public class ExitPage {

    public void exit(){
        Scanner input = new Scanner(System.in);
        char pilihan;
        System.out.println("Apakah anda benar - benar ingin keluar dari aplikasi?");
        System.out.print("Y/y atau N/n: ");
        pilihan = input.next().charAt(0);
        new SiswaController().exit(pilihan);
    }
}
