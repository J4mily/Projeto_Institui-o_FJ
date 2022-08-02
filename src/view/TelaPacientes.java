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

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import repository.BancoDao;

public class TelaPacientes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPaciente;
	private JTextField txtOrdemAtendimento;
	private BancoDao pDao;
	JTextArea taLista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPacientes frame = new TelaPacientes();
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
	public TelaPacientes() {

		pDao = new BancoDao();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 550);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(TelaPacientes.class.getResource("/imagem/choose-2-icon.png")));
		lblNewLabel_1.setBounds(497, 5, 132, 60);
		contentPane.add(lblNewLabel_1);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(5, 5, 714, 60);
		contentPane.add(panel);
		panel.setLayout(null);

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String data = formatter.format(new Date());

		JLabel lblNewLabel = new JLabel("PACIENTES DO DIA  " + data);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(20, 11, 694, 38);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		panel.add(lblNewLabel);

		JLabel lblNome = new JLabel("Nome do paciente:");
		lblNome.setForeground(Color.BLACK);
		lblNome.setFont(new Font("Arial", Font.BOLD, 19));
		lblNome.setBounds(15, 85, 197, 18);
		contentPane.add(lblNome);

		txtPaciente = new JTextField();
		txtPaciente.setFont(new Font("Arial", Font.PLAIN, 19));
		txtPaciente.setBounds(193, 81, 521, 27);
		contentPane.add(txtPaciente);
		txtPaciente.setColumns(10);

		JLabel lblOrdemDeAtendimento = new JLabel("Ordem de atendimento:");
		lblOrdemDeAtendimento.setForeground(Color.BLACK);
		lblOrdemDeAtendimento.setFont(new Font("Arial", Font.BOLD, 19));
		lblOrdemDeAtendimento.setBounds(345, 263, 229, 18);
		contentPane.add(lblOrdemDeAtendimento);

		txtOrdemAtendimento = new JTextField();
		txtOrdemAtendimento.setForeground(Color.BLACK);
		txtOrdemAtendimento.setFont(new Font("Arial", Font.PLAIN, 19));
		txtOrdemAtendimento.setColumns(10);
		txtOrdemAtendimento.setBounds(568, 259, 132, 27);
		contentPane.add(txtOrdemAtendimento);

		JLabel lblTipoAtendimento = new JLabel("Tipo de Atendimento:");
		lblTipoAtendimento.setForeground(Color.BLACK);
		lblTipoAtendimento.setFont(new Font("Arial", Font.BOLD, 19));
		lblTipoAtendimento.setBounds(451, 114, 229, 18);
		contentPane.add(lblTipoAtendimento);

		JRadioButton rdbtnEletivo = new JRadioButton("Eletivo");
		rdbtnEletivo.setForeground(Color.BLACK);
		rdbtnEletivo.setFont(new Font("Arial", Font.BOLD, 19));
		rdbtnEletivo.setBounds(451, 139, 145, 23);
		contentPane.add(rdbtnEletivo);

		JRadioButton rdbtnUrgncia = new JRadioButton("Urg\u00EAncia");
		rdbtnUrgncia.setForeground(Color.BLACK);
		rdbtnUrgncia.setFont(new Font("Arial", Font.BOLD, 19));
		rdbtnUrgncia.setBounds(451, 165, 145, 23);
		contentPane.add(rdbtnUrgncia);

		JRadioButton rdbtnEmergncia = new JRadioButton("Emerg\u00EAncia");
		rdbtnEmergncia.setForeground(Color.BLACK);
		rdbtnEmergncia.setFont(new Font("Arial", Font.BOLD, 19));
		rdbtnEmergncia.setBounds(451, 191, 145, 23);
		contentPane.add(rdbtnEmergncia);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(15, 187, 320, 313);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 300, 269);
		panel_1.add(scrollPane);

		taLista = new JTextArea();
		taLista.setForeground(Color.BLACK);
		taLista.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 19));
		taLista.setEditable(false);
		scrollPane.setViewportView(taLista);

		JLabel lblListagemDoDia = new JLabel(">>>>Listagem do dia:");
		lblListagemDoDia.setForeground(Color.BLACK);
		lblListagemDoDia.setFont(new Font("Arial", Font.BOLD, 19));
		lblListagemDoDia.setBounds(15, 161, 229, 27);
		contentPane.add(lblListagemDoDia);

		JSeparator separator = new JSeparator();
		separator.setBounds(345, 221, 369, 2);
		contentPane.add(separator);

		JButton btnAdicionar = new JButton("Adicionar ");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (txtPaciente.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nome do paciente não informado.", "ERRO ENCONTRADO",
							JOptionPane.ERROR_MESSAGE);
					return;
				}

				// concatenou o que eu queria que aparecesse.
				String registro = txtPaciente.getText() + " - " + tipoAtendimento(rdbtnEletivo.isSelected(),
						rdbtnUrgncia.isSelected(), rdbtnEmergncia.isSelected());

				// Traz o retorna paciente do pDao, busca o termo inserido e retorna o que é
				// relacionado.
				String retorno = pDao.adicionapaciente(registro);
				if (retorno.contains("inserido")) {
//					JOptionPane.showMessageDialog(null, retorno, "Sucesso",
//					JOptionPane.INFORMATION_MESSAGE); //mensagem repetida, sem necessidade.
				} else {
					JOptionPane.showMessageDialog(null, retorno, "ERRO", JOptionPane.ERROR_MESSAGE);
				}
				txtPaciente.setText("");// aqui é pra limpar a tela de pacientes
				listar();// aqui lista os pacientes inseridos.
			}
		});
		btnAdicionar.setForeground(Color.BLACK);
		btnAdicionar.setFont(new Font("Arial", Font.BOLD, 19));
		btnAdicionar.setBounds(193, 111, 162, 27);
		contentPane.add(btnAdicionar);

		JLabel lblOutrasOpes = new JLabel("Outras op\u00E7\u00F5es:");
		lblOutrasOpes.setForeground(Color.BLACK);
		lblOutrasOpes.setFont(new Font("Arial", Font.BOLD, 19));
		lblOutrasOpes.setBounds(345, 234, 229, 18);
		contentPane.add(lblOutrasOpes);

		JButton btnExcluir = new JButton("Excluir paciente");
		btnExcluir.addActionListener(new ActionListener() {
			// Exclui o paciente de acordo com a ordem selecionada.
			public void actionPerformed(ActionEvent e) {

				if (txtOrdemAtendimento.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Ordem de atendimento não selecionada!", "ERRO ENCONTRADO",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				pDao.excluipaciente(Integer.parseInt(txtOrdemAtendimento.getText()));
				txtOrdemAtendimento.setText("");
				// Lista no final os pacientes postos.
				listar();
			}
		});
		btnExcluir.setForeground(Color.BLACK);
		btnExcluir.setFont(new Font("Arial", Font.BOLD, 19));
		btnExcluir.setBounds(345, 304, 197, 27);
		contentPane.add(btnExcluir);

		JButton btnConsultarOrdem = new JButton("Consultar ordem");
		btnConsultarOrdem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtOrdemAtendimento.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Ordem de atendimento não selecionada!", "ERRO ENCONTRADO",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				// Converte o texto para inteiro e é verificado na pDao através do método
				// consulta paciente.
				String paciente = pDao.consultapaciente(Integer.parseInt(txtOrdemAtendimento.getText()));
				txtPaciente.setText(paciente);
				txtOrdemAtendimento.setText("");
			}
		});
		btnConsultarOrdem.setForeground(Color.BLACK);
		btnConsultarOrdem.setFont(new Font("Arial", Font.BOLD, 19));
		btnConsultarOrdem.setBounds(345, 342, 197, 27);
		contentPane.add(btnConsultarOrdem);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TelaDeTrabalho tct = new TelaDeTrabalho();
				tct.setVisible(true);

				// atualiza as áreas de texto selecionadas
				// na tela de trabalho central.
				TelaDeTrabalho.atualizaListaPacientes();
				TelaDeTrabalho.AtualizarlistarEnfermeiro();
				TelaDeTrabalho.AtualizarLembrete();
			}
		});
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 19));
		btnVoltar.setBounds(546, 462, 123, 43);
		contentPane.add(btnVoltar);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnEletivo);
		bg.add(rdbtnEmergncia);
		bg.add(rdbtnUrgncia);

		JButton btnListar = new JButton("Listar pacientes");
		btnListar.setBounds(345, 404, 197, 27);
		contentPane.add(btnListar);
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(BancoDao.pacientes.isEmpty() ) {
					JOptionPane.showMessageDialog(null, "No momento sem nenhum paciente adicionado.", "ERRO ENCONTRADO",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				listar();
			}
		});
		btnListar.setForeground(Color.BLACK);
		btnListar.setFont(new Font("Arial", Font.BOLD, 19));

//		
	}

	// Função de retorno que traz o q eu quero.
	private String tipoAtendimento(boolean eletivo, boolean urgencia, boolean emergencia) {
		if (urgencia) {
			return "Urgência";
		} else if (emergencia) {
			return "Emergência";
		} else {
			return "Eletivo";
		}
	}

	private void listar() {
		List<String> pacientes = pDao.consultaPacientes();
		String concatencacaoPacientes = "";
		for (int i = 0; i < pacientes.size(); i++) {
			String linha = i + 1 + " " + pacientes.get(i) + "\n";
			concatencacaoPacientes = concatencacaoPacientes + linha;
		}
		taLista.setText(concatencacaoPacientes);
	}
}
