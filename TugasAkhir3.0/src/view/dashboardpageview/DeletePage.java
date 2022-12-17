package view.dashboardpageview;

import controller.SiswaController;
import view.DashboardPage;
import view.HomePage;

import java.util.Scanner;

public class DeletePage {

    Scanner input = new Scanner(System.in);
    char pilihan;

    public void hapus() {
        String nama;
        System.out.print("Ingin menghapus Data (Y/y atau N/n)? ");
        pilihan = input.next().charAt(0);
        input.nextLine();
        if (pilihan == 'Y' || pilihan == 'y') {
            System.out.print("Masukkan nama anda: ");
            nama = input.nextLine();
            new SiswaController().delete(nama);
            System.out.println("Berhasil menghapus akun");
            new HomePage();
        } else if (pilihan == 'N' || pilihan == 'n') {
            new DashboardPage();
        } else {
            new DeletePage();
        }
    }
}
