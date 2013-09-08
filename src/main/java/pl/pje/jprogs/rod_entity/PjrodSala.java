package pl.pje.jprogs.rod_entity;
// Generated 2013-09-08 22:11:50 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PjrodSala generated by hbm2java
 */
@Entity
@Table(name="pjrod_sala"
    ,catalog="rod"
)
public class PjrodSala  implements java.io.Serializable {


     private Integer idSala;
     private String nazwa;
     private String adres;
     private String opis;
     private String atrybuty;
     private int created;
     private int lastMod;
     private String whoMod;

    public PjrodSala() {
    }

	
    public PjrodSala(String nazwa, int created, int lastMod) {
        this.nazwa = nazwa;
        this.created = created;
        this.lastMod = lastMod;
    }
    public PjrodSala(String nazwa, String adres, String opis, String atrybuty, int created, int lastMod, String whoMod) {
       this.nazwa = nazwa;
       this.adres = adres;
       this.opis = opis;
       this.atrybuty = atrybuty;
       this.created = created;
       this.lastMod = lastMod;
       this.whoMod = whoMod;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id_sala", unique=true, nullable=false)
    public Integer getIdSala() {
        return this.idSala;
    }
    
    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
    }
    
    @Column(name="nazwa", nullable=false, length=128)
    public String getNazwa() {
        return this.nazwa;
    }
    
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    
    @Column(name="adres", length=128)
    public String getAdres() {
        return this.adres;
    }
    
    public void setAdres(String adres) {
        this.adres = adres;
    }
    
    @Column(name="opis", length=256)
    public String getOpis() {
        return this.opis;
    }
    
    public void setOpis(String opis) {
        this.opis = opis;
    }
    
    @Column(name="atrybuty", length=256)
    public String getAtrybuty() {
        return this.atrybuty;
    }
    
    public void setAtrybuty(String atrybuty) {
        this.atrybuty = atrybuty;
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


