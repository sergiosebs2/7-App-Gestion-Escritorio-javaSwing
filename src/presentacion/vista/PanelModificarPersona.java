package presentacion.vista;

import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import entidad.Persona;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class PanelModificarPersona extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDNI;
	DefaultListModel<Persona> dlmPersonas;
	private JList<Persona> jList;

	private JButton btnModificar;
	private JButton btnVolverInicio;

	public PanelModificarPersona() {

		setBackground(new Color(245, 245, 250));

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{10, 1, 1, 1, 10}; // tres columnas iguales para los campos
		gridBagLayout.rowHeights = new int[]{20, 20, 214, 40, 40, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		// Título
		JLabel lblTitulo = new JLabel("Seleccione la persona que desea modificar");
		lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblTitulo.setForeground(new Color(25, 25, 112));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.anchor = GridBagConstraints.WEST;
		gbc_lblTitulo.insets = new Insets(10, 10, 10, 10);
		gbc_lblTitulo.gridwidth = 3;
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 1;
		add(lblTitulo, gbc_lblTitulo);

		// Lista
		jList = new JList<>();
		jList.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		jList.setBorder(BorderFactory.createLineBorder(new Color(180, 180, 200)));
		jList.setSelectionBackground(new Color(70, 130, 180));
		jList.setSelectionForeground(Color.WHITE);

		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.insets = new Insets(0, 10, 10, 10);
		gbc_list.gridwidth = 3;
		gbc_list.gridx = 1;
		gbc_list.gridy = 2;
		add(jList, gbc_list);

		// Campos en la misma fila: Nombre | Apellido | DNI
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtNombre.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(new Color(180, 180, 200)),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.insets = new Insets(0, 10, 10, 5);
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 3;
		add(txtNombre, gbc_txtNombre);

		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtApellido.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(new Color(180, 180, 200)),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		GridBagConstraints gbc_txtApellido = new GridBagConstraints();
		gbc_txtApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellido.insets = new Insets(0, 5, 10, 5);
		gbc_txtApellido.gridx = 2;
		gbc_txtApellido.gridy = 3;
		add(txtApellido, gbc_txtApellido);

		txtDNI = new JTextField();
		txtDNI.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtDNI.setEditable(false);
		txtDNI.setBackground(new Color(230, 230, 235));
		txtDNI.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(new Color(180, 180, 200)),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		GridBagConstraints gbc_txtDNI = new GridBagConstraints();
		gbc_txtDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDNI.insets = new Insets(0, 5, 10, 10);
		gbc_txtDNI.gridx = 3;
		gbc_txtDNI.gridy = 3;
		add(txtDNI, gbc_txtDNI);

		// Panel para los botones centrados
		JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
		panelBotones.setBackground(new Color(245, 245, 250));

		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnModificar.setBackground(new Color(70, 130, 180));
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setFocusPainted(false);
		btnModificar.setBorder(BorderFactory.createEmptyBorder(6, 12, 6, 12));
		panelBotones.add(btnModificar);

		btnVolverInicio = new JButton("Volver a Inicio");
		btnVolverInicio.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnVolverInicio.setBackground(new Color(220, 53, 69));
		btnVolverInicio.setForeground(Color.WHITE);
		btnVolverInicio.setFocusPainted(false);
		btnVolverInicio.setBorder(BorderFactory.createEmptyBorder(6, 12, 6, 12));
		panelBotones.add(btnVolverInicio);

		btnVolverInicio.addActionListener(e -> {
			// Obtiene el JFrame actual y lo cierra
			JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(panelBotones);
			if (currentFrame != null) {
				currentFrame.dispose(); // cierra la ventana actual
			}

			// Crea un nuevo JFrame de inicio (VentanaPrincipal)
			VentanaPrincipal frameInicio = new VentanaPrincipal();
			frameInicio.setVisible(true); // muestra la ventana
		});




		GridBagConstraints gbc_panelBotones = new GridBagConstraints();
		gbc_panelBotones.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelBotones.insets = new Insets(0, 10, 10, 10);
		gbc_panelBotones.gridwidth = 3; // mismo ancho que los campos/lista
		gbc_panelBotones.gridx = 1;
		gbc_panelBotones.gridy = 4;
		add(panelBotones, gbc_panelBotones);

		// Listener de la lista
		jList.addListSelectionListener(e -> {
			if (!e.getValueIsAdjusting()) {
				Persona personaSeleccionada = jList.getSelectedValue();
				if (personaSeleccionada != null) {
					txtNombre.setText(personaSeleccionada.getNombre());
					txtApellido.setText(personaSeleccionada.getApellido());
					txtDNI.setText(personaSeleccionada.getDNI());
				}
			}
		});
	}

	public void setDefaultListModel(DefaultListModel<Persona> dlm) {
		this.dlmPersonas = dlm;
		this.jList.setModel(this.dlmPersonas);
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public JButton getBtnVolverInicio() {
		return btnVolverInicio;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public JTextField getTxtDNI() {
		return txtDNI;
	}

	public JList<Persona> getjList() {
		return jList;
	}
}
