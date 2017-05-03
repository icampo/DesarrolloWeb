
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PlantacionesUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtFechaPlant;
	private JTextField txtPlantada;
	private JTextField txtFechaReco;
	private JTextField txtReco;
	private JTextField txtEspecie;
	private JTextField txtParcela;
	private JList lstPlantaciones;
	private IGestorPlantaciones gp = new GestorPlantacionesBBDD();
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	private static final String ARCHIVO = ".\\plantaciones.txt";

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
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				preguntarSalir();
			}
		});
		setTitle("Plantaciones.BETAv.0.0.2");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 480, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// JList lstPlantaciones = new JList(gp.getPlantaciones().toArray());
		lstPlantaciones = new JList();
		lstPlantaciones.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				if (arg0.getValueIsAdjusting()) {
					mostrarDatos((Plantacion) lstPlantaciones.getSelectedValue());
					System.out.println(lstPlantaciones.getSelectedValue());
				}
			}
		});
		lstPlantaciones.setBounds(10, 36, 147, 132);
		actualizarListado(gp.getPlantaciones());
		contentPane.add(lstPlantaciones);

		JLabel lblPlantaciones = new JLabel("Plantaciones:");
		lblPlantaciones.setBounds(10, 11, 87, 14);
		contentPane.add(lblPlantaciones);

		JLabel lblFechaPlantacion = new JLabel("Fecha Plantaci\u00F3n");
		lblFechaPlantacion.setBounds(167, 11, 140, 14);
		contentPane.add(lblFechaPlantacion);

		txtFechaPlant = new JTextField();
		txtFechaPlant.setBounds(167, 36, 140, 20);
		contentPane.add(txtFechaPlant);
		txtFechaPlant.setColumns(10);

		JLabel lblCantidadPlantada = new JLabel("Cantidad Plantada");
		lblCantidadPlantada.setBounds(167, 67, 140, 14);
		contentPane.add(lblCantidadPlantada);

		txtPlantada = new JTextField();
		txtPlantada.setBounds(167, 92, 140, 20);
		contentPane.add(txtPlantada);
		txtPlantada.setColumns(10);

		JLabel lblFechaRecogida = new JLabel("Fecha Recogida");
		lblFechaRecogida.setBounds(167, 123, 140, 14);
		contentPane.add(lblFechaRecogida);

		txtFechaReco = new JTextField();
		txtFechaReco.setBounds(167, 148, 140, 20);
		contentPane.add(txtFechaReco);
		txtFechaReco.setColumns(10);

		JLabel lblCantidadRecogida = new JLabel("Cantidad Recogida");
		lblCantidadRecogida.setBounds(317, 123, 140, 14);
		contentPane.add(lblCantidadRecogida);

		txtReco = new JTextField();
		txtReco.setBounds(317, 148, 140, 20);
		contentPane.add(txtReco);
		txtReco.setColumns(10);

		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNuevo();
			}
		});
		btnNuevo.setBounds(10, 179, 95, 23);
		contentPane.add(btnNuevo);

		JButton btnRecolectar = new JButton("Recolectar");
		btnRecolectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnRecolectar();
			}
		});
		btnRecolectar.setBounds(115, 179, 96, 23);
		contentPane.add(btnRecolectar);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preguntarSalir();
			}
		});
		btnSalir.setBounds(317, 179, 89, 23);
		contentPane.add(btnSalir);

		JLabel lblEspecie = new JLabel("Especie");
		lblEspecie.setBounds(317, 11, 140, 14);
		contentPane.add(lblEspecie);

		txtEspecie = new JTextField();
		txtEspecie.setColumns(10);
		txtEspecie.setBounds(317, 36, 140, 20);
		contentPane.add(txtEspecie);

		JLabel lblParcela = new JLabel("Parcela");
		lblParcela.setBounds(317, 67, 100, 14);
		contentPane.add(lblParcela);

		txtParcela = new JTextField();
		txtParcela.setColumns(10);
		txtParcela.setBounds(317, 92, 140, 20);
		contentPane.add(txtParcela);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEliminar((Plantacion) lstPlantaciones.getSelectedValue());
			}
		});
		btnEliminar.setBounds(218, 179, 89, 23);
		contentPane.add(btnEliminar);
	}

	private void btnEliminar(Plantacion p) {
		if (lstPlantaciones.getSelectedIndex() >= 0) {
		preguntarBorrar(p);
		}
	}

	private void btnNuevo() {
		PlantacionesUIEdit frmPlanEdit = new PlantacionesUIEdit(this, gp);
		frmPlanEdit.setVisible(true);
	}

	private void btnRecolectar() {
		if (lstPlantaciones.getSelectedIndex() >= 0) {
			RecolectarUI Recolectar = new RecolectarUI(this, gp, (Plantacion) lstPlantaciones.getSelectedValue());
			Recolectar.setVisible(true);
		}
	}

	public void actualizarListado(ArrayList<Plantacion> lstPlantas) {
		DefaultListModel<Plantacion> dlm = new DefaultListModel<Plantacion>();
		for (Plantacion p : lstPlantas) {
			dlm.addElement(p);
		}
		lstPlantaciones.setModel(dlm);
	}

	public void mostrarDatos(Plantacion p) {
		txtParcela.setText(Integer.toString(p.getParcela()));
		txtFechaPlant.setText(sdf.format(p.getFechaPlan()));
		txtFechaReco.setText(sdf.format(p.getFechaRec()));
		txtEspecie.setText(p.getEspecie());
		txtPlantada.setText(Integer.toString(p.getCantPlant()));
		txtReco.setText(Integer.toString(p.getCantRec()));
	}
	
	public void borrarDatos(Plantacion p){
		txtParcela.setText("");
		txtFechaPlant.setText("");
		txtFechaReco.setText("");
		txtEspecie.setText("");
		txtPlantada.setText("");
		txtReco.setText("");
	}
	
	public void preguntarBorrar(Plantacion p){
		int borrar = JOptionPane.showOptionDialog(null, "Deseea borrar la parcela seleccionada?", "Borrar Parcela",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE, null, null, null);
	      if (borrar==JOptionPane.YES_OPTION){
	    	gp.borrarPlantacion(p);
	  		actualizarListado(gp.getPlantaciones());
	  		borrarDatos(p);
	      }
	}
	
	public void preguntarSalir(){
		int salir = JOptionPane.showOptionDialog(null, "Deseea salir del programa", "Cerrar sesion",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE, null, null, null);
	      if (salir==JOptionPane.YES_OPTION){
	    	  System.exit(0);
	      }
	}

}
