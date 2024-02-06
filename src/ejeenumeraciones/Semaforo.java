package ejeenumeraciones;

/**
 *
 * @author linan
 */

enum ColorSemaforo{ROJO, AMARILLO, VERDE};

public class Semaforo {
    ColorSemaforo color;
    boolean parpadeando;
    
    public Semaforo(){
        color = ColorSemaforo.ROJO;
        parpadeando = false;
    }
    
    public Semaforo(ColorSemaforo color, boolean parpadeando){
        
        this.color = color;
        this.parpadeando = parpadeando;
        
    }

    public ColorSemaforo getColor() {
        return color;
    }

    public void setColor(ColorSemaforo color) {
        this.color = color;
    }

    public boolean isParpadeando() {
        return parpadeando;
    }

    public void setParpadeando(boolean parpadeando) {
        this.parpadeando = parpadeando;
    }
    boolean getParpadeando(){
        return parpadeando;
    }
}
