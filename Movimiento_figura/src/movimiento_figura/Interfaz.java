/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movimiento_figura;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mary zhingre
 */
public class Interfaz extends JFrame  {
    private JPanel panelBotones;
    private PanelFigura panelFigura;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JLabel etiqueta;
    
    
    public Interfaz(){
        setTitle("JuegoTresEnRaya");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        //setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        IniciarComponentes();
        
    }
    public void IniciarComponentes(){
        panelBotones = new JPanel();
        panelFigura = new PanelFigura();
        boton1 = new JButton("linea");
        boton1.setBackground(Color.WHITE);
        boton1.setBounds(100, 0, 50, 50);
        panelBotones.add(boton1);
        boton2 = new JButton("cuadrado");
        boton2.setBackground(Color.WHITE);
        boton2.setBounds(20, 0, 50, 50);
        panelBotones.add(boton2);
        boton3 = new JButton("circulo");
        boton3.setBackground(Color.WHITE);
        boton3.setBounds(40, 0, 50, 50);
        panelBotones.add(boton3);
        add(panelBotones, BorderLayout.NORTH);
        add(panelFigura , BorderLayout.CENTER);
        boton1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){
                panelFigura.setTipoFigura(1);
                panelFigura.getSeleccion().setX(100);
                panelFigura.getSeleccion().setY(100);
                panelFigura.getSeleccion().setAncho(200);
                panelFigura.getSeleccion().setAlto(200);
                panelFigura.repaint();
            }
            
        });
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                panelFigura.setTipoFigura(2);
                panelFigura.getSeleccion().setX(100);
                panelFigura.getSeleccion().setY(100);
                panelFigura.getSeleccion().setAncho(100);
                panelFigura.getSeleccion().setAlto(100);
                panelFigura.repaint();
            }
            
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                panelFigura.setTipoFigura(3);
                panelFigura.getSeleccion().setX(100);
                panelFigura.getSeleccion().setY(100);
                panelFigura.getSeleccion().setAncho(100);
                panelFigura.getSeleccion().setAlto(100);
                panelFigura.repaint();
            }
            
        });
        
        
        
        
    }

   
}
