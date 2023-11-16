package controller.astros;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

import controller.planetas.PlanetasLinguagens;

public abstract class Astros {
	
	protected ImageIcon icon;
	protected String tipo;
	protected int posicaoX;
	protected int posicaoY;
	protected boolean colidiu = false;

	public Astros() {
		do {
			posicaoX = (new Random().nextInt(15));
			posicaoY = (new Random().nextInt(15));
		} while (posicaoX == 7 && posicaoY == 7);
	}

	public abstract void modificarVelocidade(ArrayList<PlanetasLinguagens> p);

	public String getTipo() {
		return tipo;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public boolean isColidiu() {
		return colidiu;
	}

	public ImageIcon getIcon() {
		return icon;
	}
	
}
