public class ExemplosMetodosNumericos {
   public static void main(String[] args) {
     double NumeroReal = 3.53, Area;
     int NumeroInt= -3; 
     System.out.println("Valor absoluto = "+Math.abs(NumeroInt));
// 3
     System.out.println("Parte inteira = "+(int)Math.floor(NumeroReal));
// 3
     NumeroInt = 9;
     System.out.println("Quadrado = "+Math.pow(NumeroInt,2));
// 81
     System.out.println("Raiz quadrada = "+Math.sqrt(NumeroInt));
// 3
     System.out.println("Elevar a 4� pot�ncia  = "+Math.pow(NumeroInt,4));
// 6561
     System.out.println("N�mero aleat�rio entre 0 e 100 = "+(int)Math.floor(Math.random()*100));

     Area = Math.PI * Math.pow(NumeroInt,2);
     System.out.println("�rea = "+Area);
// 	
   }
}

