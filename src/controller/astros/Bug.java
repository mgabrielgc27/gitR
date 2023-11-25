package controller.astros;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import controller.planetas.PlanetasLinguagens;


	public class Bug extends Astros {
		public Bug() {
		this.icon = new ImageIcon("imagens/bugicon.png");
		tipo = "BUG";
	}

	public void modificarVelocidade(ArrayList<PlanetasLinguagens> planetas) {
		
		for (PlanetasLinguagens p : planetas) {
			
			if (posicaoX == p.getPosicaoX() && posicaoY == p.getPosicaoY() && !p.isExplodiu()) {
				
				if (colidiu == false) {
					
					p.setQuantColisoesComBugs(p.getQuantColisoesComBugs() + 1);
					System.out.println(
							"BUG colidiu com " + p.getNome() + " na posição (" + posicaoX + ", " + posicaoY + ") ");
					System.out.println(p.getNome() + " perdeu velocidade!");
					p.setVelocidade(p.getVelocidade() - 1);
					colidiu = true;
					
					if (p.getVelocidade() <= 0) {
						
						p.setExplodiu(true);
						System.out.println(p.getNome() + " EXPLODIU!");
						
					}
					
				}
				
			}
			
		}
		
	}
	
}
