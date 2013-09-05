/*
 * =======================================================
 *        Wszystko mozna zmieniac i dystrybuowac.
 *       Licencja typu MKTK - moj kod, to Twoj kod 
 *   Dla przyzwoitosci mozesz zostawic namiary na mnie:
 * Pawel Jacon - pawel@pje.pl - www.pje.pl - +48 695758801 
 * =======================================================
 */
package pl.pje.jprogs.energia;

/**
 *******[ PJE Pawel Jacon ]*******************************[ +48 695758801 ]***
 * * Utworzono dnia : * Ostatnia modyfikacja :
 *
 *
 * @author Pawel Jacon <pawel at pje.pl> * * **************[ Piotra Skargi 83E
 * ]---[ Pabianice, Polska ]*****************
 */
class PJDzialkaInfo {

    private int numerDzialkowca = 0;

    public int getNumerDzialkowca() {
        return numerDzialkowca;
    }

    public void setNumerDzialkowca(int numerDzialkowca) {
        this.numerDzialkowca = numerDzialkowca;
    }

    public int getNumerDzialki() {
        return numerDzialki;
    }

    public void setNumerDzialki(int numerDzialki) {
        this.numerDzialki = numerDzialki;
    }

    public int getNumerSektora() {
        return numerSektora;
    }

    public void setNumerSektora(int numerSektora) {
        this.numerSektora = numerSektora;
    }

    public String getWlasciciel() {
        return wlasciciel;
    }

    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    public String getWspolWlasciciel() {
        return wspolWlasciciel;
    }

    public void setWspolWlasciciel(String wspolWlasciciel) {
        this.wspolWlasciciel = wspolWlasciciel;
    }

    public int getMetrazDzialki() {
        return metrazDzialki;
    }

    public void setMetrazDzialki(int metrazDzialki) {
        this.metrazDzialki = metrazDzialki;
    }

    public int getMetrazSektora() {
        return metrazSektora;
    }

    public void setMetrazSektora(int metrazSektora) {
        this.metrazSektora = metrazSektora;
    }

    public String getZabudowania() {
        return zabudowania;
    }

    public void setZabudowania(String zabudowania) {
        this.zabudowania = zabudowania;
    }

    public String getProblemy() {
        return problemy;
    }

    public void setProblemy(String problemy) {
        this.problemy = problemy;
    }

    public int getWymogi() {
        return wymogi;
    }

    public void setWymogi(int wymogi) {
        this.wymogi = wymogi;
    }

    public int getAktywna() {
        return aktywna;
    }

    public void setAktywna(int aktywna) {
        this.aktywna = aktywna;
    }

    public String getOpisDzialki() {
        return opisDzialki;
    }

    public void setOpisDzialki(String opisDzialki) {
        this.opisDzialki = opisDzialki;
    }

    public String getPoprzedniwlasciciel() {
        return poprzedniwlasciciel;
    }

    public void setPoprzedniwlasciciel(String poprzedniwlasciciel) {
        this.poprzedniwlasciciel = poprzedniwlasciciel;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getLastMod() {
        return lastMod;
    }

    public void setLastMod(int lastMod) {
        this.lastMod = lastMod;
    }

    public String getWhoMod() {
        return whoMod;
    }

    public void setWhoMod(String whoMod) {
        this.whoMod = whoMod;
    }

    @Override
    public String toString() {
        return "PJDzialkaInfo{" + "numerDzialkowca=" + numerDzialkowca + ", numerDzialki=" + numerDzialki + ", numerSektora=" + numerSektora + ", wlasciciel=" + wlasciciel + ", wspolWlasciciel=" + wspolWlasciciel + ", metrazDzialki=" + metrazDzialki + ", metrazSektora=" + metrazSektora + ", zabudowania=" + zabudowania + ", problemy=" + problemy + ", wymogi=" + wymogi + ", aktywna=" + aktywna + ", opisDzialki=" + opisDzialki + ", poprzedniwlasciciel=" + poprzedniwlasciciel + ", created=" + created + ", lastMod=" + lastMod + ", whoMod=" + whoMod + '}';
    }
    
    private int numerDzialki = 0;
    private int numerSektora = 0;
    private String wlasciciel = "Właściciel";
    private String wspolWlasciciel = "Współwłaściciel";
    private int metrazDzialki = 0;
    private int metrazSektora = 0;
    private String zabudowania = "Altana";
    private String problemy = "Brak";
    private int wymogi = 0;
    private int aktywna = 1;
    private String opisDzialki = "Brak informacji";
    private String poprzedniwlasciciel = "Brak informacji";
    private int created = 0;
    private int lastMod = 0;
    private String whoMod = "Brak informacji";
}
