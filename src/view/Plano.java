package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import controller.EstrelaJava;
import controller.Memoria;
import controller.astros.Astros;
import controller.planetas.PlanetasLinguagens;

@SuppressWarnings("serial")
public class Plano extends JPanel{
	
	protected Memoria memoria;
	protected Pontos[][] pontoPlano = new Pontos[15][15];
	
	public Plano(Memoria memoria) {
		this.memoria = memoria;
		
		configurarPainel();

		adicionarPontos();
		
		adicionarIconsPlanetas(memoria.getJava(), memoria.getJava().getPlanetas(), memoria.getJava().getAstros());
	}
	
	private void configurarPainel() {
		setPreferredSize(new Dimension(600, 600));
		setLayout(new GridLayout(15, 15));
	}
	
	private void adicionarPontos() {
		criarLabel();
		for (int i = 0; i < pontoPlano.length; i++) {
			for (int j = 0; j < pontoPlano.length; j++) {
				add(pontoPlano[i][j]);
			}
		}
	}
	
	private void criarLabel() {
		for (int i = 0; i < pontoPlano.length; i++) {
			for (int j = 0; j < pontoPlano.length; j++) {
				pontoPlano[i][j] = new Pontos();
			}
		}
	}
	
	private ImageIcon redimencionarImagens(ImageIcon icon) {
		Image imagem = icon.getImage().getScaledInstance(38, 35, Image.SCALE_SMOOTH);
		ImageIcon iconRedimencionado = new ImageIcon(imagem);
		return iconRedimencionado;
	}
	
	public void adicionarIconsPlanetas(EstrelaJava j, ArrayList<PlanetasLinguagens> planetasLinguagens, ArrayList<Astros> astros) {
		for (int i = 0; i < pontoPlano.length; i++) {
			for (int k = 0; k < pontoPlano.length; k++) {
				pontoPlano[i][k].setIcon(null);
			}
		}
		pontoPlano[j.getPosicaoX()][j.getPosicaoY()].setIcon
			(redimencionarImagens(j.getIcon()));
		
		for (Astros a : astros) {
			pontoPlano[a.getPosicaoX()][a.getPosicaoY()].setIcon(redimencionarImagens(a.getIcon()));
		}
		
		for (PlanetasLinguagens p : planetasLinguagens) {
			pontoPlano[p.getPosicaoX()][p.getPosicaoY()].setIcon(redimencionarImagens(p.getIcon()));
		}
		
	}
}
