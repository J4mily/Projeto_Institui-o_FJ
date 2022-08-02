package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

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
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import model.Enfermeiro;
import repository.BancoDao;

public class TelaEnfermeiros extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNmEnfermeiro;
	private JTextField txtCoren;
	private BancoDao pDao;
	JTextArea taEnfe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEnfermeiros frame = new TelaEnfermeiros();
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
	public TelaEnfermeiros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 550);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		pDao = new BancoDao(); // Tô instanciando e atribuindo um valor a ele

		JLabel lblEnfermeiroCadastrado = new JLabel("Enfermeiro cadastrado:");
		lblEnfermeiroCadastrado.setBounds(393, 418, 283, 25);
		contentPane.add(lblEnfermeiroCadastrado);
		lblEnfermeiroCadastrado.setForeground(Color.BLACK);
		lblEnfermeiroCadastrado.setFont(new Font("Arial", Font.BOLD, 16));

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(559, 11, 77, 66);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(TelaEnfermeiros.class.getResource("/imagem/id-card-icon (2).png")));

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(10, 11, 704, 66);
		contentPane.add(panel_1);

		JLabel lblEnfermeiros = new JLabel("ENFERMEIROS AUXILIARES");
		lblEnfermeiros.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnfermeiros.setForeground(Color.BLACK);
		lblEnfermeiros.setFont(new Font("Arial", Font.BOLD, 25));
		lblEnfermeiros.setBounds(0, 17, 714, 38);
		panel_1.add(lblEnfermeiros);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 89, 325, 40);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("SELECIONAR EXISTENTE");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(0, 0, 325, 40);
		panel.add(lblNewLabel);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(383, 89, 331, 40);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("CADASTRAR NOVO");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 0, 331, 40);
		panel_2.add(lblNewLabel_1);

		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] { "-------------->SELECIONE<--------------",
				"FERNANDO ACIOLE", "ANA LIMA E SILVA", "ANITA ROCHELE", "FIGUEREDA ANTONELLA", "MARIA JO\u00C3O TUTELA",
				"ARTHUR LOROTA", "CHAMPIER SILVA" }));
		comboBox.setBounds(10, 156, 325, 30);
		contentPane.add(comboBox);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBounds(10, 227, 325, 40);
		contentPane.add(panel_3);

		JLabel lblProcedimentoPreciso = new JLabel("PROCEDIMENTO PRECISO");
		lblProcedimentoPreciso.setForeground(Color.BLACK);
		lblProcedimentoPreciso.setHorizontalAlignment(SwingConstants.CENTER);
		lblProcedimentoPreciso.setFont(new Font("Arial", Font.BOLD, 20));
		lblProcedimentoPreciso.setBackground(Color.LIGHT_GRAY);
		panel_3.add(lblProcedimentoPreciso);

		JComboBox<Object> comboBox_1 = new JComboBox<Object>();
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setModel(new DefaultComboBoxModel<Object>(new String[] { "-------------->SELECIONE<--------------",
				"Monitorar sinais vitais.", "Aplicar medicamentos.", "Preparar paciente para procediemento.",
				"Realizar procedimento de auxilio." }));
		comboBox_1.setFont(new Font("Arial", Font.PLAIN, 18));
		comboBox_1.setBounds(10, 302, 325, 30);
		contentPane.add(comboBox_1);

		JLabel lblNomeDoEnfermeiro = new JLabel("Nome  do enfermeiro:");
		lblNomeDoEnfermeiro.setForeground(Color.BLACK);
		lblNomeDoEnfermeiro.setFont(new Font("Arial", Font.BOLD, 16));
		lblNomeDoEnfermeiro.setBounds(383, 141, 195, 31);
		contentPane.add(lblNomeDoEnfermeiro);

		txtNmEnfermeiro = new JTextField();
		txtNmEnfermeiro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNmEnfermeiro.setBounds(383, 170, 331, 30);
		contentPane.add(txtNmEnfermeiro);
		txtNmEnfermeiro.setColumns(10);

		JLabel lblCoren = new JLabel("COREN:");
		lblCoren.setForeground(Color.BLACK);
		lblCoren.setFont(new Font("Arial", Font.BOLD, 16));
		lblCoren.setBounds(383, 227, 195, 31);
		contentPane.add(lblCoren);

		txtCoren = new JTextField();
		txtCoren.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCoren.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					e.consume();
				}
			}
		});
		txtCoren.setColumns(10);
		txtCoren.setBounds(383, 251, 331, 30);
		contentPane.add(txtCoren);

		JLabel lblNecessidade = new JLabel("Necessidade:");
		lblNecessidade.setForeground(Color.BLACK);
		lblNecessidade.setFont(new Font("Arial", Font.BOLD, 16));
		lblNecessidade.setBounds(383, 302, 195, 31);
		contentPane.add(lblNecessidade);

		JRadioButton rdbtnEfetivo = new JRadioButton("Efetivo");
		rdbtnEfetivo.setForeground(Color.BLACK);
		rdbtnEfetivo.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnEfetivo.setBounds(383, 335, 109, 23);
		contentPane.add(rdbtnEfetivo);

		JRadioButton rdbtnTemporrio = new JRadioButton("Tempor\u00E1rio");
		rdbtnTemporrio.setForeground(Color.BLACK);
		rdbtnTemporrio.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnTemporrio.setBounds(383, 361, 109, 23);
		contentPane.add(rdbtnTemporrio);

		JButton btnSalvar_1 = new JButton("SALVAR");
		btnSalvar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Enfermeiro enf = new Enfermeiro();
				
				enf.setNome(txtNmEnfermeiro.getText());
				enf.setCoren(txtCoren.getText());
				enf.setTp(tipoChamada(rdbtnEfetivo.isSelected(), rdbtnTemporrio.isSelected()));

				if (enf.getNome().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha um nome de enfermeiro.");
					return;
				}
				if (enf.getCoren().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o número de Coren.");
					return;
				}

				String retorno = pDao.adicionaenfermeiro(enf);
				if (retorno.contains("selecionado")) {
					JOptionPane.showMessageDialog(null, retorno, "Sucesso", JOptionPane.INFORMATION_MESSAGE);

				} else {
					JOptionPane.showMessageDialog(null, retorno, "ERRO", JOptionPane.ERROR_MESSAGE);
				}
				txtNmEnfermeiro.setText("");// aqui é pra limpar os pacientes
				listar1();

				TelaDeTrabalho.atualizaListaPacientes();
				TelaDeTrabalho.AtualizarlistarEnfermeiro();
				TelaDeTrabalho.AtualizarLembrete();
			}
		});

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnEfetivo);
		bg.add(rdbtnTemporrio);

		btnSalvar_1.setForeground(Color.BLACK);
		btnSalvar_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnSalvar_1.setBounds(542, 344, 123, 30);
		contentPane.add(btnSalvar_1);

		JButton btnVoltar_1 = new JButton("VOLTAR");
		btnVoltar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaDeTrabalho td = new TelaDeTrabalho();
				td.setVisible(true);

				TelaDeTrabalho.atualizaListaPacientes();
				TelaDeTrabalho.AtualizarlistarEnfermeiro();
				TelaDeTrabalho.AtualizarLembrete();
			}
		});
		btnVoltar_1.setForeground(Color.BLACK);
		btnVoltar_1.setFont(new Font("Arial", Font.BOLD, 19));
		btnVoltar_1.setBounds(175, 457, 123, 43);
		contentPane.add(btnVoltar_1);

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(355, 87, 2, 359);
		contentPane.add(separator);

		JButton btnConfirmar = new JButton("CONFIRMAR");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				JOptionPane.showMessageDialog(null, "BOTÃO EM DESENVOLVIMENTO!", "ERRO ENCONTRADO",
						JOptionPane.ERROR_MESSAGE);
			}
			});
		btnConfirmar.setForeground(Color.BLACK);
		btnConfirmar.setFont(new Font("Arial", Font.BOLD, 15));
		btnConfirmar.setBounds(10, 357, 137, 30);
		contentPane.add(btnConfirmar);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_4.setBounds(383, 418, 331, 82);
		contentPane.add(panel_4);
		panel_4.setLayout(null);

		taEnfe = new JTextArea();
		taEnfe.setEditable(false);
		taEnfe.setForeground(Color.BLACK);
		taEnfe.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 19));
		taEnfe.setBounds(10, 25, 311, 46);
		panel_4.add(taEnfe);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 214, 347, 2);
		contentPane.add(separator_1);
	}

	private String tipoChamada(boolean eletivo, boolean temporario) {
		if (eletivo) {
			return "Efetivo";
		} else {
			return "Temporário";
		}
	}

	
	private void listar1() {
		List<Enfermeiro> enfermeiros = pDao.adicionaenfermeiro();
		String concatencacaoPacientes = "";

		for (int i = 0; i < enfermeiros.size(); i++) {
			//
			String linha = i + 1 + " " + enfermeiros.get(i).getNome() + " - " + enfermeiros.get(i).getTp() + "\n";
			concatencacaoPacientes = concatencacaoPacientes + linha;
		}
		taEnfe.setText(concatencacaoPacientes);
	}
}
