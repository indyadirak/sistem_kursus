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

    public void reg(String nama, String alamat, String noTelp, String password) {
        ModelObject.siswa.insert(new Peserta(nama, alamat, noTelp, password));
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

    public void merubah_nama(String nama_lama, String nama_baru) {
        ModelObject.siswa.merubah_nama(nama_lama, nama_baru);
    }

    public void merubah_alamat(String alamat_lama, String alamat_baru) {
        ModelObject.siswa.merubah_alamat(alamat_lama, alamat_baru);
    }

    public void merubah_nomor_telepon(String nomor_telepon_lama, String nomor_telepon_baru) {
        ModelObject.siswa.merubah_nomor_telepon(nomor_telepon_lama, nomor_telepon_baru);
    }

    public void merubah_password(String password_lama, String password_baru) {
        ModelObject.siswa.merubah_password(password_lama, password_baru);
    }

    public void delete(String nama) {
        ModelObject.siswa.menghapus_account(nama);
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
        } else if (pilihan == 'n' || pilihan == 'N') {
            new HomePage().home();
        }
    }
}
