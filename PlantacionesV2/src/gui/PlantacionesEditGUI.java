package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.GestorPlantaciones;
import model.Plantacion;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class PlantacionesEditGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textParcela;
	private JTextField textCantPlant;
	private JTextField textFechaRecog;
	private JTextField textEspecie;
	private JTextField textFechaPlant;
	private PlantacionesUI frmPrincipal;
	private GestorPlantaciones gp;
	private SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	
	
	/**
	 * Create the frame.
	 */
	public PlantacionesEditGUI(PlantacionesUI frmPrincipal,GestorPlantaciones gp) {
		this.frmPrincipal=frmPrincipal;
		// Asignar el mismo gestor
		this.gp=gp;
		setTitle("Plantaciones.BETAv.0.0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 287, 278);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFechaPlantacion = new JLabel("Fecha Plantacion:");
		lblFechaPlantacion.setBounds(10, 11, 96, 14);
		contentPane.add(lblFechaPlantacion);
		
		textParcela = new JTextField();
		textParcela.setBounds(142, 36, 117, 20);
		contentPane.add(textParcela);
		textParcela.setColumns(10);
		
		JLabel lblCantidadPlantada = new JLabel("Cantidad Plantada:");
		lblCantidadPlantada.setBounds(10, 67, 119, 14);
		contentPane.add(lblCantidadPlantada);
		
		textCantPlant = new JTextField();
		textCantPlant.setBounds(12, 90, 115, 20);
		contentPane.add(textCantPlant);
		textCantPlant.setColumns(10);
		
		JLabel lblFechaRecogida = new JLabel("Fecha Recogida:");
		lblFechaRecogida.setBounds(12, 121, 115, 14);
		contentPane.add(lblFechaRecogida);
		
		textFechaRecog = new JTextField();
		textFechaRecog.setBounds(12, 144, 115, 20);
		contentPane.add(textFechaRecog);
		textFechaRecog.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAceptarClick();
			}
		});
		btnAceptar.setBounds(10, 208, 83, 23);
		contentPane.add(btnAceptar);
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCancelar.setBounds(103, 208, 102, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblParcela = new JLabel("Parcela:");
		lblParcela.setBounds(142, 11, 63, 14);
		contentPane.add(lblParcela);
		
		JLabel lblEspecie = new JLabel("Especie:");
		lblEspecie.setBounds(142, 67, 63, 14);
		contentPane.add(lblEspecie);
		
		textEspecie = new JTextField();
		textEspecie.setBounds(142, 90, 117, 20);
		contentPane.add(textEspecie);
		textEspecie.setColumns(10);
		
		textFechaPlant = new JTextField();
		textFechaPlant.setColumns(10);
		textFechaPlant.setBounds(10, 36, 115, 20);
		contentPane.add(textFechaPlant);
		// Pedir las platnaciones
		contentPane.add(lblFechaPlantacion);
	}
	
	private void btnAceptarClick(){
		// leer los datos introducidos por el usuario
		// Leer parcela
		int parcela=Integer.parseInt(textParcela.getText());
		// Leer fecha plantacion
		Date fechaPlan=null;
		Date fechaRec=null;
		try {
			fechaPlan=sdf.parse(textFechaPlant.getText());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Leer fecha recogida
		try {
			fechaRec=sdf.parse(textFechaRecog.getText());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// leer especie
		String especie=textEspecie.getText();
		// Leer cantidad plantada
		int cantPlant=Integer.parseInt(textCantPlant.getText());
		// crear una plantaciones con los datos
		Plantacion p=new Plantacion(parcela,fechaPlan,fechaRec,especie,cantPlant);
		// decir al gesto de plantacion que añada la plantacion
		gp.plantar(p);
		// Actualizar la lista de la ventana principal
		frmPrincipal.actualizarListado(gp.getPlantaciones());
		// descargar la ventana 
		this.dispose();
	}
	
}
