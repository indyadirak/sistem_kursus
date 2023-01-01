package view.homepageview;

import controller.AdminController;

import java.util.Scanner;

import static view.object.sC;

public class LoginAdmin {
    AdminController adminC = new AdminController();
    Scanner inp = new Scanner(System.in);
    ShowPage tampil = new ShowPage();

    public void loginAdmin(){
        System.out.print("masukkan id       : ");
        String id = inp.next();
        System.out.print("masukkan password :");
        String pass = inp.next();
        boolean checkAdmin = adminC.login(id,pass);
        if(checkAdmin == true){
            deleteByAdmin();
        }else {

        }
    }
    public void deleteByAdmin(){
        System.out.println("masukkan npm : ");
        int npm = inp.nextInt();
        int indexNpm = adminC.searchByNpm(npm);
        if (indexNpm != -1){
            System.out.println("[" + (indexNpm + 1) + "]");
            System.out.println("===============================");
            System.out.println("nama        : " + sC.getData(indexNpm).getNama());
            System.out.println("alamat      : " + sC.getData(indexNpm).getAlamat());
            System.out.println("no telpon   : " + sC.getData(indexNpm).getNoTelpon());
            System.out.println("Npm         : " + sC.getData(indexNpm).getNpm());
            System.out.println("Modul       : " + sC.getData(indexNpm).getMdl());
            System.out.println("Kelas       : " + sC.getData(indexNpm).getKls());
            System.out.println("jadwal      : " + sC.getData(indexNpm).getJdwl());
            System.out.println("===============================");
            System.out.print("anda mau menghapus akun ini (y/t) : ");
            String ya = inp.next();
            if(ya.equals("y")){
                adminC.deleteByAdmin(indexNpm);
            }else {

            }
        }
    }
}
