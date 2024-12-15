/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante;


import javax.swing.JOptionPane;

/**
 *
 * @author 50494
 */
public class Restaurante {
    double Ceconomica;
    double Cregular;
    double Cpremium;
    double Ptotal=0;
    int pedidos;
    String nombre;
    String direccion; 
    int numero;
    
            
    
    public Restaurante(double Ceconomica, double Cregular, double Cpremium, String nombre, int numero, String direccion){
        this.Ceconomica = Ceconomica;
        this.Cpremium=Cpremium;
        this.Cregular=Cregular;
        this.nombre = nombre;
        this.numero = numero;
        this.direccion = direccion;
        
    }
    public double CalcucularTotal(){
        return Ptotal;
    }
    
    public void MostrarInfo(){
        JOptionPane.showMessageDialog(null, "El nombre del pedido es: " + nombre + 
                "\n El celular de cliente es: " + numero + 
                "\nLa direccion del pedido es a: " + direccion + 
                "\nSu total a pagar es de: " + CalcucularTotal());
    }
    
    public static void main(String[] args) {
        
        double Ceconomica = 50.0;
        double Cregular = 100.0;
        double Cpremium = 150.0;
        double chile = 30.0;
        double queso = 15.0;
        int opcion=0;
        String respuesta;
        
        JOptionPane.showMessageDialog(null, "===BIENVENIDOS A NUESTRO RESTAURANTE===");
        JOptionPane.showMessageDialog(null, "===Datos Personales===");
        String nombre = JOptionPane.showInputDialog("Pofavor ingrese su nombre: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Pofavor ingrese su celular: "));
        String direccion = JOptionPane.showInputDialog("Pofavor ingrese la su direccion: ");
        
        Restaurante res = new Restaurante(Ceconomica, Cregular, Cpremium, nombre, numero, direccion);
        
        JOptionPane.showMessageDialog(null, "Los precios del dia son: \n1: Economico es de 50.0 \n2: Regular es de 100.0 \n3:Premium es de 150.0");
        JOptionPane.showInputDialog("Que comida desea pedir?: \n1:Comida Economica  \n2: Comida Regular \n3: Comida Premium ");
       
        
        JOptionPane.showMessageDialog(null, "      ===Pedido===   ");
       switch (opcion) {
            case 1:
                res.Ptotal = Ceconomica;
                JOptionPane.showMessageDialog(null, "Usted eligio Comida Economica");
                break;
            case 2:
                res.Ptotal = Cregular;
                JOptionPane.showMessageDialog(null, "Usted eligio Comida Regular");
                break;
            case 3:
                res.Ptotal = Cpremium;
                JOptionPane.showMessageDialog(null, "Usted eligio Comida Premium");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no válida.");
                return;
        }
        respuesta = JOptionPane.showInputDialog("Desea agregar extras? (S/N):").toUpperCase();
        if (respuesta.equals("S")) {
            int extra = Integer.parseInt(JOptionPane.showInputDialog("1: Chile (30.0)\n2: Queso (15.0)"));
            if (extra == 1) {
                res.Ptotal += chile;
            } else if (extra == 2) {
                res.Ptotal += queso;
            }
        }
        res.MostrarInfo();
        }
    
    }
 
    
    

