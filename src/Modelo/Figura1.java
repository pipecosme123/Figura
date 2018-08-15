/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Usuario
 */
public class Figura1 {
    
        private double x1,x2,x3,x4,x5,x6,x7,x8,x9;
        private double y1,y2,y3,y4,y5,y6,y7,y8,y9;

    public Figura1(double x1, double x2, double x3, double x4, double x5, double x6, 
                   double x7, double x8, double x9, double y1, double y2, double y3, 
                   double y4, double y5, double y6, double y7, double y8, double y9) {
        this.x1 = x1;        this.x2 = x2;        this.x3 = x3;
        this.x4 = x4;        this.x5 = x5;        this.x6 = x6;
        this.x7 = x7;        this.x8 = x8;        this.x9 = x9;
        this.y1 = y1;        this.y2 = y2;        this.y3 = y3;
        this.y4 = y4;        this.y5 = y5;        this.y6 = y6;
        this.y7 = y7;        this.y8 = y8;        this.y9 = y9;
    }

    public double getX1() {
        return x1;
    }
    public double getX2() {
        return x2;
    }
    public double getX3() {
        return x3;
    }
    public double getX4() {
        return x4;
    }
    public double getX5() {
        return x5;
    }
    public double getX6() {
        return x6;
    }
    public double getX7() {
        return x7;
    }
    public double getX8() {
        return x8;
    }
    public double getX9() {
        return x9;
    }
    public double getY1() {
        return y1;
    }
    public double getY2() {
        return y2;
    }
    public double getY3() {
        return y3;
    }
    public double getY4() {
        return y4;
    }
    public double getY5() {
        return y5;
    }
    public double getY6() {
        return y6;
    }
    public double getY7() {
        return y7;
    }
    public double getY8() {
        return y8;
    }
    public double getY9() {
        return y9;
    }
    public void setX1(double x1) {
        this.x1 = x1;
    }
    public void setX2(double x2) {
        this.x2 = x2;
    }
    public void setX3(double x3) {
        this.x3 = x3;
    }
    public void setX4(double x4) {
        this.x4 = x4;
    }
    public void setX5(double x5) {
        this.x5 = x5;
    }
    public void setX6(double x6) {
        this.x6 = x6;
    }
    public void setX7(double x7) {
        this.x7 = x7;
    }
    public void setX8(double x8) {
        this.x8 = x8;
    }
    public void setX9(double x9) {
        this.x9 = x9;
    }
    public void setY1(double y1) {
        this.y1 = y1;
    }
    public void setY2(double y2) {
        this.y2 = y2;
    }
    public void setY3(double y3) {
        this.y3 = y3;
    }
    public void setY4(double y4) {
        this.y4 = y4;
    }
    public void setY5(double y5) {
        this.y5 = y5;
    }
    public void setY6(double y6) {
        this.y6 = y6;
    }
    public void setY7(double y7) {
        this.y7 = y7;
    }
    public void setY8(double y8) {
        this.y8 = y8;
    }
    public void setY9(double y9) {
        this.y9 = y9;
    }
    
    

    public boolean guardarFigura(LinkedList<Figura1> listaC) {
        
        boolean guardar = false;
      
       try{
            Element poligono = new Element("Poligonos");
            Document doc = new Document(poligono);
            
            for (int i = 0; i < listaC.size(); i++) {
                Element figura = new Element("figura");
                
                figura.addContent(new Element("x1").setText(listaC.get(i).getX1() + ""));
                figura.addContent(new Element("y1").setText(listaC.get(i).getY1() + ""));
                
                figura.addContent(new Element("x2").setText(listaC.get(i).getX2() + ""));
                figura.addContent(new Element("y2").setText(listaC.get(i).getY2() + ""));
                
                figura.addContent(new Element("x3").setText(listaC.get(i).getX3() + ""));
                figura.addContent(new Element("y3").setText(listaC.get(i).getY3() + ""));
                
                figura.addContent(new Element("x4").setText(listaC.get(i).getX4() + ""));
                figura.addContent(new Element("y4").setText(listaC.get(i).getY4() + ""));
                
                figura.addContent(new Element("x5").setText(listaC.get(i).getX5() + ""));
                figura.addContent(new Element("y5").setText(listaC.get(i).getY5() + ""));
                
                figura.addContent(new Element("x6").setText(listaC.get(i).getX6() + ""));
                figura.addContent(new Element("y6").setText(listaC.get(i).getY6() + ""));
                
                figura.addContent(new Element("x7").setText(listaC.get(i).getX7() + ""));
                figura.addContent(new Element("y7").setText(listaC.get(i).getY7() + ""));
                
                figura.addContent(new Element("x8").setText(listaC.get(i).getX8() + ""));
                figura.addContent(new Element("y8").setText(listaC.get(i).getY8() + ""));
                
                figura.addContent(new Element("x9").setText(listaC.get(i).getX9() + ""));
                figura.addContent(new Element("y9").setText(listaC.get(i).getY9() + ""));
                
                doc.getRootElement().addContent(figura);
            }
            
            XMLOutputter xmlOutput = new XMLOutputter();
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(doc, new FileWriter("Poligono.xml"));
            
            guardar = true;            
            System.out.println("Archivo Creado");     
            
         } catch (IOException io){
            System.out.println(io.getMessage());
            guardar =false;
        }   
       
       return guardar;
    }
}

//    public boolean guardarFigura1(double x1, double x2, double x3, double x4, double x5, double x6, double x7, double x8, double x9, double y1, double y2, double y3, double y4, double y5, double y6, double y7, double y8, double y9) {
//        boolean guardar = false;
//       
//       try{
//            Element poligono = new Element("Poligonos");
//            Document doc = new Document(poligono);
//            
//            Element figura = new Element("Figura 1");
//            figura.addContent(new Element("x1").setText());
//       }
//        
//        /*try {
//            Element universidad = new Element("universidad");
//            Document doc = new Document(universidad);
//            
//            for (int i = 0; i < listaE.size(); i++) {
//                Element estudiante = new Element("estudiante");
//                estudiante.addContent(new Element("nombre").setText(listaE.get(i).getNombre()));
//                estudiante.addContent(new Element("telefono").setText(listaE.get(i).getTelefono()));
//                estudiante.addContent(new Element("correo").setText(listaE.get(i).getCorreo()));
//                estudiante.addContent(new Element("codigo").setText(listaE.get(i).getCodigo()));
//                estudiante.addContent(new Element("carrera").setText(listaE.get(i).getCarrera()));
//                
//                doc.getRootElement().addContent(estudiante);               
//            }
//            XMLOutputter xmlOutput = new XMLOutputter();
//            xmlOutput.setFormat(Format.getPrettyFormat());
//            xmlOutput.output(doc, new FileWriter("universidad.xml"));
//            
//            g = true;
//            
//            System.out.println("Archivo Creado");
//        } catch(IOException io){
//            System.out.println(io.getMessage());
//            g=false;
//        }*/
//    }
//    
