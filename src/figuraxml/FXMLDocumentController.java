/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuraxml;

import Modelo.Figura1;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Usuario
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btnFigura1;
    
    LinkedList<Figura1> listaC;
    
    @FXML
    private void guardarFigura(ActionEvent event) {
        
        double x1,x2,x3,x4,x5,x6,x7,x8,x9;
        double y1,y2,y3,y4,y5,y6,y7,y8,y9;
        
        x1 = 177.0;        y1 = 36.0;
        x3 = 50.0;         y3 = 13.0;
        x5 = 6.0;          y5 = 134.0;
        x7 = 117.0;        y7 = 198.0;
        x9 = 200.0;        y9 = 100.0;
        x2 = 117.0;        y2 = 2.0;
        x4 = 6.0;          y4 = 66.0;
        x6 = 50.0;         y6 = 187.0;
        x8 = 177.0;        y8 = 164.0;
        
        Figura1 objF = new Figura1(x1, x2, x3, x4, x5, x6, x7, x8, x9, y1, y2, y3, y4, y5, y6, y7, y8, y9);
        listaC.add(objF);
        
        boolean g = objF.guardarFigura(listaC);       
        
     
//        G.strokeLine(177.0, 36.0,   50.0,   13.0);  //1 3
//        G.strokeLine(50.0,   13.0,    6.0,    134.0); //3 5
//        G.strokeLine( 6.0,    134.0,   117.0,  198.0);// 5 7
//        G.strokeLine(117.0,  198.0,   200.0, 100.0);// 7 9
//        G.strokeLine(200.0, 100.0,  117.0, 2.0);  // 9 2
//        G.strokeLine(117.0, 2.0,  6.0, 66.0);  // 2 4
//        G.strokeLine(6.0, 66.0,  50.0, 187.0); // 4 6
//        G.strokeLine(50.0, 187.0,  177.0, 164.0);  // 6 8
//        G.strokeLine(177.0, 164.0,  177.0,  36.0); // 8 1 

            
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       listaC = new LinkedList<>();
               
    }    
    
}
