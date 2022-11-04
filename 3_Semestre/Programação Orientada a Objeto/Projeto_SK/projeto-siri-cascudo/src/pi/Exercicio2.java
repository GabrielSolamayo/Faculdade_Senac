package pi;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exercicio2 extends JFrame implements ActionListener, ItemListener {

	public static void main(String[] args) {
		new Exercicio2();
	}
	
	JButton proximaPag;
	JButton btOk, btCancelar;
	JTextField campoNome, campoEndereco, campoCpf, campoRg, campoTelefone;
	JLabel j1, j2, j3, j4, j5;
	JComboBox cidade, ufs;

	public Exercicio2() {
		setTitle("Exercicio2");
		setSize(400, 300);
		GridLayout layout = new GridLayout(7, 2, 5, 5);
		getContentPane().setLayout(layout);
		String[] cidades = { "", "São Paulo", "Osasco", "Campinas", "Barueiri", "São jose dos campos" };
		String[] uf = { "", "SP", "OS", "CP", "BR", "JC" };

		j1 = criarRotulo("Nome");
		campoNome = caixaDeTexto();

		j2 = criarRotulo("Cidade");
		cidade = criarBomboBox(cidades);

		j3 = criarRotulo("Uf");
		ufs = criarBomboBox(uf);

		j4 = criarRotulo("Cpf");
		campoCpf = caixaDeTexto();

		j5 = criarRotulo("Rg");
		campoRg = caixaDeTexto();

		btOk = criarBotao("Ok");
		btCancelar = criarBotao("Cancelar");
		proximaPag = criarBotao("Avançar");

		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private JComboBox criarBomboBox(String[] msg) {
		JComboBox box = new JComboBox(msg);
		box.addItemListener(this);
		add(box);
		return box;
	}

	private JButton criarBotao(String msg) {
		JButton botao = new JButton(msg);
		botao.addActionListener(this);
		add(botao);

		return botao;
	}

	private JTextField caixaDeTexto() {
		JTextField texto = new JTextField("", 40);
		texto.toString().toUpperCase();
		texto.setFont(new Font("Courier new".toUpperCase(), Font.BOLD, 18));
		add(texto);
		return texto;
	}

	private JLabel criarRotulo(String msg) {
		JLabel label = new JLabel(msg);
		label.setFont(new Font("Courier new", Font.BOLD, 18));
		label.setForeground(Color.blue);
		add(label);
		return label;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btOk) {
			int resp = JOptionPane.showConfirmDialog(null, "Confirmar gravação?");

			if (resp == 0) {
				pegarInformacoes();
				limparDados();
			}

		} else if (e.getSource() == btCancelar) {
			int cancelar = JOptionPane.showConfirmDialog(null, "Realmente deseja cancelar?");

			if (cancelar == 0) {
				System.exit(0);
			}
		}
		
		if(e.getSource() == proximaPag) {
			
			JOptionPane.showMessageDialog(null, "Essa tentativa falhou");
		}
	}

	private void pegarInformacoes() {
	
		JOptionPane.showMessageDialog(null, "Nome: " + campoNome.getText().toUpperCase() //
				+ "\nCidade: " + cidade.getSelectedItem().toString().toUpperCase()//
				+ "\nUf: " + ufs.getSelectedItem().toString().toUpperCase() //
				+ "\nCpf: " + campoCpf.getText().toUpperCase() //
				+ "\nRg: " + campoRg.getText().toUpperCase());

	}

	public void limparDados() {
		campoNome.setText("");
		String[] t = { "" };
		cidade.setSelectedItem("");
		ufs.setSelectedItem("");
		campoCpf.setText("");
		campoRg.setText("");

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	}
}
