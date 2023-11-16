package controller.planetas;

import javax.swing.ImageIcon;

public class Csharp extends PlanetasLinguagens{

	public Csharp(String nome, int distancia) {
		super(nome, distancia);
		this.icon = new ImageIcon("imagens/csharpicon.png");
		this.velocidade = 1;
		this.velocidadeRotacao = 4;
		this.posicaoX = (7 - distancia);
		this.informacoes = "C# é uma linguagem de programação, multiparadigma, de tipagem forte, desenvolvida pela Microsoft como parte\r\n"
				+ " da plataforma .NET. A linguagem C# destina-se a ser simples, moderna, de propósito geral e orientada a objetos.\r\n"
				+ " A sua sintaxe orientada a objetos foi baseada no C++ mas inclui muitas influências de outras linguagens de programação,\r\n"
				+ " como Object Pascal e, principalmente, Java. O código fonte é compilado para Common Intermediate Language (CIL) que\r\n"
				+ " é interpretado pela máquina virtual Common Language Runtime (CLR).\n";
	}

}