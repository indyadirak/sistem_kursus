package controller;
import entity.Peserta;
import model.Admin;
import model.ModelObject;
import entity.Kursus;

public class AdminController {
    public boolean login(String id, String pass){
        boolean status = false;
        if (id.equals(ModelObject.admin.getId())&& pass.equals(ModelObject.admin.getPass())){
            status = true;
        }return status;
    }

    public void deleteByAdmin(int index){
        ModelObject.siswa.listSiswa.remove(index);
    }

    public Peserta getData(int index) {
        return ModelObject.siswa.listSiswa.get(index);
    }
    public int searchByNpm(int npm){
        int StatusNpm;
        for (int perulangan = 0; perulangan < ModelObject.siswa.listSiswa.size(); perulangan++){
            if(npm == ModelObject.siswa.listSiswa.get(perulangan).getNpm()){
                return perulangan;
            }else {
                System.out.println("npm yang anda masukkan tidak ada");
            }
        }return -1;
    }
}
