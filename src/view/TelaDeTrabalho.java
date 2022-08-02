package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import model.Enfermeiro;
import repository.BancoDao;

public class TelaDeTrabalho extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextArea txtListaDia;
	static JTextArea txtEnfer;
	static JTextArea taLista;
	static JTextArea txtLembrete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeTrabalho frame = new TelaDeTrabalho();
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
	public TelaDeTrabalho() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 740, 550);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(6, 6, 712, 74);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel(
				"Para eventuais problemas no sistema entre em contato com o (081) 90000-0000.");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblNewLabel_1.setBounds(6, 29, 700, 22);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("Bem vindo novamente ao painel principal da FJ+!");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 700, 22);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1_1 = new JLabel(
				"\"N\u00E3o \u00E9 um diploma m\u00E9dico, mas a qualidade humana o decisivo. Carl Jung.\" Estamos nessa com voc\u00EA!");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_1.setBounds(6, 47, 700, 22);
		panel.add(lblNewLabel_1_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(6, 177, 293, 328);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		txtListaDia = new JTextArea();
		txtListaDia.setEditable(false);
		txtListaDia.setForeground(new Color(0, 0, 0));
		txtListaDia.setFont(new Font("Arial", Font.BOLD, 19));
		txtListaDia.setBounds(6, 58, 281, 264);
		panel_2.add(txtListaDia);

		JLabel lbllistagemDePacientes = new JLabel(">>Listagem de pacientes:");
		lbllistagemDePacientes.setForeground(Color.BLACK);
		lbllistagemDePacientes.setFont(new Font("Arial", Font.BOLD, 19));
		lbllistagemDePacientes.setBounds(6, 19, 251, 27);
		panel_2.add(lbllistagemDePacientes);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(TelaDeTrabalho.class.getResource("/imagem/front-office-icon (2).png")));
		lblNewLabel_3.setBounds(591, 362, 133, 143);
		contentPane.add(lblNewLabel_3);

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String data = formatter.format(new Date());

		JLabel lblDataEHora = new JLabel("DATA E HORA:" + data);
		lblDataEHora.setHorizontalAlignment(SwingConstants.LEFT);
		lblDataEHora.setForeground(Color.BLACK);
		lblDataEHora.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 19));
		lblDataEHora.setBounds(6, 135, 331, 44);
		contentPane.add(lblDataEHora);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(6, 92, 712, 44);
		contentPane.add(panel_1);

		JButton btnPaciente = new JButton("PACIENTES");
		btnPaciente.setForeground(Color.BLACK);
		btnPaciente.setBounds(105, 8, 100, 28);
		btnPaciente.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TelaPacientes pc = new TelaPacientes();
				pc.setVisible(true);
				setVisible(false);

			}
		});
		panel_1.setLayout(null);
		panel_1.add(btnPaciente);

		JButton btnNewButton_4 = new JButton("ENFERMEIROS");
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setBounds(217, 8, 119, 28);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEnfermeiros te = new TelaEnfermeiros();
				te.setVisible(true);

			}
		});
		btnNewButton_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		panel_1.add(btnNewButton_4);

		JButton btnAgenda = new JButton("AGENDA");
		btnAgenda.setForeground(Color.BLACK);
		btnAgenda.setBounds(348, 8, 82, 28);
		btnAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAgenda tg = new TelaAgenda();
				tg.setVisible(true);
				dispose();
			}

		});
		btnAgenda.setHorizontalAlignment(SwingConstants.LEFT);
		btnAgenda.setFont(new Font("SansSerif", Font.BOLD, 12));
		panel_1.add(btnAgenda);

		JButton btnSair = new JButton("SAIR");
		btnSair.setForeground(Color.BLACK);
		btnSair.setBounds(608, 8, 94, 28);
		btnSair.setBackground(new Color(255, 69, 0));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		btnSair.setFont(new Font("SansSerif", Font.BOLD, 12));
		panel_1.add(btnSair);

		JButton btnProcedimentos = new JButton("PROCEDIMENTOS");
		btnProcedimentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaProcedimentos tp = new TelaProcedimentos();
				tp.setVisible(true);
			}
		});
		btnProcedimentos.setForeground(Color.BLACK);
		btnProcedimentos.setBounds(442, 8, 134, 28);
		btnProcedimentos.setFont(new Font("SansSerif", Font.BOLD, 12));
		panel_1.add(btnProcedimentos);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(32, 6, 52, 38);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(TelaDeTrabalho.class.getResource("/imagem/statistic-icon.png")));

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBounds(364, 277, 354, 88);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		txtEnfer = new JTextArea();
		txtEnfer.setEditable(false);
		txtEnfer.setForeground(Color.BLACK);
		txtEnfer.setFont(new Font("Arial", Font.BOLD, 19));
		txtEnfer.setBounds(6, 39, 345, 43);
		panel_3.add(txtEnfer);

		JLabel lblNewLabel_4 = new JLabel(">>Enfermeiro auxiliar selecionado:");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_4.setBounds(6, 6, 345, 32);
		panel_3.add(lblNewLabel_4);

		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3_1.setBounds(311, 177, 407, 88);
		contentPane.add(panel_3_1);

		txtLembrete = new JTextArea();
		txtLembrete.setEditable(false);
		txtLembrete.setForeground(Color.BLACK);
		txtLembrete.setFont(new Font("Arial", Font.BOLD, 19));
		txtLembrete.setBounds(6, 39, 395, 43);
		panel_3_1.add(txtLembrete);

		JLabel lblNewLabel_4_1 = new JLabel(">>Lembrete:");
		lblNewLabel_4_1.setForeground(Color.BLACK);
		lblNewLabel_4_1.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_4_1.setBounds(6, 6, 345, 32);
		panel_3_1.add(lblNewLabel_4_1);

	}

	// ATUALIZA NA TELA DDE PACIENTES NA PRINCIPAL.
	static void atualizaListaPacientes() {
		String concatencacaoPacientes = "";
		List<String> pacientes = BancoDao.pacientes;
		for (int i = 0; i < pacientes.size(); i++) {
			String linha = (i + 1) + " " + pacientes.get(i) + "\n";
			concatencacaoPacientes = concatencacaoPacientes + linha;
		}
		if(txtListaDia != null) {
			txtListaDia.setText(concatencacaoPacientes);
			}
		//txtListaDia.setText(concatencacaoPacientes);
	}

	// ATUALIZA A TELA DE ENFERMEIROS NA PRINCIPAL.
	static void AtualizarlistarEnfermeiro() {
		List<Enfermeiro> enfermeiros = BancoDao.enfermeiros;
		String concatencacaoenfermeiros = "";

		for (int i = 0; i < enfermeiros.size(); i++) {
			String linha = i + 1 + " " + enfermeiros.get(i).getNome() + " - " + enfermeiros.get(i).getTp() + "\n";
			concatencacaoenfermeiros = concatencacaoenfermeiros + linha;
		}
		if(txtEnfer != null) {
		txtEnfer.setText(concatencacaoenfermeiros);
		}

	}

	// ATUALIZA A TELA DE ENFERMEIROS NA PRINCIPAL.

	static void AtualizarLembrete() {
		String concatencacao = "";
		List<String> lembretes = BancoDao.lembretes;
		for (int i = 0; i < lembretes.size(); i++) {
			String linha = " " + lembretes.get(i) + "\n";
			concatencacao = concatencacao + linha;
		}
		if(txtLembrete != null) {
		txtLembrete.setText(concatencacao);
		}

	}
}
