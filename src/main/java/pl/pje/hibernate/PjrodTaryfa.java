package pl.pje.hibernate;
// Generated 2013-09-03 23:49:33 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PjrodTaryfa generated by hbm2java
 */
@Entity
@Table(name="pjrod_taryfa"
    ,catalog="rod"
)
public class PjrodTaryfa  implements java.io.Serializable {


     private Integer idTaryfa;
     private String nazwa;
     private int opsPrzejsciowa;
     private int opsPrzesyl;
     private int opsDystrybucja;
     private int opzEnergia;
     private int opzSkljak;
     private int vat1;
     private int vat2;
     private int vatMaska;
     private int opzSieciowa;
     private int dataOd;
     private int created;
     private int lastMod;
     private String whoMod;

    public PjrodTaryfa() {
    }

	
    public PjrodTaryfa(String nazwa, int opsPrzejsciowa, int opsPrzesyl, int opsDystrybucja, int opzEnergia, int opzSkljak, int vat1, int vat2, int vatMaska, int opzSieciowa, int dataOd, int created, int lastMod) {
        this.nazwa = nazwa;
        this.opsPrzejsciowa = opsPrzejsciowa;
        this.opsPrzesyl = opsPrzesyl;
        this.opsDystrybucja = opsDystrybucja;
        this.opzEnergia = opzEnergia;
        this.opzSkljak = opzSkljak;
        this.vat1 = vat1;
        this.vat2 = vat2;
        this.vatMaska = vatMaska;
        this.opzSieciowa = opzSieciowa;
        this.dataOd = dataOd;
        this.created = created;
        this.lastMod = lastMod;
    }
    public PjrodTaryfa(String nazwa, int opsPrzejsciowa, int opsPrzesyl, int opsDystrybucja, int opzEnergia, int opzSkljak, int vat1, int vat2, int vatMaska, int opzSieciowa, int dataOd, int created, int lastMod, String whoMod) {
       this.nazwa = nazwa;
       this.opsPrzejsciowa = opsPrzejsciowa;
       this.opsPrzesyl = opsPrzesyl;
       this.opsDystrybucja = opsDystrybucja;
       this.opzEnergia = opzEnergia;
       this.opzSkljak = opzSkljak;
       this.vat1 = vat1;
       this.vat2 = vat2;
       this.vatMaska = vatMaska;
       this.opzSieciowa = opzSieciowa;
       this.dataOd = dataOd;
       this.created = created;
       this.lastMod = lastMod;
       this.whoMod = whoMod;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id_taryfa", unique=true, nullable=false)
    public Integer getIdTaryfa() {
        return this.idTaryfa;
    }
    
    public void setIdTaryfa(Integer idTaryfa) {
        this.idTaryfa = idTaryfa;
    }
    
    @Column(name="nazwa", nullable=false, length=32)
    public String getNazwa() {
        return this.nazwa;
    }
    
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    
    @Column(name="ops_przejsciowa", nullable=false)
    public int getOpsPrzejsciowa() {
        return this.opsPrzejsciowa;
    }
    
    public void setOpsPrzejsciowa(int opsPrzejsciowa) {
        this.opsPrzejsciowa = opsPrzejsciowa;
    }
    
    @Column(name="ops_przesyl", nullable=false)
    public int getOpsPrzesyl() {
        return this.opsPrzesyl;
    }
    
    public void setOpsPrzesyl(int opsPrzesyl) {
        this.opsPrzesyl = opsPrzesyl;
    }
    
    @Column(name="ops_dystrybucja", nullable=false)
    public int getOpsDystrybucja() {
        return this.opsDystrybucja;
    }
    
    public void setOpsDystrybucja(int opsDystrybucja) {
        this.opsDystrybucja = opsDystrybucja;
    }
    
    @Column(name="opz_energia", nullable=false)
    public int getOpzEnergia() {
        return this.opzEnergia;
    }
    
    public void setOpzEnergia(int opzEnergia) {
        this.opzEnergia = opzEnergia;
    }
    
    @Column(name="opz_skljak", nullable=false)
    public int getOpzSkljak() {
        return this.opzSkljak;
    }
    
    public void setOpzSkljak(int opzSkljak) {
        this.opzSkljak = opzSkljak;
    }
    
    @Column(name="vat_1", nullable=false)
    public int getVat1() {
        return this.vat1;
    }
    
    public void setVat1(int vat1) {
        this.vat1 = vat1;
    }
    
    @Column(name="vat_2", nullable=false)
    public int getVat2() {
        return this.vat2;
    }
    
    public void setVat2(int vat2) {
        this.vat2 = vat2;
    }
    
    @Column(name="vat_maska", nullable=false)
    public int getVatMaska() {
        return this.vatMaska;
    }
    
    public void setVatMaska(int vatMaska) {
        this.vatMaska = vatMaska;
    }
    
    @Column(name="opz_sieciowa", nullable=false)
    public int getOpzSieciowa() {
        return this.opzSieciowa;
    }
    
    public void setOpzSieciowa(int opzSieciowa) {
        this.opzSieciowa = opzSieciowa;
    }
    
    @Column(name="data_od", nullable=false)
    public int getDataOd() {
        return this.dataOd;
    }
    
    public void setDataOd(int dataOd) {
        this.dataOd = dataOd;
    }
    
    @Column(name="created", nullable=false)
    public int getCreated() {
        return this.created;
    }
    
    public void setCreated(int created) {
        this.created = created;
    }
    
    @Column(name="last_mod", nullable=false)
    public int getLastMod() {
        return this.lastMod;
    }
    
    public void setLastMod(int lastMod) {
        this.lastMod = lastMod;
    }
    
    @Column(name="who_mod", length=32)
    public String getWhoMod() {
        return this.whoMod;
    }
    
    public void setWhoMod(String whoMod) {
        this.whoMod = whoMod;
    }




}


