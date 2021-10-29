package br.senia.sp.jadira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaTabuada {

	public void criarTela() {

		// fontes
		Font titulo = new Font("arial", Font.BOLD, 40);
		Font labels = new Font("arial", Font.BOLD, 30);

		// cores
		Color Verde = new Color(156, 197, 35);

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setTitle("Tabuada");
		frame.setLayout(null);

		// header do frame

		JPanel header = new JPanel();
		header.setBounds(10, 20, 340, 400);
		header.setBackground(Color.WHITE);
		header.setLayout(null);

		JLabel lblTitulo = new JLabel("tabuada");
		lblTitulo.setBounds(10, 30, 300, 30);
		lblTitulo.setForeground(Color.BLUE);
		lblTitulo.setFont(titulo);

		header.add(lblTitulo);

		JPanel panelFormulario = new JPanel();
		panelFormulario.setBounds(20, 110, 320, 220);

		JLabel lblMultiplicando = new JLabel("Multiplicando");
		lblMultiplicando.setBounds(20, 150, 200, 30);
		lblMultiplicando.setFont(labels);
		lblMultiplicando.setHorizontalTextPosition(SwingConstants.RIGHT);

		JTextField txtmultiplicando = new JTextField();
		txtmultiplicando.setBounds(225, 115, 100, 30);

		JTextField txtmultiplicador = new JTextField();
		txtmultiplicador.setBounds(225, 170, 100, 30);

		JLabel lblMultiplicador = new JLabel("maximo Multiplicandor");
		lblMultiplicador.setBounds(20, 170, 200, 30);
		lblMultiplicador.setFont(labels);

		JButton btcalcular = new JButton();
		btcalcular.setBounds(20, 230, 205, 40);
		btcalcular.setForeground(Verde);

		JButton btlimpar = new JButton("limpar");
		btlimpar.setBounds(20, 290, 305, 40);
		btlimpar.setForeground(Color.RED);

		JLabel lblresultado = new JLabel("resultado");
		lblresultado.setBounds(360, 120, 150, 30);

		// JList
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(360, 155, 200, 300);

		JList listaTabuada = new JList();
		scroll.getViewport().add(listaTabuada);

		frame.getContentPane().add(header);
		frame.getContentPane().add(panelFormulario);
		frame.getContentPane().add(scroll);
		frame.getContentPane().add(lblresultado);

		frame.setVisible(true);

		btcalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DefaultListModel tabuadaModel = new DefaultListModel();

				br.senia.sp.jadira.model.tabuada tabuada = new Tabuada();
				String[] resultadoTabuada = tabuada.calcular();

				for (int i = 0; i < resultadoTabuada.length; i++) {
					tabuadaModel.addElement(resultadoTabuada[i]);
				}
			}
		});

	}

}
