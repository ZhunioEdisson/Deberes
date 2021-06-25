/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movimiento_figura;

import java.awt.Color;
import java.awt.Graphics;
import javax.accessibility.AccessibleContext;
import javax.swing.JPanel;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author mary zhingre
 */
public class PanelFigura extends JPanel {
    private Figuras seleccion;
    private int tipoFigura;
    
    public PanelFigura(){
        setBounds(0, 0 , 500 , 500);
        seleccion = new Figuras(0, 0 , 200, 200);
        tipoFigura = 0;
    }
    
    @Override
    public void paint(Graphics lienzo){
        lienzo.clearRect(0, 0, 500, 500);
        lienzo.setColor(Color.red);
        switch(tipoFigura){
            case 1:lienzo.drawLine(seleccion.getX(), seleccion.getY(),seleccion.getAncho(),seleccion.getAlto());
            break;
            case 2:lienzo.drawRect(seleccion.getX(), seleccion.getY(),seleccion.getAncho(),seleccion.getAlto());
            break;
            case 3:lienzo.drawOval(seleccion.getX(), seleccion.getY(),seleccion.getAncho(),seleccion.getAlto());
            break;
            case 4: lienzo.drawRoundRect(seleccion.getX(), seleccion.getY(),seleccion.getAncho(),seleccion.getAlto(),20,20);
            break; 
        }
    }

    public Figuras getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Figuras seleccion) {
        this.seleccion = seleccion;
    }

    public int getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(int tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public ComponentUI getUi() {
        return ui;
    }

    public void setUi(ComponentUI ui) {
        this.ui = ui;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }
    
    
    
}
