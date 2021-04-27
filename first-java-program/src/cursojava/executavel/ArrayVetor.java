package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	/* Main = Método usado para executar o programa */
	public static void main(String[] args) throws InterruptedException {
		
		double aporte=0, dyi=0, taxady=0, mtt=0, dyf=0, acr=0;
		int n=0, i=0, ano=2020;
		
		System.out.println("\n===================================================\n");
		
		aporte = Double.parseDouble(JOptionPane.showInputDialog("Aporte: "));
		System.out.println("Aporte Mensal: "+aporte);
		dyi = Double.parseDouble(JOptionPane.showInputDialog("Dividend Yield: ")) / 1200;
		System.out.println("Dividend Yield: "+dyi*1200+"%");
		n = Integer.valueOf(JOptionPane.showInputDialog("Períodos (Meses): "));
		System.out.println("Períodos: "+n + " Meses");
		mtt = Double.parseDouble(JOptionPane.showInputDialog("Montante inicial: "));
		System.out.println("Montante inicial: R$"+mtt);
		acr = Double.parseDouble(JOptionPane.showInputDialog("Acréscimo anual do aporte: "));
		System.out.println("Acréscimo anual do aporte: R$"+acr);
		taxady = Double.parseDouble(JOptionPane.showInputDialog("Taxa de crescimento do DY: ")) / 100;
		System.out.println("Taxa de crescimento do DY: "+taxady*100 + "%");
		
		System.out.println("\n===================================================\n");

		dyf = dyi;
		
		 for(i=1; i<=n; i++) {
			 
			mtt = mtt + aporte + mtt*dyf;
			
			if(i%12 ==0) {
				ano++;
				aporte+=acr;
				dyf = dyf*(1+taxady);
			}
			
			System.out.println("Montante atual: R$" + mtt);
			System.out.println("Dividend Yield Atual: " + dyf*1200 + "%");
			System.out.println("Aporte atual: R$" + aporte);
			System.out.println("Ano: " + ano);
			System.out.println("Mês: " + i);
			System.out.println("\n===================================================\n");
			
			Thread.sleep(200);

		}
		 
		/* System.out.println("\n===================================================\n");
		 
		System.out.println("Montante Final: R$" + mtt);
		System.out.println("Dividend Yield Final: " + dyf*1200);
		System.out.println("Aporte Final: R$" + aporte);
		System.out.println("Ano: " + ano);
		System.out.println("Meses percorridos: " + i); */
		
	}
}