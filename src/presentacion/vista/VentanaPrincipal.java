package presentacion.vista;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	private JMenuBar menuBar;
	private JMenu mnPersona;
	private JMenuItem mntmAgregar;
	private JMenuItem mntmModificar;
	private JMenuItem mntmEliminar;
	private JMenuItem mntmListar;

	public VentanaPrincipal() {
		setTitle("Gestión de base de datos de Personas...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(660, 400); // ancho y alto
		setLocationRelativeTo(null); // esto lo centra en la pantalla

		// Panel con imagen de fondo
		JPanel panelConFondo = new JPanel() {
			private Image imagen = new ImageIcon(getClass().getResource("/imagenes/fondo.png")).getImage();

			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
		};
		panelConFondo.setLayout(new BorderLayout());
		setContentPane(panelConFondo);

		// Barra de menú con estilo
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(70, 130, 180));
		menuBar.setForeground(Color.WHITE);
		setJMenuBar(menuBar);

		// Menú principal
		mnPersona = new JMenu("Menu de Personas");
		mnPersona.setForeground(Color.WHITE);
		mnPersona.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnPersona);

		// Íconos normalizados (todos 16x16)
		mntmAgregar = new JMenuItem("Agregar", escalarIcono(UIManager.getIcon("FileView.fileIcon"), 16, 16));
		mnPersona.add(mntmAgregar);

		mntmModificar = new JMenuItem("Modificar", escalarIcono(UIManager.getIcon("FileChooser.detailsViewIcon"), 16, 16));
		mnPersona.add(mntmModificar);

		mntmEliminar = new JMenuItem("Eliminar", escalarIcono(UIManager.getIcon("OptionPane.errorIcon"), 16, 16));
		mnPersona.add(mntmEliminar);

		mntmListar = new JMenuItem("Listar", escalarIcono(UIManager.getIcon("FileView.directoryIcon"), 16, 16));
		mnPersona.add(mntmListar);

		// Panel central con mensaje de bienvenida
		JLabel lblBienvenida = new JLabel("Bienvenido! Programa de Gestión de Personas", SwingConstants.CENTER);
		lblBienvenida.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblBienvenida.setForeground(Color.WHITE); // texto blanco para que contraste con el fondo
		panelConFondo.add(lblBienvenida, BorderLayout.CENTER);
	}

	// Método para escalar íconos y que todos tengan el mismo tamaño
	private Icon escalarIcono(Icon icono, int ancho, int alto) {
		if (icono instanceof ImageIcon) {
			Image img = ((ImageIcon) icono).getImage();
			Image imgEscalada = img.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
			return new ImageIcon(imgEscalada);
		}
		return icono;
	}

	// Getters y Setters
	public void setMenuBar(JMenuBar menuBar) { this.menuBar = menuBar; }
	public JMenu getMnPersona() { return mnPersona; }
	public void setMnPersona(JMenu mnPersona) { this.mnPersona = mnPersona; }
	public JMenuItem getMntmAgregar() { return mntmAgregar; }
	public void setMntmAgregar(JMenuItem mntmAgregar) { this.mntmAgregar = mntmAgregar; }
	public JMenuItem getMntmModificar() { return mntmModificar; }
	public void setMntmModificar(JMenuItem mntmModificar) { this.mntmModificar = mntmModificar; }
	public JMenuItem getMntmEliminar() { return mntmEliminar; }
	public void setMntmEliminar(JMenuItem mntmEliminar) { this.mntmEliminar = mntmEliminar; }
	public JMenuItem getMntmListar() { return mntmListar; }
	public void setMntmListar(JMenuItem mntmListar) { this.mntmListar = mntmListar; }

	// Método main para probar
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			VentanaPrincipal vp = new VentanaPrincipal();
			vp.setVisible(true);
		});
	}
}