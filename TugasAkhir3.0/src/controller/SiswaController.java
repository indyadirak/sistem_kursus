package controller;


import entity.Peserta;
import model.ModelObject;
import view.DashboardPage;
import view.HomePage;
import view.homepageview.LoginPage;
import java.util.ArrayList;

public class SiswaController {

    int index_akun;
    public Peserta getData(int index) {
        return ModelObject.siswa.listSiswa.get(index);
    }


    public void reg(String nama, String alamat, String noTelp, String password, String mdl, String jdwl, String kls) {

        ModelObject.siswa.insert(new Peserta(nama, alamat, noTelp, password, mdl, jdwl, kls, ModelObject.siswa.listSiswa.size()+1));
    }

    public void proses_login(int npm, String password)
    {
        int status = 0;

        for (int perulangan = 0; perulangan < ModelObject.siswa.listSiswa.size(); perulangan++)
        {
            if ((ModelObject.siswa.listSiswa.get(perulangan).getNpm() == npm) && (ModelObject.siswa.listSiswa.get(perulangan).getPass().equals(password)))
            {
                index_akun = perulangan;
                status = 1;
            }
        }

        if (status == 1)
        {
            System.out.println("selamat datang " +ModelObject.siswa.listSiswa.get(index_akun).getNama());
            new DashboardPage().dashboard();
        }
        else
        {
            new LoginPage().loginGagal();
            new LoginPage().login();
        }

    }

    public  void perubahan_data_akun(String nama_baru,String alamat_baru,String nomor_telepon_baru,String password_baru)
    {
        ModelObject.siswa.merubah_nama(index_akun,nama_baru);
        ModelObject.siswa.merubah_alamat(index_akun,alamat_baru);
        ModelObject.siswa.merubah_nomor_telepon(index_akun,nomor_telepon_baru);
        ModelObject.siswa.merubah_password_akun(index_akun,password_baru);
    }

    public void delete()
    {

    }


}
