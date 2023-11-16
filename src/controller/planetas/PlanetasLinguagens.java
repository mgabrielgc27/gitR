package controller.planetas;

import javax.swing.ImageIcon;

public abstract class PlanetasLinguagens {

	protected ImageIcon icon;
	protected String nome;
	protected int distancia;
	protected int velocidade;
	protected float velocidadeRotacao;
	protected float horasPassadas = 0;
	protected int posicaoX;
	protected int posicaoY = 7;
	protected int quantColisoesComBugs = 0;
	protected int quantColisoesComDevs = 0;
	protected int deslocamentoTotal = 0;
	protected boolean explodiu = false;
	protected String informacoes;
	
	public PlanetasLinguagens(String nome, int distancia) {
		this.nome = nome;
		this.distancia = distancia;
	}

	public void rotacionar(int tempo) {
		horasPassadas += (velocidadeRotacao * tempo);
	}

	public void translacionar(int tempo) {
		int deslocamento = (velocidade * tempo);
		deslocamentoTotal += deslocamento;
		int limiteDireito = (7 + distancia);
		int limiteEsquerdo = (7 - distancia);
		int limiteDeCima = (7 + distancia);
		int limiteDeBaixo = (7 - distancia);

		while (deslocamento > 0) {

			if (posicaoY == limiteEsquerdo) {

				while (posicaoX != limiteDeBaixo) {
					posicaoX--;
					deslocamento--;
					if (deslocamento == 0)
						return;
				}

			} else if (posicaoY == limiteDireito) {

				while (posicaoX != limiteDeCima) {
					posicaoX++;
					deslocamento--;
					if (deslocamento == 0)
						return;
				}
			}

			if (posicaoX == limiteDeCima) {

				while (posicaoY != limiteEsquerdo) {
					posicaoY--;
					deslocamento--;
					if (deslocamento == 0)
						return;
				}

			} else if (posicaoX == limiteDeBaixo) {

				while (posicaoY != limiteDireito) {
					posicaoY++;
					deslocamento--;
					if (deslocamento == 0)
						return;
				}
			}
		}
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}

	public String getNome() {
		return nome;
	}

	public int getDistancia() {
		return distancia;
	}

	public double getVelocidadeRotacao() {
		return velocidadeRotacao;
	}

	public void setVelocidadeRotacao(float velocidadeRotacao) {
		this.velocidadeRotacao = velocidadeRotacao;
	}

	public double getHorasPassadas() {
		return horasPassadas;
	}

	public int getQuantColisoesComBugs() {
		return quantColisoesComBugs;
	}

	public void setQuantColisoesComBugs(int quantColisoesComBugs) {
		this.quantColisoesComBugs = quantColisoesComBugs;
	}

	public int getQuantColisoesComDevs() {
		return quantColisoesComDevs;
	}

	public void setQuantColisoesComDevs(int quantColisoesComDevs) {
		this.quantColisoesComDevs = quantColisoesComDevs;
	}

	public int getDeslocamentoTotal() {
		return deslocamentoTotal;
	}

	public boolean isExplodiu() {
		return explodiu;
	}

	public void setExplodiu(boolean explodiu) {
		this.explodiu = explodiu;
	}

	public String getInformacoes() {
		return informacoes;
	}

	public ImageIcon getIcon() {
		return icon;
	}
	
}
