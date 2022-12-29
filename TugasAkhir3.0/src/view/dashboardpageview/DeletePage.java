package view.dashboardpageview;

import controller.SiswaController;
import view.DashboardPage;
import view.HomePage;
import view.homepageview.LoginPage;

import java.util.Scanner;

public class DeletePage extends LoginPage {

    SiswaController sC = new SiswaController();

    Scanner input = new Scanner(System.in);
    char pilihan;

    //delete untuk admin
    public void hapus() {
        System.out.print("Ingin menghapus Data (Y/y atau N/n)? ");
        pilihan = input.next().charAt(0);
        input.nextLine();
        if (pilihan == 'Y' || pilihan == 'y') {
            // System.out.print("Masukkan nama anda: ");
            // nama = input.nextLine();
            // new SiswaController().delete(nama);
/*            new SiswaController().delete(sC.getData(cekdata).getNama());*/
            System.out.println("Berhasil menghapus akun");
            // new HomePage();
            // HomePage homePage = new HomePage();
            new HomePage().home();
        } else if (pilihan == 'N' || pilihan == 'n') {
            new DashboardPage();
        } else {
            new DeletePage();
        }
    }
}
