package presentacion.vista;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableCellRenderer;

public class PanelListarPersona extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tabla;
	private DefaultTableModel dtm;
	private JScrollPane scrollPane;
	private JButton btnVolverInicio;

	public JTable getTabla() {
		return tabla;
	}

	public void setTabla(JTable tabla) {
		this.tabla = tabla;
	}

	public DefaultTableModel getDtm() {
		return dtm;
	}

	public void setDtm(DefaultTableModel dtm) {
		this.dtm = dtm;
		this.tabla.setModel(dtm);

		// Actualizar centrado de columnas si el modelo cambia
		DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
		centrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		for (int i = 0; i < tabla.getColumnCount(); i++) {
			tabla.getColumnModel().getColumn(i).setCellRenderer(centrado);
		}
	}

	public PanelListarPersona() {
		// Fondo general
		setBackground(new Color(245, 245, 250));

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 116, 135, 134, 77, 0};
		gridBagLayout.rowHeights = new int[]{16, 15, 214, 50, 0}; // fila extra para el botón
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		// Tabla
		dtm = new DefaultTableModel();
		tabla = new JTable(dtm);

		// Mejorar apariencia de la tabla
		tabla.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		tabla.setForeground(new Color(25, 25, 112));
		tabla.setBackground(new Color(255, 255, 255));
		tabla.setGridColor(new Color(200, 200, 200));
		tabla.setRowHeight(25);
		tabla.setFillsViewportHeight(true);
		tabla.setBorder(new LineBorder(new Color(180, 180, 200)));

		// Centrar datos de todas las columnas
		DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
		centrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		tabla.setDefaultRenderer(Object.class, centrado);

		// Centrar encabezados
		((DefaultTableCellRenderer) tabla.getTableHeader().getDefaultRenderer())
				.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		// ScrollPane para la tabla
		scrollPane = new JScrollPane(tabla);
		scrollPane.setBorder(new LineBorder(new Color(180, 180, 200)));

		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridheight = 2;
		gbc_table.gridwidth = 3;
		gbc_table.insets = new Insets(10, 10, 10, 10); // espacio igual en ambos lados
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 1;
		gbc_table.gridy = 1;
		add(scrollPane, gbc_table);

		// Botón Volver a Inicio
		btnVolverInicio = new JButton("Volver a Inicio");
		btnVolverInicio.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnVolverInicio.setBackground(new Color(220, 53, 69));
		btnVolverInicio.setForeground(Color.WHITE);
		btnVolverInicio.setFocusPainted(false);
		btnVolverInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 12, 6, 12));

		GridBagConstraints gbc_btnVolver = new GridBagConstraints();
		gbc_btnVolver.insets = new Insets(10, 10, 10, 10);
		gbc_btnVolver.gridx = 1;
		gbc_btnVolver.gridy = 3;
		gbc_btnVolver.gridwidth = 3;
		gbc_btnVolver.fill = GridBagConstraints.HORIZONTAL;
		add(btnVolverInicio, gbc_btnVolver);

		// --------------------- funcionalidad ---------------------
		btnVolverInicio.addActionListener(e -> {
			// Cierra la ventana actual
			JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
			if (currentFrame != null) {
				currentFrame.dispose();
			}

			// Abre la ventana de inicio (VentanaPrincipal)
			SwingUtilities.invokeLater(() -> {
				VentanaPrincipal frameInicio = new VentanaPrincipal();
				frameInicio.setLocationRelativeTo(null);
				frameInicio.setVisible(true);
			});
		});
	}

	public JButton getBtnVolverInicio() {
		return btnVolverInicio;
	}
}
