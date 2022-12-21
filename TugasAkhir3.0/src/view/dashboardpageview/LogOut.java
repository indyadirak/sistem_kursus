package view.dashboardpageview;

import controller.SiswaController;

import java.util.Scanner;

public class LogOut {
    Scanner input = new Scanner(System.in);

    public void logOutConfirm() {

        char pilihan;
        System.out.println("Apakah anda benar - benar ingin logout?");
        System.out.print("Y/y atau N/n: ");
        pilihan = input.next().charAt(0);
        new SiswaController().logOut(pilihan);
    }
}