/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.sql.ResultSet;

/**
 *
 * @author BUNTORO
 */
public class member {
    private String idMember, nama, alamat, nohp,jkelamin,tempatl,tgllahir,agama;
    
    public member(){}

    public member(String idMember, String nama, String alamat, String nohp, String jkelamin, String tempatl, String tgllahir, String agama) {
        this.idMember = idMember;
        this.nama = nama;
        this.alamat = alamat;
        this.nohp = nohp;
        this.jkelamin = jkelamin;
        this.tempatl = tempatl;
        this.tgllahir = tgllahir;
        this.agama = agama;
    }
    
    public String getQuote(String masuk)
    {
        return "'"+masuk+"'";
    }
    public void createMember(){
        Database db = new Database();
        String s="insert into member values("+getQuote(idMember)+","+getQuote(nama)+","+getQuote(alamat)+","+getQuote(nohp)+","+getQuote(jkelamin)+","+getQuote(tempatl)+","+getQuote(tgllahir)+","+getQuote(agama)+")";
        db.query(s);
    }
    public void deleteMember(String id){
        Database db = new Database();
        String s="delete from member where idmember ="+getQuote(id)+";";
        db.query(s);
    }
    public void updateMember(String id, String nm, String alm, String hp, String jk, String tl, String tg, String agm){
        Database db = new Database();
        String s="UPDATE member SET  nama = "+getQuote(nm)+", alamat = "+getQuote(alm)+", nohp = "+getQuote(hp)+", jenis_kelamin = "+getQuote(jk)+", tempat_lahir = "+getQuote(tl)+", tanggal_lahir = "+getQuote(tg)+",agama = "+getQuote(agm)+" WHERE idmember = "+getQuote(id)+";";
        db.query(s);
    }
    public ResultSet cekMember(String id){
        Database db = new Database();
        String SQLString = "SELECT * from member where idmember= "+getQuote(id)+";";
        return db.getData(SQLString);
    }
    public ResultSet getDataMember(){
        Database db = new Database();
        String SQLString = "SELECT * from member ";
        return db.getData(SQLString);
    }
    
    public String getIdMember() {
        return idMember;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
    public String getJkelamin() {
        return jkelamin;
    }

    public void setJkelamin(String jkelamin) {
        this.jkelamin = jkelamin;
    }

    public String getTempatl() {
        return tempatl;
    }

    public void setTempatl(String tempatl) {
        this.tempatl = tempatl;
    }

    public String getTgllahir() {
        return tgllahir;
    }

    public void setTgllahir(String tgllahir) {
        this.tgllahir = tgllahir;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }
    
    
}
