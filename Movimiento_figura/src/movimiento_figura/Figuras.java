/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movimiento_figura;

/**
 *
 * @author mary zhingre
 */
public class Figuras {
    private int x;
    private int y;
    private int ancho;
    private int alto;

    public Figuras(int x, int y, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }

    public Figuras(int x, int y, int ancho) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Figura{" + "x=" + x + ", y=" + y + ", ancho=" + ancho + ", alto=" + alto + '}';
    }
    
    
    
}
