package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import controller.astros.Astros;
import controller.planetas.PlanetasLinguagens;
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
		
		if( (contadorInstante+1) >= dadosDasRodadas.size() ) {
			JOptionPane.showConfirmDialog(null, "Todas as linhas do arquivo foram lidas. Troque o arquivo de entrada.", null, JOptionPane.WARNING_MESSAGE);
			return null;
		}
		else {
			contadorInstante++;
			return dadosDasRodadas.get(contadorInstante);
		}
		
			
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
	
	public int[] calcularVelocidadeMedia(ArrayList<PlanetasLinguagens> planetas) {
		int[] velocidades = new int[6];
		int i = 0;
		for (PlanetasLinguagens p : planetas) {
			try {
				velocidades[i] = (p.getDeslocamentoTotal()/p.getInstantesTotais());
			} catch (Exception e) {
			}
			
			i++;
		}
		return velocidades;
	}
	
	public int[] calcularDiasPassados(ArrayList<PlanetasLinguagens> planetas) {
		int[] dias = new int[7];
		int i = 0;
		for (PlanetasLinguagens p : planetas) {
			dias[i] = (int) (p.getHorasPassadas()/24);
			i++;
		}
		return dias;
	}

	public void setView(Janela view) {
		this.view = view;
	}

	public int[] calcularAnosPassados(ArrayList<PlanetasLinguagens> planetas) {
		int[] anos = new int[7];
		int i = 0;
		for (PlanetasLinguagens p : planetas) {
			anos[i] = (p.getDeslocamentoTotal()/(8*p.getDistancia()));
			i++;
		}
		return anos;
	}

	public int[] BugsQuadrantes(ArrayList<Astros> astros) {
		int bugsq1 = 0;
		int bugsq2 = 0;
		int bugsq3 = 0;
		int bugsq4 = 0;
		for (Astros a : astros) {
			if(a.getTipo() == "BUG") {
				if(a.getPosicaoX() < 7 && a.getPosicaoY() < 7)
					bugsq1++;
				if(a.getPosicaoX() > 7 && a.getPosicaoY() > 7)
					bugsq4++;
				if(a.getPosicaoX() < 7 && a.getPosicaoY() > 7)
					bugsq3++;
				if(a.getPosicaoX() > 7 && a.getPosicaoY() < 7)
					bugsq2++;
			}
		}
		
		int[] bugs = { bugsq1, bugsq2, bugsq3, bugsq4};
		return bugs;
	}
	
	public int[] DevsQuadrantes(ArrayList<Astros> astros) {
		int devsq1 = 0;
		int devsq2 = 0;
		int devsq3 = 0;
		int devsq4 = 0;
		for (Astros a : astros) {
			if(a.getTipo() == "DEV") {
				if(a.getPosicaoX() < 7 && a.getPosicaoY() < 7)
					devsq1++;
				if(a.getPosicaoX() > 7 && a.getPosicaoY() > 7)
					devsq4++;
				if(a.getPosicaoX() < 7 && a.getPosicaoY() > 7)
					devsq3++;
				if(a.getPosicaoX() > 7 && a.getPosicaoY() < 7)
					devsq2++;
			}
		}
		
		int[] devs = { devsq1, devsq2, devsq3, devsq4};
		return devs;
	}

	public void gravarRelatorio() {
		Relatorio r = new Relatorio(this);
	}
}
