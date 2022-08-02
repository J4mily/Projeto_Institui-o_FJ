package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import model.Medico;
import repository.BancoDao;

public class TelaLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 550);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		frame.setLocationRelativeTo(null);

		JLabel lblNomeHospital = new JLabel("INSTITUTO FJ+");
		lblNomeHospital.setForeground(Color.BLACK);
		lblNomeHospital.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNomeHospital.setBounds(72, 11, 310, 53);
		frame.getContentPane().add(lblNomeHospital);

		JLabel lblMenssagem = new JLabel("Excel\u00EAncia \u00E9 o nosso maior m\u00E9rito!");
		lblMenssagem.setForeground(Color.BLACK);
		lblMenssagem.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lblMenssagem.setBounds(195, 50, 209, 14);
		frame.getContentPane().add(lblMenssagem);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Arial", Font.BOLD, 19));
		lblLogin.setBounds(43, 373, 77, 30);
		frame.getContentPane().add(lblLogin);

		txtLogin = new JTextField();
		txtLogin.setForeground(Color.BLACK);
		txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtLogin.setBounds(117, 368, 287, 30);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Arial", Font.BOLD, 19));
		lblSenha.setBounds(43, 409, 77, 30);
		frame.getContentPane().add(lblSenha);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setForeground(Color.BLACK);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Recebe os dados postos no login e senha e direciona ao chekLogin
				// para vê se os dados são válidos.


				if (chekLogin(txtLogin.getText(), new String(txtSenha.getPassword()))) {
					JOptionPane.showMessageDialog(null, "Seja Bem-vindo ");

					dispose();
					TelaDeTrabalho tt = new TelaDeTrabalho();
					tt.setVisible(true);
					dispose();
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Dados inválidos, tente novamente ou se cadastre.",
							"ERRO DE CADASTRO", JOptionPane.ERROR_MESSAGE);
					return;
				}
			}

		});

		btnEntrar.setFont(new Font("Arial", Font.BOLD, 19));
		btnEntrar.setBounds(117, 451, 133, 38);
		frame.getContentPane().add(btnEntrar);

		txtSenha = new JPasswordField();
		txtSenha.setForeground(Color.BLACK);
		txtSenha.setBounds(117, 409, 287, 30);
		frame.getContentPane().add(txtSenha);

		JLabel lblNewLabel = new JLabel("New label");

		lblNewLabel.setIcon(new ImageIcon(TelaLogin.class.getResource("/imagem/istockphoto-1032613538-170667a.jpg")));
		lblNewLabel.setBounds(44, 75, 360, 282);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\u00C9 novo por aqui?");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(261, 451, 110, 20);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnCadastro = new JButton("Realizar cadastro");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TelaDeCadastro tc = new TelaDeCadastro();
				tc.setVisible(true);
				dispose();

			}
		});
		btnCadastro.setForeground(Color.RED);
		btnCadastro.setFont(new Font("Arial", Font.BOLD, 12));
		btnCadastro.setBounds(260, 466, 144, 23);
		frame.getContentPane().add(btnCadastro);
	}

	// Corre a lista de médicos para vê se a senha posta no momento do cadastro se
	// encontra por lá.
	public boolean chekLogin(String login, String senha) {
		boolean medicoEncontrado = false;
		for (Medico medico : BancoDao.medicos) {
			// Se login e senha forem iguais, esse método é disparado, permitindo a entrada
			// na tela de trabalho principal.
			if (medico.getNome().equalsIgnoreCase(login) && medico.getSenha().equals(senha)) {
				medicoEncontrado = true;
				break;
			}

		}

		return medicoEncontrado;
	}

}
