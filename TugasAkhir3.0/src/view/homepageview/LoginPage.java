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

    public void login(){
        while(true){
            char pilihan;
            System.out.println("=========LOGIN=========");
            System.out.println("Sudah punya akun?");
            System.out.print("Y/y || N/n: ");
            pilihan = inp.next().charAt(0);
            inp.nextLine();
            if (pilihan == 'y' || pilihan == 'Y'){
                try {
                    System.out.print("Masukkan NPM anda      : ");
                    String arrNpm = inp.next();
                    System.out.print("Masukkan password      : ");
                    String password = inp.next();
                    cekdata = sC.cekdataAkun(arrNpm, password);
                    if(cekdata != 0){
                        System.out.println("Debug test : " + cekdata);
                        System.out.println("\nSelamat datang " + sC.getData(cekdata).getNama() + "\n");
                        new DashboardPage().dashboard();
                    }
                    else{
                        loginGagal();
                    }
                } catch (Exception e) {
                    System.out.println("Nama atau password salah");
                }
            }
            else if (pilihan == 'n' || pilihan == 'N'){
                new RegistrationPage().reg();
            }
            else{
                new LoginPage();
            }
        }
    }

    private void loginGagal() {
        System.out.println("-------------------------------");
        System.out.println("----------LOGIN GAGAL----------");
        System.out.println("-------------------------------");
    }
}