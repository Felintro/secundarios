package cursojava.executavel;

public class Matriz {
	
	public static void main(String[] args) {
		
		int notas[][] = new int[4][4]; 
		int auxiliar = 0;
		
		notas[0][0] = 10;
		
		for(int linha = 0; linha < notas.length; linha++) {
			
			for(int coluna = 0; coluna < notas[linha].length; coluna++) {
				
				auxiliar++;
				notas[linha][coluna] = auxiliar*(linha+1);
				System.out.println("Valor (" + linha + ")(" + coluna + "):" + notas[linha][coluna]);
			}
			
			System.out.println("================== Quebra ==================");
			
			
		}
		
		System.out.println(notas);
	}
	
	
	
	
	
	

}
