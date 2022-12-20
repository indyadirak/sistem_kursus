package controller;

import entity.Peserta;
import model.ModelObject;
import view.DashboardPage;
import view.HomePage;

import java.util.ArrayList;

public class SiswaController {

    public ArrayList<Peserta> listSiswa;
    public ArrayList<String> arrNpm;

    public Peserta getData(int index) {
        return ModelObject.siswa.getPeserta(index);
    }

    public void reg(String nama, String alamat, String noTelp, String password, String mdl, String jdwl, String kls) {
        ModelObject.siswa.insert(new Peserta(nama, alamat, noTelp, password, mdl, jdwl, kls));
    }

    public int cekdataAkun(String nama, String password) {
        int cekdata = ModelObject.siswa.cekLogin(nama, password);
        return cekdata;
    }

    public int getArrayList() {
        return ModelObject.siswa.getArrayList();
    }

    public String npmAuto(int index) {
        for (index = 0; index < listSiswa.size(); index++) {
            arrNpm.add("062025" + (index + 1));
        }
        return arrNpm.get(index);
    }

    public void merubah_nama(String nama_lama, String nama_baru)
    {
        for (int perulangan = 0; perulangan < listSiswa.size(); perulangan++)
        {
            if (listSiswa.get(perulangan).getNama().equals(nama_lama))
            {
                ModelObject.siswa.merubah_nama(perulangan, nama_baru);
            }
        }
    }

    public void merubah_alamat(String alamat_lama, String alamat_baru) {
        for (int perulangan = 0; perulangan < listSiswa.size(); perulangan++)
        {
            if (listSiswa.get(perulangan).getAlamat().equals(alamat_lama))
            {
                ModelObject.siswa.merubah_alamat(perulangan, alamat_baru);
            }
        }

    }

    public void merubah_nomor_telepon(String nomor_telepon_lama, String nomor_telepon_baru) {
        for (int perulangan = 0 ; perulangan < listSiswa.size(); perulangan++)
        {
            if (listSiswa.get(perulangan).getNoTelpon().equals(nomor_telepon_lama))
            {
                ModelObject.siswa.merubah_nomor_telepon(perulangan, nomor_telepon_baru);
            }
        }
    }

    public void merubah_password(String password_lama, String password_baru) {
        for (int perulangan = 0 ; perulangan < listSiswa.size(); perulangan++)
        {
            if (listSiswa.get(perulangan).getPass().equals(password_lama))
            {
                ModelObject.siswa.merubah_password(perulangan, password_baru);
            }
        }
    }

    public void delete(String nama)
    {
        for (int perulangan = 0; perulangan < listSiswa.size(); perulangan++)
        {
            if (listSiswa.get(perulangan).getNama().equals(nama))
            {
                ModelObject.siswa.menghapus_account(perulangan);
            }
        }
    }

    public void logOut(char pilihan){
        if (pilihan == 'y' || pilihan == 'Y'){
            new HomePage().home();
        }
        else if (pilihan == 'n' || pilihan == 'N'){
            new DashboardPage().dashboard();
        }
    }

    public void exit(char pilihan) {
        if (pilihan == 'y' || pilihan == 'Y') {
            System.out.println("Terima Kasih Kunjungannya");
        }
        else if (pilihan == 'n' || pilihan == 'N') {
            new HomePage().home();
        }
    }
}
