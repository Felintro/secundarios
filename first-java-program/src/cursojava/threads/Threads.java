	package cursojava.threads;

import javax.swing.JOptionPane;

public class Threads {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread threadNova = new Thread(thread1);
		Thread threadNova2 = new Thread(thread2);
		
		threadNova.start();
		threadNova2.start();
	
		String teste = JOptionPane.showInputDialog("Insira algo para teste:");
		JOptionPane.showMessageDialog(null, "Teste = " + teste);
		
	}
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			System.out.println("======================================");
			System.out.println("Envio de e-mail iniciado!");
			
			/* Processamento paralelo */
			for(int i=0; i<=10; i++) {
				System.out.println("======================================");
				System.out.println("Enviando e-mail..." + i + "...\n");
				System.out.println("======================================\n\n");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
			System.out.println("E-mail enviado!");
		}
	};
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			/* Dentro do método run, colocamos a rotina que será executada paralelamente ao restante */
			
			System.out.println("======================================");
			System.out.println("Nota fiscal gerada!");
			
			/* Processamento paralelo */
			for(int i=0; i<=5; i++) {
				System.out.println("======================================");
				System.out.println("Aguardando liberação de nota fiscal " + i + "...\n");
				System.out.println("======================================\n\n");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
			
			JOptionPane.showMessageDialog(null, "Nota fiscal liberada!");
		}

	};
	
}