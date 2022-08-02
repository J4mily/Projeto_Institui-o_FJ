package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class TelaProcedimentos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	///private String DefaultComboBoxModel;
	String procedimentos[] = { "SELECIONE", "TRAQUEOSTOMIA", "TRANSPLANTE DE RIM", "TRANSPLANTE DE PÂNCREAS",
			"CIRURGIA DE CORAÇÃO ABERTO" };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProcedimentos frame = new TelaProcedimentos();
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
	public TelaProcedimentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 550);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 11, 704, 60);
		contentPane.add(panel);

		JLabel lblProcedimentosAdicionais = new JLabel("PROCEDIMENTOS ADICIONAIS");
		lblProcedimentosAdicionais.setHorizontalAlignment(SwingConstants.CENTER);
		lblProcedimentosAdicionais.setForeground(Color.BLACK);
		lblProcedimentosAdicionais.setFont(new Font("Arial", Font.BOLD, 30));
		lblProcedimentosAdicionais.setBounds(0, 11, 714, 38);
		panel.add(lblProcedimentosAdicionais);

		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setForeground(Color.BLACK);
//		String procedimentos[] = {"SELECIONE", "TRAQUEOSTOMIA", "TRANSPLANTE DE RIM", "TRANSPLANTE DE PÂNCREAS", "CIRURGIA DE CORAÇÃO ABERTO"};

