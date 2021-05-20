/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author cesar
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField cuadro;
    private float valor1=0;
    private float valor2=0;
    private int v1=0;
    private int v2=0;
    private float resultado;
    private boolean suma, div, mul, men =false;

    public FXMLDocumentController() {
        this.resultado = 0;
    }
    
    @FXML
    private void siete(ActionEvent event) {
        System.out.println("Presiono el 7");
        if(!suma && !div && !mul && !men){
            if(valor1==0){
                cuadro.setText("7");
                valor1=7;
                v1=7;
            }
            else{
                cuadro.setText(v1+"7");
                valor1=(valor1*10)+7;
                v1=(v1*10)+7;
            }
        }
        else{
            if(valor2==0){
                cuadro.setText("7");
                valor2=7;
                v2=7;
            }
            else{
                cuadro.setText(v2+"7");
                valor2=(valor2*10)+7;
                v2=(v2*10)+7;                
            }
        }
    }
    
    @FXML
    private void ocho(ActionEvent event) {
       System.out.println("Presiono el 8");
        if(!suma && !div && !mul && !men){
            if(valor1==0){
                cuadro.setText("8");
                valor1=8;
                v1=8;
            }
            else{
                cuadro.setText(v1+"8");
                valor1=(valor1*10)+8;
                v1=(v1*10)+8;
            }
        }
        else{
            if(valor2==0){
                cuadro.setText("8");
                valor2=8;
                v2=8;
            }
            else{
                cuadro.setText(v2+"8");
                valor2=(valor2*10)+8;
                v2=(v2*10)+8;
            }
        }
    }
    
    @FXML
    private void nueve(ActionEvent event) {
       System.out.println("Presiono el 9");
        if(!suma && !div && !mul && !men){
            if(valor1==0){
                cuadro.setText("9");
                valor1=9;
                v1=9;
            }
            else{
                cuadro.setText(v1+"9");
                valor1=(valor1*10)+9;
                v1=(v1*10)+9;
            }
        }
        else{
            if(valor2==0){
                cuadro.setText("9");
                valor2=9;
                v2=9;
            }
            else{
                cuadro.setText(v2+"9");
                valor2=(valor2*10)+9;
                v2=(v2*10)+9;
            }
        }
    }
    
    
    @FXML
    private void cuatro(ActionEvent event) {
       System.out.println("Presiono el 4");
        if(!suma && !div && !mul && !men){
            if(valor1==0){
                cuadro.setText("4");
                valor1=4;
                v1=4;
            }
            else{
                cuadro.setText(v1+"4");
                valor1=(valor1*10)+4;
                v1=(v1*10)+4;
            }
        }
        else{
            if(valor2==0){
                cuadro.setText("4");
                valor2=4;
                v2=4;
            }
            else{
                cuadro.setText(v2+"4");
                valor2=(valor2*10)+4;
                v2=(v2*10)+4;
            }
        }
    }
    
    
    @FXML
    private void cinco(ActionEvent event) {
       System.out.println("Presiono el 5");
        if(!suma && !div && !mul && !men){
            if(valor1==0){
                cuadro.setText("5");
                valor1=5;
                v1=5;
            }
            else{
                cuadro.setText(v1+"5");
                valor1=(valor1*10)+5;
                v1=(v1*10)+5;
            }
        }
        else{
            if(valor2==0){
                cuadro.setText("5");
                valor2=5;
                v2=5;
            }
            else{
                cuadro.setText(v2+"5");
                valor2=(valor2*10)+5;
                v2=(v2*10)+5;
            }
        }
    }
    
    
    @FXML
    private void seis(ActionEvent event) {
       System.out.println("Presiono el 6");
        if(!suma && !div && !mul && !men){
            if(valor1==0){
                cuadro.setText("6");
                valor1=6;
                v1=6;
            }
            else{
                cuadro.setText(v1+"6");
                valor1=(valor1*10)+6;
                v1=(v1*10)+6;
            }
        }
        else{
            if(valor2==0){
                cuadro.setText("6");
                valor2=6;
                v2=6;
            }
            else{
                cuadro.setText(v2+"6");
                valor2=(valor2*10)+6;
                v2=(v2*10)+6;
            }
        }
    }
    
    
    @FXML
    private void uno (ActionEvent event) {
       System.out.println("Presiono el 1");
        if(!suma && !div && !mul && !men){
            if(valor1==0){
                cuadro.setText("1");
                valor1=1;
                v1=1;
            }
            else{
                cuadro.setText(v1+"1");
                valor1=(valor1*10)+1;
                v1=(v1*10)+1;
            }
        }
        else{
            if(valor2==0){
                cuadro.setText("1");
                valor2=1;
                v2=1;
            }
            else{
                cuadro.setText(v2+"1");
                valor2=(valor2*10)+1;
                v2=(v2*10)+1;
            }
        }
    }
    
    
    @FXML
    private void dos (ActionEvent event) {
       System.out.println("Presiono el 2");
        if(!suma && !div && !mul && !men){
            if(valor1==0){
                cuadro.setText("2");
                valor1=2;
                v1=2;
            }
            else{
                cuadro.setText(v1+"2");
                valor1=(valor1*10)+2;
                v1=(v1*10)+2;
            }
        }
        else{
            if(valor2==0){
                cuadro.setText("2");
                valor2=2;
                v2=2;
            }
            else{
                cuadro.setText(v2+"2");
                valor2=(valor2*10)+2;
                v2=(v2*10)+2;
            }
        }
    }
    
    
    @FXML
    private void tres (ActionEvent event) {
       System.out.println("Presiono el 3");
        if(!suma && !div && !mul && !men){
            if(valor1==0){
                cuadro.setText("3");
                valor1=3;
                v1=3;
            }
            else{
                cuadro.setText(v1+"3");
                valor1=(valor1*10)+3;
                v1=(v1*10)+3;
            }
        }
        else{
            if(valor2==0){
                cuadro.setText("3");
                valor2=3;
                v2=3;
            }
            else{
                cuadro.setText(v2+"3");
                valor2=(valor2*10)+3;
                v2=(v2*10)+3;
            }
        }
    }
    
    
    @FXML
    private void cero (ActionEvent event) {
       System.out.println("Presiono el 0");
        if(!suma && !div && !mul && !men){
            if(valor1==0){
                cuadro.setText("0");
                valor1=0;
                v1=0;
            }
            else{
                cuadro.setText(v1+"0");
                valor1=(valor1*10)+0;
                v1=(v1*10)+0;
            }
        }
        else{
            if(valor2==0){
                cuadro.setText("0");
                valor2=0;
                v2=0;
            }
            else{
                cuadro.setText(v2+"0");
                valor2=(valor2*10)+0;
                v2=(v2*10)+0;
            }
        }
    }
    //Operaciones e igual
    
    
    @FXML
    private void igual(ActionEvent event) {
            
            if(suma){
                System.out.println(valor1+" + "+valor2);
                resultado=valor1+valor2;
                 cuadro.setText(" "+resultado);
                 System.out.println("El resultado es "+resultado);
                 suma=false;
            }
            else if(div){
                System.out.println(valor1+" / "+valor2);
                 resultado=valor1/valor2;
                 cuadro.setText(" "+resultado);
                 System.out.println("El resultado es "+resultado);
                 div=false;
            }
            else if(mul){
                System.out.println(valor1+" x "+valor2);
                 resultado=valor1*valor2;
                 cuadro.setText(" "+resultado);
                 System.out.println("El resultado es "+resultado);
                 mul=false;
            }
            else if(men){
                System.out.println(valor1+" - "+valor2);
                 resultado=valor1-valor2;
                 cuadro.setText(" "+resultado);
                 System.out.println("El resultado es "+resultado);
                 men=false;
            }
            resultado=0;
            valor1=0;
            valor2=0;
            v1=0;
            v2=0;
    }
    
    @FXML
    private void mas(ActionEvent event) {
            suma=true;
            System.out.println("Suma");
    }
    
    @FXML
    private void div(ActionEvent event) {
            div=true;
            System.out.println("División");
    }
    
    @FXML
    private void mul(ActionEvent event) {
            mul=true;
            System.out.println("Multiplicación");
    }
    
    @FXML
    private void men(ActionEvent event) {
            men=true;
            System.out.println("Resta");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}