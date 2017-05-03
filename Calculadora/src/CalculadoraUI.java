import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalculadoraUI extends JFrame implements ActionListener{

	private JPanel contentPane;
	private int optionType;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;
	private JCheckBox checkPositivo;
	private JCheckBox checkNegativo;
	private JCheckBox checkNeutro;
	private JTextArea txtrHistorial;
	private JRadioButton radioSuma;
	private JRadioButton radioResta;
	private JRadioButton radioMulti;
	private JRadioButton radioDiv;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private int contHistorial=0;
	private JComboBox combo1;
	 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraUI frame = new CalculadoraUI();
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
	public CalculadoraUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				preguntaSalir();
			}
		});
		setTitle("Calculadora_Beta.v0.0.3");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 395, 272);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOperaciones = new JMenu("Operaciones");
		menuBar.add(mnOperaciones);
		
		JMenuItem mntmSuma = new JMenuItem("Suma");
		mntmSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcularResultado("+");
			}
		});
		mnOperaciones.add(mntmSuma);
		
		JMenuItem mntmResta = new JMenuItem("Resta");
		mntmResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
			calcularResultado("-");
			}
		});
		mnOperaciones.add(mntmResta);
		
		JMenuItem mntmMultiplicar = new JMenuItem("Multiplicar");
		mntmMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularResultado("*");
			}
		});
		mnOperaciones.add(mntmMultiplicar);
		
		JMenuItem mntmDividir = new JMenuItem("Dividir");
		mntmDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularResultado("/");
			}
		});
		mnOperaciones.add(mntmDividir);
		
		JMenu mnOtros = new JMenu("Otros");
		mnOperaciones.add(mnOtros);
		
		JMenuItem mntmBorrar = new JMenuItem("Borrar");
		mntmBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contHistorial=0;
				combo1.setSelectedItem("Selecciona Operación");
				txtNum1.setText("");
				txtNum2.setText("");
				txtNum3.setText("");
				txtrHistorial.setText("Historial:");
				radioSuma.setSelected(true);
				checkPositivo.setSelected(false);
				checkNegativo.setSelected(false);
				checkNeutro.setSelected(false);
				txtNum1.requestFocus();
			}
		});
		mnOtros.add(mntmBorrar);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			preguntaSalir();
			}
		});
		mnOtros.add(mntmSalir);
		
		JMenuItem menuItem = new JMenuItem("");
		menuBar.add(menuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero = new JLabel("Numero 1:");
		lblNumero.setBounds(10, 23, 71, 14);
		contentPane.add(lblNumero);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(85, 20, 86, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		JLabel lblNumero_1 = new JLabel("Numero 2:");
		lblNumero_1.setBounds(10, 48, 71, 14);
		contentPane.add(lblNumero_1);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(85, 45, 86, 20);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);
		
		JLabel lblNumero_2 = new JLabel("Resultado:");
		lblNumero_2.setBounds(10, 73, 71, 14);
		contentPane.add(lblNumero_2);
		
		txtNum3 = new JTextField();
		txtNum3.setBounds(85, 70, 86, 20);
		contentPane.add(txtNum3);
		txtNum3.setColumns(10);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			calcularResultado("+");
			}
		});
	
		button.setBounds(10, 99, 41, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularResultado("-");
			}
		});
		button_1.setBounds(61, 99, 41, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularResultado("*");
			}
		});
		button_2.setBounds(112, 99, 41, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("/");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularResultado("/");
			}
		});
		button_3.setBounds(163, 99, 41, 23);
		contentPane.add(button_3);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contHistorial=0;
				combo1.setSelectedItem("Selecciona Operación");
				txtNum1.setText("");
				txtNum2.setText("");
				txtNum3.setText("");
				txtrHistorial.setText("Historial:");
				radioSuma.setSelected(true);
				checkPositivo.setSelected(false);
				checkNegativo.setSelected(false);
				checkNeutro.setSelected(false);
				txtNum1.requestFocus();
			}
		});
		btnCe.setBounds(214, 99, 60, 23);
		contentPane.add(btnCe);
		
		checkPositivo = new JCheckBox("Positivo");
		checkPositivo.setBounds(177, 19, 71, 23);
		contentPane.add(checkPositivo);
		
		checkNegativo = new JCheckBox("Negativo");
		checkNegativo.setBounds(177, 44, 86, 23);
		contentPane.add(checkNegativo);
		
		checkNeutro = new JCheckBox("Neutro");
		checkNeutro.setBounds(177, 69, 71, 23);
		contentPane.add(checkNeutro);
		
		txtrHistorial = new JTextArea();
		txtrHistorial.setText("Historial:");
		txtrHistorial.setBounds(284, 18, 84, 212);
		contentPane.add(txtrHistorial);
		
		radioSuma = new JRadioButton("+");
		radioSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			calcularResultado("+");
			}
		});
		buttonGroup.add(radioSuma);
		radioSuma.setBounds(181, 131, 50, 23);
		contentPane.add(radioSuma);
		
		radioResta = new JRadioButton("-");
		buttonGroup.add(radioResta);
		radioResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			calcularResultado("-");
			}
		});
		radioResta.setBounds(233, 131, 41, 23);
		contentPane.add(radioResta);
		
		radioMulti = new JRadioButton("*");
		buttonGroup.add(radioMulti);
		radioMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			calcularResultado("*");
			}
		});
		radioMulti.setBounds(183, 157, 41, 23);
		contentPane.add(radioMulti);
		
		radioDiv = new JRadioButton("/");
		buttonGroup.add(radioDiv);
		radioDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			calcularResultado("/");
			}
		});
		radioDiv.setBounds(233, 157, 41, 23);
		contentPane.add(radioDiv);
		
		 combo1=new JComboBox();
		 combo1.setBounds(10,133,161,19);
		 getContentPane().add(combo1);
		 combo1.addActionListener(this);
		 combo1.addItem("Selecciona Operación");
		 combo1.addItem("+");
		 combo1.addItem("-");
	     combo1.addItem("*");
	     combo1.addItem("/");
	}
	
	private void calcularResultado(String op){
		//
		double num1=0;
		
		// Coger valor 1
		try{
			num1=Integer.parseInt(txtNum1.getText());
		}catch(NumberFormatException nfe){
			 JOptionPane.showMessageDialog(null, "Debes introducir un valor numérico!!!");
			 txtNum1.requestFocus();
			 txtNum1.setSelectionStart(0);
			 return;
		}
		//
		double num2=0;
		// Coger valor 2
		try{
		num2=Integer.parseInt(txtNum2.getText());
		}catch(NumberFormatException nfe){
			 JOptionPane.showMessageDialog(null, "Debes introducir un valor numérico!!!");
			 txtNum2.requestFocus();
			 txtNum2.setSelectionStart(0);
			 return;
		}
		// Obtener ecuacion
		String opcion = null;
		double res=0;
		switch(op){
		case "+":
			res=num1+num2;
			break;
			
		case "-":
			res=num1-num2;
			break;
			
		case "*":
			res=num1*num2;
			break;
			
		case "/":
			res=num1/num2;
			break;
		}
		txtNum3.setText(Double.toString(res));
		contHistorial++;
		if(contHistorial>=13){
			contHistorial=0;
			txtrHistorial.setText("Historial:"+"\r\n"+Double.toString(res));
		}else{
			txtrHistorial.setText(txtrHistorial.getText()+"\r\n"+Double.toString(res));
		}
		txtNum1.requestFocus();
		actualizarCheckBox(res);
	}
	public void actualizarCheckBox(double res){
	checkPositivo.setSelected(false);
	checkNegativo.setSelected(false);
	checkNeutro.setSelected(false);
	if(res>0){
		checkPositivo.setSelected(true);
	}else if(res<0){
		checkNegativo.setSelected(true);
	}else{
		checkNeutro.setSelected(true);
	}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(combo1.getSelectedItem().equals("+")){
			calcularResultado("+");
		}
		else if(combo1.getSelectedItem().equals("-")){
			calcularResultado("-");
		}
		else if(combo1.getSelectedItem().equals("*")){
			calcularResultado("*");
		}
		else if(combo1.getSelectedItem().equals("/")){
			calcularResultado("/");
		}
	}
	private void preguntaSalir(){
		
		int salir = JOptionPane.showOptionDialog(null, "Deseea salir del programa", "Cerrar sesion",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE, null, null, null);
	      if (salir==JOptionPane.YES_OPTION){
	    	  System.exit(0);
	      }
	}
}
