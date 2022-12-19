package view.homepageview;

import java.util.Scanner;

public class ShowPage extends LoginPage {

    public void show() {
        // System.out.println("Debug test : " + sC.getArrayList());
        if (sC.getArrayList() == 0){
            System.out.println("Tidak ada data!\n");
        }
        else{
            for (int i = 0; i < sC.getArrayList(); i++) {
                arrNpm.add("06.2021.1.0746" + i);
                System.out.println("[" + (i + 1) + "]");
                System.out.println("===============================");
                System.out.println("nama        : " + sC.getData(i).getNama());
                System.out.println("alamat      : " + sC.getData(i).getAlamat());
                System.out.println("no telpon   : " + sC.getData(i).getNoTelpon());
                System.out.println("Npm         : " + arrNpm.get(i));
            }
        }
    }
}