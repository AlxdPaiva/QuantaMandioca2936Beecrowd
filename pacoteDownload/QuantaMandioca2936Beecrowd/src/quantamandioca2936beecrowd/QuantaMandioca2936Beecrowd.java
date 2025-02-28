/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quantamandioca2936beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class QuantaMandioca2936Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 1;
        int tot = 0;
        Scanner teclado = new Scanner(System.in);
        
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();
        n4 = teclado.nextInt();
        n5 = teclado.nextInt();
                
        n1 = n1 * 300;
        n2 = n2 * 1500;
        n3 = n3 * 600;
        n4 = n4 * 1000;
        n5 = n5 * 150;
        n6 = n6 * 225;
        
        tot = n1+n2+n3+n4+n5+n6;
        
        System.out.println(tot);
    }
    
}
