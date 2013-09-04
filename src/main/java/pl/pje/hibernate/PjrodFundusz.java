package pl.pje.hibernate;
// Generated 2013-09-03 23:49:33 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PjrodFundusz generated by hbm2java
 */
@Entity
@Table(name="pjrod_fundusz"
    ,catalog="rod"
)
public class PjrodFundusz  implements java.io.Serializable {


     private Integer idFundusz;
     private String nazwaSkr;
     private String nazwa;
     private String opis;
     private String kontoBank;
     private String kontoZpk;
     private int kwota;
     private int domyslny;
     private int dataOd;
     private int created;
     private int lastMod;
     private String whoMod;

    public PjrodFundusz() {
    }

	
    public PjrodFundusz(String nazwaSkr, String nazwa, int kwota, int domyslny, int dataOd, int created, int lastMod) {
        this.nazwaSkr = nazwaSkr;
        this.nazwa = nazwa;
        this.kwota = kwota;
        this.domyslny = domyslny;
        this.dataOd = dataOd;
        this.created = created;
        this.lastMod = lastMod;
    }
    public PjrodFundusz(String nazwaSkr, String nazwa, String opis, String kontoBank, String kontoZpk, int kwota, int domyslny, int dataOd, int created, int lastMod, String whoMod) {
       this.nazwaSkr = nazwaSkr;
       this.nazwa = nazwa;
       this.opis = opis;
       this.kontoBank = kontoBank;
       this.kontoZpk = kontoZpk;
       this.kwota = kwota;
       this.domyslny = domyslny;
       this.dataOd = dataOd;
       this.created = created;
       this.lastMod = lastMod;
       this.whoMod = whoMod;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id_fundusz", unique=true, nullable=false)
    public Integer getIdFundusz() {
        return this.idFundusz;
    }
    
    public void setIdFundusz(Integer idFundusz) {
        this.idFundusz = idFundusz;
    }
    
    @Column(name="nazwa_skr", nullable=false, length=32)
    public String getNazwaSkr() {
        return this.nazwaSkr;
    }
    
    public void setNazwaSkr(String nazwaSkr) {
        this.nazwaSkr = nazwaSkr;
    }
    
    @Column(name="nazwa", nullable=false, length=128)
    public String getNazwa() {
        return this.nazwa;
    }
    
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    
    @Column(name="opis", length=256)
    public String getOpis() {
        return this.opis;
    }
    
    public void setOpis(String opis) {
        this.opis = opis;
    }
    
    @Column(name="konto_bank", length=256)
    public String getKontoBank() {
        return this.kontoBank;
    }
    
    public void setKontoBank(String kontoBank) {
        this.kontoBank = kontoBank;
    }
    
    @Column(name="konto_zpk", length=32)
    public String getKontoZpk() {
        return this.kontoZpk;
    }
    
    public void setKontoZpk(String kontoZpk) {
        this.kontoZpk = kontoZpk;
    }
    
    @Column(name="kwota", nullable=false)
    public int getKwota() {
        return this.kwota;
    }
    
    public void setKwota(int kwota) {
        this.kwota = kwota;
    }
    
    @Column(name="domyslny", nullable=false)
    public int getDomyslny() {
        return this.domyslny;
    }
    
    public void setDomyslny(int domyslny) {
        this.domyslny = domyslny;
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
    
    @Column(name="who_mod", length=128)
    public String getWhoMod() {
        return this.whoMod;
    }
    
    public void setWhoMod(String whoMod) {
        this.whoMod = whoMod;
    }




}

