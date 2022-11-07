import java.util.*; 
import java.io.*;

class Fatorial {

  public static int FirstFactorial(int num) {
    // code goes here 
     for (int i = num; i > 1; i--){
       num *= (i - 1);       
     }
     //System.out.print("teste " + fatorial);
    return num;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
	
	System.out.print("Informe um numero para calcular o fatorial dele: ");
	int resultado = s.nextInt();
	
    System.out.print("O fatorial de " + resultado + " e " + FirstFactorial(resultado)); 
  }

}