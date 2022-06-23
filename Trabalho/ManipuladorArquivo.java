package Trabalho;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

import java.util.ArrayList;

public class ManipuladorArquivo {
	
	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				 JOptionPane.showMessageDialog(null, linha);

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}

	public static void escritor(String path) throws IOException {
		
		ArrayList < String > texto = new  ArrayList < String >();
			
		BufferedWriter  escrever = new  BufferedWriter ( new  FileWriter (path , true));
        
		String  t = "", o = "", ec = "", s = "", d = "";
		
		t = JOptionPane.showInputDialog("titulo");
		texto.add(t);
		
		o = JOptionPane.showInputDialog("objetivo");
		texto.add(o);
		
		ec = JOptionPane.showInputDialog("endereço completo");
		texto.add(ec);
		
		
		s = JOptionPane.showInputDialog("data de incio");
		texto.add(s);
		
		
		d = JOptionPane.showInputDialog("status.");
		texto.add(d);
		
        JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
    
		
		escrever.append(texto + "\n");
	
		escrever.close();
		
		
	}
	
	public static void escritora(String path) throws IOException {
		
		ArrayList < String > proj = new  ArrayList < String >();
			
		BufferedWriter  escrever = new  BufferedWriter ( new  FileWriter ( path , true ));
			
		String  dta = "", hor = "", endc = "", desc = "";
		
		dta = JOptionPane.showInputDialog("data");
		proj.add(dta);
		
		hor = JOptionPane.showInputDialog(" hora");
		proj.add(hor);
		
		endc = JOptionPane.showInputDialog("endereço completo");
		proj.add(endc);
	
		desc = JOptionPane.showInputDialog("descrisão e ação");
		proj.add(desc);
        
		
        JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
		
		escrever.append(proj + "\n");
	
		escrever.close();
		
	}	
}

