package view.dashboardpageview;


import controller.SiswaController;

import java.util.Scanner;

public class LogOut{

    Scanner input = new Scanner(System.in);

    char pilihan;

    public void logOutConfirm(){
        System.out.println("Apakah anda benar - benar ingin logout?");
        System.out.print("Y/y atau N/n: ");
        pilihan = input.next().charAt(0);
    }
}