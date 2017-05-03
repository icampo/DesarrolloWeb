
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PlantacionesUIEdit extends JFrame {

	private JPanel contentPane;
	private JTextField txtFechaPlant;
	private JSpinner txtPlantada;
	private JTextField txtFechaReco;
	private JTextField txtEspecie;
	private JTextField txtParcela;
	private IGestorPlantaciones gp;
	private PlantacionesUI frmPrincipal;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public PlantacionesUIEdit(PlantacionesUI frmPrincipal, IGestorPlantaciones gp) {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		this.frmPrincipal=frmPrincipal;
		this.gp=gp;
		setTitle("Nueva Plantacion");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 268, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFechaPlantacion = new JLabel("Fecha Plantaci\u00F3n");
		lblFechaPlantacion.setBounds(17, 67, 100, 14);
		contentPane.add(lblFechaPlantacion);
		
		txtFechaPlant = new JTextField();
		txtFechaPlant.setBounds(17, 92, 100, 20);
		contentPane.add(txtFechaPlant);
		txtFechaPlant.setColumns(10);
		
		JLabel lblCantidadPlantada = new JLabel("Cantidad Plantada");
		lblCantidadPlantada.setBounds(127, 67, 115, 14);
		contentPane.add(lblCantidadPlantada);
		
		txtPlantada = new JSpinner();
		txtPlantada.setBounds(127, 92, 100, 20);
		contentPane.add(txtPlantada);
		
		JLabel lblFechaRecogida = new JLabel("Fecha Recogida");
		lblFechaRecogida.setBounds(17, 123, 100, 14);
		contentPane.add(lblFechaRecogida);
		
		txtFechaReco = new JTextField();
		txtFechaReco.setBounds(17, 148, 100, 20);
		contentPane.add(txtFechaReco);
		txtFechaReco.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnAceptar();
			}
		});
		
		btnAceptar.setBounds(17, 184, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(116, 184, 89, 23);
		
		contentPane.add(btnCancelar);
		
		JLabel lblEspecie = new JLabel("Especie");
		lblEspecie.setBounds(127, 11, 100, 14);
		contentPane.add(lblEspecie);
		
		txtEspecie = new JTextField();
		txtEspecie.setColumns(10);
		txtEspecie.setBounds(127, 36, 100, 20);
		contentPane.add(txtEspecie);
		
		JLabel lblParcela = new JLabel("Parcela");
		lblParcela.setBounds(17, 11, 100, 14);
		contentPane.add(lblParcela);
		
		txtParcela = new JTextField();
		txtParcela.setColumns(10);
		txtParcela.setBounds(17, 36, 100, 20);
		contentPane.add(txtParcela);
	}
	public void btnAceptar(){
		Date fechaPlant = null;
		Date fechaReco = null;
		try {
			fechaPlant = sdf.parse(txtFechaPlant.getText());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fechaReco = sdf.parse(txtFechaReco.getText());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String especie = txtEspecie.getText();
		int cantidadPlan = Integer.parseInt(txtPlantada.getValue().toString());
		int parcela = Integer.parseInt(txtParcela.getText());
			
		Plantacion p = new Plantacion(parcela, fechaPlant, fechaReco, especie, cantidadPlan);
		
		gp.plantar(p);
		
		frmPrincipal.actualizarListado(gp.getPlantaciones());
		
		JOptionPane.showMessageDialog(this, "Se ha añadido correctamente");
		this.dispose();
	}
}
