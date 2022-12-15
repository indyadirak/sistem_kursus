package view.dashboardpageview;

import controller.SiswaController;
import view.dashboardpageview.updatepageview.UpdateAlamat;
import view.dashboardpageview.updatepageview.UpdateNama;
import view.dashboardpageview.updatepageview.UpdateNoTelpon;
import view.dashboardpageview.updatepageview.UpdatePassword;
import view.homepageview.LoginPage;

import java.util.Scanner;

public class UpdatePage
{
    String nama;
    Scanner inputan = new Scanner(System.in);
    public void menu_update()
    {
        System.out.println("""
                pilihan menu update
                1. nama
                2. alamat
                3. nomor telepon
                4. password""");
        System.out.print("masukkan pilihan : ");
        int inputan_menu_update = inputan.nextInt();
        proses_menu_update(inputan_menu_update);
    }

    public void proses_menu_update( int inputan_menu_update)
    {
        switch (inputan_menu_update)
        {
            case 1:
            {
                new UpdateNama().perubahan_nama();
                new LoginPage().login();
                break;
            }
            case 2:
            {
                new UpdateAlamat().perubahan_alamat();
                new LoginPage().login();
                break;
            }
            case 3:
            {
                new UpdateNoTelpon().perubahan_nomor_telepon();
                new LoginPage().login();
                break;
            }
            case 4:
            {
                new UpdatePassword().perubahan_password();
                new LoginPage().login();
                break;
            }
            default:
            {
                System.out.println("mohon maaf, pilihan anda salah.");
                menu_update();
                break;
            }
        }

    }
}
