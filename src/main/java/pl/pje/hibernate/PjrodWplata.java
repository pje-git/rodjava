package pl.pje.hibernate;
// Generated 2013-09-03 23:49:33 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PjrodWplata generated by hbm2java
 */
@Entity
@Table(name="pjrod_wplata"
    ,catalog="rod"
)
public class PjrodWplata  implements java.io.Serializable {


     private Integer idWplata;
     private int idDzialka;
     private int idFundusz;
     private String wplacajacy;
     private String operacja;
     private int data;
     private int kwota;
     private int created;
     private int lastMod;
     private String whoMod;

    public PjrodWplata() {
    }

	
    public PjrodWplata(int idDzialka, int idFundusz, int data, int kwota, int created, int lastMod) {
        this.idDzialka = idDzialka;
        this.idFundusz = idFundusz;
        this.data = data;
        this.kwota = kwota;
        this.created = created;
        this.lastMod = lastMod;
    }
    public PjrodWplata(int idDzialka, int idFundusz, String wplacajacy, String operacja, int data, int kwota, int created, int lastMod, String whoMod) {
       this.idDzialka = idDzialka;
       this.idFundusz = idFundusz;
       this.wplacajacy = wplacajacy;
       this.operacja = operacja;
       this.data = data;
       this.kwota = kwota;
       this.created = created;
       this.lastMod = lastMod;
       this.whoMod = whoMod;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id_wplata", unique=true, nullable=false)
    public Integer getIdWplata() {
        return this.idWplata;
    }
    
    public void setIdWplata(Integer idWplata) {
        this.idWplata = idWplata;
    }
    
    @Column(name="id_dzialka", nullable=false)
    public int getIdDzialka() {
        return this.idDzialka;
    }
    
    public void setIdDzialka(int idDzialka) {
        this.idDzialka = idDzialka;
    }
    
    @Column(name="id_fundusz", nullable=false)
    public int getIdFundusz() {
        return this.idFundusz;
    }
    
    public void setIdFundusz(int idFundusz) {
        this.idFundusz = idFundusz;
    }
    
    @Column(name="wplacajacy", length=256)
    public String getWplacajacy() {
        return this.wplacajacy;
    }
    
    public void setWplacajacy(String wplacajacy) {
        this.wplacajacy = wplacajacy;
    }
    
    @Column(name="operacja", length=256)
    public String getOperacja() {
        return this.operacja;
    }
    
    public void setOperacja(String operacja) {
        this.operacja = operacja;
    }
    
    @Column(name="data", nullable=false)
    public int getData() {
        return this.data;
    }
    
    public void setData(int data) {
        this.data = data;
    }
    
    @Column(name="kwota", nullable=false)
    public int getKwota() {
        return this.kwota;
    }
    
    public void setKwota(int kwota) {
        this.kwota = kwota;
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

