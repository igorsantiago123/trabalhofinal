package Trabalho;

import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Color;
import javax.swing.SwingConstants;

public class PArquivo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PArquivo frame = new PArquivo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PArquivo() {
		setForeground(Color.WHITE);
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel AgendaP = new JLabel("Escolhas uma das 2\u00BA op\u00E7\u00F5es abaixo ");
		AgendaP.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		AgendaP.setBounds(111, 82, 236, 29);
		contentPane.add(AgendaP);
		
		JButton CadastroProjeto = new JButton("Cadastrar dados de um Projeto Social ");
		CadastroProjeto.setFont(new Font("Tahoma", Font.PLAIN, 11));
		CadastroProjeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*Cadastro2 cad1 = new Cadastro2();
				cad1.setVisible(true);*/
				
				/*JFrame Agenda = new JFrame("Cadastrar dados de um Projeto Social");
				Agenda.pack();
				Agenda.setVisible(true);*/
				
				
				
				Path dir = Paths.get("C:");

				
				Path path = dir.resolve("AulaLP.doc");
		
				try {
					ManipuladorArquivo.escritora(path.toString());
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
					
			}
				
				
			
			
		});
		CadastroProjeto.setBounds(68, 167, 299, 34);
		contentPane.add(CadastroProjeto);
		
		JButton CadastroAgenda = new JButton("Cadastrar Agenda do Projeto Social");
		CadastroAgenda.setFont(new Font("Tahoma", Font.PLAIN, 11));
		CadastroAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*Cadastro cad = new Cadastro();
				cad.setVisible(true);*/
				
				
				Path dir = Paths.get("C:");

				
				Path path = dir.resolve("AulaLP.doc");
				
				try {
					ManipuladorArquivo.escritor(path.toString());
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
		});
		CadastroAgenda.setBounds(68, 122, 299, 34);
		contentPane.add(CadastroAgenda);
		
		JLabel BEM = new JLabel("Ola! Seja Bem-vindo");
		BEM.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		BEM.setBounds(137, 11, 186, 60);
		contentPane.add(BEM);
		
		JButton btnNewButton = new JButton("Abrir Arquivo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Path dir = Paths.get("C:");

				
				Path path = dir.resolve("AulaLP.doc");
				
				
				try {
					ManipuladorArquivo.leitor("AulaLP.doc");
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
			
		});
		btnNewButton.setBounds(68, 221, 299, 29);
		contentPane.add(btnNewButton);
	}
}
