package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JPanel pnlUsuario;
	private JPanel pnlAyuda;
	private JLabel lblPedidos;
	private JLabel lblProductos;
	private JLabel lblClientes;
	private JLabel lblPromociones;
	private JLabel lblMapa;
	private JButton lblImgPedidos;
	private JButton lblImgProductos;
	private JButton lblmgClientes;
	private JButton lblImgPromociones;
	private JButton lblImagenMapa;
	private JLabel lblImgUsuario;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblId;
	private JLabel lblltimoAcceso;
	private JButton btnCerrarSesion;
	private JTextField txtUsuario;
	private JTextField txtApellidos;
	private JTextField txtId;
	private JTextField txtUltimoAcceso;
	private JButton btnAyuda;
	private TPV tpv1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public TPV getTpv1() {
		return tpv1;
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setTitle(MessagesVPinter.getString("VentanaPrincipal.this.title")); //$NON-NLS-1$
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1151, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 16, 0, 0, 0, 0, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 171, 44, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		pnlUsuario = new JPanel();
		pnlUsuario.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		GridBagConstraints gbc_pnlUsuario = new GridBagConstraints();
		gbc_pnlUsuario.gridwidth = 7;
		gbc_pnlUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_pnlUsuario.fill = GridBagConstraints.BOTH;
		gbc_pnlUsuario.gridx = 0;
		gbc_pnlUsuario.gridy = 1;
		contentPane.add(pnlUsuario, gbc_pnlUsuario);
		GridBagLayout gbl_pnlUsuario = new GridBagLayout();
		gbl_pnlUsuario.columnWidths = new int[]{0, 0, 0, 0, 102, 40, 121, 0, -37, 0};
		gbl_pnlUsuario.rowHeights = new int[]{0, 56, 0, 0, 0};
		gbl_pnlUsuario.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlUsuario.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlUsuario.setLayout(gbl_pnlUsuario);
		
		lblImgUsuario = new JLabel(MessagesVPinter.getString("VentanaPrincipal.lblImgUsuario.text")); //$NON-NLS-1$
		lblImgUsuario.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/usuario128.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblImgUsuario = new GridBagConstraints();
		gbc_lblImgUsuario.gridheight = 3;
		gbc_lblImgUsuario.insets = new Insets(0, 0, 0, 5);
		gbc_lblImgUsuario.gridx = 1;
		gbc_lblImgUsuario.gridy = 1;
		pnlUsuario.add(lblImgUsuario, gbc_lblImgUsuario);
		
		lblNombre = new JLabel(MessagesVPinter.getString("VentanaPrincipal.lblNombre.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 3;
		gbc_lblNombre.gridy = 1;
		pnlUsuario.add(lblNombre, gbc_lblNombre);
		
		txtUsuario = new JTextField();
		txtUsuario.setText(MessagesVPinter.getString("VentanaPrincipal.txtUsuario.text")); //$NON-NLS-1$
		txtUsuario.setEditable(false);
		txtUsuario.setEnabled(false);
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuario.gridx = 4;
		gbc_txtUsuario.gridy = 1;
		pnlUsuario.add(txtUsuario, gbc_txtUsuario);
		txtUsuario.setColumns(10);
		
		lblltimoAcceso = new JLabel(MessagesVPinter.getString("VentanaPrincipal.lblltimoAcceso.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblltimoAcceso = new GridBagConstraints();
		gbc_lblltimoAcceso.anchor = GridBagConstraints.EAST;
		gbc_lblltimoAcceso.insets = new Insets(0, 0, 5, 5);
		gbc_lblltimoAcceso.gridx = 5;
		gbc_lblltimoAcceso.gridy = 1;
		pnlUsuario.add(lblltimoAcceso, gbc_lblltimoAcceso);
		
		txtUltimoAcceso = new JTextField();
		txtUltimoAcceso.setText(MessagesVPinter.getString("VentanaPrincipal.txtUltimoAcceso.text")); //$NON-NLS-1$
		txtUltimoAcceso.setEditable(false);
		txtUltimoAcceso.setEnabled(false);
		txtUltimoAcceso.setColumns(10);
		GridBagConstraints gbc_txtUltimoAcceso = new GridBagConstraints();
		gbc_txtUltimoAcceso.insets = new Insets(0, 0, 5, 5);
		gbc_txtUltimoAcceso.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUltimoAcceso.gridx = 6;
		gbc_txtUltimoAcceso.gridy = 1;
		pnlUsuario.add(txtUltimoAcceso, gbc_txtUltimoAcceso);
		
		lblApellidos = new JLabel(MessagesVPinter.getString("VentanaPrincipal.lblApellidos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 3;
		gbc_lblApellidos.gridy = 2;
		pnlUsuario.add(lblApellidos, gbc_lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setText(MessagesVPinter.getString("VentanaPrincipal.txtApellidos.text")); //$NON-NLS-1$
		txtApellidos.setEditable(false);
		txtApellidos.setEnabled(false);
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridx = 4;
		gbc_txtApellidos.gridy = 2;
		pnlUsuario.add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);
		
		lblId = new JLabel(MessagesVPinter.getString("VentanaPrincipal.lblId.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 0, 5);
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.gridx = 3;
		gbc_lblId.gridy = 3;
		pnlUsuario.add(lblId, gbc_lblId);
		
		txtId = new JTextField();
		txtId.setText(MessagesVPinter.getString("VentanaPrincipal.txtId.text")); //$NON-NLS-1$
		txtId.setEditable(false);
		txtId.setEnabled(false);
		GridBagConstraints gbc_txtId = new GridBagConstraints();
		gbc_txtId.insets = new Insets(0, 0, 0, 5);
		gbc_txtId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtId.gridx = 4;
		gbc_txtId.gridy = 3;
		pnlUsuario.add(txtId, gbc_txtId);
		txtId.setColumns(10);
		
		btnCerrarSesion = new JButton(MessagesVPinter.getString("VentanaPrincipal.btnCerrarSesion.text")); //$NON-NLS-1$
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int resp = JOptionPane.showConfirmDialog(null, MessagesVPinter.getString("VentanaPrincipal.1"), MessagesVPinter.getString("VentanaPrincipal.4"), JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE); //$NON-NLS-1$ //$NON-NLS-2$
				if(resp == 0) {
					dispose();
					Login login = new Login();
					login.setVisible(true);
				}
			}
		});
		btnCerrarSesion.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/candado32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnCerrarSesion = new GridBagConstraints();
		gbc_btnCerrarSesion.gridheight = 2;
		gbc_btnCerrarSesion.gridwidth = 3;
		gbc_btnCerrarSesion.insets = new Insets(0, 0, 0, 5);
		gbc_btnCerrarSesion.gridx = 5;
		gbc_btnCerrarSesion.gridy = 2;
		pnlUsuario.add(btnCerrarSesion, gbc_btnCerrarSesion);
		
		pnlAyuda = new JPanel();
		pnlAyuda.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		GridBagConstraints gbc_pnlAyuda = new GridBagConstraints();
		gbc_pnlAyuda.gridwidth = 7;
		gbc_pnlAyuda.insets = new Insets(0, 0, 5, 5);
		gbc_pnlAyuda.fill = GridBagConstraints.BOTH;
		gbc_pnlAyuda.gridx = 7;
		gbc_pnlAyuda.gridy = 1;
		contentPane.add(pnlAyuda, gbc_pnlAyuda);
		
		btnAyuda = new JButton(MessagesVPinter.getString("VentanaPrincipal.btnAyuda.text")); //$NON-NLS-1$
		btnAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, MessagesVPinter.getString("VentanaPrincipal.2"),MessagesVPinter.getString("VentanaPrincipal.3"), JOptionPane.CLOSED_OPTION); //$NON-NLS-1$ //$NON-NLS-2$
			}
		});
		pnlAyuda.setLayout(new BorderLayout(0, 0));
		btnAyuda.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/informacion64.png"))); //$NON-NLS-1$
		pnlAyuda.add(btnAyuda);
		
		lblImgPedidos = new JButton(MessagesVPinter.getString("VentanaPrincipal.lblImgPedidos.text")); //$NON-NLS-1$
		lblImgPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(tpv1 == null) {
					tpv1 = new TPV();
				}
				tpv1.getTabbedPane().setSelectedIndex(0);
				tpv1.setVisible(true);
			}
		});
		lblImgPedidos.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblImgPedidos.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/pedidos150.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblImgPedidos = new GridBagConstraints();
		gbc_lblImgPedidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblImgPedidos.gridx = 2;
		gbc_lblImgPedidos.gridy = 3;
		contentPane.add(lblImgPedidos, gbc_lblImgPedidos);
		
		lblImgProductos = new JButton(MessagesVPinter.getString("VentanaPrincipal.lblImgProductos.text")); //$NON-NLS-1$
		lblImgProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tpv1 == null) {
					tpv1 = new TPV();
				}
				tpv1.getTabbedPane().setSelectedIndex(2);
				tpv1.setVisible(true);
			}
		});
		lblImgProductos.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblImgProductos.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/productos150.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblImgProductos = new GridBagConstraints();
		gbc_lblImgProductos.insets = new Insets(0, 0, 5, 5);
		gbc_lblImgProductos.gridx = 4;
		gbc_lblImgProductos.gridy = 3;
		contentPane.add(lblImgProductos, gbc_lblImgProductos);
		
		lblmgClientes = new JButton(MessagesVPinter.getString("VentanaPrincipal.lblmgClientes.text")); //$NON-NLS-1$
		lblmgClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tpv1 == null) {
					tpv1 = new TPV();
				}
				tpv1.getTabbedPane().setSelectedIndex(3);
				tpv1.setVisible(true);
			}
		});
		lblmgClientes.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblmgClientes.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/comiendo150.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblmgClientes = new GridBagConstraints();
		gbc_lblmgClientes.gridwidth = 2;
		gbc_lblmgClientes.insets = new Insets(0, 0, 5, 5);
		gbc_lblmgClientes.gridx = 6;
		gbc_lblmgClientes.gridy = 3;
		contentPane.add(lblmgClientes, gbc_lblmgClientes);
		
		lblImgPromociones = new JButton(MessagesVPinter.getString("VentanaPrincipal.lblImgPromociones.text")); //$NON-NLS-1$
		lblImgPromociones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tpv1 == null) {
					tpv1 = new TPV();
				}
				tpv1.getTabbedPane().setSelectedIndex(4);
				tpv1.setVisible(true);
			}
		});
		lblImgPromociones.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblImgPromociones.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/promocion150.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblImgPromociones = new GridBagConstraints();
		gbc_lblImgPromociones.insets = new Insets(0, 0, 5, 5);
		gbc_lblImgPromociones.gridx = 9;
		gbc_lblImgPromociones.gridy = 3;
		contentPane.add(lblImgPromociones, gbc_lblImgPromociones);
		
		lblImagenMapa = new JButton(MessagesVPinter.getString("VentanaPrincipal.lblImagenMapa.text")); //$NON-NLS-1$
		lblImagenMapa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tpv1 == null) {
					tpv1 = new TPV();
				}
				tpv1.getTabbedPane().setSelectedIndex(5);
				tpv1.setVisible(true);
			}
		});
		lblImagenMapa.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblImagenMapa.setIcon(new ImageIcon(VentanaPrincipal.class.getResource(MessagesVPinter.getString("VentanaPrincipal.0")))); //$NON-NLS-1$
		GridBagConstraints gbc_lblImagenMapa = new GridBagConstraints();
		gbc_lblImagenMapa.insets = new Insets(0, 0, 5, 5);
		gbc_lblImagenMapa.gridx = 11;
		gbc_lblImagenMapa.gridy = 3;
		contentPane.add(lblImagenMapa, gbc_lblImagenMapa);
		
		lblPedidos = new JLabel(MessagesVPinter.getString("VentanaPrincipal.lblPedidos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPedidos = new GridBagConstraints();
		gbc_lblPedidos.anchor = GridBagConstraints.NORTH;
		gbc_lblPedidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblPedidos.gridx = 2;
		gbc_lblPedidos.gridy = 4;
		contentPane.add(lblPedidos, gbc_lblPedidos);
		
		lblProductos = new JLabel(MessagesVPinter.getString("VentanaPrincipal.lblProductos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblProductos = new GridBagConstraints();
		gbc_lblProductos.anchor = GridBagConstraints.NORTH;
		gbc_lblProductos.insets = new Insets(0, 0, 5, 5);
		gbc_lblProductos.gridx = 4;
		gbc_lblProductos.gridy = 4;
		contentPane.add(lblProductos, gbc_lblProductos);
		
		lblClientes = new JLabel(MessagesVPinter.getString("VentanaPrincipal.lblClientes.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblClientes = new GridBagConstraints();
		gbc_lblClientes.anchor = GridBagConstraints.NORTH;
		gbc_lblClientes.gridwidth = 2;
		gbc_lblClientes.insets = new Insets(0, 0, 5, 5);
		gbc_lblClientes.gridx = 6;
		gbc_lblClientes.gridy = 4;
		contentPane.add(lblClientes, gbc_lblClientes);
		
		lblPromociones = new JLabel(MessagesVPinter.getString("VentanaPrincipal.lblPromociones.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPromociones = new GridBagConstraints();
		gbc_lblPromociones.anchor = GridBagConstraints.NORTH;
		gbc_lblPromociones.insets = new Insets(0, 0, 5, 5);
		gbc_lblPromociones.gridx = 9;
		gbc_lblPromociones.gridy = 4;
		contentPane.add(lblPromociones, gbc_lblPromociones);
		
		lblMapa = new JLabel(MessagesVPinter.getString("VentanaPrincipal.lblMapa.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblMapa = new GridBagConstraints();
		gbc_lblMapa.anchor = GridBagConstraints.NORTH;
		gbc_lblMapa.insets = new Insets(0, 0, 5, 5);
		gbc_lblMapa.gridx = 11;
		gbc_lblMapa.gridy = 4;
		contentPane.add(lblMapa, gbc_lblMapa);
	}

}
