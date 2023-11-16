package controller.planetas;

import javax.swing.ImageIcon;

public class C extends PlanetasLinguagens {

	public C(String nome, int distancia) {
		super(nome, distancia);
		this.icon = new ImageIcon("imagens/cicon.png");
		this.velocidade = 10;
		this.velocidadeRotacao = 0.1f;
		this.posicaoX = (7 - distancia);
		this.informacoes = "C é uma linguagem de programação compilada de propósito geral, estruturada, imperativa, procedural. É uma das linguagens\r\n"
				+ " de programação mais populares e existem poucas arquiteturas para as quais não existem compiladores para C.\r\n"
				+ " C tem influenciado muitas outras linguagens de programação por exemplo, a linguagem Java, e mais notavelmente C++,\r\n"
				+ " que originalmente começou como uma extensão para C.\n";
	}

}
