package view.dashboardpageview;

import view.DashboardPage;
import view.HomePage;

import java.util.Scanner;

public class LogOutPage {
    Scanner input = new Scanner(System.in);
    char pilihan;

    public void logOutConfirm() {

        System.out.println("Apakah anda benar - benar ingin logout?");
        System.out.print("Y/y atau N/n: ");
        pilihan = input.next().charAt(0);
        if (pilihan == 'y' || pilihan == 'Y') {
            new HomePage().home();
        } else if (pilihan == 'n' || pilihan == 'N') {
            new DashboardPage().dashboard();
        }
    }
}