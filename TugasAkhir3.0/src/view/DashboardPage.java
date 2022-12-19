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

    public void dashboard() {
        int pil;
        do {
            System.out.println("""
                    Menu
                    1. update
                    2. delete
                    0. Logout""");
            pil = inp.nextInt();
            switch (pil) {
                case 1:
                    updatepage.menu_update();
                    break;
                case 2:
                    deletePage.hapus();
                    break;
                case 0:
                    log.logOutConfirm();
            }
        } while (pil != 0);
    }
}
