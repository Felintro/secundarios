package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
	
	public static void main (String[] args) {
		
		String texto = "Allan,Chavier,Felintro,24,Maringá,Paraná,07371172906";
		
		String[] valores = texto.split(",");
		
		for(int i = 0; i < valores.length; i++) {
			System.out.println("valores[" + i + "]" + ": " + valores[i]);
		}
		
		/* Converter um Array em uma lista (uma posição do array em uma posição da lista) */
		
		List<String> list = Arrays.asList(valores);
		
		for (String valorString : list) {
			System.out.println(valorString);
		}
		
		/* Converter uma lista em um Array (uma posição da lista em uma posição do Array) */
		
//		String[] conversaoArray = list.toArray(new String[6]);
		
	}

}
