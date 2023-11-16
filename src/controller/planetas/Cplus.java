package controller.planetas;

import javax.swing.ImageIcon;

public class Cplus extends PlanetasLinguagens{

	public Cplus(String nome, int distancia) {
		super(nome, distancia);
		this.icon = new ImageIcon("imagens/cplusicon.png");
		this.velocidade = 2;
		this.velocidadeRotacao = 0.5f;
		this.posicaoX = (7 - distancia);
		this.informacoes = "C++ é uma linguagem de programação compilada multi-paradigma. Bjarne Stroustrup desenvolveu o C++ em 1983 no Bell Labs\r\n"
				+ " como um adicional à linguagem C. Novas características foram adicionadas com o tempo[5], como funções virtuais,\r\n"
				+ " sobrecarga de operadores, herança múltipla, gabaritos e tratamento de exceções.\n";
	}

}
