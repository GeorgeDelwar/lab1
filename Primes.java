/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell-PC
 */
public class Primes {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        for (int i=2;i<100;i++){
            if(isPrime(i))
                System.out.println(i);
        }
            // TODO code application logic here
    }
     public static boolean isPrime(int n) {
        for (int i=2;i<100;i++){
          if (n%i==0 && i!=n)
              return false;
            }
         return true;
         
    }
}
    

