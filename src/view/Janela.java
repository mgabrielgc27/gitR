package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import controller.Memoria;

@SuppressWarnings("serial")
public class Janela extends JFrame{

	protected Memoria memoria;
	protected String JANELA_TITULO = "Java Lar";
	protected ImageIcon JANELA_ICONE = new ImageIcon("imagens/java.png");
	protected Plano plano;
	protected PainelBotoes painelBotoes;
			
	public Janela() {
		memoria = new Memoria();
		memoria.setView(this);
		
		configurarJanela();
		
		setVisible(true);
	}
	
	private void configurarJanela() {
		setTitle(JANELA_TITULO);
		setIconImage(JANELA_ICONE.getImage());
		setSize(new Dimension(820, 600));
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		this.plano = new Plano(memoria);
		this.painelBotoes = new PainelBotoes(memoria);
		add(plano, BorderLayout.CENTER);
		add(painelBotoes, BorderLayout.WEST);
	}

	public Plano getPlano() {
		return plano;
	}
	
	
}
