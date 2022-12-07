package br.com.senai.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JList;

public class ViewEntrega extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewEntrega frame = new ViewEntrega();
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
	public ViewEntrega() {
		setTitle("Gerenciar Entregas - Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 871, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFrete = new JLabel("Frete");
		lblFrete.setBounds(10, 48, 46, 14);
		contentPane.add(lblFrete);
		
		JComboBox cbFrete = new JComboBox();
		cbFrete.setBounds(10, 73, 396, 29);
		contentPane.add(cbFrete);
		
		JLabel lblEndereco = new JLabel("Endereço");
		lblEndereco.setBounds(10, 132, 94, 14);
		contentPane.add(lblEndereco);
		
		JComboBox cbEndereco = new JComboBox();
		cbEndereco.setBounds(10, 163, 835, 29);
		contentPane.add(cbEndereco);
		
		JLabel lblColaborador = new JLabel("Colaborador");
		lblColaborador.setBounds(429, 48, 94, 14);
		contentPane.add(lblColaborador);
		
		JComboBox cbColaborador = new JComboBox();
		cbColaborador.setBounds(429, 73, 416, 29);
		contentPane.add(cbColaborador);
		
		JLabel lblDataDeSaida = new JLabel("Data De Saída");
		lblDataDeSaida.setBounds(10, 203, 94, 14);
		contentPane.add(lblDataDeSaida);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(10, 228, 155, 29);
		contentPane.add(formattedTextField);
		
		JLabel lblHoraDaSaida = new JLabel("Hora da Saída");
		lblHoraDaSaida.setBounds(200, 203, 100, 14);
		contentPane.add(lblHoraDaSaida);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(200, 228, 129, 29);
		contentPane.add(formattedTextField_1);
		
		JLabel lblDataDeChegada = new JLabel("Data de Chegada");
		lblDataDeChegada.setBounds(357, 203, 107, 14);
		contentPane.add(lblDataDeChegada);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setBounds(357, 228, 138, 29);
		contentPane.add(formattedTextField_2);
		
		JLabel lblHoraDeChegada = new JLabel("Hora de Chegada"); 
		lblHoraDeChegada.setBounds(547, 203, 113, 14);
		contentPane.add(lblHoraDeChegada);
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField();
		formattedTextField_3.setBounds(545, 228, 275, 29);
		contentPane.add(formattedTextField_3);
		
		JLabel lblKmPercorrido = new JLabel("Km Percorrido");
		lblKmPercorrido.setBounds(10, 281, 113, 14);
		contentPane.add(lblKmPercorrido);
		
		textField = new JTextField();
		textField.setBounds(10, 312, 138, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblValorTotal = new JLabel("Valor Total(R$)");
		lblValorTotal.setBounds(176, 281, 94, 14);
		contentPane.add(lblValorTotal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(176, 312, 138, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblObservacoes = new JLabel("Observações");
		lblObservacoes.setBounds(10, 374, 113, 16);
		contentPane.add(lblObservacoes);
		
		JList list = new JList();
		list.setBounds(10, 417, 835, 124);
		contentPane.add(list);
	}
}
