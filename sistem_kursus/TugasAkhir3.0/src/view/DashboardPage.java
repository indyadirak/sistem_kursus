package view;

import view.dashboardpageview.DaftarKelasPage;
import view.dashboardpageview.DeletePage;
import view.dashboardpageview.LogOut;
import view.dashboardpageview.UpdatePage;

import java.util.Scanner;

public class DashboardPage {
    Scanner inp = new Scanner(System.in);

    UpdatePage updatepage = new UpdatePage();
    DeletePage deletePage = new DeletePage();
    DaftarKelasPage daftarKelasPage = new DaftarKelasPage();
    LogOut log = new LogOut();

    public void dashboard(String nama) {
        int pil;
        do {
            System.out.println("""
                    Menu
                    1. update
                    2. daftar kelas
                    3. delete
                    0. Logout""");
            pil = inp.nextInt();
            switch (pil) {
                case 1:
                    updatepage.menu_update();
                    break;
                case 2:
                    daftarKelasPage.pilihKursus();
                    break;
                case 3:
                    deletePage.hapus(nama);
                    break;
                case 0:
                    log.logOutConfirm();
            }
        } while (pil != 0);
    }
}
