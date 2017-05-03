
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RecolectarUI extends JFrame {

	private JPanel contentPane;
	private JTextField textParcela;
	private JTextField textPlantacion;
	private PlantacionesUI frmPrincipal;
	private IGestorPlantaciones gp;
	private Plantacion p;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

	/**
	 * Create the frame.
	 * @param plantacion 
	 */
	public RecolectarUI(PlantacionesUI frmPrincipal, IGestorPlantaciones gp, Plantacion p) {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		this.frmPrincipal=frmPrincipal;
		this.p=p;
		this.gp=gp;
		setTitle("Recolectar Plantacion");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 399, 144);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblParcela = new JLabel("Parcela");
		lblParcela.setBounds(10, 11, 46, 14);
		contentPane.add(lblParcela);
		
		JLabel lblFechaPlantacion = new JLabel("Fecha recogida");
		lblFechaPlantacion.setBounds(122, 11, 103, 14);
		contentPane.add(lblFechaPlantacion);
		
		
		JLabel lblCantidadRecogida = new JLabel("Cantidad recogida");
		lblCantidadRecogida.setBounds(235, 11, 103, 14);
		contentPane.add(lblCantidadRecogida);		
		
		JSlider textRecogida = new JSlider();
		textRecogida.setBounds(235, 36, 138, 23);
		contentPane.add(textRecogida);
		
		textParcela = new JTextField();
		textParcela.setBounds(10, 36, 103, 20);
		contentPane.add(textParcela);
		textParcela.setColumns(10);
		textParcela.setText(Integer.toString(p.getParcela()));
		
		textPlantacion = new JTextField();
		textPlantacion.setBounds(122, 36, 103, 20);
		contentPane.add(textPlantacion);
		textPlantacion.setColumns(10);
		textPlantacion.setText(sdf.format(p.getFechaPlan()));
		
		
		JButton btnRecolectar = new JButton("Recolectar");
		btnRecolectar.setBounds(10, 74, 103, 23);
		btnRecolectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cantRec=textRecogida.getValue();
				p.setCantRec(cantRec);
				gp.recolectar(p.getParcela(),p.getFechaPlan(), cantRec);
				frmPrincipal.mostrarDatos(p);
				info();
			}
		});
		contentPane.add(btnRecolectar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(122, 74, 89, 23);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnCancelar);
		
		JLabel label = new JLabel("50");
		label.setBounds(298, 61, 21, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel(" 0");
		label_1.setBounds(235, 61, 15, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel(" 100");
		label_2.setBounds(343, 61, 30, 14);
		contentPane.add(label_2);
		
	}
	private void info(){
		JOptionPane.showMessageDialog(this, "Se ha añadido correctamente");
		this.dispose();
	}
}
