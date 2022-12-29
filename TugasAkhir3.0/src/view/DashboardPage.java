package view;

import view.dashboardpageview.DaftarKelasPage;
import view.dashboardpageview.DeletePage;
import view.dashboardpageview.LogOutPage;
import view.dashboardpageview.updatepageview.UpdateData;

import java.util.Scanner;

public class DashboardPage {
    Scanner inp = new Scanner(System.in);

    DeletePage deletePage = new DeletePage();
    DaftarKelasPage daftarKelasPage = new DaftarKelasPage();
    LogOutPage log = new LogOutPage();

    public void dashboard() {
        int pil;
        do {
            System.out.println("""
                    Menu
                    1. update
                    2. delete
                    0. Logout""");
            pil = inp.nextInt();
            menu(pil);
        } while (pil != 0);
    }

    private void menu(int pil){
        switch (pil) {
            case 1:
                new UpdateData().perubahan_data_pribadi();
                new HomePage().home();
                break;
            case 2:
                deletePage.hapus();
                new HomePage().home();
                break;
            case 0:
                log.logOutConfirm();
        }
    }
}
