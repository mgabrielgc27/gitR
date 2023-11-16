package controller.planetas;

import javax.swing.ImageIcon;

public class Ruby extends PlanetasLinguagens{

	public Ruby(String nome, int distancia) {
		super(nome, distancia);
		this.icon = new ImageIcon("imagens/rubyicon.png");
		this.velocidade = 2;
		this.velocidadeRotacao = 48;
		this.posicaoX = (7 - distancia);
		this.informacoes = "Ruby é uma linguagem de programação interpretada multiparadigma, de tipagem dinâmica e forte, com gerenciamento\r\n"
				+ " de memória automático, originalmente planejada e desenvolvida no Japão em 1995, por Yukihiro \"Matz\" Matsumoto,\r\n"
				+ " para ser usada como linguagem de script. Ruby on Rails é um framework livre que promete aumentar velocidade e\r\n"
				+ " facilidade no desenvolvimento de sites orientados a banco de dados (database-driven web sites), uma vez que é\r\n"
				+ " possível criar aplicações com base em estruturas pré-definidas.\n";
	}

}
