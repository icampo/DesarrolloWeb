package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import gui.PlantacionesEditGUI;
import model.GestorPlantaciones;
import model.Plantacion;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class PlantacionesUI extends JFrame {

	private JPanel contentPane;
	private JTextField textParcela;
	private JTextField textCantPlant;
	private JTextField textFechaRecog;
	private JTextField textCantRecog;
	private JTextField textEspecie;
	private GestorPlantaciones gp=new GestorPlantaciones();
	private JTextField textFechaPlant;
	private JList listPlantaciones;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlantacionesUI frame = new PlantacionesUI();
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
	public PlantacionesUI() {
		setTitle("Plantaciones.BETAv.0.0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListado = new JLabel("Listado:");
		lblListado.setBounds(10, 11, 46, 14);
		contentPane.add(lblListado);
		
		JLabel lblFechaPlantacion = new JLabel("Fecha Plantacion:");
		lblFechaPlantacion.setBounds(177, 11, 115, 14);
		contentPane.add(lblFechaPlantacion);
		
		textParcela = new JTextField();
		textParcela.setBounds(309, 36, 117, 20);
		contentPane.add(textParcela);
		textParcela.setColumns(10);
		
		JLabel lblCantidadPlantada = new JLabel("Cantidad Plantada:");
		lblCantidadPlantada.setBounds(177, 67, 119, 14);
		contentPane.add(lblCantidadPlantada);
		
		textCantPlant = new JTextField();
		textCantPlant.setBounds(179, 90, 115, 20);
		contentPane.add(textCantPlant);
		textCantPlant.setColumns(10);
		
		JLabel lblFechaRecogida = new JLabel("Fecha Recogida:");
		lblFechaRecogida.setBounds(179, 121, 115, 14);
		contentPane.add(lblFechaRecogida);
		
		textFechaRecog = new JTextField();
		textFechaRecog.setBounds(179, 144, 115, 20);
		contentPane.add(textFechaRecog);
		textFechaRecog.setColumns(10);
		
		JLabel lblCantidadRecogida = new JLabel("Cantidad Recogida:");
		lblCantidadRecogida.setBounds(179, 175, 115, 14);
		contentPane.add(lblCantidadRecogida);
		
		textCantRecog = new JTextField();
		textCantRecog.setBounds(179, 200, 115, 20);
		contentPane.add(textCantRecog);
		textCantRecog.setColumns(10);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNuevoClick();
			}
		});
		btnNuevo.setBounds(10, 246, 84, 23);
		contentPane.add(btnNuevo);
		
		JButton btnRecolectar = new JButton("Recolectar");
		btnRecolectar.setBounds(104, 246, 110, 23);
		contentPane.add(btnRecolectar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(224, 246, 72, 23);
		contentPane.add(btnSalir);
		
		JLabel lblParcela = new JLabel("Parcela:");
		lblParcela.setBounds(309, 11, 117, 14);
		contentPane.add(lblParcela);
		
		JLabel lblEspecie = new JLabel("Especie:");
		lblEspecie.setBounds(309, 67, 117, 14);
		contentPane.add(lblEspecie);
		
		textEspecie = new JTextField();
		textEspecie.setBounds(309, 90, 117, 20);
		contentPane.add(textEspecie);
		textEspecie.setColumns(10);
		
		textFechaPlant = new JTextField();
		textFechaPlant.setColumns(10);
		textFechaPlant.setBounds(177, 36, 115, 20);
		contentPane.add(textFechaPlant);
		
		JList listPlantaciones = new JList();
		listPlantaciones.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent arg0){
				if(arg0.getValueIsAdjusting()){
					mostrarDatos(listPlantaciones.getSelectedValue());
				}
				System.out.println(listPlantaciones.getSelectedValue());
			}
		});
		listPlantaciones.setBounds(10, 36, 157, 184);
		contentPane.add(listPlantaciones);
		// Pedir las plantaciones
		actualizarListado(gp.getPlantaciones());
		
	}
	
	private void btnNuevoClick(){
		PlantacionesEditGUI frmPlantEdit=new PlantacionesEditGUI(this,gp);
		frmPlantEdit.setVisible(true);
	}
	
	// mostrar los datos del array list
	public void actualizarListado(ArrayList<Plantacion> lstPlantas){
		DefaultListModel dlm=new DefaultListModel<Plantacion>();
		//añadir las plantaciones pasadas como parametro en el arraylist 
		for(Plantacion p:lstPlantas){
			dlm.addElement(p);
		}
		// pasar el modelo al Jlist
		listPlantaciones.setModel(dlm);
	}
	
	// Cargar la informacion en las cajas de texto
	
	private void mostrarDatos(Plantacion p){
		
	}
	 
}
