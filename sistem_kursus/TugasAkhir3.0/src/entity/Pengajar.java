package entity;

public class Pengajar extends Member {
    private String nip;

    public Pengajar(String nama, String nip, String password){
        super(nama, password);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

}
