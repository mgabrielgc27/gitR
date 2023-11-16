package controller.planetas;

import javax.swing.ImageIcon;

public class JavaScript extends PlanetasLinguagens{

	public JavaScript(String nome, int distancia) {
		super(nome, distancia);
		this.icon = new ImageIcon("imagens/javascripticon.png");
		this.velocidade = 3;
		this.velocidadeRotacao = 10;
		this.posicaoX = (7 - distancia);
		this.informacoes = "JavaScript é uma linguagem de programação interpretada estruturada, de script em alto nível com tipagem\r\n"
				+ " dinâmica fraca e multiparadigma criado por Brendan Eich em 1995. O JavaScript é uma das três principais\r\n"
				+ " tecnologias da World Wide Web. Como uma linguagem multiparadigma, o JavaScript suporta estilos de programação\r\n"
				+ " orientados a eventos, funcionais e imperativos (incluindo orientado a objetos e prototype-based), apresentando\r\n"
				+ " recursos como fechamentos (closures) e funções de alta ordem comumente indisponíveis em outras linguagens populares.\n";
	}

}