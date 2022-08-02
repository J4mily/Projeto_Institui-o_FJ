package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import repository.BancoDao;

public class TelaAgenda extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel TelaTraz;
	private JTextField txtLembrete;
	private BancoDao pDao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAgenda frame = new TelaAgenda();
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
	public TelaAgenda() {

		pDao = new BancoDao();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 550);
		TelaTraz = new JPanel();
		TelaTraz.setBackground(SystemColor.activeCaption);
		TelaTraz.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(TelaTraz);
		TelaTraz.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 5, 704, 60);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		TelaTraz.add(panel);
		panel.setLayout(null);

		JLabel lblAgenda = new JLabel("AGENDA");
		lblAgenda.setBounds(248, 11, 129, 36);
		lblAgenda.setHorizontalAlignment(SwingConstants.LEFT);
		lblAgenda.setForeground(Color.BLACK);
		lblAgenda.setFont(new Font("Arial", Font.BOLD, 30));
		panel.add(lblAgenda);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(162, -8, 76, 72);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(TelaAgenda.class.getResource("/imagem/calendar-icon.png")));

		JTree tree_1 = new JTree();
		tree_1.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("3/12 de 2022") {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				DefaultMutableTreeNode node_1;
				node_1 = new DefaultMutableTreeNode("JANEIR0");
				node_1.add(new DefaultMutableTreeNode("12/01"));
				node_1.add(new DefaultMutableTreeNode("20/01"));
				node_1.add(new DefaultMutableTreeNode("26/01"));
				node_1.add(new DefaultMutableTreeNode("30/01"));
				add(node_1);
				node_1 = new DefaultMutableTreeNode("FEVEREIRO");
				node_1.add(new DefaultMutableTreeNode("03/02"));
				node_1.add(new DefaultMutableTreeNode("17/02"));
				node_1.add(new DefaultMutableTreeNode("20/02"));
				node_1.add(new DefaultMutableTreeNode("27/02"));
				add(node_1);
				node_1 = new DefaultMutableTreeNode("MAR\u00C7O");
				node_1.add(new DefaultMutableTreeNode("10/03"));
				node_1.add(new DefaultMutableTreeNode("20/03"));
				node_1.add(new DefaultMutableTreeNode("23/02"));
				node_1.add(new DefaultMutableTreeNode("28/03"));
				add(node_1);
			}
		}));
		tree_1.setShowsRootHandles(true);
		tree_1.setFont(new Font("Arial", Font.BOLD, 16));
		tree_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		tree_1.setBounds(10, 79, 161, 342);
		TelaTraz.add(tree_1);

		JTree tree_1_1 = new JTree();
		tree_1_1.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("6/12 de 2022") {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				DefaultMutableTreeNode node_1;
				node_1 = new DefaultMutableTreeNode("ABRIL");
				node_1.add(new DefaultMutableTreeNode("02/04"));
				node_1.add(new DefaultMutableTreeNode("05/04"));
				node_1.add(new DefaultMutableTreeNode("20/04"));
				node_1.add(new DefaultMutableTreeNode("23/04"));
				add(node_1);
				node_1 = new DefaultMutableTreeNode("MAIO");
				node_1.add(new DefaultMutableTreeNode("04/05"));
				node_1.add(new DefaultMutableTreeNode("18/05"));
				node_1.add(new DefaultMutableTreeNode("20/05"));
				node_1.add(new DefaultMutableTreeNode("30/05"));
				add(node_1);
				node_1 = new DefaultMutableTreeNode("JUNHO");
				node_1.add(new DefaultMutableTreeNode("10/06"));
				node_1.add(new DefaultMutableTreeNode("11/06"));
				node_1.add(new DefaultMutableTreeNode("20/06"));
				node_1.add(new DefaultMutableTreeNode("27/06"));
				add(node_1);
			}
		}));
		tree_1_1.setShowsRootHandles(true);
		tree_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		tree_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		tree_1_1.setBounds(189, 79, 161, 342);
		TelaTraz.add(tree_1_1);

		JTree tree_1_2 = new JTree();
		tree_1_2.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("9/12 de 2022") {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				DefaultMutableTreeNode node_1;
				node_1 = new DefaultMutableTreeNode("JULHO");
				node_1.add(new DefaultMutableTreeNode("06/07"));
				node_1.add(new DefaultMutableTreeNode("20/07"));
				node_1.add(new DefaultMutableTreeNode("-----"));
				node_1.add(new DefaultMutableTreeNode("-----"));
				add(node_1);
				node_1 = new DefaultMutableTreeNode("AGOSTO");
				node_1.add(new DefaultMutableTreeNode("-----"));
				node_1.add(new DefaultMutableTreeNode("20/08"));
				node_1.add(new DefaultMutableTreeNode("-----"));
				node_1.add(new DefaultMutableTreeNode("-----"));
				add(node_1);
				node_1 = new DefaultMutableTreeNode("SETEMBRO");
				node_1.add(new DefaultMutableTreeNode("-----"));
				node_1.add(new DefaultMutableTreeNode("20/09"));
				node_1.add(new DefaultMutableTreeNode("-----"));
				node_1.add(new DefaultMutableTreeNode("-----"));
				add(node_1);
			}
		}));
		tree_1_2.setShowsRootHandles(true);
		tree_1_2.setFont(new Font("Arial", Font.BOLD, 16));
		tree_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		tree_1_2.setBounds(370, 79, 161, 342);
		TelaTraz.add(tree_1_2);

		JTree tree_1_2_1 = new JTree();
		tree_1_2_1.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("12/12 DE 2022") {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				DefaultMutableTreeNode node_1;
				node_1 = new DefaultMutableTreeNode("OUTUBRO");
				node_1.add(new DefaultMutableTreeNode("-----"));
				node_1.add(new DefaultMutableTreeNode("20/10"));
				node_1.add(new DefaultMutableTreeNode("-----"));
				node_1.add(new DefaultMutableTreeNode("-----"));
				add(node_1);
				node_1 = new DefaultMutableTreeNode("NOVEMBRO");
				node_1.add(new DefaultMutableTreeNode("-----"));
				node_1.add(new DefaultMutableTreeNode("20/11"));
				node_1.add(new DefaultMutableTreeNode("-----"));
				node_1.add(new DefaultMutableTreeNode("-----"));
				add(node_1);
				node_1 = new DefaultMutableTreeNode("DEZEMBRO");
				node_1.add(new DefaultMutableTreeNode("-----"));
				node_1.add(new DefaultMutableTreeNode("20/12"));
				node_1.add(new DefaultMutableTreeNode("-----"));
				node_1.add(new DefaultMutableTreeNode("-----"));
				add(node_1);
			}
		}));
		tree_1_2_1.setShowsRootHandles(true);
		tree_1_2_1.setFont(new Font("Arial", Font.BOLD, 16));
		tree_1_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		tree_1_2_1.setBounds(553, 76, 161, 342);
		TelaTraz.add(tree_1_2_1);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(608, 459, 106, 41);
		TelaTraz.add(btnVoltar);
		btnVoltar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				TelaDeTrabalho tb = new TelaDeTrabalho();
				tb.setVisible(true);
				dispose();

				TelaDeTrabalho.atualizaListaPacientes();
				TelaDeTrabalho.AtualizarlistarEnfermeiro();
				TelaDeTrabalho.AtualizarLembrete();
			}
		});
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 19));

		txtLembrete = new JTextField();
		txtLembrete.setForeground(Color.BLACK);
		txtLembrete.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 19));
		txtLembrete.setBounds(10, 466, 456, 33);
		TelaTraz.add(txtLembrete);
		txtLembrete.setColumns(10);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String lembrete = txtLembrete.getText();
				String retorno = pDao.adicionalembrete(lembrete);
				if (retorno.contains("lembrete adicionado")) {
					JOptionPane.showMessageDialog(null, retorno, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, retorno, "ERRO", JOptionPane.ERROR_MESSAGE);
				}
				txtLembrete.setText(" ");// aqui é pra limpar os pacientes
				listarLembretes();// aqui lista os pacientes inseridos.
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 19));
		btnNewButton.setBounds(467, 466, 81, 33);
		TelaTraz.add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("Adicionar lembrete:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 441, 236, 26);
		TelaTraz.add(lblNewLabel_1);

	}

	private void listarLembretes() {
		List<String> lembretes = pDao.consultaLembretes();
		String concatencacao = "";
		for (int i = 0; i < lembretes.size(); i++) {
			String linha = " > " + lembretes.get(i) + "\n";
			concatencacao = concatencacao + linha;
		}
		txtLembrete.setText(concatencacao);
	}

}
