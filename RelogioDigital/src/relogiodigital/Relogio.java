package relogiodigital;

public class Relogio {

    private int hora;
    private int minuto;
    private int segundo;
    
    //C1
    public Relogio() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    //C2
    public Relogio(int h) {
        if (h >= 0 && h <= 24){
            hora = h;
        }
        minuto = 0;
        segundo = 0;
    }

    //C3
    public Relogio(int h, int m) {
        if (h >= 0 && h <= 24){
            hora = h;
        }
        if (m >= 0 && m <= 60){
            minuto = m;
        }
        segundo = 0;
    }

    //C4
    public Relogio(int h, int m, int s) {
        if (h >= 0 && h <= 24){
            hora = h;
        }
        if (m >= 0 && m <= 60){
            minuto = m;
        }
        if (s >= 0 && s <= 60){
            segundo = s;
        }
    }

    public void setHora(int x) {
        if (x >= 0 && x <= 24){
            hora = x;
        }
    }

    public void setMinuto(int x) {
        if (x >= 0 && x <= 60){
            minuto = x;
        }
    }

    public void setSegundo(int x) {
        if (x >= 0 && x <= 60){
            segundo = x;
        }
    }
    
    public int getHora(){
        return hora;
    }
    public int getMinuto(){
        return minuto;
    }
    public int getSegundo(){
        return segundo;
    }
}
