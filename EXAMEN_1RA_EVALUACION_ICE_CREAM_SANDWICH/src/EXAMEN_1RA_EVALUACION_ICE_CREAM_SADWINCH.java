
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP1000
 */
public class EXAMEN_1RA_EVALUACION_ICE_CREAM_SADWINCH {
    public static void main(String[] args) {
          int numero;
        numero= Integer.parseInt(JOptionPane.showInputDialog("1 para elegirlos \n 2 para predefinidos"));
        if(numero == 1){
                    Scanner GN = new Scanner(System.in);
        Fibonacci fib = new Fibonacci();
        }else {
            Scanner GN = new Scanner(System.in);  
            
    FibonacciSE fibse = new FibonacciSE();
    


}
    }

    
}
  
class Fibonacci{
    //atributos
    private int a1=0;
    private int a2;
    private int n;
    private int valores=0;
    
    

public Fibonacci(){
    Scanner GN = new Scanner(System.in);
    System.out.println("Por favor digite la cantidad de elementos para la serie: ");
    n=GN.nextInt();
    System.out.println("Ingresa a1()Numero de inicio :");
    a1=GN.nextInt();
    System.out.println("ingresa a() Segundo numero:");
    a2=GN.nextInt();
    for (int i = 1; i < n; i++) {
        
        valores=a1+a2;
        a1=a2;
        a2 = valores;
        System.out.println(a2);

            }
}

}
 class FibonacciSE{
            private int n=6;
            private int a1=1;
            private int a2=2;
            private int valores;
                public void seta1(int a1){
        this.a1=a1;
    }
        public void setValores(int valores){
        this.a2=a2;
    }
    public void seta2(int a2){
        this.a2=a2;
    }

    
            public int Geta1(){
                return a1;
            }
            public int Geta2(){
                return a2;
            }

            
            public int GetValores(){
                return valores;
            }
            public FibonacciSE(){
        Scanner GN = new Scanner(System.in);
                    System.out.println("los numeros pre definidos son: \n"
                    + "a2= "+a2+ "\n a1= "+ a1+"\n numero de elementos= "+n);
        for (int i = 0; i < n; i++) {

        valores=a1+a2;
        a1=a2;
        a2 = valores;
                System.out.println(a2);

            }

        }
       }     
            