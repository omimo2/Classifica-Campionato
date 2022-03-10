package tema.pkg20;

public class Partita extends Giocatore{
    private String data;
    private String ora;
    private String squadra1;
    private String squadra2;
    public int punteggio1;
    private int punteggio2;
    private String vincitore;

    public Partita(String data, String ora, String squadra1, String squadra2, int punteggio1, int punteggio2) {
        this.data = data;
        this.ora = ora;
        this.squadra1 = squadra1;
        this.squadra2 = squadra2;
        this.punteggio1 = punteggio1;
        this.punteggio2 = punteggio2;
        this.vincitore=vincitore;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public String getSquadra1() {
        return squadra1;
    }

    public void setSquadra1(String squadra1) {
        this.squadra1 = squadra1;
    }

    public String getSquadra2() {
        return squadra2;
    }

    public void setSquadra2(String squadra2) {
        this.squadra2 = squadra2;
    }

    public int getPunteggio1() {
          punteggio1 = (int)(Math.random()*7);
        return punteggio1;
    }

    public void setPunteggio1(int punteggio1) {
        this.punteggio1 = punteggio1;
    }

    public int getPunteggio2() {
        punteggio2 = (int)(Math.random()*7);
        return punteggio2;
    }

    public void setPunteggio2(int punteggio2) {
        this.punteggio2 = punteggio2;
    }
    
    public String getVincitore() {
       if(punteggio1>punteggio2){
           vincitore = squadra1;
           
       }else{vincitore = squadra2;}
              
       return vincitore;
    }
    
    public int getPunteggio(){
        int pClass=0;
        
        if(vincitore == squadra1){
            pClass+=3;
        }else if(vincitore == squadra2){
            pClass+=3;
        }else if(vincitore == null){
            pClass+=1;
        }
        return pClass;
    }  
    public String toString(){
        return data + " - " + ora + ": \n" + squadra1 + " - " + squadra2 + ": " + punteggio1 + " - " + punteggio2;
    }
}

