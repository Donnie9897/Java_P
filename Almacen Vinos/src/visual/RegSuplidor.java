package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import Logico.Liga;
import logic.Almacen;
import logic.Suministrador;

import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;

public class RegSuplidor extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JComboBox cbxpais;
	private JSpinner spntiempo;
	private Almacen mialma = null;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		try {
			RegSuplidor dialog = new RegSuplidor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
	/**
	 * Create the dialog.
	 */
	public RegSuplidor(Almacen alma) {
		this.mialma = alma;
		setForeground(SystemColor.windowBorder);
		setResizable(false);
		setTitle("Registrar Suplidor");
		setBounds(100, 100, 445, 272);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Registro de informacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblCdigo = new JLabel("C\u00F3digo: ");
			lblCdigo.setBounds(10, 48, 46, 14);
			panel.add(lblCdigo);
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(10, 99, 46, 14);
			panel.add(lblNombre);
			
			txtCodigo = new JTextField();
			txtCodigo.setBounds(55, 45, 98, 20);
			panel.add(txtCodigo);
			txtCodigo.setColumns(10);
			txtCodigo.setText("s-"+mialma.getGeneradorCodigoSupli());
			
			txtNombre = new JTextField();
			txtNombre.setBounds(55, 96, 337, 20);
			panel.add(txtNombre);
			txtNombre.setColumns(10);
			
			JLabel txtPais = new JLabel("Pa\u00EDs:");
			txtPais.setBounds(10, 151, 46, 14);
			panel.add(txtPais);
			
			cbxpais = new JComboBox();
			cbxpais.setModel(new DefaultComboBoxModel(new String[] {"\t-Seleccione-", "Chile ", "Espa\u00F1a", "Suiza"}));
			cbxpais.setBounds(55, 148, 121, 20);
			panel.add(cbxpais);
			
			JLabel lblTiempo = new JLabel("Tiempo:");
			lblTiempo.setBounds(222, 151, 46, 14);
			panel.add(lblTiempo);
			
			spntiempo = new JSpinner();
			spntiempo.setModel(new SpinnerNumberModel(1, 1, 90, 1));
			spntiempo.setBounds(271, 148, 121, 20);
			panel.add(spntiempo);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String pais;
						int tiempoEntrega;
						Suministrador aux = new Suministrador(txtCodigo.getText(), txtNombre.getText(), cbxpais.getSelectedItem().toString(), Integer.valueOf(spntiempo.getValue().toString()));
						mialma.insertarSuministrador(aux);
						JOptionPane.showMessageDialog(null, "Operación satisfactoria", "Notificación", JOptionPane.INFORMATION_MESSAGE);
					    clean();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	private void clean() {
		cbxpais.setSelectedIndex(0);
		spntiempo.setValue(Integer.valueOf("1"));
		txtNombre.setText("");
		txtCodigo.setText("s-"+mialma.getGeneradorCodigoSupli());
		
	}
	/*
	private void limpiar(){
		cbxPosicion.setSelectedIndex(0);
		spnEdad.setValue(Short.valueOf("18"));
		txtNombre.setText("");
		txtId.setText(" "+Liga.getInstance().getMisJugadores().size()+1);
		
	}
	*/
}
