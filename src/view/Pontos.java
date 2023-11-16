package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Pontos extends JLabel{
	
	public Pontos() {
		setBorder(BorderFactory.createLineBorder(Color.black, 1, true));
		setSize(new Dimension(40, 40));
	}
}
