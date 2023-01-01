package view;

import view.homepageview.*;

import java.util.Scanner;

public class HomePage {
    Scanner inp = new Scanner(System.in);
//    int loop = -1;
    int pilih;
    int pilihAdmin;

    public void homeAdmin(){
        do{
            System.out.println("login sebagai : ");
            System.out.println("1. admin");
            System.out.println("2. user");
            System.out.println("0. exit");
            System.out.print("pilih : ");
            pilihAdmin = inp.nextInt();
            switch (pilihAdmin){
                case 1:
                    new LoginAdmin().loginAdmin();
                    break;
                case 2:
                    home();
                    break;
            }
        }while (pilihAdmin!=0);
        System.out.println("=========================");
        System.out.println("Terima Kasih Kunjungannya");
        System.exit(0);
    }

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