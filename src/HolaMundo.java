import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
        
        
        //exercici ordenació
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        
        for (int i = 0; i < 5; i++) {
        	numeros[i] = scanner.nextInt();
        }
        
        //ordenació per selecció
        for (int i = 0; i < numeros.length -1; i++) {
        	int posicio = i;
        	
        	for (int j = 0+i; j < numeros.length; j++ ) {
        		if (numeros[j] < numeros[posicio]) {
        			posicio = j;
        			
        		}
        	}
        	
        	int temp = numeros[posicio];
        	numeros[posicio] = numeros[i];
        	numeros[i] = temp;
        }
        
        for (int i = 0; i < numeros.length; i++)
        	System.out.println(numeros[i]);
    }
}