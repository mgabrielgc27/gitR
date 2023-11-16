package controller;

import java.util.ArrayList;

import model.arquivos.LerDados;
import view.Janela;

public class Memoria {
	
	//Referências
	protected EstrelaJava java;
	protected ArrayList<Rodada> rodadas;
	protected Janela view;
	protected LerDados ler;
	
	protected String diretorioArquivoEntrada = "dados/AE_10.csv";
	protected int contadorArquivoEntrada = 0;
	protected ArrayList<String[]> dadosDasRodadas;
	protected int contadorInstante = 0;
	protected int instantesTotais = 0;
	
	public Memoria() {
		java = new EstrelaJava();
		rodadas = new ArrayList<Rodada>();
		ler = new LerDados();
		
		dadosDasRodadas = ler.lerDados(diretorioArquivoEntrada);
	}

	public void processarInstante() {
		
		Rodada rodada = new Rodada(java, separarDados());
		adicionarRodada(rodada);
		view.getPlano().adicionarIconsPlanetas(java, java.planetas, java.astros);
		
	}
	
	private void adicionarRodada(Rodada r) {
		rodadas.add(r);
	}
	
	private String[] separarDados() {
		contadorInstante++;
		return dadosDasRodadas.get(contadorInstante);
	}

	public EstrelaJava getJava() {
		return java;
	}

	public void trocarArquivoEntrada() {
		
		instantesTotais += contadorInstante;
		contadorArquivoEntrada++;
		String diretorio;
		
		switch (contadorArquivoEntrada) {
		case 1:
				diretorio = "dados/AE_50.csv";
			break;
		case 2:
				diretorio = "dados/AE_100.csv";
			break;
		case 3:
				diretorio = "dados/AE_500.csv";
			break;
		case 4:
				diretorio = "dados/AE_1000.csv";
			break;
		case 5:
				diretorio = "dados/AE_1500.csv";
			break;
		case 6:
				diretorio = "dados/AE_2000.csv";
			break;
		default:
				contadorArquivoEntrada = 0;
				diretorio = "dados/AE_10.csv";
			break;
		}
		
		diretorioArquivoEntrada = diretorio;
		dadosDasRodadas = ler.lerDados(diretorioArquivoEntrada);
	}

	public void setView(Janela view) {
		this.view = view;
	}
	
}
