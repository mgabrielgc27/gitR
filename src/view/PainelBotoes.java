package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import controller.Memoria;

@SuppressWarnings("serial")
public class PainelBotoes extends JPanel{
	
	protected Memoria memoria;
	protected Botao botaoProcessarProximoInstante;
	protected Botao botaoLerNovoArquivo;
	protected Botao botaoGravarRelatorio;
	protected Botao botaoLerDadosOutrosParticipantes;
	protected Botao botaoGravarArquivoSaida;
	
	public PainelBotoes(Memoria memoria) {
		this.memoria = memoria;
		
		configurarPainel();
		
		adicionarBotoes();
	}
	
	private void configurarPainel() {
		setPreferredSize(new Dimension(200, 600));
		setLayout(new GridLayout(5, 1));
	}
	
	private void adicionarBotoes() {
		botaoProcessarProximoInstante = criarBotao("Processar próximo instante");
		botaoLerNovoArquivo = criarBotao("Ler novo arquivo de entrada");
		botaoGravarRelatorio = criarBotao("Gravar relatório");
		botaoLerDadosOutrosParticipantes = criarBotao("Ler dados de outros participantes");
		botaoGravarArquivoSaida = criarBotao("Gravar arquivo de saída");
		
		adicionarActionListenerBotoes();
		
		add(botaoProcessarProximoInstante);
		add(botaoLerNovoArquivo);
		add(botaoGravarRelatorio);
		add(botaoLerDadosOutrosParticipantes);
		add(botaoGravarArquivoSaida);
	}
	
	private void adicionarActionListenerBotoes() {
		botaoProcessarProximoInstante.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				memoria.processarInstante();
			}
		});
		botaoLerNovoArquivo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				memoria.trocarArquivoEntrada();
			}
		});
		botaoGravarRelatorio.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
				memoria.gravarRelatorio();
			}
		});
		botaoLerDadosOutrosParticipantes.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		botaoGravarArquivoSaida.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
	
	private Botao criarBotao(String texto) {
		Botao b = new Botao(texto);
		return b;
	}
}
