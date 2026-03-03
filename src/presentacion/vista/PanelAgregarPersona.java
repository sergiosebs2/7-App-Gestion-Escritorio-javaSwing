package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.JTextField;
import javax.swing.BorderFactory;

public class PanelAgregarPersona extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;
	private JButton btnAceptar;
	private JButton btnVolverInicio;

	public PanelAgregarPersona() {

		setBackground(new Color(245, 245, 250));
		setPreferredSize(new Dimension(450, 350));
		setMinimumSize(new Dimension(450, 350));

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{30, 120, 200, 30};
		gridBagLayout.rowHeights = new int[]{40, 40, 40, 40, 40, 40, 40, 40};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
		setLayout(gridBagLayout);

		// Título
		JLabel lblTitulo = new JLabel("Agregar Persona");
		lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblTitulo.setForeground(new Color(25, 25, 112));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.gridwidth = 2;
		gbc_lblTitulo.insets = new Insets(20, 0, 30, 0);
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 0;
		gbc_lblTitulo.anchor = GridBagConstraints.CENTER;
		add(lblTitulo, gbc_lblTitulo);

		// Nombre
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNombre.setForeground(new Color(30, 30, 30));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 10, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		add(lblNombre, gbc_lblNombre);

		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtNombre.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(new Color(180, 180, 200)),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));

		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.weightx = 1.0;
		gbc_txtNombre.insets = new Insets(0, 0, 10, 0);
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 1;
		add(txtNombre, gbc_txtNombre);

		// Apellido
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblApellido.setForeground(new Color(30, 30, 30));
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.anchor = GridBagConstraints.EAST;
		gbc_lblApellido.insets = new Insets(0, 0, 10, 5);
		gbc_lblApellido.gridx = 1;
		gbc_lblApellido.gridy = 3;
		add(lblApellido, gbc_lblApellido);

		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtApellido.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(new Color(180, 180, 200)),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));

		GridBagConstraints gbc_txtApellido = new GridBagConstraints();
		gbc_txtApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellido.weightx = 1.0;
		gbc_txtApellido.insets = new Insets(0, 0, 10, 0);
		gbc_txtApellido.gridx = 2;
		gbc_txtApellido.gridy = 3;
		add(txtApellido, gbc_txtApellido);

		// DNI
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblDni.setForeground(new Color(30, 30, 30));
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.anchor = GridBagConstraints.EAST;
		gbc_lblDni.insets = new Insets(0, 0, 10, 5);
		gbc_lblDni.gridx = 1;
		gbc_lblDni.gridy = 5;
		add(lblDni, gbc_lblDni);

		txtDni = new JTextField();
		txtDni.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtDni.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(new Color(180, 180, 200)),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));

		GridBagConstraints gbc_txtDni = new GridBagConstraints();
		gbc_txtDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDni.weightx = 1.0;
		gbc_txtDni.insets = new Insets(0, 0, 10, 0);
		gbc_txtDni.gridx = 2;
		gbc_txtDni.gridy = 5;
		add(txtDni, gbc_txtDni);

		JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
		botonesPanel.setOpaque(false);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnAceptar.setBackground(new Color(70, 130, 180));
		btnAceptar.setForeground(Color.WHITE);
		btnAceptar.setFocusPainted(false);
		btnAceptar.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));

		btnVolverInicio = new JButton("Volver a Inicio");
		btnVolverInicio.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnVolverInicio.setBackground(new Color(220, 53, 69));
		btnVolverInicio.setForeground(Color.WHITE);
		btnVolverInicio.setFocusPainted(false);
		btnVolverInicio.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));

		botonesPanel.add(btnAceptar);
		botonesPanel.add(btnVolverInicio);

		GridBagConstraints gbc_botones = new GridBagConstraints();
		gbc_botones.gridx = 1;
		gbc_botones.gridy = 6;
		gbc_botones.gridwidth = 2;
		gbc_botones.insets = new Insets(20, 0, 20, 0);
		gbc_botones.anchor = GridBagConstraints.CENTER;
		add(botonesPanel, gbc_botones);

	}

	// Getters
	public JButton getBtnAceptar() { return btnAceptar; }
	public JButton getBtnVolverInicio() { return btnVolverInicio; }
	public JTextField getTxtNombre() { return txtNombre; }
	public JTextField getTxtApellido() { return txtApellido; }
	public JTextField getTxtDNI() { return txtDni; }
}
