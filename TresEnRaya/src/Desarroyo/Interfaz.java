/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desarroyo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mary zhingre
 */
public class Interfaz extends JFrame  {
    public String comprobar = "";
    public boolean turno =false;
    public JPanel panelPrincipal;
    public JLabel etiqueta;
    public JButton label1;
    public JButton label2;
    public JButton label3;
    public JButton label4;
    public JButton label5;
    public JButton label6;
    public JButton label7;
    public JButton label8;
    public JButton label9;
    public JButton label10;
    public JTextField cuadroTexto;

    
    public Interfaz(){
        setTitle("JuegoTresEnRaya");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setContentPane(panelPrincipal);
        setLayout(null);
        
        setLocationRelativeTo(null);
        IniciarComponentes();
    }
    public void IniciarComponentes() {
        panelPrincipal = new JPanel();
        panelPrincipal.setBackground(Color.orange);
        panelPrincipal.setLayout(null);
        panelPrincipal.setBounds(90, 110, 300, 300);
        //this.getContentPane().add(4);
        
        label1 = new JButton("Reiniciar");
        label1.setBackground(Color.WHITE);
        label1.setBounds(10, 15, 90, 50);
        label1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                label2.setText("");
                label3.setText("");
                label4.setText("");
                label5.setText("");
                label6.setText("");
                label7.setText("");
                label8.setText("");
                label9.setText("");
                label10.setText("");
                comprobar = "";
            }
        });
        
        cuadroTexto = new JTextField();
        cuadroTexto.setBounds(130, 30, 90, 35);
        
        etiqueta = new JLabel("Turno: ");
        etiqueta.setBounds(130,5,100, 35);
        Cambiar();
        
        label2 = new JButton();
        label2.setBackground(Color.WHITE);
        label2.setBounds(30, 30, 65, 65);
        panelPrincipal.add(label2);
        label2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(turno == false && label2.getText() == ""){
                    label2.setText("X");
                    turno = true;
                }
                else if(turno == true && label2.getText() ==""){
                    label2.setText("O");
                    turno = false;
                }
                Cambiar();
                ComprobarX();
                ComprobarO();
            }
        });
        
        
        label3 = new JButton();
        label3.setBackground(Color.WHITE);
        label3.setBounds(30, 110, 65, 65);
        panelPrincipal.add(label3);
        label3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
               if(turno == false && label3.getText() == ""){
                    label3.setText("X");
                    turno = true;
                }
                else if(turno == true && label3.getText() ==""){
                    label3.setText("O");
                    turno = false;
                }
               Cambiar();
              ComprobarX();
                ComprobarO();
            }
            
        });
        
        label4 = new JButton();
        label4.setBackground(Color.WHITE);
        label4.setBounds(30, 190, 65, 65);
        panelPrincipal.add(label4);
        label4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
               if(turno == false && label4.getText() == ""){
                    label4.setText("X");
                    turno = true;
                }
                else if(turno == true && label4.getText() ==""){
                    label4.setText("O");
                    turno = false;
                }
               Cambiar();
               ComprobarX();
                ComprobarO();
            }
            
        });
        
        label5 = new JButton();
        label5.setBackground(Color.WHITE);
        label5.setBounds(115, 30, 65, 65);
        panelPrincipal.add(label5);
        label5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
               if(turno == false && label5.getText() == ""){
                    label5.setText("X");
                    turno = true;
                }
                else if(turno == true && label5.getText() ==""){
                    label5.setText("O");
                    turno = false;
                }
               Cambiar();
               ComprobarX();
                ComprobarO();
            }
            
        });
        
        label6 = new JButton();
        label6.setBackground(Color.WHITE);
        label6.setBounds(115, 110, 65, 65);
        panelPrincipal.add(label6);
        label6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
               if(turno == false && label6.getText() == ""){
                    label6.setText("X");
                    turno = true;
                }
                else if(turno == true && label6.getText() ==""){
                    label6.setText("O");
                    turno = false;
                }
               Cambiar();
              ComprobarX();
                ComprobarO();
            }
        });
        
        label7 = new JButton();
        label7.setBackground(Color.WHITE);
        label7.setBounds(115, 190, 65, 65);
        panelPrincipal.add(label7);
        label7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(turno == false && label7.getText() == ""){
                    label7.setText("X");
                    turno = true;
                }
                else if(turno == true && label7.getText() ==""){
                    label7.setText("O");
                    turno = false;
                }
                Cambiar();
                ComprobarX();
                ComprobarO();
            }
        });
        
        label8 = new JButton();
        label8.setBackground(Color.WHITE);
        label8.setBounds(200, 30, 65, 65);
        panelPrincipal.add(label8);
        label8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
               if(turno == false && label8.getText() == ""){
                    label8.setText("X");
                    turno = true;
                }
                else if(turno == true && label8.getText() ==""){
                    label8.setText("O");
                    turno = false;
                }
               Cambiar();
               ComprobarX();
                ComprobarO();
            }
        });
        
        label9 = new JButton();
        label9.setBackground(Color.WHITE);
        label9.setBounds(200, 110, 65, 65);
        panelPrincipal.add(label9);
        label9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
               if(turno == false && label9.getText() == ""){
                    label9.setText("X");
                    turno = true;
                }
                else if(turno == true && label9.getText() ==""){
                    label9.setText("O");
                    turno = false;
                }
               Cambiar();
               ComprobarX();
                ComprobarO();
            }
        });
        
        label10 = new JButton();
        label10.setBackground(Color.WHITE);
        label10.setBounds(200, 190, 65, 65);
        panelPrincipal.add(label10);
        label10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(turno == false && label10.getText() == ""){
                    label10.setText("X");
                    turno = true;
                }
                else if(turno == true && label10.getText() ==""){
                    label10.setText("O");
                    turno = false;
                }
                Cambiar();
                ComprobarX();
                ComprobarO();
            }
        });
        
        add(cuadroTexto);
        add(label1);
        add(etiqueta);
        add(panelPrincipal);
    }
    
    public void Cambiar(){
        if(turno == false){
            cuadroTexto.setText("X");
        }
        else{
            cuadroTexto.setText("O");
        }
    }
    
    public void ComprobarX(){
        if(label2.getText().equals("X") && label3.getText().equals("X") && label4.getText().equals("X")){
            JOptionPane.showMessageDialog(this,"GANASTE!!");
        }
        else if(label5.getText().equals("X") && label6.getText().equals("X") && label7.getText().equals("X") ){
            JOptionPane.showMessageDialog(this,"GANASTE!!");
        }
        else if(label8.getText().equals("X") && label9.getText().equals("X") && label10.getText().equals("X") ){
            JOptionPane.showMessageDialog(this,"GANASTE!!");
        }
        else if(label2.getText().equals("X")&& label5.getText().equals("X") &&label8.getText().equals("X")){
            JOptionPane.showMessageDialog(this,"GANASTE!!");
        }
        else if( label3.getText().equals("X") && label6.getText().equals("X") &&label9.getText().equals("X")){
            JOptionPane.showMessageDialog(this,"GANASTE!!");
        }
        else if(label4.getText().equals("X") && label7.getText().equals("X")&&label9.getText().equals("X") ){
            JOptionPane.showMessageDialog(this,"GANASTE!!");
        }
        else if(label2.getText().equals("X") &&label6.getText().equals("X") &&label10.getText().equals("X")){
            JOptionPane.showMessageDialog(this,"GANASTE!!");
        }
        else if(label4.getText().equals("X") && label6.getText().equals("X") && label8.getText().equals("X")){
            JOptionPane.showMessageDialog(this,"GANASTE!!");
        }
    }
    public void ComprobarO(){
        if(label2.getText().equals("O") && label3.getText().equals("O") && label4.getText().equals("O") ){
            JOptionPane.showMessageDialog(this,"GANASTE!!");
        }
        else if(label5.getText().equals("O") && label6.getText().equals("O") && label7.getText().equals("O") ){
            JOptionPane.showMessageDialog(this,"GANASTE!!");
        }
        else if(label8.getText().equals("O") && label9.getText().equals("O") && label10.getText().equals("O") ){
            JOptionPane.showMessageDialog(this,"GANASTE!!");
        }
        else if(label2.getText().equals("O")&& label5.getText().equals("O") &&label8.getText().equals("O")){
            JOptionPane.showMessageDialog(this,"GANASTE!!");
        }
        else if( label3.getText().equals("O") && label6.getText().equals("O") &&label9.getText().equals("O")){
            JOptionPane.showMessageDialog(this,"GANASTE!!");
        }
         else if(label4.getText().equals("O") && label7.getText().equals("O")&&label9.getText().equals("O") ){
            JOptionPane.showMessageDialog(this,"GANASTE!!");
        }
        else if(label2.getText().equals("O") &&label6.getText().equals("O") &&label10.getText().equals("O")){
            JOptionPane.showMessageDialog(this,"GANASTE!!");
        }
         else if(label4.getText().equals("O") && label6.getText().equals("O") && label8.getText().equals("O")){
            JOptionPane.showMessageDialog(this,"GANASTE!!");
        }
        
    }
   

  
    
}