//		comboBox.addActionListener(new ActionListener() {			
//			public void actionPerformed(ActionEvent e) {
//				
//				if(comboBox.getSelectedIndex() == 1 ){
//					JOptionPane.showMessageDialog(null, "Corre fia");
//		
//				}		
//	
//			}
//			});

		comboBox.setFont(new Font("Arial", Font.BOLD, 19));
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] { "SELECIONE", "TRAQUEOSTOMIA", "TRANSPLANTE DE RIM",
				"TRANSPLANTE DE P\u00C2NCREAS", "CIRURGIA DE CORA\u00C7\u00C3O ABERTO" }));
		comboBox.setBounds(10, 125, 704, 35);
		contentPane.add(comboBox);

		JLabel lblProcedimento = new JLabel("Procedimento:");
		lblProcedimento.setForeground(Color.BLACK);
		lblProcedimento.setFont(new Font("Arial", Font.BOLD, 27));
		lblProcedimento.setBounds(10, 92, 274, 35);
		contentPane.add(lblProcedimento);

		JLabel lblTipoDeOperao = new JLabel("Tipo de opera\u00E7\u00E3o:");
		lblTipoDeOperao.setForeground(Color.BLACK);
		lblTipoDeOperao.setFont(new Font("Arial", Font.BOLD, 27));
		lblTipoDeOperao.setBounds(10, 195, 259, 44);
		contentPane.add(lblTipoDeOperao);

		JRadioButton rdbtnLimpa = new JRadioButton("Limpa (Sem riscos)");
		rdbtnLimpa.setForeground(Color.BLACK);
		rdbtnLimpa.setFont(new Font("Arial", Font.BOLD, 19));
		rdbtnLimpa.setBounds(10, 236, 310, 23);
		contentPane.add(rdbtnLimpa);

		JRadioButton rdbtnPotencialmenteContaminadas = new JRadioButton("Potencialmente contaminadas");
		rdbtnPotencialmenteContaminadas.setForeground(Color.BLACK);
		rdbtnPotencialmenteContaminadas.setFont(new Font("Arial", Font.BOLD, 19));
		rdbtnPotencialmenteContaminadas.setBounds(10, 262, 310, 23);
		contentPane.add(rdbtnPotencialmenteContaminadas);

		JRadioButton rdbtnContaminadas = new JRadioButton("Contaminadas");
		rdbtnContaminadas.setForeground(Color.BLACK);
		rdbtnContaminadas.setFont(new Font("Arial", Font.BOLD, 19));
		rdbtnContaminadas.setBounds(10, 288, 310, 23);
		contentPane.add(rdbtnContaminadas);

		JRadioButton rdbtnInfectadas = new JRadioButton("Infectadas");
		rdbtnInfectadas.setForeground(Color.BLACK);
		rdbtnInfectadas.setFont(new Font("Arial", Font.BOLD, 19));
		rdbtnInfectadas.setBounds(10, 314, 310, 23);
		contentPane.add(rdbtnInfectadas);

		// AGRUPANDPO OS BOTÕES PARA APENAS UMS ALTERNATIVA:
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnLimpa);
		bg.add(rdbtnPotencialmenteContaminadas);
		bg.add(rdbtnContaminadas);
		bg.add(rdbtnInfectadas);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				switch (comboBox.getSelectedItem().toString()) {
				case "TRAQUEOSTOMIA":
					JOptionPane
							.showMessageDialog(null,
									"O valor do procedimento é: " + (205000
											+ 205000 * TipoOperacao(rdbtnLimpa.isSelected(),
													rdbtnPotencialmenteContaminadas.isSelected(),
													rdbtnContaminadas.isSelected(), rdbtnInfectadas.isSelected())
											+ " R$"));
					break;
				case "TRANSPLANTE DE RIM":
					JOptionPane
							.showMessageDialog(null,
									"O valor do procedimento é: " + (263000
											+ 263000 * TipoOperacao(rdbtnLimpa.isSelected(),
													rdbtnPotencialmenteContaminadas.isSelected(),
													rdbtnContaminadas.isSelected(), rdbtnInfectadas.isSelected())
											+ " R$" ));
					break;
				case "TRANSPLANTE DE PÂNCREAS":
					JOptionPane
							.showMessageDialog(null,
									"O valor do procedimento é: " + (289500
											+ 289500 * TipoOperacao(rdbtnLimpa.isSelected(),
													rdbtnPotencialmenteContaminadas.isSelected(),
													rdbtnContaminadas.isSelected(), rdbtnInfectadas.isSelected())
											+ " R$"));
					break;
				case "CIRURGIA DE CORAÇÃO ABERTO":
					JOptionPane
							.showMessageDialog(null,
									"O valor do procedimento adequado ao tipo é: " + (324000
											+ 324000 * TipoOperacao(rdbtnLimpa.isSelected(),
													rdbtnPotencialmenteContaminadas.isSelected(),
													rdbtnContaminadas.isSelected(), rdbtnInfectadas.isSelected())
											+ " R$"));
					break;
				}

			}
		});
		btnNewButton.setIcon(new ImageIcon(TelaProcedimentos.class.getResource("/imagem/d-feet-icon.png")));
		btnNewButton.setBounds(459, 264, 100, 73);
		contentPane.add(btnNewButton);

		JLabel lblVerificarValor = new JLabel("Verificar valor do");
		lblVerificarValor.setForeground(Color.BLACK);
		lblVerificarValor.setFont(new Font("Arial", Font.BOLD, 27));
		lblVerificarValor.setBounds(396, 206, 259, 22);
		contentPane.add(lblVerificarValor);

		JLabel lblProcedimento_1 = new JLabel("procedimento:");
		lblProcedimento_1.setForeground(Color.BLACK);
		lblProcedimento_1.setFont(new Font("Arial", Font.BOLD, 27));
		lblProcedimento_1.setBounds(418, 229, 226, 32);
		contentPane.add(lblProcedimento_1);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaDeTrabalho tt = new TelaDeTrabalho();
				tt.setVisible(true);
				dispose();

				TelaDeTrabalho.atualizaListaPacientes();
				TelaDeTrabalho.AtualizarlistarEnfermeiro();
				TelaDeTrabalho.AtualizarLembrete();
			}
		});
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 19));
		btnVoltar.setBounds(580, 445, 134, 55);
		contentPane.add(btnVoltar);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaProcedimentos.class.getResource("/imagem/notes-icon.png")));
		lblNewLabel.setBounds(86, 359, 134, 128);
		contentPane.add(lblNewLabel);
	}

	// Fazendo essa função pra evitar repetição no switch case. Organizando de
	// acordo com o botão radio selecionado.
	private double TipoOperacao(boolean limpo, boolean ponteContaminado, boolean contaminado, boolean infectado) {

		if (limpo) {
			return 0;
		} else if (ponteContaminado) {
			return 0.20;

		} else if (contaminado) {
			return 0.30;

		} else if (infectado) {
			return 0.50;
		}
		return 0;

	}

}

//Se a cirurgia for do tipo 
//limpa: valor inteiro
//PC: + 20%
//Contaminada: + 30%
//Infectada: + 50% 
