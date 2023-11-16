package model.arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LerDados {
	
	protected BufferedReader br;
	
	public ArrayList<String[]> lerDados(String diretorio) {
		
		ArrayList <String[]> dados= new ArrayList <String[]>();
		String linha = "";
		try {
			br = new BufferedReader(new FileReader(diretorio));
			while ( br.ready() ) {
				
				linha = br.readLine();
				String[] dadosSeparados = linha.split(",");
				dados.add(dadosSeparados);
				
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dados;
		
	}
	
}