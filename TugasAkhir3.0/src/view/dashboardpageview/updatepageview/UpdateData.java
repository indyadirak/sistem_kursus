package view.dashboardpageview.updatepageview;

import controller.SiswaController;
import view.object;

import java.util.Scanner;

public class UpdateData {
    Scanner inputan = new Scanner(System.in);

    public void perubahan_data_pribadi()
    {
        System.out.print("Masukkan nama baru : ");
        String nama_baru = inputan.nextLine();
        System.out.print("Masukkan alamat baru :");
        String alamat_baru = inputan.nextLine();
        System.out.print("Masukkan no. telepon baru : ");
        String nomor_telepon_baru = inputan.nextLine();
        System.out.print("Masukkan password baru : ");
        String password_baru = inputan.next();
        object.sC.perubahan_data_akun(nama_baru,alamat_baru,nomor_telepon_baru,password_baru);
    }
}
