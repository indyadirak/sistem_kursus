package controller;


import entity.Peserta;
import model.ModelObject;
import org.junit.Test;
import view.DashboardPage;
import view.HomePage;
import view.homepageview.LoginPage;

import java.util.ArrayList;

public class SiswaController {


    public Peserta getData(int index) {
        return ModelObject.siswa.getPeserta(index);
    }

    public String getArrNpm(int index) {
        return ModelObject.siswa.getNpm(index);
    }

    public void reg(String nama, String alamat, String noTelp, String password, String mdl, String jdwl, String kls) {
//        int npm = 0;
        ModelObject.siswa.insert(new Peserta(nama, alamat, noTelp, password, mdl, jdwl, kls, ModelObject.siswa.jumlah_data_array_peserta()+1));
    }

    public void proses_login(int npm, String password)
    {
        int status = 0;

        for (int perulangan = 0; perulangan < ModelObject.siswa.jumlah_data_array_peserta(); perulangan++)
        {
            if ((ModelObject.siswa.getPeserta(perulangan).getNpm() == npm) && (ModelObject.siswa.getPeserta(perulangan).getPass().equals(password)))
            {
                status = 1;
            }
        }

        if (status == 1)
        {
            System.out.println("selamat datang ");
            new DashboardPage().dashboard();
        }
        else
        {
            loginGagal();
            new LoginPage().login();
        }
    }
    private void loginGagal() {
        System.out.println("-------------------------------");
        System.out.println("----------LOGIN GAGAL----------");
        System.out.println("-------------------------------");
    }

    public int getArrayList() {
        return ModelObject.siswa.getArrayList();
    }

    public void merubah_nama(String nama_lama, String nama_baru) {
        for (int perulangan = 0; perulangan < ModelObject.siswa.jumlah_data_array_peserta(); perulangan++) {
            if (ModelObject.siswa.getPeserta(perulangan).getNama().equals(nama_lama)) {
                ModelObject.siswa.merubah_nama(perulangan, nama_baru);
            }
        }
    }

    public void merubah_alamat(String alamat_lama, String alamat_baru) {
        for (int perulangan = 0; perulangan < ModelObject.siswa.jumlah_data_array_peserta(); perulangan++) {
            if (ModelObject.siswa.getPeserta(perulangan).getAlamat().equals(alamat_lama)) {
                ModelObject.siswa.merubah_alamat(perulangan, alamat_baru);
            }
        }

    }

    public void merubah_nomor_telepon(String nomor_telepon_lama, String nomor_telepon_baru) {
        for (int perulangan = 0; perulangan < ModelObject.siswa.jumlah_data_array_peserta(); perulangan++) {
            if (ModelObject.siswa.getPeserta(perulangan).getNoTelpon().equals(nomor_telepon_lama)) {
                ModelObject.siswa.merubah_nomor_telepon(perulangan, nomor_telepon_baru);
            }
        }
    }

    public void merubah_password(String password_lama, String password_baru) {
        for (int perulangan = 0; perulangan < ModelObject.siswa.jumlah_data_array_peserta(); perulangan++) {
            if (ModelObject.siswa.getPeserta(perulangan).getPass().equals(password_lama)) {
                ModelObject.siswa.merubah_password(perulangan, password_baru);
            }
        }
    }

    public void delete(String nama) {
        for (int perulangan = 0; perulangan < ModelObject.siswa.jumlah_data_array_peserta(); perulangan++) {
            if (ModelObject.siswa.getPeserta(perulangan).getNama().equals(nama)) {
                ModelObject.siswa.menghapus_account(perulangan);
            }
        }
    }
}
