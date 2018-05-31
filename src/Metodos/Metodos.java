/*
 * operaciones a traves de los metodos

 */
package Metodos;

/**
 *
 * @author Juan David Gomez
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creando objeto
        int total,tota,total1,total2;
        int r=12;
        moto op = new moto();
       total= op.sumarnumero(34, 28);
       tota=(int) Math.sqrt(op.pitagoras(8, 8));
       total1=(int) Math.sqrt(op.pitagorascao(7, 6));
       total2=(int) Math.sqrt(op.pitagorascaa(5, 4));
        System.out.println("la suma es"+total);
        System.out.println("la resta es"+ op.restarnumero(34, 54));
        System.out.println("el diametro es"+op.diametro(r));
        System.out.println("------Teorema de pitagoras-----------");
        System.out.println("La hipotenusa es: "+tota);
        System.out.println("el cateto opuesto es:"+total1);
        System.out.println("el cateto adyacente es:"+total2);
    }
    
}
 