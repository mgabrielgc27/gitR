package controller.planetas;

import javax.swing.ImageIcon;

public class Python extends PlanetasLinguagens{

	public Python(String nome, int distancia) {
		super(nome, distancia);
		this.icon = new ImageIcon("imagens/pythonicon.png");
		this.velocidade = 4;
		this.velocidadeRotacao = 24;
		this.posicaoX = (7 - distancia);
		this.informacoes = "Python é uma linguagem de programação de alto nível, orientada a objetos, de tipagem dinâmica e forte.\r\n"
				+ " Foi lançada por Guido van Rossum em 1991, e uma de suas principais características é permitir a fácil\r\n"
				+ " leitura do código e exigir poucas linhas de código se comparado ao mesmo programa em outras linguagens.\n";
	}

}
