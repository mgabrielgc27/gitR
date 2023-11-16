package controller;

import java.util.ArrayList;

import controller.astros.Astros;
import controller.astros.Bug;
import controller.astros.Dev;

public class Rodada {

	protected EstrelaJava java;
	protected String[] dadosDaRodada;
	ArrayList<Astros> astros = new ArrayList<Astros>();
	protected int quantBugs = 0;
	protected int quantDevs = 0;

	public Rodada(EstrelaJava j, String[] dados) {
		java = j;
		dadosDaRodada = dados;
		
		quantBugs = Integer.valueOf(dados[8]);
		quantDevs = Integer.valueOf(dados[9]);
		
		adicionarAstros();
		java.movimentarPlanetas(dadosDaRodada);
	}

	public void adicionarAstros() {
		
		for (int i = 0; i < quantBugs; i++) {
			
			java.astros.add(new Bug());
		}
		for (int i = 0; i < quantDevs; i++) {
			
			java.astros.add(new Dev());
		}
		
		for (int i = 0; i < java.astros.size(); i++) {
			for (int j = 0; j < java.astros.size(); j++) {
				if (java.astros.get(i).getPosicaoX() == java.astros.get(j).getPosicaoX() &&
						java.astros.get(i).getPosicaoY() == java.astros.get(j).getPosicaoY() ) {
					
					if( java.astros.get(j).getTipo() == "BUG" ) {
						java.astros.remove(j);
						java.astros.add(new Bug());
					}else {
						java.astros.remove(j);
						java.astros.add(new Dev());
					}
					
				}
			}
		}
	}

}
