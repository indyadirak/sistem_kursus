package entity;

public class Member {
    protected String nama, pass;

    public Member(String name, String pass){
        this.nama = name;
        this.pass = pass;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }
}
