/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author Juan David Gomez
 */
public class moto {
    int Num1,Num2;
    int sumarnumero(int num1, int num2)
    {
        return(num1+num2);
       
    }
    int restarnumero(int num1, int num2)
    {
        return(num1-num2);
    }
    double diametro(int radio)
    {
        return(3.1416*(radio*radio));
    }
    int pitagoras(int cateto1,int cateto2)
    {
        return((cateto1*cateto1)+(cateto2*cateto2));
    }
    int pitagorascao(int cateto1, int hipotenusa)
    {
        return((cateto1*cateto1)-(hipotenusa*hipotenusa));
    }
    int pitagorascaa(int hipotenusa, int cateto2)
    {
        return((hipotenusa*hipotenusa)-(cateto2*cateto2));
    }
}