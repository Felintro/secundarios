package cursojava.threads;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaThread1 extends JDialog {
	
	private JPanel painel = new JPanel(new GridBagLayout());	/* Painel de componentes */
	
	private JLabel description = new JLabel("Nome: ");		/* Label para o primeiro campo */
	private JTextField mostraTempo = new JTextField();			/* Primeiro Campo */
	
	private JLabel description2 = new JLabel("E-mail: ");		/* Label para o segundo campo */
	private JTextField mostraTempo2 = new JTextField();			/* Segundo Campo */
	
		
	private JButton button = new JButton("Gerar");
	private JButton button2 = new JButton("Enviar");
	
	private JButton button3 = new JButton("Parar");
	private JButton button4 = new JButton("Stop 2");
	
	private JLabel ajuste1 = new JLabel(" ");
	private JLabel ajuste3 = new JLabel(" ");
	
	private ExecutaFila fila = new ExecutaFila();

	public TelaThread1() {
		
		/* Configurações iniciais: */
		setTitle("Teste Thread1");			/* Titulo */
		setSize(new Dimension(300, 300));	/* Dimensão da tela (largura, altura) */
		setLocationRelativeTo(null);		/* Posicionamento da janela, null se refere a centralizado */
		setResizable(false);				/* Comando para não permitir a alteração do tamanho da tela */
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();	/* Controlador de posicionamento de componentes */
		gridBagConstraints.gridx = 0;							/* Seguir a lógica do plano cartesiano! */
		gridBagConstraints.gridy = 0;							/* <----X----> e ^ Y V */
		gridBagConstraints.gridwidth = 2;						/* Insere a largura do Grid (proporção) */
		gridBagConstraints.anchor = GridBagConstraints.WEST;	/* Âncora do grid, o mesmo inicializa a WEST (Oeste), ou seja, a esquerda) */
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);	/* Editor para os espaços de cima, esquerda, baixo e direita dos componentes */
											 
		/* Tempo 1: */
		description.setPreferredSize(new Dimension(200, 25));	/* Setar o tamanho do componente description (largura, altura) */
		painel.add(description, gridBagConstraints);			/* Adiciona o componente description ao painel */
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		mostraTempo.setEditable(true);							/* Torna o componente mostraTempo ineditável */
		gridBagConstraints.gridy++;								/* Incrementa 1 no gridy, ou seja, corre 1 casa para + */
		painel.add(mostraTempo, gridBagConstraints);			/* Adiciona o componente mostraTempo ao painel */
		
		/* Tempo 2: */
		description2.setPreferredSize(new Dimension(200, 25));	/* Setar o tamanho do componente description2 (largura, altura) */
		gridBagConstraints.gridy++;								/* Incrementa 1 no gridy, ou seja, corre 1 casa para + */
		painel.add(description2, gridBagConstraints);			/* Adiciona o componente description2 ao painel */
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		mostraTempo2.setEditable(true);						/* Torna o componente mostraTempo2 ineditável */
		gridBagConstraints.gridy++;								/* Incrementa 1 no gridy, ou seja, corre 1 casa para + */
		painel.add(mostraTempo2, gridBagConstraints);			/* Adiciona o componente mostraTempo2 ao painel */
		
		gridBagConstraints.gridy++;								/* Incrementa 1 no gridy, ou seja, corre 1 casa para + */
		painel.add(ajuste1, gridBagConstraints);				/* Adiciona o componente ajuste1 ao painel */
		
		gridBagConstraints.gridwidth = 1;						/* Insere a largura do Grid (proporção) */
		
		button.setPreferredSize(new Dimension(102, 25));			/* Setar o tamanho do componente button (largura, altura) */
		gridBagConstraints.gridy++;								/* Incrementa 1 no gridy, ou seja, corre 1 casa para + */
		painel.add(button, gridBagConstraints);					/* Adiciona o componente button ao painel */
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {		/* Método que será executado ao clicar no button */
				
				if(fila == null) {
					fila = new ExecutaFila();
					fila.start();
				}
				
				for (int i=1; i<=100; i++) {
					
					ObjetoFilaThread filaThread = new ObjetoFilaThread();
					filaThread.setNome(mostraTempo.getText());
					filaThread.setEmail(mostraTempo2.getText() + " - " + i);
					
					fila.add(filaThread);
					
				}
			}
		});
		
		button3.setPreferredSize(new Dimension(102, 25));		/* Setar o tamanho do componente button3 (largura, altura) */
		gridBagConstraints.gridx++;								/* Incrementa 1 no gridx, ou seja, corre 1 casa para + */
		painel.add(button3, gridBagConstraints);				/* Adiciona o componente button3 ao painel */
		
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				
				fila.stop();
				fila = null;
			}
		});
		
		/* ============================= */
		
		gridBagConstraints.gridy++;								/* Incrementa 1 no gridy, ou seja, corre 1 casa para + */
		gridBagConstraints.gridx--;								/* Incrementa 1 no gridy, ou seja, corre 1 casa para + */
		
		gridBagConstraints.gridwidth = 1;						/* Insere a largura do Grid (proporção) */
		
		button2.setPreferredSize(new Dimension(92, 25));		/* Setar o tamanho do componente button2 (largura, altura) */
		gridBagConstraints.gridy++;								/* Incrementa 1 no gridy, ou seja, corre 1 casa para + */
		//painel.add(button2, gridBagConstraints);				/* Adiciona o componente button2 ao painel */
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {		/* Método que será executado ao clicar no button2 */

				
			}
		});
		
		button4.setPreferredSize(new Dimension(92, 25));		/* Setar o tamanho do componente button4 (largura, altura) */
		gridBagConstraints.gridx++;								/* Incrementa 1 no gridx, ou seja, corre 1 casa para +, para o botão ficar alinhado*/
		//painel.add(button4, gridBagConstraints);				/* Adiciona o componente button4 ao painel */
		
		gridBagConstraints.gridy++;								/* Incrementa 1 no gridx, ou seja, corre 1 casa para + */
		painel.add(ajuste3, gridBagConstraints);				/* Adiciona o componente ajuste3 ao painel */
		
		button4.addActionListener(new ActionListener() {		/* Método que será executado ao clicar no button4 */
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		/* ============================= */
		
		fila.start();
		add(painel, BorderLayout.PAGE_START);
		/* Normalmente último comando: */
		setVisible(true);					/* Comando para tornar a tela visível */
	}
	
}