package view.homepageview;

import controller.SiswaController;
import view.DashboardPage;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginPage {
    SiswaController sC = new SiswaController();
    Scanner inp = new Scanner(System.in);


    public void login()
    {
            char pilihan;
            System.out.println("=========LOGIN=========");
            System.out.println("Sudah punya akun?");
            System.out.print("Y/y || N/n: ");
            pilihan = inp.next().charAt(0);
            inp.nextLine();
            if (pilihan == 'y' || pilihan == 'Y')
            {
                proses_login();
            }
            else if (pilihan == 'n' || pilihan == 'N')
            {
                new RegistrationPage().reg();
            }
            else
            {
                System.out.println("mohon maaf, yang anda input tidak ada....");
                login();
            }
    }

    public void proses_login()
    {
        System.out.print("Masukkan NPM anda      : ");
        int arrNpm = inp.nextInt();
        System.out.print("Masukkan password      : ");
        String password = inp.next();
        sC.proses_login(arrNpm,password);
    }

    public void loginGagal(){
        System.out.println("-------------------------------");
        System.out.println("----------LOGIN GAGAL----------");
        System.out.println("-------------------------------");
    }
}