package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class Botao extends JButton{

	public Botao(String texto) {
		setText(texto);
		setBorder(new LineBorder(Color.black, 1, true));
		setForeground(Color.white);
		setFont(new Font("baskerville", Font.BOLD, 12));
		setBackground(Color.black);
		setPreferredSize(new Dimension(200, 50));
	}
}
