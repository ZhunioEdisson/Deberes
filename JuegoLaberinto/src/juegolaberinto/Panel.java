/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegolaberinto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mary zhingre
 */
public class Panel extends JFrame implements MouseMotionListener{
    int x1,y1;
    String tex;
    public JLabel label;
    public JPanel panelPrincipal;
    public JButton boton1,boton2,boton3,boton4,boton5;
    
    
    public Panel(){
        setTitle("JUEGO");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        IniciarComponentes();
    }
    public void IniciarComponentes(){
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        
        panelPrincipal.setBounds(20,20,400,400);
        add(panelPrincipal);
        boton1 = new JButton();
        boton1.setBounds(30, 30, 400, 10);
        boton1.setBackground(Color.black);
        panelPrincipal.add(boton1);
        //repaint();
        label =  new JLabel("Por Aqui -->");
        label.setBounds(20, 45, 100, 100);
        panelPrincipal.add(label);
        //repaint();
        boton2 = new JButton();
        boton2.setBackground(Color.black);
        boton2.setBounds(430, 20, 10, 200);
        panelPrincipal.add(boton2);
        //repaint();
        boton3 = new JButton();
        boton3.setBackground(Color.black);
        boton3.setBounds(30,60, 400, 10);
        add(boton3);
        //repaint();
        addMouseMotionListener(this);
        Mouse();
        
    }
    @Override
    public void paint(Graphics lienzo){
        
        lienzo.clearRect(0, 0, 400, 400);
        lienzo.setColor(Color.BLUE);
        lienzo.fillOval(x1,y1,10,10);
       //lienzo.drawString(tex, 20, 300);
       //repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x1=(int) e.getPoint().getX();
        y1=(int) e.getPoint().getY();
        tex ="X"+x1 +"Y"+y1;
        repaint();
    }

   
    public void Mouse(){
        MouseListener oyente = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(panelPrincipal, "Perdiste");
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        boton1.addMouseListener(oyente);
        boton2.addMouseListener(oyente);
        boton3.addMouseListener(oyente);
    
    }
        
   
    
    

   

   
    
}
