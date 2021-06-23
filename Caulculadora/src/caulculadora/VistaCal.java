/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caulculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mary zhingre
 */
public class VistaCal extends JFrame implements ActionListener{
    public float parte1;
    public float parte2;
    public String operador;
    private JPanel panelPrincipal;
    private JButton boton;
    private JTextField cuadroTexto;
    
    
    public VistaCal(){
        super(); 
        setTitle("holaSoyEdy");
        setBounds(0,0,500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponentesGridLayout();
        setContentPane(panelPrincipal);
    }
    public void initComponentesGridLayout(){
        this.panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        GridLayout tablaPlantilla = new GridLayout(6,4);
        cuadroTexto =  new JTextField();
        cuadroTexto.setBounds(0, 0, 50, 100);
        
        panelPrincipal.setLayout(tablaPlantilla);
        panelPrincipal.add(cuadroTexto);
        int contador = 0;
        for(int i=2;i<tablaPlantilla.getRows();i++){
            for(int j =0;j<tablaPlantilla.getColumns();j++){
                String texto= ""+contador;
                if(contador==10){
                texto = "+";
                }else if(contador ==11){
                    texto = "-";
                }else if(contador ==12){
                    texto = "/";
                }else if(contador ==13){
                    texto = "*";
                }else if(contador ==14){
                    texto = "AC";
                }else if(contador ==15){
                    texto = "=";
                }
                JButton boton = new JButton(texto);
                boton.addActionListener(this);
                panelPrincipal.add(boton);
                contador ++;
            } 
        }        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();
        String num = btn.getText();
        if(num=="AC"){
            cuadroTexto.setText(" ");
        }
        else if(num=="+"){
            this.parte1 = Float.parseFloat(this.cuadroTexto.getText());
            this.operador = "+";
            cuadroTexto.setText(" ");
        }
        else if(num=="-"){
           this.parte1 = Float.parseFloat(this.cuadroTexto.getText());
           this.operador = "-";
           cuadroTexto.setText(" ");
        }
        else if(num=="*"){
           this.parte1 = Float.parseFloat(this.cuadroTexto.getText());
           this.operador = "*";
           cuadroTexto.setText(" ");
        }
        else if(num=="/"){
           this.parte1 = Float.parseFloat(this.cuadroTexto.getText());
           this.operador = "/";
           cuadroTexto.setText(" ");
        }
        else if(num=="=" ){
            this.parte2 = Float.parseFloat(this.cuadroTexto.getText());
            switch(this.operador){
                case "+" : cuadroTexto.setText(Float.toString(parte1+parte2)); break;
                case "-" : cuadroTexto.setText(Float.toString(parte1-parte2)); break;
                case "*" : cuadroTexto.setText(Float.toString(parte1*parte2)); break;
                case "/" : cuadroTexto.setText(Float.toString(parte1/parte2)); break;
            }
        }
        else{
            cuadroTexto.setText(this.cuadroTexto.getText()+num);
        }
      
       
        
    }
    
}
