package pl.pje.jprogs.rod_entity;
// Generated 2013-09-08 22:11:50 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PjrodRezerwacja generated by hbm2java
 */
@Entity
@Table(name="pjrod_rezerwacja"
    ,catalog="rod"
)
public class PjrodRezerwacja  implements java.io.Serializable {


     private Integer idRezerwacja;
     private int idSala;
     private String opis;
     private String kto;
     private String haslo;
     private String kontakt;
     private int dataRezerwacji;
     private int created;
     private int lastMod;
     private String whoMod;

    public PjrodRezerwacja() {
    }

	
    public PjrodRezerwacja(int idSala, String kto, String haslo, String kontakt, int dataRezerwacji, int created, int lastMod) {
        this.idSala = idSala;
        this.kto = kto;
        this.haslo = haslo;
        this.kontakt = kontakt;
        this.dataRezerwacji = dataRezerwacji;
        this.created = created;
        this.lastMod = lastMod;
    }
    public PjrodRezerwacja(int idSala, String opis, String kto, String haslo, String kontakt, int dataRezerwacji, int created, int lastMod, String whoMod) {
       this.idSala = idSala;
       this.opis = opis;
       this.kto = kto;
       this.haslo = haslo;
       this.kontakt = kontakt;
       this.dataRezerwacji = dataRezerwacji;
       this.created = created;
       this.lastMod = lastMod;
       this.whoMod = whoMod;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id_rezerwacja", unique=true, nullable=false)
    public Integer getIdRezerwacja() {
        return this.idRezerwacja;
    }
    
    public void setIdRezerwacja(Integer idRezerwacja) {
        this.idRezerwacja = idRezerwacja;
    }
    
    @Column(name="id_sala", nullable=false)
    public int getIdSala() {
        return this.idSala;
    }
    
    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }
    
    @Column(name="opis", length=256)
    public String getOpis() {
        return this.opis;
    }
    
    public void setOpis(String opis) {
        this.opis = opis;
    }
    
    @Column(name="kto", nullable=false, length=128)
    public String getKto() {
        return this.kto;
    }
    
    public void setKto(String kto) {
        this.kto = kto;
    }
    
    @Column(name="haslo", nullable=false, length=128)
    public String getHaslo() {
        return this.haslo;
    }
    
    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }
    
    @Column(name="kontakt", nullable=false, length=128)
    public String getKontakt() {
        return this.kontakt;
    }
    
    public void setKontakt(String kontakt) {
        this.kontakt = kontakt;
    }
    
    @Column(name="data_rezerwacji", nullable=false)
    public int getDataRezerwacji() {
        return this.dataRezerwacji;
    }
    
    public void setDataRezerwacji(int dataRezerwacji) {
        this.dataRezerwacji = dataRezerwacji;
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


