package controller.astros;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import controller.planetas.PlanetasLinguagens;

	public class Dev extends Astros {
		public Dev() {
		this.icon = new ImageIcon("imagens/devicon.png");
		tipo = "DEV";
	}

	public void modificarVelocidade(ArrayList<PlanetasLinguagens> planetas) {
		
		for (PlanetasLinguagens p : planetas) {
			
			if (posicaoX == p.getPosicaoX() && posicaoY == p.getPosicaoY() && !p.isExplodiu()) {
				
				if (colidiu == false) {
					
					p.setQuantColisoesComDevs(p.getQuantColisoesComDevs() + 1);
					System.out.println(
							"DEV colidiu com " + p.getNome() + " na posição (" + posicaoX + ", " + posicaoY + ") ");
					System.out.println(p.getNome() + " ganhou velocidade!");
					p.setVelocidade(p.getVelocidade() + 1);
					colidiu = true;
					
				}
				
			}
			
		}
		
	}

}
