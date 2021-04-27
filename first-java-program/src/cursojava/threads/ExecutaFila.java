package cursojava.threads;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ExecutaFila extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}
	
	@Override
	public void run() {
		
		
		System.out.println("Fila Rodando!");
		
		while(true) {
			
			Iterator iterador = pilha_fila.iterator();
		
			synchronized (pilha_fila) {
				
				while(iterador.hasNext()) {
					
					ObjetoFilaThread processar = (ObjetoFilaThread) iterador.next();
					
					/* Insira seu processo aqui :) */
					System.out.println("--------------------");
					System.out.println(processar.getNome());
					System.out.println(processar.getEmail());
					
					iterador.remove();
					
					try {
						Thread.sleep(100); /* Tempo de descarga de memória */
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
					
					
			}
			
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} /* Tempo para iniciar outro processo */
			
		}
		
		
	}
	
}