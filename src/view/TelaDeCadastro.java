package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.text.NumberFormatter;

import model.Medico;
import repository.BancoDao;

public class TelaDeCadastro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSenha;
	private JTextField txtEmail;
	private JTextField txtEspecializacao;
	private JTextField txtNomeCompleto;
	private JTextField txtConfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeCadastro frame = new TelaDeCadastro();
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
	public TelaDeCadastro() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 550);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new CompoundBorder());
		setContentPane(contentPane);
		contentPane.setLayout(null);

		setLocationRelativeTo(null);

		JLabel lblTitulo = new JLabel("Novo Cadastro");
		lblTitulo.setBackground(Color.WHITE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 42));
		lblTitulo.setBounds(6, 29, 308, 79);
		contentPane.add(lblTitulo);

		JLabel lblNome = new JLabel("Nome /Login:");
		lblNome.setForeground(Color.BLACK);
		lblNome.setFont(new Font("Arial", Font.BOLD, 15));
		lblNome.setBounds(6, 135, 117, 31);
		getContentPane().add(lblNome);

		JLabel lblEspecialização = new JLabel("Especializa\u00E7\u00E3o:");
		lblEspecialização.setForeground(Color.BLACK);
		lblEspecialização.setFont(new Font("Arial", Font.BOLD, 15));
		lblEspecialização.setBounds(10, 178, 150, 31);
		getContentPane().add(lblEspecialização);

		JLabel lblCrm = new JLabel("CRM:");
		lblCrm.setForeground(Color.BLACK);
		lblCrm.setHorizontalAlignment(SwingConstants.LEFT);
		lblCrm.setFont(new Font("Arial", Font.BOLD, 15));
		lblCrm.setBounds(10, 221, 72, 31);
		getContentPane().add(lblCrm);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 326, 414, 2);
		getContentPane().add(separator);

		JLabel lblEmail = new JLabel("E-mail profissional:");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("Arial", Font.BOLD, 15));
		lblEmail.setBounds(10, 264, 150, 31);
		getContentPane().add(lblEmail);

		txtSenha = new JTextField();
		txtSenha.setFont(new Font("Arial", Font.PLAIN, 15));
		txtSenha.setColumns(10);
		txtSenha.setBounds(155, 368, 269, 31);
		contentPane.add(txtSenha);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha.setFont(new Font("Arial", Font.BOLD, 15));
		lblSenha.setBounds(10, 368, 150, 31);
		contentPane.add(lblSenha);

		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 15));
		txtEmail.setColumns(10);
		txtEmail.setBounds(155, 264, 269, 31);
		contentPane.add(txtEmail);

		txtEspecializacao = new JTextField();
		txtEspecializacao.setFont(new Font("Arial", Font.PLAIN, 15));
		txtEspecializacao.setColumns(10);
		txtEspecializacao.setBounds(155, 178, 269, 31);
		contentPane.add(txtEspecializacao);

		txtNomeCompleto = new JTextField();
		txtNomeCompleto.setFont(new Font("Arial", Font.PLAIN, 15));
		txtNomeCompleto.setColumns(10);
		txtNomeCompleto.setBounds(155, 135, 269, 31);
		contentPane.add(txtNomeCompleto);

		JLabel lblConfirmarSenha = new JLabel("Confirmar senha:");
		lblConfirmarSenha.setForeground(Color.BLACK);
		lblConfirmarSenha.setHorizontalAlignment(SwingConstants.LEFT);
		lblConfirmarSenha.setFont(new Font("Arial", Font.BOLD, 15));
		lblConfirmarSenha.setBounds(10, 411, 150, 31);
		contentPane.add(lblConfirmarSenha);

		txtConfSenha = new JTextField();
		txtConfSenha.setFont(new Font("Arial", Font.PLAIN, 15));
		txtConfSenha.setColumns(10);
		txtConfSenha.setBounds(155, 411, 269, 31);
		contentPane.add(txtConfSenha);

		JLabel lblNewLabel = new JLabel("Agora, crie um senha para seu acesso: ");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 340, 280, 16);
		contentPane.add(lblNewLabel);

		// pondor regras nos botãos para não aceitarem letras!
		NumberFormat numberformat = NumberFormat.getInstance();
		NumberFormatter formatter = new NumberFormatter(numberformat);
		formatter.setAllowsInvalid(false);
		//Não funcionou como eu queria, peguei um modelo na internet.

		JFormattedTextField txtCrm = new JFormattedTextField();
		txtCrm.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {


				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					e.consume();
				}
			}
		});
		txtCrm.setBounds(155, 222, 269, 31);
		contentPane.add(txtCrm);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Medico md = new Medico();
				// preenchendo o que faz referência a md.
				md.setNome(txtNomeCompleto.getText());
				md.setEspecializacao(txtEspecializacao.getText());
				md.setCrm(txtCrm.getText());
				md.setEmail(txtEmail.getText());
				md.setSenha(txtSenha.getText());

				if (md.getNome().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o nome.");
					return;
				}
				if (md.getEspecializacao().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha a especialização.");
					return;
				}
				if (md.getCrm().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o CRM.");
					return;
				}
				if (md.getEmail().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o E-mail.");
					return;
				}
				if (md.getSenha().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha uma Senha.");
					return;
				}
				if (!md.getSenha().equals(txtConfSenha.getText())) {
					JOptionPane.showMessageDialog(null, "A senha precisa ser igual.");
					return;
				}
				String message = String.format(" %s foi salvo no sistema com SUCESSO!" , md.getNome());
				JOptionPane.showMessageDialog(null, message);

				BancoDao.medicos.add(md);

				// getText lê o que foi posto na Txt e armazena no set essa informação.

			}
		});
		btnSalvar.setForeground(Color.BLACK);
		btnSalvar.setFont(new Font("Arial", Font.BOLD, 15));
		btnSalvar.setBounds(155, 454, 123, 43);
		contentPane.add(btnSalvar);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 15));
		btnVoltar.setBounds(301, 454, 123, 43);
		contentPane.add(btnVoltar);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(TelaDeCadastro.class.getResource("/imagem/App-login-manager-icon.png")));
		lblNewLabel_1.setBounds(308, 6, 126, 123);
		contentPane.add(lblNewLabel_1);

	}
}
