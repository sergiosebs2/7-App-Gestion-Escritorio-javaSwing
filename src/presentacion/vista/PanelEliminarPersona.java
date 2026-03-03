package presentacion.vista;

import javax.swing.JPanel;
import entidad.Persona;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;
import javax.swing.JList;
import java.awt.Insets;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.BorderFactory;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;

public class PanelEliminarPersona extends JPanel {

	private static final long serialVersionUID = 1L;

	private DefaultListModel<Persona> dlmPersonas;
	private JList<Persona> list;
	JButton btnEliminar;
	JButton btnVolverInicio;

	public PanelEliminarPersona() {
		// Fondo suave
		setBackground(new Color(245, 245, 250));

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 1, 1, 60, 0};
		gridBagLayout.rowHeights = new int[]{16, 15, 214, 50, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		// Título
		JLabel lblEliminar = new JLabel("Eliminar usuarios");
		lblEliminar.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblEliminar.setForeground(new Color(25, 25, 112));
		GridBagConstraints gbc_lblEliminar = new GridBagConstraints();
		gbc_lblEliminar.gridwidth = 3;
		gbc_lblEliminar.insets = new Insets(10, 10, 10, 10);
		gbc_lblEliminar.gridx = 1;
		gbc_lblEliminar.gridy = 1;
		add(lblEliminar, gbc_lblEliminar);

		// Lista de usuarios
		list = new JList<>();
		list.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		list.setForeground(new Color(25, 25, 112));
		list.setBackground(Color.WHITE);
		list.setBorder(BorderFactory.createLineBorder(new Color(180, 180, 200)));
		list.setFixedCellHeight(25);

		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridwidth = 2;
		gbc_list.insets = new Insets(0, 10, 10, 10); // mismo espacio a izquierda y derecha
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 2;
		add(list, gbc_list);

		// Panel contenedor para los botones (centrados y lado a lado)
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0)); // separación de 10px entre botones
		panelBotones.setBackground(new Color(245, 245, 250));

		// Botón Eliminar
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnEliminar.setBackground(new Color(220, 53, 69));
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFocusPainted(false);
		btnEliminar.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
		panelBotones.add(btnEliminar);

		// Botón Volver a Inicio
		btnVolverInicio = new JButton("Volver a Inicio");
		btnVolverInicio.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnVolverInicio.setBackground(new Color(70, 130, 180));
		btnVolverInicio.setForeground(Color.WHITE);
		btnVolverInicio.setFocusPainted(false);
		btnVolverInicio.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
		panelBotones.add(btnVolverInicio);

		GridBagConstraints gbc_panelBotones = new GridBagConstraints();
		gbc_panelBotones.gridwidth = 2;
		gbc_panelBotones.insets = new Insets(0, 10, 10, 10);
		gbc_panelBotones.gridx = 1;
		gbc_panelBotones.gridy = 3;
		add(panelBotones, gbc_panelBotones);
	}

	// Getters y setters
	public JList<Persona> getJList() {
		return this.list;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JButton getBtnVolverInicio() {
		return btnVolverInicio;
	}

	public void setDefaultListModel(DefaultListModel<Persona> dlm) {
		this.dlmPersonas = dlm;
		this.list.setModel(this.dlmPersonas);
	}
}
