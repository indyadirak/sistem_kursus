package view;

import view.homepageview.ExitPage;
import view.homepageview.LoginPage;
import view.homepageview.RegistrationPage;
import view.homepageview.ShowPage;

import java.util.Scanner;

public class HomePage {
    Scanner inp = new Scanner(System.in);
//    int loop = -1;
    int pilih;

    public void home(){
        do{
            System.out.println("""
                    1. Daftar
                    2. Show
                    3. Login
                    0. Exit""");
            System.out.print("pilih = ");
            pilih = inp.nextInt();
            menu(pilih);
        } while (pilih != 0);
    }

    private void menu(int pilih){
        switch (pilih){
            case 1:
                new RegistrationPage().reg();
                break;
            case 2:
                new ShowPage().show();
                break;
            case 3:
                new LoginPage().login();
                break;
            case 0:
                new ExitPage().exit();
                break;
            default:
                System.out.println("Menu tidak valid");
                break;
        }
    }
}