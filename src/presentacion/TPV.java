package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ListSelectionModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Font;
import javax.swing.JMenuItem;

public class TPV extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel pnlPedidos;
	private JPanel pnlProductos;
	private JPanel pnlClientes;
	private JPanel pnlPromociones;
	private JPanel pnlMapa;
	private JLabel lblPedidos;
	private JButton btnAniadirPedido;
	private JLabel lblFiltro;
	private JTextField txtFiltro;
	private JCheckBox chckbxSoloPedidosDe;
	private JTextField txtCliente;
	private JLabel lblPromocion;
	private JComboBox cmbxPromocion;
	private JLabel lblTipo;
	private JComboBox cmbxTipo;
	private JButton btnAplicarFiltro;
	private JScrollPane scrollPane;
	private JTable tblPedidos;
	private JTextField txtBuscarProducto;
	private JLabel lblCategoria;
	private JComboBox cmbxCategoria;
	private JButton btnAniadir;
	private JScrollPane scrollPane_1;
	private JTable tblProductos;
	private JLabel lblImgProducto;
	private JTextField txtBuscarCliente;
	private JScrollPane scrollPane_2;
	private JTable tblClientes;
	private JPanel pnlCliente;
	private JLabel lblImgCliente;
	private JLabel lblNombre_1;
	private JLabel lblApellidos;
	private JLabel lblTelfono;
	private JTextField txtClNombre;
	private JTextField txtClApellidos;
	private JTextField txtClTelefono;
	private JLabel lblDireccion;
	private JLabel lblEmail;
	private JLabel lblPuntos;
	private JTextField txtClDireccion;
	private JTextField txtClEmail;
	private JComboBox cmbxClPuntos;
	private JLabel lblCaducanEl;
	private JFormattedTextField ftxtCaducidad;
	private JLabel lblAlergias;
	private JTextArea txtaAlergias;
	private JButton btnGuardar;
	private JTextField txtPrmBuscarPromocion;
	private JList lstPrmPromociones;
	private JButton btnPrmAniadir;
	private JLabel lblPrmId;
	private JLabel lblPrmNombre;
	private JLabel lblPrmProductos;
	private JLabel lblPrmDtoAplicable;
	private JButton btnPrmGuardar;
	private JTextField txtPrmDto;
	private JTextField txtPrmNombre;
	private JTextField txtPrmId;
	private JList lstPrmProductos;
	private JTextField txtPrmBuscarCliente;
	private JLabel lblPrmClientes;
	private JLabel lblPrmNotificar;
	private JList list;
	private JPanel pnlPrmNotificar;
	private JCheckBox chckbxPrmEmail;
	private JCheckBox chckbxPrmSMS;
	private JButton btnCargarImagendocumento;
	private JButton btnEnviar;
	private JLabel lblMpIdPedido;
	private JLabel lblMpDireccion;
	private JLabel lblHoraDeLlegada;
	private JCheckBox chckbxMpPagado;
	private JRadioButton rdbtnMpFrio;
	private JRadioButton rdbtnMpCaliente;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox chckbxMpVip;
	private JButton btnMpAniadir;
	private JButton btnMpEliminar;
	private JTextField txtMpIdPedido;
	private JTextField txtMpDireccion;
	private JTextField txtMpHora;
	private JScrollPane scrollPane_3;
	private MiAreaDibujo lblMpMapa;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnEditar;
	private JMenu mnAyuda;
	private JButton btnMnVolver;
	private JPanel pnlHistorial;
	private JLabel lblHstPedidos;
	private JLabel lblHstFiltro;
	private JTextField txtHstId;
	private JCheckBox chckbxHstSoloClientes;
	private JLabel lblHstPromocion;
	private JComboBox chckbxHstPromocion;
	private JLabel lblHstTipo;
	private JComboBox chckbxHstTipo;
	private JButton btnHstAplicarFiltro;
	private JScrollPane scrollPane_4;
	private JFormattedTextField txtHstFecha;
	private JPanel pnlPddNuevoPedido;
	private JLabel lblPddIdPedido;
	private JLabel lblPddCliente;
	private JLabel lblPddPromociones;
	private JLabel lblPddProductos;
	private JTextField txtPddIdPedido;
	private JTextField txtPddCliente;
	private JTextField txtPddPromociones;
	private JButton btnPddAniadir;
	private JLabel lblPddHoraDeRecepcion;
	private JLabel lblPddHoraDeEntrega;
	private JCheckBox chckbxADomicilio;
	private JLabel lblPddDireccionDeEnvio;
	private JTextField txtPddHoradeRecepcion;
	private JTextField txtPddHoradeEntrega;
	private JTextField txtPddDirecciondeEnvio;
	private JButton btnPddImprimirTicket;
	private JTable tblPddProductos;
	private JLabel lblPddPrecioTotal;
	private JLabel lblPddDescuento;
	private JLabel lblPddNewLabel;
	private JLabel lblPddPrecioFinal;
	private JLabel lblPddPuntosObtenidos;
	private JTextField txtPddPrecioTotal;
	private JTextField txtPddDescuento;
	private JTextField txtPddTransporte;
	private JTextField txtPddPrecioFinal;
	private JTextField txtPddPuntosObtenidos;
	private JTextArea txtAPddInformacionAdicional;
	private JComboBox cmbxPddMetodoPago;
	private JCheckBox chckbxPddPagado;
	private JCheckBox chckbxPddUsarPuntos;
	private JButton btnPddAceptar;
	private JPanel pnlPddProductos;
	private JTextField txtPddBuscarProducto;
	private JLabel lblPddBuscarProducto;
	private JLabel lblPddCategorias;
	private JComboBox cmbxPddCategorias;
	private JLabel lblPddCantidad;
	private JSpinner spnPddCantidad;
	private JPanel pnlAniadirProducto;
	private JLabel lblPrdNombre;
	private JLabel lblPrdId;
	private JTextField txtPrdNombre;
	private JTextField txtPrdId;
	private JLabel lblPrdIngredientes;
	private JButton btnPrdAniadir;
	private JTable table_2;
	private JLabel lblPrdAlergenos;
	private JLabel lblPrdEspecial;
	private JCheckBox chckbxGluten_1;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxHuevo_1;
	private JCheckBox chckbxLeche_1;
	private JCheckBox chckbxVegano;
	private JCheckBox chckbxVegetariano;
	private JCheckBox chckbxEcolgico;
	private JLabel lblPrecio_1;
	private JFormattedTextField ftxtPrdPrecio;
	private JButton btnAadirProducto;
	private JPanel pnlAniadirIngrediente;
	private JLabel lblPrdBuscarIngrediente;
	private JTextField txtPrdBuscarIngrediente;
	private JLabel lblPrdNuevo;
	private JLabel lblPrdCantidad;
	private JTextField txtPrdNuevoIngrediente;
	private JSpinner spnPrdCantidad;
	private JLabel lblCltBuscarCliente;
	private JButton btnCltNuevo;
	private JScrollPane scrollPane_5;
	private JScrollPane scrollPane_6;
	private JButton btnEliminarPedido;
	private JButton btnPddEliminarProducto;
	private JButton btnPrdEliminar;
	private JButton btnEliminar;
	private JButton btnEliminar_1;
	private JScrollPane scrollPane_8;
	private JTable table;
	private JButton btnPrmEliminarPromocion;
	private JButton btnPrmEliminarProducto;
	private JLabel lblBuscarProducto;
	private JComboBox comboBox;
	private JList list_2;
	private JTextField txtGramosotrasUnidades;
	private JMenuItem mntmAyuda;
	private JMenuItem mntmAcercaDe;
	private JTable table_1;
	private int modo = -1;
	private int x,y;
	private final int FRIO = 1;
	private final int CALIENTE = 2;
	private final int TEXTO = 3;
	private JButton btnPedidoFrio;
	private JButton btnPedidoCaliente;
	private JButton btnAnotacion;
	private JButton btnLimpiarMapa;
	private JTextField txtTexto = new JTextField();
	private Toolkit toolkit;
	private Image imagFrio;
	private Image imagCaliente;
	private DefaultListModel mdlLista;
	private int count = 1;
	private JScrollPane scrollPane_7;
	private JList lstMpPedidos;
	private JButton btnEliminar_2;

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TPV frame = new TPV();
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
	public TPV() {
		
		toolkit = Toolkit.getDefaultToolkit();
		imagFrio = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/frio32.png")); //$NON-NLS-1$
		imagCaliente = toolkit.getImage(getClass().getClassLoader().getResource("presentacion/caliente32.png")); //$NON-NLS-1$
		
		setTitle(MessagesTPVInter.getString("TPV.this.title")); //$NON-NLS-1$
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1647, 849);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnArchivo = new JMenu(MessagesTPVInter.getString("TPV.mnArchivo.text")); //$NON-NLS-1$
		menuBar.add(mnArchivo);

		mnEditar = new JMenu(MessagesTPVInter.getString("TPV.mnEditar.text")); //$NON-NLS-1$
		menuBar.add(mnEditar);

		mnAyuda = new JMenu(MessagesTPVInter.getString("TPV.mnAyuda.text")); //$NON-NLS-1$
		menuBar.add(mnAyuda);

		mntmAyuda = new JMenuItem(MessagesTPVInter.getString("TPV.mntmAyuda.text")); //$NON-NLS-1$
		mntmAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, MessagesTPVInter.getString("TPV.0"), //$NON-NLS-1$
						MessagesTPVInter.getString("TPV.1"), JOptionPane.QUESTION_MESSAGE); //$NON-NLS-1$
			}
		});
		mnAyuda.add(mntmAyuda);

		mntmAcercaDe = new JMenuItem(MessagesTPVInter.getString("TPV.mntmAcercaDe.text")); //$NON-NLS-1$
		mntmAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, MessagesTPVInter.getString("TPV.3"), //$NON-NLS-1$
						MessagesTPVInter.getString("TPV.4"), JOptionPane.QUESTION_MESSAGE); //$NON-NLS-1$

			}
		});
		mnAyuda.add(mntmAcercaDe);

		btnMnVolver = new JButton(MessagesTPVInter.getString("TPV.btnMnVolver.text")); //$NON-NLS-1$
		btnMnVolver.addActionListener(new BtnMnVolverActionListener());
		btnMnVolver.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/volver24.png"))); //$NON-NLS-1$
		menuBar.add(btnMnVolver);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "name_102052628494386"); //$NON-NLS-1$

		pnlPedidos = new JPanel();
		tabbedPane.addTab(MessagesTPVInter.getString("TPV.2"), null, pnlPedidos, null); //$NON-NLS-1$
		GridBagLayout gbl_pnlPedidos = new GridBagLayout();
		gbl_pnlPedidos.columnWidths = new int[] { 45, 0, 0, 0, 0, 46, 290, 73, 0, 95, 0, 76, 38, 137, 0, 129, 167, 32,
				0 };
		gbl_pnlPedidos.rowHeights = new int[] { 0, 0, 0, 152, 0, 40, 0 };
		gbl_pnlPedidos.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_pnlPedidos.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		pnlPedidos.setLayout(gbl_pnlPedidos);

		lblPedidos = new JLabel(MessagesTPVInter.getString("TPV.lblPedidos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPedidos = new GridBagConstraints();
		gbc_lblPedidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblPedidos.gridx = 1;
		gbc_lblPedidos.gridy = 1;
		pnlPedidos.add(lblPedidos, gbc_lblPedidos);

		btnAniadirPedido = new JButton(MessagesTPVInter.getString("TPV.btnAniadirPedido.text")); //$NON-NLS-1$
		btnAniadirPedido.setToolTipText(MessagesTPVInter.getString("TPV.btnAniadirPedido.toolTipText")); //$NON-NLS-1$
		btnAniadirPedido.addActionListener(new BtnAniadirPedidoActionListener());
		btnAniadirPedido.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/aniadir32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnAniadirPedido = new GridBagConstraints();
		gbc_btnAniadirPedido.insets = new Insets(0, 0, 5, 5);
		gbc_btnAniadirPedido.gridx = 2;
		gbc_btnAniadirPedido.gridy = 1;
		pnlPedidos.add(btnAniadirPedido, gbc_btnAniadirPedido);

		lblFiltro = new JLabel(MessagesTPVInter.getString("TPV.lblFiltro.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblFiltro = new GridBagConstraints();
		gbc_lblFiltro.anchor = GridBagConstraints.EAST;
		gbc_lblFiltro.insets = new Insets(0, 0, 5, 5);
		gbc_lblFiltro.gridx = 4;
		gbc_lblFiltro.gridy = 1;
		pnlPedidos.add(lblFiltro, gbc_lblFiltro);

		txtFiltro = new JTextField();
		txtFiltro.addFocusListener(new txtFocusListener());
		txtFiltro.setText(MessagesTPVInter.getString("TPV.txtFiltro.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtFiltro = new GridBagConstraints();
		gbc_txtFiltro.insets = new Insets(0, 0, 5, 5);
		gbc_txtFiltro.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFiltro.gridx = 5;
		gbc_txtFiltro.gridy = 1;
		pnlPedidos.add(txtFiltro, gbc_txtFiltro);
		txtFiltro.setColumns(10);

		chckbxSoloPedidosDe = new JCheckBox(MessagesTPVInter.getString("TPV.chckbxSoloPedidosDe.text")); //$NON-NLS-1$
		GridBagConstraints gbc_chckbxSoloPedidosDe = new GridBagConstraints();
		gbc_chckbxSoloPedidosDe.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxSoloPedidosDe.gridx = 6;
		gbc_chckbxSoloPedidosDe.gridy = 1;
		pnlPedidos.add(chckbxSoloPedidosDe, gbc_chckbxSoloPedidosDe);

		txtCliente = new JTextField();
		txtCliente.addFocusListener(new txtFocusListener());
		txtCliente.setText(MessagesTPVInter.getString("TPV.txtCliente.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtCliente = new GridBagConstraints();
		gbc_txtCliente.insets = new Insets(0, 0, 5, 5);
		gbc_txtCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCliente.gridx = 7;
		gbc_txtCliente.gridy = 1;
		pnlPedidos.add(txtCliente, gbc_txtCliente);
		txtCliente.setColumns(10);

		lblPromocion = new JLabel(MessagesTPVInter.getString("TPV.lblPromocion.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPromocion = new GridBagConstraints();
		gbc_lblPromocion.anchor = GridBagConstraints.EAST;
		gbc_lblPromocion.insets = new Insets(0, 0, 5, 5);
		gbc_lblPromocion.gridx = 8;
		gbc_lblPromocion.gridy = 1;
		pnlPedidos.add(lblPromocion, gbc_lblPromocion);

		cmbxPromocion = new JComboBox();
		GridBagConstraints gbc_cmbxPromocion = new GridBagConstraints();
		gbc_cmbxPromocion.insets = new Insets(0, 0, 5, 5);
		gbc_cmbxPromocion.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbxPromocion.gridx = 9;
		gbc_cmbxPromocion.gridy = 1;
		pnlPedidos.add(cmbxPromocion, gbc_cmbxPromocion);

		lblTipo = new JLabel(MessagesTPVInter.getString("TPV.lblTipo.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblTipo = new GridBagConstraints();
		gbc_lblTipo.anchor = GridBagConstraints.EAST;
		gbc_lblTipo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipo.gridx = 10;
		gbc_lblTipo.gridy = 1;
		pnlPedidos.add(lblTipo, gbc_lblTipo);

		cmbxTipo = new JComboBox();
		GridBagConstraints gbc_cmbxTipo = new GridBagConstraints();
		gbc_cmbxTipo.insets = new Insets(0, 0, 5, 5);
		gbc_cmbxTipo.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbxTipo.gridx = 11;
		gbc_cmbxTipo.gridy = 1;
		pnlPedidos.add(cmbxTipo, gbc_cmbxTipo);

		btnAplicarFiltro = new JButton(MessagesTPVInter.getString("TPV.btnAplicarFiltro.text")); //$NON-NLS-1$
		GridBagConstraints gbc_btnAplicarFiltro = new GridBagConstraints();
		gbc_btnAplicarFiltro.insets = new Insets(0, 0, 5, 5);
		gbc_btnAplicarFiltro.gridx = 13;
		gbc_btnAplicarFiltro.gridy = 1;
		pnlPedidos.add(btnAplicarFiltro, gbc_btnAplicarFiltro);

		btnEliminarPedido = new JButton(MessagesTPVInter.getString("TPV.btnEliminarPedido.text")); //$NON-NLS-1$
		btnEliminarPedido.setToolTipText(MessagesTPVInter.getString("TPV.btnEliminarPedido.toolTipText")); //$NON-NLS-1$
		btnEliminarPedido.addActionListener(new BtnEliminarPedidoActionListener());
		btnEliminarPedido.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/eliminar32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnEliminarPedido = new GridBagConstraints();
		gbc_btnEliminarPedido.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminarPedido.gridx = 15;
		gbc_btnEliminarPedido.gridy = 1;
		pnlPedidos.add(btnEliminarPedido, gbc_btnEliminarPedido);

		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.gridwidth = 15;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		pnlPedidos.add(scrollPane, gbc_scrollPane);

		tblPedidos = new JTable();
		tblPedidos.setFont(new Font("Courier New", Font.BOLD, 18)); //$NON-NLS-1$
		tblPedidos.setRowHeight(50);
		tblPedidos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tblPedidos.addMouseListener(new TblPedidosMouseListener());
		tblPedidos.setModel(new DefaultTableModel(new Object[][] {
				{ "P - 001", MessagesTPVInter.getString("TPV.10"), "<html>1<br>2</html>", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						"<html>4.50<br>4.50</html>", "CL - 003", "0%", "13.50", MessagesTPVInter.getString("TPV.21"), MessagesTPVInter.getString("TPV.33") }, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
				{ "P - 002", MessagesTPVInter.getString("TPV.35"), "2", "7.00", "CL - 012", "0%", "14.00", MessagesTPVInter.getString("TPV.73"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$
						MessagesTPVInter.getString("TPV.75") }, }, //$NON-NLS-1$
				new String[] { MessagesTPVInter.getString("TPV.77"), MessagesTPVInter.getString("TPV.79"), MessagesTPVInter.getString("TPV.82"), MessagesTPVInter.getString("TPV.83"), MessagesTPVInter.getString("TPV.84"), MessagesTPVInter.getString("TPV.90"), MessagesTPVInter.getString("TPV.91"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$
						MessagesTPVInter.getString("TPV.92"), MessagesTPVInter.getString("TPV.95") }) { //$NON-NLS-1$ //$NON-NLS-2$
			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblPedidos.getColumnModel().getColumn(0).setResizable(false);
		tblPedidos.getColumnModel().getColumn(0).setPreferredWidth(80);
		tblPedidos.getColumnModel().getColumn(0).setMaxWidth(80);
		tblPedidos.getColumnModel().getColumn(1).setResizable(false);
		tblPedidos.getColumnModel().getColumn(1).setPreferredWidth(300);
		tblPedidos.getColumnModel().getColumn(1).setMaxWidth(300);
		tblPedidos.getColumnModel().getColumn(2).setResizable(false);
		tblPedidos.getColumnModel().getColumn(2).setPreferredWidth(70);
		tblPedidos.getColumnModel().getColumn(2).setMaxWidth(70);
		tblPedidos.getColumnModel().getColumn(3).setResizable(false);
		tblPedidos.getColumnModel().getColumn(3).setPreferredWidth(70);
		tblPedidos.getColumnModel().getColumn(3).setMaxWidth(70);
		tblPedidos.getColumnModel().getColumn(4).setResizable(false);
		tblPedidos.getColumnModel().getColumn(4).setPreferredWidth(95);
		tblPedidos.getColumnModel().getColumn(4).setMaxWidth(95);
		tblPedidos.getColumnModel().getColumn(5).setResizable(false);
		tblPedidos.getColumnModel().getColumn(5).setPreferredWidth(50);
		tblPedidos.getColumnModel().getColumn(5).setMaxWidth(50);
		tblPedidos.getColumnModel().getColumn(6).setResizable(false);
		tblPedidos.getColumnModel().getColumn(6).setPreferredWidth(120);
		tblPedidos.getColumnModel().getColumn(6).setMaxWidth(120);
		tblPedidos.getColumnModel().getColumn(7).setResizable(false);
		tblPedidos.getColumnModel().getColumn(7).setPreferredWidth(150);
		tblPedidos.getColumnModel().getColumn(7).setMaxWidth(150);
		tblPedidos.getColumnModel().getColumn(8).setResizable(false);
		scrollPane.setViewportView(tblPedidos);

		pnlPddNuevoPedido = new JPanel();
		pnlPddNuevoPedido
				.setBorder(new TitledBorder(null, MessagesTPVInter.getString("TPV.pnlPddNuevoPedido.borderTitle"), //$NON-NLS-1$
						TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlPddNuevoPedido = new GridBagConstraints();
		gbc_pnlPddNuevoPedido.gridheight = 4;
		gbc_pnlPddNuevoPedido.insets = new Insets(0, 0, 5, 5);
		gbc_pnlPddNuevoPedido.fill = GridBagConstraints.BOTH;
		gbc_pnlPddNuevoPedido.gridx = 16;
		gbc_pnlPddNuevoPedido.gridy = 0;
		pnlPedidos.add(pnlPddNuevoPedido, gbc_pnlPddNuevoPedido);
		GridBagLayout gbl_pnlPddNuevoPedido = new GridBagLayout();
		gbl_pnlPddNuevoPedido.columnWidths = new int[] { 0, 64, 53, 139, 69, 0, 0 };
		gbl_pnlPddNuevoPedido.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_pnlPddNuevoPedido.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_pnlPddNuevoPedido.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		pnlPddNuevoPedido.setLayout(gbl_pnlPddNuevoPedido);

		lblPddIdPedido = new JLabel(MessagesTPVInter.getString("TPV.lblPddIdPedido.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPddIdPedido = new GridBagConstraints();
		gbc_lblPddIdPedido.anchor = GridBagConstraints.EAST;
		gbc_lblPddIdPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblPddIdPedido.gridx = 0;
		gbc_lblPddIdPedido.gridy = 0;
		pnlPddNuevoPedido.add(lblPddIdPedido, gbc_lblPddIdPedido);

		txtPddIdPedido = new JTextField();
		txtPddIdPedido.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtPddIdPedido = new GridBagConstraints();
		gbc_txtPddIdPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPddIdPedido.gridwidth = 2;
		gbc_txtPddIdPedido.insets = new Insets(0, 0, 5, 5);
		gbc_txtPddIdPedido.gridx = 1;
		gbc_txtPddIdPedido.gridy = 0;
		pnlPddNuevoPedido.add(txtPddIdPedido, gbc_txtPddIdPedido);
		txtPddIdPedido.setColumns(10);

		lblPddHoraDeRecepcion = new JLabel(MessagesTPVInter.getString("TPV.lblPddHoraDeRecepcion.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPddHoraDeRecepcion = new GridBagConstraints();
		gbc_lblPddHoraDeRecepcion.anchor = GridBagConstraints.EAST;
		gbc_lblPddHoraDeRecepcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblPddHoraDeRecepcion.gridx = 3;
		gbc_lblPddHoraDeRecepcion.gridy = 0;
		pnlPddNuevoPedido.add(lblPddHoraDeRecepcion, gbc_lblPddHoraDeRecepcion);

		txtPddHoradeRecepcion = new JTextField();
		txtPddHoradeRecepcion.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtPddHoradeRecepcion = new GridBagConstraints();
		gbc_txtPddHoradeRecepcion.insets = new Insets(0, 0, 5, 5);
		gbc_txtPddHoradeRecepcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPddHoradeRecepcion.gridx = 4;
		gbc_txtPddHoradeRecepcion.gridy = 0;
		pnlPddNuevoPedido.add(txtPddHoradeRecepcion, gbc_txtPddHoradeRecepcion);
		txtPddHoradeRecepcion.setColumns(10);

		lblPddCliente = new JLabel(MessagesTPVInter.getString("TPV.lblPddCliente.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPddCliente = new GridBagConstraints();
		gbc_lblPddCliente.anchor = GridBagConstraints.EAST;
		gbc_lblPddCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblPddCliente.gridx = 0;
		gbc_lblPddCliente.gridy = 1;
		pnlPddNuevoPedido.add(lblPddCliente, gbc_lblPddCliente);

		txtPddCliente = new JTextField();
		txtPddCliente.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtPddCliente = new GridBagConstraints();
		gbc_txtPddCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPddCliente.gridwidth = 2;
		gbc_txtPddCliente.insets = new Insets(0, 0, 5, 5);
		gbc_txtPddCliente.gridx = 1;
		gbc_txtPddCliente.gridy = 1;
		pnlPddNuevoPedido.add(txtPddCliente, gbc_txtPddCliente);
		txtPddCliente.setColumns(10);

		lblPddHoraDeEntrega = new JLabel(MessagesTPVInter.getString("TPV.lblPddHoraDeEntrega.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPddHoraDeEntrega = new GridBagConstraints();
		gbc_lblPddHoraDeEntrega.anchor = GridBagConstraints.EAST;
		gbc_lblPddHoraDeEntrega.insets = new Insets(0, 0, 5, 5);
		gbc_lblPddHoraDeEntrega.gridx = 3;
		gbc_lblPddHoraDeEntrega.gridy = 1;
		pnlPddNuevoPedido.add(lblPddHoraDeEntrega, gbc_lblPddHoraDeEntrega);

		txtPddHoradeEntrega = new JTextField();
		txtPddHoradeEntrega.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtPddHoradeEntrega = new GridBagConstraints();
		gbc_txtPddHoradeEntrega.insets = new Insets(0, 0, 5, 5);
		gbc_txtPddHoradeEntrega.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPddHoradeEntrega.gridx = 4;
		gbc_txtPddHoradeEntrega.gridy = 1;
		pnlPddNuevoPedido.add(txtPddHoradeEntrega, gbc_txtPddHoradeEntrega);
		txtPddHoradeEntrega.setColumns(10);

		lblPddPromociones = new JLabel(MessagesTPVInter.getString("TPV.lblPddPromociones.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPddPromociones = new GridBagConstraints();
		gbc_lblPddPromociones.anchor = GridBagConstraints.EAST;
		gbc_lblPddPromociones.insets = new Insets(0, 0, 5, 5);
		gbc_lblPddPromociones.gridx = 0;
		gbc_lblPddPromociones.gridy = 2;
		pnlPddNuevoPedido.add(lblPddPromociones, gbc_lblPddPromociones);

		txtPddPromociones = new JTextField();
		txtPddPromociones.addFocusListener(new txtFocusListener());
		txtPddPromociones.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtPddPromociones = new GridBagConstraints();
		gbc_txtPddPromociones.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPddPromociones.gridwidth = 2;
		gbc_txtPddPromociones.insets = new Insets(0, 0, 5, 5);
		gbc_txtPddPromociones.gridx = 1;
		gbc_txtPddPromociones.gridy = 2;
		pnlPddNuevoPedido.add(txtPddPromociones, gbc_txtPddPromociones);
		txtPddPromociones.setColumns(10);

		chckbxADomicilio = new JCheckBox(MessagesTPVInter.getString("TPV.chckbxADomicilio.text")); //$NON-NLS-1$
		chckbxADomicilio.addItemListener(new ChckbxADomicilioItemListener());
		GridBagConstraints gbc_chckbxADomicilio = new GridBagConstraints();
		gbc_chckbxADomicilio.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxADomicilio.gridx = 3;
		gbc_chckbxADomicilio.gridy = 2;
		pnlPddNuevoPedido.add(chckbxADomicilio, gbc_chckbxADomicilio);

		btnPddImprimirTicket = new JButton(MessagesTPVInter.getString("TPV.btnPddImprimirTicket.text")); //$NON-NLS-1$
		btnPddImprimirTicket.setToolTipText(MessagesTPVInter.getString("TPV.btnPddImprimirTicket.toolTipText")); //$NON-NLS-1$
		btnPddImprimirTicket.addActionListener(new BtnPddImprimirTicketActionListener());
		btnPddImprimirTicket.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/imprimir32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnPddImprimirTicket = new GridBagConstraints();
		gbc_btnPddImprimirTicket.gridheight = 2;
		gbc_btnPddImprimirTicket.insets = new Insets(0, 0, 5, 0);
		gbc_btnPddImprimirTicket.gridx = 5;
		gbc_btnPddImprimirTicket.gridy = 1;
		pnlPddNuevoPedido.add(btnPddImprimirTicket, gbc_btnPddImprimirTicket);

		lblPddProductos = new JLabel(MessagesTPVInter.getString("TPV.lblPddProductos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPddProductos = new GridBagConstraints();
		gbc_lblPddProductos.anchor = GridBagConstraints.EAST;
		gbc_lblPddProductos.insets = new Insets(0, 0, 5, 5);
		gbc_lblPddProductos.gridx = 0;
		gbc_lblPddProductos.gridy = 3;
		pnlPddNuevoPedido.add(lblPddProductos, gbc_lblPddProductos);

		btnPddAniadir = new JButton(MessagesTPVInter.getString("TPV.btnPddAniadir.text")); //$NON-NLS-1$
		btnPddAniadir.setToolTipText(MessagesTPVInter.getString("TPV.btnPddAniadir.toolTipText")); //$NON-NLS-1$
		btnPddAniadir.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/aniadir20.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnPddAniadir = new GridBagConstraints();
		gbc_btnPddAniadir.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPddAniadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnPddAniadir.gridx = 1;
		gbc_btnPddAniadir.gridy = 3;
		pnlPddNuevoPedido.add(btnPddAniadir, gbc_btnPddAniadir);

		btnPddEliminarProducto = new JButton(MessagesTPVInter.getString("TPV.btnPddEliminarProducto.text")); //$NON-NLS-1$
		btnPddEliminarProducto.setToolTipText(MessagesTPVInter.getString("TPV.btnPddEliminarProducto.toolTipText")); //$NON-NLS-1$
		btnPddEliminarProducto.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/eliminar20.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnPddEliminarProducto = new GridBagConstraints();
		gbc_btnPddEliminarProducto.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPddEliminarProducto.insets = new Insets(0, 0, 5, 5);
		gbc_btnPddEliminarProducto.gridx = 2;
		gbc_btnPddEliminarProducto.gridy = 3;
		pnlPddNuevoPedido.add(btnPddEliminarProducto, gbc_btnPddEliminarProducto);

		lblPddDireccionDeEnvio = new JLabel(MessagesTPVInter.getString("TPV.lblPddDireccionDeEnvio.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPddDireccionDeEnvio = new GridBagConstraints();
		gbc_lblPddDireccionDeEnvio.anchor = GridBagConstraints.EAST;
		gbc_lblPddDireccionDeEnvio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPddDireccionDeEnvio.gridx = 3;
		gbc_lblPddDireccionDeEnvio.gridy = 3;
		pnlPddNuevoPedido.add(lblPddDireccionDeEnvio, gbc_lblPddDireccionDeEnvio);

		txtPddDirecciondeEnvio = new JTextField();
		txtPddDirecciondeEnvio.addFocusListener(new txtFocusListener());
		txtPddDirecciondeEnvio.setEnabled(false);
		GridBagConstraints gbc_txtPddDirecciondeEnvio = new GridBagConstraints();
		gbc_txtPddDirecciondeEnvio.gridwidth = 2;
		gbc_txtPddDirecciondeEnvio.insets = new Insets(0, 0, 5, 0);
		gbc_txtPddDirecciondeEnvio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPddDirecciondeEnvio.gridx = 4;
		gbc_txtPddDirecciondeEnvio.gridy = 3;
		pnlPddNuevoPedido.add(txtPddDirecciondeEnvio, gbc_txtPddDirecciondeEnvio);
		txtPddDirecciondeEnvio.setColumns(10);

		scrollPane_5 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_5 = new GridBagConstraints();
		gbc_scrollPane_5.gridwidth = 6;
		gbc_scrollPane_5.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_5.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_5.gridx = 0;
		gbc_scrollPane_5.gridy = 4;
		pnlPddNuevoPedido.add(scrollPane_5, gbc_scrollPane_5);

		tblPddProductos = new JTable();
		scrollPane_5.setViewportView(tblPddProductos);
		tblPddProductos.setBorder(new LineBorder(new Color(0, 0, 0)));
		tblPddProductos.setModel(new DefaultTableModel(new Object[][] { { null, "", null, null, null, null }, }, //$NON-NLS-1$
				new String[] { MessagesTPVInter.getString("TPV.99"), MessagesTPVInter.getString("TPV.100"), MessagesTPVInter.getString("TPV.103"), MessagesTPVInter.getString("TPV.104"), MessagesTPVInter.getString("TPV.108"), MessagesTPVInter.getString("TPV.109") }) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
			Class[] columnTypes = new Class[] { Integer.class, String.class, Object.class, String.class, String.class,
					String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

		lblPddPrecioTotal = new JLabel(MessagesTPVInter.getString("TPV.lblPddPrecioTotal.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPddPrecioTotal = new GridBagConstraints();
		gbc_lblPddPrecioTotal.anchor = GridBagConstraints.EAST;
		gbc_lblPddPrecioTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblPddPrecioTotal.gridx = 0;
		gbc_lblPddPrecioTotal.gridy = 5;
		pnlPddNuevoPedido.add(lblPddPrecioTotal, gbc_lblPddPrecioTotal);

		txtPddPrecioTotal = new JTextField();
		txtPddPrecioTotal.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtPddPrecioTotal = new GridBagConstraints();
		gbc_txtPddPrecioTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPddPrecioTotal.gridwidth = 2;
		gbc_txtPddPrecioTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtPddPrecioTotal.gridx = 1;
		gbc_txtPddPrecioTotal.gridy = 5;
		pnlPddNuevoPedido.add(txtPddPrecioTotal, gbc_txtPddPrecioTotal);
		txtPddPrecioTotal.setColumns(10);

		txtAPddInformacionAdicional = new JTextArea();
		txtAPddInformacionAdicional.addFocusListener(new TxtAPddInformacionAdicionalFocusListener());
		txtAPddInformacionAdicional.setText(MessagesTPVInter.getString("TPV.txtAPddInformacionAdicional.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtAPddInformacionAdicional = new GridBagConstraints();
		gbc_txtAPddInformacionAdicional.gridwidth = 2;
		gbc_txtAPddInformacionAdicional.gridheight = 5;
		gbc_txtAPddInformacionAdicional.insets = new Insets(0, 0, 0, 5);
		gbc_txtAPddInformacionAdicional.fill = GridBagConstraints.BOTH;
		gbc_txtAPddInformacionAdicional.gridx = 3;
		gbc_txtAPddInformacionAdicional.gridy = 5;
		pnlPddNuevoPedido.add(txtAPddInformacionAdicional, gbc_txtAPddInformacionAdicional);

		lblPddDescuento = new JLabel(MessagesTPVInter.getString("TPV.lblPddDescuento.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPddDescuento = new GridBagConstraints();
		gbc_lblPddDescuento.anchor = GridBagConstraints.EAST;
		gbc_lblPddDescuento.insets = new Insets(0, 0, 5, 5);
		gbc_lblPddDescuento.gridx = 0;
		gbc_lblPddDescuento.gridy = 6;
		pnlPddNuevoPedido.add(lblPddDescuento, gbc_lblPddDescuento);

		txtPddDescuento = new JTextField();
		txtPddDescuento.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtPddDescuento = new GridBagConstraints();
		gbc_txtPddDescuento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPddDescuento.gridwidth = 2;
		gbc_txtPddDescuento.insets = new Insets(0, 0, 5, 5);
		gbc_txtPddDescuento.gridx = 1;
		gbc_txtPddDescuento.gridy = 6;
		pnlPddNuevoPedido.add(txtPddDescuento, gbc_txtPddDescuento);
		txtPddDescuento.setColumns(10);

		cmbxPddMetodoPago = new JComboBox();
		cmbxPddMetodoPago.setModel(new DefaultComboBoxModel(new String[] { MessagesTPVInter.getString("TPV.43"), //$NON-NLS-1$
				MessagesTPVInter.getString("TPV.44"), MessagesTPVInter.getString("TPV.45") })); //$NON-NLS-1$ //$NON-NLS-2$
		GridBagConstraints gbc_cmbxPddMetodoPago = new GridBagConstraints();
		gbc_cmbxPddMetodoPago.insets = new Insets(0, 0, 5, 0);
		gbc_cmbxPddMetodoPago.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbxPddMetodoPago.gridx = 5;
		gbc_cmbxPddMetodoPago.gridy = 6;
		pnlPddNuevoPedido.add(cmbxPddMetodoPago, gbc_cmbxPddMetodoPago);

		lblPddNewLabel = new JLabel(MessagesTPVInter.getString("TPV.lblPddNewLabel.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPddNewLabel = new GridBagConstraints();
		gbc_lblPddNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblPddNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblPddNewLabel.gridx = 0;
		gbc_lblPddNewLabel.gridy = 7;
		pnlPddNuevoPedido.add(lblPddNewLabel, gbc_lblPddNewLabel);

		txtPddTransporte = new JTextField();
		txtPddTransporte.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtPddTransporte = new GridBagConstraints();
		gbc_txtPddTransporte.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPddTransporte.gridwidth = 2;
		gbc_txtPddTransporte.insets = new Insets(0, 0, 5, 5);
		gbc_txtPddTransporte.gridx = 1;
		gbc_txtPddTransporte.gridy = 7;
		pnlPddNuevoPedido.add(txtPddTransporte, gbc_txtPddTransporte);
		txtPddTransporte.setColumns(10);

		chckbxPddUsarPuntos = new JCheckBox(MessagesTPVInter.getString("TPV.chckbxPddUsarPuntos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_chckbxPddUsarPuntos = new GridBagConstraints();
		gbc_chckbxPddUsarPuntos.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxPddUsarPuntos.gridx = 5;
		gbc_chckbxPddUsarPuntos.gridy = 7;
		pnlPddNuevoPedido.add(chckbxPddUsarPuntos, gbc_chckbxPddUsarPuntos);

		lblPddPrecioFinal = new JLabel(MessagesTPVInter.getString("TPV.lblPddPrecioFinal.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPddPrecioFinal = new GridBagConstraints();
		gbc_lblPddPrecioFinal.anchor = GridBagConstraints.EAST;
		gbc_lblPddPrecioFinal.insets = new Insets(0, 0, 5, 5);
		gbc_lblPddPrecioFinal.gridx = 0;
		gbc_lblPddPrecioFinal.gridy = 8;
		pnlPddNuevoPedido.add(lblPddPrecioFinal, gbc_lblPddPrecioFinal);

		txtPddPrecioFinal = new JTextField();
		txtPddPrecioFinal.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtPddPrecioFinal = new GridBagConstraints();
		gbc_txtPddPrecioFinal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPddPrecioFinal.gridwidth = 2;
		gbc_txtPddPrecioFinal.insets = new Insets(0, 0, 5, 5);
		gbc_txtPddPrecioFinal.gridx = 1;
		gbc_txtPddPrecioFinal.gridy = 8;
		pnlPddNuevoPedido.add(txtPddPrecioFinal, gbc_txtPddPrecioFinal);
		txtPddPrecioFinal.setColumns(10);

		chckbxPddPagado = new JCheckBox(MessagesTPVInter.getString("TPV.chckbxPddPagado.text")); //$NON-NLS-1$
		GridBagConstraints gbc_chckbxPddPagado = new GridBagConstraints();
		gbc_chckbxPddPagado.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxPddPagado.gridx = 5;
		gbc_chckbxPddPagado.gridy = 8;
		pnlPddNuevoPedido.add(chckbxPddPagado, gbc_chckbxPddPagado);

		lblPddPuntosObtenidos = new JLabel(MessagesTPVInter.getString("TPV.lblPddPuntosObtenidos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPddPuntosObtenidos = new GridBagConstraints();
		gbc_lblPddPuntosObtenidos.anchor = GridBagConstraints.EAST;
		gbc_lblPddPuntosObtenidos.insets = new Insets(0, 0, 0, 5);
		gbc_lblPddPuntosObtenidos.gridx = 0;
		gbc_lblPddPuntosObtenidos.gridy = 9;
		pnlPddNuevoPedido.add(lblPddPuntosObtenidos, gbc_lblPddPuntosObtenidos);

		txtPddPuntosObtenidos = new JTextField();
		txtPddPuntosObtenidos.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtPddPuntosObtenidos = new GridBagConstraints();
		gbc_txtPddPuntosObtenidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPddPuntosObtenidos.gridwidth = 2;
		gbc_txtPddPuntosObtenidos.insets = new Insets(0, 0, 0, 5);
		gbc_txtPddPuntosObtenidos.gridx = 1;
		gbc_txtPddPuntosObtenidos.gridy = 9;
		pnlPddNuevoPedido.add(txtPddPuntosObtenidos, gbc_txtPddPuntosObtenidos);
		txtPddPuntosObtenidos.setColumns(10);

		btnPddAceptar = new JButton(MessagesTPVInter.getString("TPV.btnPddAceptar.text")); //$NON-NLS-1$
		btnPddAceptar.setToolTipText(MessagesTPVInter.getString("TPV.btnPddAceptar.toolTipText")); //$NON-NLS-1$
		btnPddAceptar.addActionListener(new BtnPddAceptarActionListener());
		btnPddAceptar.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/aceptar20.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnPddAceptar = new GridBagConstraints();
		gbc_btnPddAceptar.gridx = 5;
		gbc_btnPddAceptar.gridy = 9;
		pnlPddNuevoPedido.add(btnPddAceptar, gbc_btnPddAceptar);

		pnlPddProductos = new JPanel();
		pnlPddProductos.setBorder(new TitledBorder(null, MessagesTPVInter.getString("TPV.pnlPddProductos.borderTitle"), //$NON-NLS-1$
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlPddProductos = new GridBagConstraints();
		gbc_pnlPddProductos.insets = new Insets(0, 0, 5, 5);
		gbc_pnlPddProductos.fill = GridBagConstraints.BOTH;
		gbc_pnlPddProductos.gridx = 16;
		gbc_pnlPddProductos.gridy = 4;
		pnlPedidos.add(pnlPddProductos, gbc_pnlPddProductos);
		GridBagLayout gbl_pnlPddProductos = new GridBagLayout();
		gbl_pnlPddProductos.columnWidths = new int[] { 0, 212, 0, 0 };
		gbl_pnlPddProductos.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_pnlPddProductos.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_pnlPddProductos.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		pnlPddProductos.setLayout(gbl_pnlPddProductos);

		lblPddBuscarProducto = new JLabel(MessagesTPVInter.getString("TPV.lblPddBuscarProducto.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPddBuscarProducto = new GridBagConstraints();
		gbc_lblPddBuscarProducto.insets = new Insets(0, 0, 5, 5);
		gbc_lblPddBuscarProducto.anchor = GridBagConstraints.EAST;
		gbc_lblPddBuscarProducto.gridx = 0;
		gbc_lblPddBuscarProducto.gridy = 0;
		pnlPddProductos.add(lblPddBuscarProducto, gbc_lblPddBuscarProducto);

		txtPddBuscarProducto = new JTextField();
		txtPddBuscarProducto.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtPddBuscarProducto = new GridBagConstraints();
		gbc_txtPddBuscarProducto.gridwidth = 2;
		gbc_txtPddBuscarProducto.insets = new Insets(0, 0, 5, 0);
		gbc_txtPddBuscarProducto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPddBuscarProducto.gridx = 1;
		gbc_txtPddBuscarProducto.gridy = 0;
		pnlPddProductos.add(txtPddBuscarProducto, gbc_txtPddBuscarProducto);
		txtPddBuscarProducto.setColumns(10);

		lblPddCategorias = new JLabel(MessagesTPVInter.getString("TPV.lblPddCategorias.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPddCategorias = new GridBagConstraints();
		gbc_lblPddCategorias.anchor = GridBagConstraints.EAST;
		gbc_lblPddCategorias.insets = new Insets(0, 0, 5, 5);
		gbc_lblPddCategorias.gridx = 0;
		gbc_lblPddCategorias.gridy = 1;
		pnlPddProductos.add(lblPddCategorias, gbc_lblPddCategorias);

		cmbxPddCategorias = new JComboBox();
		cmbxPddCategorias.setModel(new DefaultComboBoxModel(new String[] { MessagesTPVInter.getString("TPV.47") })); //$NON-NLS-1$
		GridBagConstraints gbc_cmbxPddCategorias = new GridBagConstraints();
		gbc_cmbxPddCategorias.gridwidth = 2;
		gbc_cmbxPddCategorias.insets = new Insets(0, 0, 5, 0);
		gbc_cmbxPddCategorias.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbxPddCategorias.gridx = 1;
		gbc_cmbxPddCategorias.gridy = 1;
		pnlPddProductos.add(cmbxPddCategorias, gbc_cmbxPddCategorias);

		scrollPane_8 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_8 = new GridBagConstraints();
		gbc_scrollPane_8.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_8.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_8.gridx = 1;
		gbc_scrollPane_8.gridy = 2;
		pnlPddProductos.add(scrollPane_8, gbc_scrollPane_8);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { "PRDBB-001", MessagesTPVInter.getString("TPV.49") }, //$NON-NLS-1$ //$NON-NLS-2$
				{ "PRDBB-002", MessagesTPVInter.getString("TPV.51") }, //$NON-NLS-1$ //$NON-NLS-2$
				{ "PRDBB-003", MessagesTPVInter.getString("TPV.53") }, //$NON-NLS-1$ //$NON-NLS-2$
				{ "PRDCR-001", MessagesTPVInter.getString("TPV.55") }, //$NON-NLS-1$ //$NON-NLS-2$
				{ "PRDCR-002", MessagesTPVInter.getString("TPV.57") }, //$NON-NLS-1$ //$NON-NLS-2$
				{ "PRDPT-001", MessagesTPVInter.getString("TPV.59") }, //$NON-NLS-1$ //$NON-NLS-2$
				{ "PRDPZ-001", MessagesTPVInter.getString("TPV.61") }, //$NON-NLS-1$ //$NON-NLS-2$
				{ "PRDPZ-002", MessagesTPVInter.getString("TPV.63") }, //$NON-NLS-1$ //$NON-NLS-2$
		}, new String[] { "ID", MessagesTPVInter.getString("TPV.65") //$NON-NLS-1$ //$NON-NLS-2$
		}));
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(70);
		table.getColumnModel().getColumn(0).setMaxWidth(70);
		scrollPane_8.setViewportView(table);

		lblPddCantidad = new JLabel(MessagesTPVInter.getString("TPV.lblPddCantidad.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPddCantidad = new GridBagConstraints();
		gbc_lblPddCantidad.anchor = GridBagConstraints.EAST;
		gbc_lblPddCantidad.insets = new Insets(0, 0, 0, 5);
		gbc_lblPddCantidad.gridx = 0;
		gbc_lblPddCantidad.gridy = 3;
		pnlPddProductos.add(lblPddCantidad, gbc_lblPddCantidad);

		spnPddCantidad = new JSpinner();
		spnPddCantidad.setSize(new Dimension(30, 0));
		spnPddCantidad.setBounds(new Rectangle(30, 0, 30, 0));
		GridBagConstraints gbc_spnPddCantidad = new GridBagConstraints();
		gbc_spnPddCantidad.anchor = GridBagConstraints.WEST;
		gbc_spnPddCantidad.insets = new Insets(0, 0, 0, 5);
		gbc_spnPddCantidad.gridx = 1;
		gbc_spnPddCantidad.gridy = 3;
		pnlPddProductos.add(spnPddCantidad, gbc_spnPddCantidad);

		pnlHistorial = new JPanel();
		tabbedPane.addTab(MessagesTPVInter.getString("TPV.66"), null, pnlHistorial, null); //$NON-NLS-1$
		GridBagLayout gbl_pnlHistorial = new GridBagLayout();
		gbl_pnlHistorial.columnWidths = new int[] { 52, 0, 0, 0, 46, 0, 73, 0, 95, 0, 76, 38, 85, 0, 0, 33, 0 };
		gbl_pnlHistorial.rowHeights = new int[] { 0, 0, 0, 152, 31, 0 };
		gbl_pnlHistorial.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_pnlHistorial.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		pnlHistorial.setLayout(gbl_pnlHistorial);

		lblHstPedidos = new JLabel(MessagesTPVInter.getString("TPV.lblHstPedidos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblHstPedidos = new GridBagConstraints();
		gbc_lblHstPedidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblHstPedidos.gridx = 1;
		gbc_lblHstPedidos.gridy = 1;
		pnlHistorial.add(lblHstPedidos, gbc_lblHstPedidos);

		txtHstFecha = new JFormattedTextField();
		txtHstFecha.setText(MessagesTPVInter.getString("TPV.txtHstFecha.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtHstFecha = new GridBagConstraints();
		gbc_txtHstFecha.insets = new Insets(0, 0, 5, 5);
		gbc_txtHstFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHstFecha.gridx = 2;
		gbc_txtHstFecha.gridy = 1;
		pnlHistorial.add(txtHstFecha, gbc_txtHstFecha);

		lblHstFiltro = new JLabel(MessagesTPVInter.getString("TPV.lblHstFiltro.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblHstFiltro = new GridBagConstraints();
		gbc_lblHstFiltro.anchor = GridBagConstraints.EAST;
		gbc_lblHstFiltro.insets = new Insets(0, 0, 5, 5);
		gbc_lblHstFiltro.gridx = 3;
		gbc_lblHstFiltro.gridy = 1;
		pnlHistorial.add(lblHstFiltro, gbc_lblHstFiltro);

		txtHstId = new JTextField();
		txtHstId.setText(MessagesTPVInter.getString("TPV.txtHstId.text")); //$NON-NLS-1$
		txtHstId.setColumns(10);
		GridBagConstraints gbc_txtHstId = new GridBagConstraints();
		gbc_txtHstId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHstId.insets = new Insets(0, 0, 5, 5);
		gbc_txtHstId.gridx = 4;
		gbc_txtHstId.gridy = 1;
		pnlHistorial.add(txtHstId, gbc_txtHstId);

		chckbxHstSoloClientes = new JCheckBox(MessagesTPVInter.getString("TPV.chckbxHstSoloClientes.text")); //$NON-NLS-1$
		GridBagConstraints gbc_chckbxHstSoloClientes = new GridBagConstraints();
		gbc_chckbxHstSoloClientes.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxHstSoloClientes.gridx = 5;
		gbc_chckbxHstSoloClientes.gridy = 1;
		pnlHistorial.add(chckbxHstSoloClientes, gbc_chckbxHstSoloClientes);

		lblHstPromocion = new JLabel(MessagesTPVInter.getString("TPV.lblHstPromocion.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblHstPromocion = new GridBagConstraints();
		gbc_lblHstPromocion.anchor = GridBagConstraints.EAST;
		gbc_lblHstPromocion.insets = new Insets(0, 0, 5, 5);
		gbc_lblHstPromocion.gridx = 7;
		gbc_lblHstPromocion.gridy = 1;
		pnlHistorial.add(lblHstPromocion, gbc_lblHstPromocion);

		chckbxHstPromocion = new JComboBox();
		GridBagConstraints gbc_chckbxHstPromocion = new GridBagConstraints();
		gbc_chckbxHstPromocion.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxHstPromocion.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxHstPromocion.gridx = 8;
		gbc_chckbxHstPromocion.gridy = 1;
		pnlHistorial.add(chckbxHstPromocion, gbc_chckbxHstPromocion);

		lblHstTipo = new JLabel(MessagesTPVInter.getString("TPV.lblHstTipo.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblHstTipo = new GridBagConstraints();
		gbc_lblHstTipo.anchor = GridBagConstraints.EAST;
		gbc_lblHstTipo.insets = new Insets(0, 0, 5, 5);
		gbc_lblHstTipo.gridx = 9;
		gbc_lblHstTipo.gridy = 1;
		pnlHistorial.add(lblHstTipo, gbc_lblHstTipo);

		chckbxHstTipo = new JComboBox();
		GridBagConstraints gbc_chckbxHstTipo = new GridBagConstraints();
		gbc_chckbxHstTipo.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxHstTipo.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxHstTipo.gridx = 10;
		gbc_chckbxHstTipo.gridy = 1;
		pnlHistorial.add(chckbxHstTipo, gbc_chckbxHstTipo);

		btnHstAplicarFiltro = new JButton(MessagesTPVInter.getString("TPV.btnHstAplicarFiltro.text")); //$NON-NLS-1$
		GridBagConstraints gbc_btnHstAplicarFiltro = new GridBagConstraints();
		gbc_btnHstAplicarFiltro.insets = new Insets(0, 0, 5, 5);
		gbc_btnHstAplicarFiltro.gridx = 12;
		gbc_btnHstAplicarFiltro.gridy = 1;
		pnlHistorial.add(btnHstAplicarFiltro, gbc_btnHstAplicarFiltro);
		
		btnEliminar_2 = new JButton(MessagesTPVInter.getString("TPV.btnEliminar_2.text")); //$NON-NLS-1$
		btnEliminar_2.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/eliminar32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnEliminar_2 = new GridBagConstraints();
		gbc_btnEliminar_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar_2.gridx = 14;
		gbc_btnEliminar_2.gridy = 1;
		pnlHistorial.add(btnEliminar_2, gbc_btnEliminar_2);

		scrollPane_4 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_4 = new GridBagConstraints();
		gbc_scrollPane_4.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_4.gridwidth = 14;
		gbc_scrollPane_4.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_4.gridx = 1;
		gbc_scrollPane_4.gridy = 3;
		pnlHistorial.add(scrollPane_4, gbc_scrollPane_4);

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(new Object[][] {
				{ "P - 050", MessagesTPVInter.getString("TPV.114"), "1", "6.00", "CL - 005", "12%", "5.28", "23/12/18", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$
						MessagesTPVInter.getString("TPV.136") }, //$NON-NLS-1$
				{ MessagesTPVInter.getString("TPV.5"), MessagesTPVInter.getString("TPV.139"), "2", "4.50", "NO", "0%", "9.00", "23/12/18", MessagesTPVInter.getString("TPV.146") }, }, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ //$NON-NLS-9$
				new String[] { MessagesTPVInter.getString("TPV.147"), MessagesTPVInter.getString("TPV.148"), MessagesTPVInter.getString("TPV.149"), MessagesTPVInter.getString("TPV.150"), MessagesTPVInter.getString("TPV.151"), MessagesTPVInter.getString("TPV.152"), MessagesTPVInter.getString("TPV.153"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$
						MessagesTPVInter.getString("TPV.154"), MessagesTPVInter.getString("TPV.155") }) { //$NON-NLS-1$ //$NON-NLS-2$
			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(0).setPreferredWidth(80);
		table_1.getColumnModel().getColumn(0).setMaxWidth(80);
		table_1.getColumnModel().getColumn(1).setResizable(false);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(300);
		table_1.getColumnModel().getColumn(1).setMaxWidth(300);
		table_1.getColumnModel().getColumn(2).setResizable(false);
		table_1.getColumnModel().getColumn(3).setResizable(false);
		table_1.getColumnModel().getColumn(4).setResizable(false);
		table_1.getColumnModel().getColumn(5).setResizable(false);
		table_1.getColumnModel().getColumn(6).setResizable(false);
		table_1.getColumnModel().getColumn(7).setResizable(false);
		table_1.getColumnModel().getColumn(8).setResizable(false);
		table_1.setFont(new Font("Courier New", Font.BOLD, 18)); //$NON-NLS-1$
		table_1.setRowHeight(50);
		scrollPane_4.setViewportView(table_1);

		pnlProductos = new JPanel();
		tabbedPane.addTab(MessagesTPVInter.getString("TPV.67"), null, pnlProductos, null); //$NON-NLS-1$
		GridBagLayout gbl_pnlProductos = new GridBagLayout();
		gbl_pnlProductos.columnWidths = new int[] { 46, 166, 93, 0, 0, 101, 0, 39, 0 };
		gbl_pnlProductos.rowHeights = new int[] { 0, 37, 0, 149, 0, 29, 0 };
		gbl_pnlProductos.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlProductos.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		pnlProductos.setLayout(gbl_pnlProductos);

		pnlAniadirProducto = new JPanel();
		pnlAniadirProducto.setBorder(new TitledBorder(null,
				MessagesTPVInter.getString("TPV.pnlAniadirProducto.borderTitle"), TitledBorder.LEADING, //$NON-NLS-1$
				TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlAniadirProducto = new GridBagConstraints();
		gbc_pnlAniadirProducto.gridheight = 4;
		gbc_pnlAniadirProducto.insets = new Insets(0, 0, 5, 5);
		gbc_pnlAniadirProducto.fill = GridBagConstraints.BOTH;
		gbc_pnlAniadirProducto.gridx = 6;
		gbc_pnlAniadirProducto.gridy = 0;
		pnlProductos.add(pnlAniadirProducto, gbc_pnlAniadirProducto);
		GridBagLayout gbl_pnlAniadirProducto = new GridBagLayout();
		gbl_pnlAniadirProducto.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_pnlAniadirProducto.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_pnlAniadirProducto.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlAniadirProducto.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		pnlAniadirProducto.setLayout(gbl_pnlAniadirProducto);

		lblImgProducto = new JLabel(MessagesTPVInter.getString("TPV.lblImgProducto.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblImgProducto = new GridBagConstraints();
		gbc_lblImgProducto.gridheight = 3;
		gbc_lblImgProducto.insets = new Insets(0, 0, 5, 5);
		gbc_lblImgProducto.gridx = 0;
		gbc_lblImgProducto.gridy = 0;
		pnlAniadirProducto.add(lblImgProducto, gbc_lblImgProducto);
		lblImgProducto.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/hamburguer100.png"))); //$NON-NLS-1$

		lblPrdNombre = new JLabel(MessagesTPVInter.getString("TPV.lblPrdNombre.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrdNombre = new GridBagConstraints();
		gbc_lblPrdNombre.anchor = GridBagConstraints.EAST;
		gbc_lblPrdNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrdNombre.gridx = 1;
		gbc_lblPrdNombre.gridy = 0;
		pnlAniadirProducto.add(lblPrdNombre, gbc_lblPrdNombre);

		txtPrdNombre = new JTextField();
		txtPrdNombre.setText(MessagesTPVInter.getString("TPV.txtPrdNombre.text")); //$NON-NLS-1$
		txtPrdNombre.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtPrdNombre = new GridBagConstraints();
		gbc_txtPrdNombre.gridwidth = 2;
		gbc_txtPrdNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrdNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrdNombre.gridx = 2;
		gbc_txtPrdNombre.gridy = 0;
		pnlAniadirProducto.add(txtPrdNombre, gbc_txtPrdNombre);
		txtPrdNombre.setColumns(10);

		lblPrdId = new JLabel(MessagesTPVInter.getString("TPV.lblPrdId.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrdId = new GridBagConstraints();
		gbc_lblPrdId.anchor = GridBagConstraints.EAST;
		gbc_lblPrdId.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrdId.gridx = 1;
		gbc_lblPrdId.gridy = 1;
		pnlAniadirProducto.add(lblPrdId, gbc_lblPrdId);

		txtPrdId = new JTextField();
		txtPrdId.setText(MessagesTPVInter.getString("TPV.txtPrdId.text")); //$NON-NLS-1$
		txtPrdId.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtPrdId = new GridBagConstraints();
		gbc_txtPrdId.gridwidth = 2;
		gbc_txtPrdId.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrdId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrdId.gridx = 2;
		gbc_txtPrdId.gridy = 1;
		pnlAniadirProducto.add(txtPrdId, gbc_txtPrdId);
		txtPrdId.setColumns(10);

		lblPrdIngredientes = new JLabel(MessagesTPVInter.getString("TPV.lblPrdIngredientes.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrdIngredientes = new GridBagConstraints();
		gbc_lblPrdIngredientes.anchor = GridBagConstraints.EAST;
		gbc_lblPrdIngredientes.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrdIngredientes.gridx = 1;
		gbc_lblPrdIngredientes.gridy = 2;
		pnlAniadirProducto.add(lblPrdIngredientes, gbc_lblPrdIngredientes);

		btnPrdAniadir = new JButton(MessagesTPVInter.getString("TPV.btnPrdAniadir.text")); //$NON-NLS-1$
		btnPrdAniadir.setToolTipText(MessagesTPVInter.getString("TPV.btnPrdAniadir.toolTipText")); //$NON-NLS-1$
		btnPrdAniadir.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/aniadir20.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnPrdAniadir = new GridBagConstraints();
		gbc_btnPrdAniadir.anchor = GridBagConstraints.WEST;
		gbc_btnPrdAniadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnPrdAniadir.gridx = 2;
		gbc_btnPrdAniadir.gridy = 2;
		pnlAniadirProducto.add(btnPrdAniadir, gbc_btnPrdAniadir);

		btnPrdEliminar = new JButton(MessagesTPVInter.getString("TPV.btnPrdEliminar.text")); //$NON-NLS-1$
		btnPrdEliminar.setToolTipText(MessagesTPVInter.getString("TPV.btnPrdEliminar.toolTipText")); //$NON-NLS-1$
		btnPrdEliminar.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/eliminar20.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnPrdEliminar = new GridBagConstraints();
		gbc_btnPrdEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnPrdEliminar.gridx = 3;
		gbc_btnPrdEliminar.gridy = 2;
		pnlAniadirProducto.add(btnPrdEliminar, gbc_btnPrdEliminar);

		scrollPane_6 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_6 = new GridBagConstraints();
		gbc_scrollPane_6.gridwidth = 7;
		gbc_scrollPane_6.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_6.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_6.gridx = 0;
		gbc_scrollPane_6.gridy = 3;
		pnlAniadirProducto.add(scrollPane_6, gbc_scrollPane_6);

		table_2 = new JTable();
		table_2.setRowHeight(25);
		table_2.setFont(new Font("Courier New", Font.BOLD, 16)); //$NON-NLS-1$
		table_2.setModel(new DefaultTableModel(
				new Object[][] { { MessagesTPVInter.getString("TPV.156"), "150 GR" }, { MessagesTPVInter.getString("TPV.162"), "1" }, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
						{ MessagesTPVInter.getString("TPV.177"), "3" }, { MessagesTPVInter.getString("TPV.182"), "2" }, }, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
				new String[] { MessagesTPVInter.getString("TPV.184"), MessagesTPVInter.getString("TPV.185") }) { //$NON-NLS-1$ //$NON-NLS-2$
			Class[] columnTypes = new Class[] { String.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] { false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_2.getColumnModel().getColumn(1).setMaxWidth(75);
		scrollPane_6.setViewportView(table_2);

		lblPrdAlergenos = new JLabel(MessagesTPVInter.getString("TPV.lblPrdAlergenos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrdAlergenos = new GridBagConstraints();
		gbc_lblPrdAlergenos.anchor = GridBagConstraints.WEST;
		gbc_lblPrdAlergenos.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrdAlergenos.gridx = 1;
		gbc_lblPrdAlergenos.gridy = 4;
		pnlAniadirProducto.add(lblPrdAlergenos, gbc_lblPrdAlergenos);

		lblPrdEspecial = new JLabel(MessagesTPVInter.getString("TPV.lblPrdEspecial.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrdEspecial = new GridBagConstraints();
		gbc_lblPrdEspecial.gridwidth = 2;
		gbc_lblPrdEspecial.anchor = GridBagConstraints.WEST;
		gbc_lblPrdEspecial.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrdEspecial.gridx = 2;
		gbc_lblPrdEspecial.gridy = 4;
		pnlAniadirProducto.add(lblPrdEspecial, gbc_lblPrdEspecial);

		chckbxGluten_1 = new JCheckBox(MessagesTPVInter.getString("TPV.chckbxGluten_1.text")); //$NON-NLS-1$
		chckbxGluten_1.setSelected(true);
		GridBagConstraints gbc_chckbxGluten_1 = new GridBagConstraints();
		gbc_chckbxGluten_1.anchor = GridBagConstraints.WEST;
		gbc_chckbxGluten_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxGluten_1.gridx = 1;
		gbc_chckbxGluten_1.gridy = 5;
		pnlAniadirProducto.add(chckbxGluten_1, gbc_chckbxGluten_1);

		chckbxVegano = new JCheckBox(MessagesTPVInter.getString("TPV.chckbxVegano.text")); //$NON-NLS-1$
		GridBagConstraints gbc_chckbxVegano = new GridBagConstraints();
		gbc_chckbxVegano.gridwidth = 2;
		gbc_chckbxVegano.anchor = GridBagConstraints.WEST;
		gbc_chckbxVegano.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxVegano.gridx = 2;
		gbc_chckbxVegano.gridy = 5;
		pnlAniadirProducto.add(chckbxVegano, gbc_chckbxVegano);

		lblPrecio_1 = new JLabel(MessagesTPVInter.getString("TPV.lblPrecio_1.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrecio_1 = new GridBagConstraints();
		gbc_lblPrecio_1.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio_1.gridx = 5;
		gbc_lblPrecio_1.gridy = 5;
		pnlAniadirProducto.add(lblPrecio_1, gbc_lblPrecio_1);

		ftxtPrdPrecio = new JFormattedTextField();
		ftxtPrdPrecio.setFont(new Font("Tahoma", Font.BOLD, 15)); //$NON-NLS-1$
		ftxtPrdPrecio.setText(MessagesTPVInter.getString("TPV.ftxtPrdPrecio.text")); //$NON-NLS-1$
		ftxtPrdPrecio.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_ftxtPrdPrecio = new GridBagConstraints();
		gbc_ftxtPrdPrecio.insets = new Insets(0, 0, 5, 0);
		gbc_ftxtPrdPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtPrdPrecio.gridx = 6;
		gbc_ftxtPrdPrecio.gridy = 5;
		pnlAniadirProducto.add(ftxtPrdPrecio, gbc_ftxtPrdPrecio);

		chckbxNewCheckBox = new JCheckBox(MessagesTPVInter.getString("TPV.chckbxNewCheckBox.text")); //$NON-NLS-1$
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 6;
		pnlAniadirProducto.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);

		chckbxVegetariano = new JCheckBox(MessagesTPVInter.getString("TPV.chckbxVegetariano.text")); //$NON-NLS-1$
		GridBagConstraints gbc_chckbxVegetariano = new GridBagConstraints();
		gbc_chckbxVegetariano.gridwidth = 2;
		gbc_chckbxVegetariano.anchor = GridBagConstraints.WEST;
		gbc_chckbxVegetariano.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxVegetariano.gridx = 2;
		gbc_chckbxVegetariano.gridy = 6;
		pnlAniadirProducto.add(chckbxVegetariano, gbc_chckbxVegetariano);

		btnAadirProducto = new JButton(MessagesTPVInter.getString("TPV.btnAadirProducto.text")); //$NON-NLS-1$
		btnAadirProducto.setToolTipText(MessagesTPVInter.getString("TPV.btnAadirProducto.toolTipText")); //$NON-NLS-1$
		btnAadirProducto.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/guardar32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnAadirProducto = new GridBagConstraints();
		gbc_btnAadirProducto.gridheight = 2;
		gbc_btnAadirProducto.gridwidth = 2;
		gbc_btnAadirProducto.insets = new Insets(0, 0, 5, 0);
		gbc_btnAadirProducto.gridx = 5;
		gbc_btnAadirProducto.gridy = 6;
		pnlAniadirProducto.add(btnAadirProducto, gbc_btnAadirProducto);

		chckbxHuevo_1 = new JCheckBox(MessagesTPVInter.getString("TPV.chckbxHuevo_1.text")); //$NON-NLS-1$
		GridBagConstraints gbc_chckbxHuevo_1 = new GridBagConstraints();
		gbc_chckbxHuevo_1.anchor = GridBagConstraints.WEST;
		gbc_chckbxHuevo_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxHuevo_1.gridx = 1;
		gbc_chckbxHuevo_1.gridy = 7;
		pnlAniadirProducto.add(chckbxHuevo_1, gbc_chckbxHuevo_1);

		chckbxEcolgico = new JCheckBox(MessagesTPVInter.getString("TPV.chckbxEcolgico.text")); //$NON-NLS-1$
		GridBagConstraints gbc_chckbxEcolgico = new GridBagConstraints();
		gbc_chckbxEcolgico.gridwidth = 2;
		gbc_chckbxEcolgico.anchor = GridBagConstraints.WEST;
		gbc_chckbxEcolgico.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxEcolgico.gridx = 2;
		gbc_chckbxEcolgico.gridy = 7;
		pnlAniadirProducto.add(chckbxEcolgico, gbc_chckbxEcolgico);

		chckbxLeche_1 = new JCheckBox(MessagesTPVInter.getString("TPV.chckbxLeche_1.text")); //$NON-NLS-1$
		chckbxLeche_1.setSelected(true);
		GridBagConstraints gbc_chckbxLeche_1 = new GridBagConstraints();
		gbc_chckbxLeche_1.anchor = GridBagConstraints.WEST;
		gbc_chckbxLeche_1.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxLeche_1.gridx = 1;
		gbc_chckbxLeche_1.gridy = 8;
		pnlAniadirProducto.add(chckbxLeche_1, gbc_chckbxLeche_1);

		txtBuscarProducto = new JTextField();
		txtBuscarProducto.addFocusListener(new txtFocusListener());
		txtBuscarProducto.setText(MessagesTPVInter.getString("TPV.txtBuscarProducto.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtBuscarProducto = new GridBagConstraints();
		gbc_txtBuscarProducto.gridwidth = 2;
		gbc_txtBuscarProducto.insets = new Insets(0, 0, 5, 5);
		gbc_txtBuscarProducto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBuscarProducto.gridx = 1;
		gbc_txtBuscarProducto.gridy = 1;
		pnlProductos.add(txtBuscarProducto, gbc_txtBuscarProducto);
		txtBuscarProducto.setColumns(10);

		btnAniadir = new JButton(MessagesTPVInter.getString("TPV.btnAniadir.text")); //$NON-NLS-1$
		btnAniadir.setToolTipText(MessagesTPVInter.getString("TPV.btnAniadir.toolTipText")); //$NON-NLS-1$
		btnAniadir.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/aniadir32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnAniadir = new GridBagConstraints();
		gbc_btnAniadir.gridheight = 2;
		gbc_btnAniadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAniadir.gridx = 3;
		gbc_btnAniadir.gridy = 1;
		pnlProductos.add(btnAniadir, gbc_btnAniadir);

		lblCategoria = new JLabel(MessagesTPVInter.getString("TPV.lblCategoria.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblCategoria = new GridBagConstraints();
		gbc_lblCategoria.anchor = GridBagConstraints.EAST;
		gbc_lblCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_lblCategoria.gridx = 1;
		gbc_lblCategoria.gridy = 2;
		pnlProductos.add(lblCategoria, gbc_lblCategoria);

		cmbxCategoria = new JComboBox();
		cmbxCategoria.setModel(new DefaultComboBoxModel(new String[] { MessagesTPVInter.getString("TPV.85"), //$NON-NLS-1$
				MessagesTPVInter.getString("TPV.86"), MessagesTPVInter.getString("TPV.87"), //$NON-NLS-1$ //$NON-NLS-2$
				MessagesTPVInter.getString("TPV.88"), MessagesTPVInter.getString("TPV.89") })); //$NON-NLS-1$ //$NON-NLS-2$
		GridBagConstraints gbc_cmbxCategoria = new GridBagConstraints();
		gbc_cmbxCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_cmbxCategoria.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbxCategoria.gridx = 2;
		gbc_cmbxCategoria.gridy = 2;
		pnlProductos.add(cmbxCategoria, gbc_cmbxCategoria);

		btnEliminar = new JButton(MessagesTPVInter.getString("TPV.btnEliminar.text")); //$NON-NLS-1$
		btnEliminar.setToolTipText(MessagesTPVInter.getString("TPV.btnEliminar.toolTipText")); //$NON-NLS-1$
		btnEliminar.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/eliminar32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.gridheight = 2;
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 4;
		gbc_btnEliminar.gridy = 1;
		pnlProductos.add(btnEliminar, gbc_btnEliminar);

		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 2;
		gbc_scrollPane_1.gridwidth = 5;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 3;
		pnlProductos.add(scrollPane_1, gbc_scrollPane_1);

		tblProductos = new JTable();
		tblProductos.setRowHeight(30);
		tblProductos.setFont(new Font("Courier New", Font.BOLD, 20)); //$NON-NLS-1$
		tblProductos
				.setModel(new DefaultTableModel(
						new Object[][] { { "PRDBB-001", MessagesTPVInter.getString("TPV.187"), MessagesTPVInter.getString("TPV.188"), null, "1.80" }, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
								{ "PRDBB-002", MessagesTPVInter.getString("TPV.192"), MessagesTPVInter.getString("TPV.193"), null, "1.80" }, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
								{ "PRDBB-003", MessagesTPVInter.getString("TPV.196"), MessagesTPVInter.getString("TPV.197"), null, "1.00" }, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
								{ "PRDCR-001", MessagesTPVInter.getString("TPV.201"), MessagesTPVInter.getString("TPV.204"), MessagesTPVInter.getString("TPV.208"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
										"4.50" }, //$NON-NLS-1$
								{ "PRDCR-002", MessagesTPVInter.getString("TPV.212"), MessagesTPVInter.getString("TPV.213"), MessagesTPVInter.getString("TPV.214"), "4.50" }, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
								{ "PRDPT-001", MessagesTPVInter.getString("TPV.217"), MessagesTPVInter.getString("TPV.218"), MessagesTPVInter.getString("TPV.8"), "6.00" }, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
								{ "PRDPZ-001", MessagesTPVInter.getString("TPV.222"), MessagesTPVInter.getString("TPV.223"), MessagesTPVInter.getString("TPV.224"), "7.25" }, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
								{ "PRDPZ-001", MessagesTPVInter.getString("TPV.227"), MessagesTPVInter.getString("TPV.228"), null, "8.25" }, }, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
						new String[] { MessagesTPVInter.getString("TPV.230"), MessagesTPVInter.getString("TPV.231"), MessagesTPVInter.getString("TPV.232"), MessagesTPVInter.getString("TPV.233"), MessagesTPVInter.getString("TPV.234") }) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
					boolean[] columnEditables = new boolean[] { false, false, false, false, false };

					public boolean isCellEditable(int row, int column) {
						return columnEditables[column];
					}
				});
		tblProductos.getColumnModel().getColumn(0).setResizable(false);
		tblProductos.getColumnModel().getColumn(0).setPreferredWidth(120);
		tblProductos.getColumnModel().getColumn(0).setMaxWidth(120);
		tblProductos.getColumnModel().getColumn(1).setPreferredWidth(300);
		tblProductos.getColumnModel().getColumn(1).setMaxWidth(300);
		tblProductos.getColumnModel().getColumn(4).setPreferredWidth(70);
		tblProductos.getColumnModel().getColumn(4).setMaxWidth(70);
		scrollPane_1.setViewportView(tblProductos);

		pnlAniadirIngrediente = new JPanel();
		pnlAniadirIngrediente
				.setBorder(new TitledBorder(null, MessagesTPVInter.getString("TPV.pnlAniadirIngrediente.borderTitle"), //$NON-NLS-1$
						TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlAniadirIngrediente = new GridBagConstraints();
		gbc_pnlAniadirIngrediente.insets = new Insets(0, 0, 5, 5);
		gbc_pnlAniadirIngrediente.fill = GridBagConstraints.BOTH;
		gbc_pnlAniadirIngrediente.gridx = 6;
		gbc_pnlAniadirIngrediente.gridy = 4;
		pnlProductos.add(pnlAniadirIngrediente, gbc_pnlAniadirIngrediente);
		GridBagLayout gbl_pnlAniadirIngrediente = new GridBagLayout();
		gbl_pnlAniadirIngrediente.columnWidths = new int[] { 0, 63, 0, 0, 0 };
		gbl_pnlAniadirIngrediente.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_pnlAniadirIngrediente.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_pnlAniadirIngrediente.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlAniadirIngrediente.setLayout(gbl_pnlAniadirIngrediente);

		lblPrdBuscarIngrediente = new JLabel(MessagesTPVInter.getString("TPV.lblPrdBuscarIngrediente.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrdBuscarIngrediente = new GridBagConstraints();
		gbc_lblPrdBuscarIngrediente.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrdBuscarIngrediente.anchor = GridBagConstraints.EAST;
		gbc_lblPrdBuscarIngrediente.gridx = 0;
		gbc_lblPrdBuscarIngrediente.gridy = 0;
		pnlAniadirIngrediente.add(lblPrdBuscarIngrediente, gbc_lblPrdBuscarIngrediente);

		txtPrdBuscarIngrediente = new JTextField();
		txtPrdBuscarIngrediente.setText(MessagesTPVInter.getString("TPV.txtPrdBuscarIngrediente.text")); //$NON-NLS-1$
		txtPrdBuscarIngrediente.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtPrdBuscarIngrediente = new GridBagConstraints();
		gbc_txtPrdBuscarIngrediente.gridwidth = 2;
		gbc_txtPrdBuscarIngrediente.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrdBuscarIngrediente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrdBuscarIngrediente.gridx = 1;
		gbc_txtPrdBuscarIngrediente.gridy = 0;
		pnlAniadirIngrediente.add(txtPrdBuscarIngrediente, gbc_txtPrdBuscarIngrediente);
		txtPrdBuscarIngrediente.setColumns(10);

		list_2 = new JList();
		list_2.setModel(new AbstractListModel() {
			String[] values = new String[] { MessagesTPVInter.getString("TPV.133"), //$NON-NLS-1$
					MessagesTPVInter.getString("TPV.134"), MessagesTPVInter.getString("TPV.135") }; //$NON-NLS-1$ //$NON-NLS-2$

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_2.setFont(new Font("Courier New", Font.BOLD, 16)); //$NON-NLS-1$
		GridBagConstraints gbc_list_2 = new GridBagConstraints();
		gbc_list_2.gridwidth = 2;
		gbc_list_2.insets = new Insets(0, 0, 5, 5);
		gbc_list_2.fill = GridBagConstraints.BOTH;
		gbc_list_2.gridx = 1;
		gbc_list_2.gridy = 1;
		pnlAniadirIngrediente.add(list_2, gbc_list_2);

		lblPrdNuevo = new JLabel(MessagesTPVInter.getString("TPV.lblPrdNuevo.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrdNuevo = new GridBagConstraints();
		gbc_lblPrdNuevo.anchor = GridBagConstraints.EAST;
		gbc_lblPrdNuevo.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrdNuevo.gridx = 0;
		gbc_lblPrdNuevo.gridy = 2;
		pnlAniadirIngrediente.add(lblPrdNuevo, gbc_lblPrdNuevo);

		txtPrdNuevoIngrediente = new JTextField();
		txtPrdNuevoIngrediente.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtPrdNuevoIngrediente = new GridBagConstraints();
		gbc_txtPrdNuevoIngrediente.gridwidth = 2;
		gbc_txtPrdNuevoIngrediente.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrdNuevoIngrediente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrdNuevoIngrediente.gridx = 1;
		gbc_txtPrdNuevoIngrediente.gridy = 2;
		pnlAniadirIngrediente.add(txtPrdNuevoIngrediente, gbc_txtPrdNuevoIngrediente);
		txtPrdNuevoIngrediente.setColumns(10);

		lblPrdCantidad = new JLabel(MessagesTPVInter.getString("TPV.lblPrdCantidad.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrdCantidad = new GridBagConstraints();
		gbc_lblPrdCantidad.anchor = GridBagConstraints.EAST;
		gbc_lblPrdCantidad.insets = new Insets(0, 0, 0, 5);
		gbc_lblPrdCantidad.gridx = 0;
		gbc_lblPrdCantidad.gridy = 3;
		pnlAniadirIngrediente.add(lblPrdCantidad, gbc_lblPrdCantidad);

		spnPrdCantidad = new JSpinner();
		GridBagConstraints gbc_spnPrdCantidad = new GridBagConstraints();
		gbc_spnPrdCantidad.anchor = GridBagConstraints.WEST;
		gbc_spnPrdCantidad.insets = new Insets(0, 0, 0, 5);
		gbc_spnPrdCantidad.gridx = 1;
		gbc_spnPrdCantidad.gridy = 3;
		pnlAniadirIngrediente.add(spnPrdCantidad, gbc_spnPrdCantidad);

		txtGramosotrasUnidades = new JTextField();
		txtGramosotrasUnidades.setText(MessagesTPVInter.getString("TPV.txtGramosotrasUnidades.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtGramosotrasUnidades = new GridBagConstraints();
		gbc_txtGramosotrasUnidades.insets = new Insets(0, 0, 0, 5);
		gbc_txtGramosotrasUnidades.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGramosotrasUnidades.gridx = 2;
		gbc_txtGramosotrasUnidades.gridy = 3;
		pnlAniadirIngrediente.add(txtGramosotrasUnidades, gbc_txtGramosotrasUnidades);
		txtGramosotrasUnidades.setColumns(10);

		pnlClientes = new JPanel();
		tabbedPane.addTab(MessagesTPVInter.getString("TPV.137"), null, pnlClientes, null); //$NON-NLS-1$
		GridBagLayout gbl_pnlClientes = new GridBagLayout();
		gbl_pnlClientes.columnWidths = new int[] { 36, 0, 226, 0, 0, 0, 30, 0 };
		gbl_pnlClientes.rowHeights = new int[] { 0, 0, 139, 0, 30, 0 };
		gbl_pnlClientes.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_pnlClientes.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlClientes.setLayout(gbl_pnlClientes);

		lblCltBuscarCliente = new JLabel(MessagesTPVInter.getString("TPV.lblCltBuscarCliente.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblCltBuscarCliente = new GridBagConstraints();
		gbc_lblCltBuscarCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblCltBuscarCliente.anchor = GridBagConstraints.EAST;
		gbc_lblCltBuscarCliente.gridx = 1;
		gbc_lblCltBuscarCliente.gridy = 1;
		pnlClientes.add(lblCltBuscarCliente, gbc_lblCltBuscarCliente);

		txtBuscarCliente = new JTextField();
		txtBuscarCliente.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtBuscarCliente = new GridBagConstraints();
		gbc_txtBuscarCliente.insets = new Insets(0, 0, 5, 5);
		gbc_txtBuscarCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBuscarCliente.gridx = 2;
		gbc_txtBuscarCliente.gridy = 1;
		pnlClientes.add(txtBuscarCliente, gbc_txtBuscarCliente);
		txtBuscarCliente.setColumns(10);

		btnCltNuevo = new JButton(MessagesTPVInter.getString("TPV.btnCltNuevo.text")); //$NON-NLS-1$
		btnCltNuevo.setToolTipText(MessagesTPVInter.getString("TPV.btnCltNuevo.toolTipText")); //$NON-NLS-1$
		btnCltNuevo.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/aniadir32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnCltNuevo = new GridBagConstraints();
		gbc_btnCltNuevo.insets = new Insets(0, 0, 5, 5);
		gbc_btnCltNuevo.gridx = 3;
		gbc_btnCltNuevo.gridy = 1;
		pnlClientes.add(btnCltNuevo, gbc_btnCltNuevo);

		btnEliminar_1 = new JButton(MessagesTPVInter.getString("TPV.btnEliminar_1.text")); //$NON-NLS-1$
		btnEliminar_1.setToolTipText(MessagesTPVInter.getString("TPV.btnEliminar_1.toolTipText")); //$NON-NLS-1$
		btnEliminar_1.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/eliminar32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnEliminar_1 = new GridBagConstraints();
		gbc_btnEliminar_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar_1.gridx = 4;
		gbc_btnEliminar_1.gridy = 1;
		pnlClientes.add(btnEliminar_1, gbc_btnEliminar_1);

		scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.gridwidth = 5;
		gbc_scrollPane_2.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 1;
		gbc_scrollPane_2.gridy = 2;
		pnlClientes.add(scrollPane_2, gbc_scrollPane_2);

		tblClientes = new JTable();
		tblClientes.setRowHeight(40);
		tblClientes.setFont(new Font("Courier New", Font.BOLD, 18)); //$NON-NLS-1$
		tblClientes.setModel(new DefaultTableModel(
			new Object[][] {
				{"CL-003", "Antonio", "Merino Garcia", "654789425", "Calle Martires 5 (Ciudad Real)"}, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
				{"CL-012", "Julia", "Rodriguez Campos", "623071415", "Calle Jorge Manrique 10 (Ciudad Real)"}, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
				{"CL-015", "Vicente", "Rodriguez Campos", "682042806", "Calle Era 16 (Ciudad Real)"}, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
			},
			new String[] {
				MessagesTPVInter.getString("TPV.123"), MessagesTPVInter.getString("TPV.124"), MessagesTPVInter.getString("TPV.127"), MessagesTPVInter.getString("TPV.128"), MessagesTPVInter.getString("TPV.138") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, true, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblClientes.getColumnModel().getColumn(0).setMaxWidth(75);
		tblClientes.getColumnModel().getColumn(3).setResizable(false);
		tblClientes.getColumnModel().getColumn(3).setPreferredWidth(150);
		tblClientes.getColumnModel().getColumn(3).setMaxWidth(150);
		tblClientes.getColumnModel().getColumn(4).setPreferredWidth(500);
		tblClientes.getColumnModel().getColumn(4).setMaxWidth(500);
		scrollPane_2.setViewportView(tblClientes);

		pnlCliente = new JPanel();
		pnlCliente.setBorder(new TitledBorder(null, MessagesTPVInter.getString("TPV.pnlCliente.borderTitle"), //$NON-NLS-1$
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlCliente = new GridBagConstraints();
		gbc_pnlCliente.gridwidth = 5;
		gbc_pnlCliente.insets = new Insets(0, 0, 5, 5);
		gbc_pnlCliente.fill = GridBagConstraints.BOTH;
		gbc_pnlCliente.gridx = 1;
		gbc_pnlCliente.gridy = 3;
		pnlClientes.add(pnlCliente, gbc_pnlCliente);
		GridBagLayout gbl_pnlCliente = new GridBagLayout();
		gbl_pnlCliente.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 60, 0, 82, 129, 0, 0, 0 };
		gbl_pnlCliente.rowHeights = new int[] { 0, 36, 37, 0, 0, 0 };
		gbl_pnlCliente.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		gbl_pnlCliente.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		pnlCliente.setLayout(gbl_pnlCliente);

		lblImgCliente = new JLabel(MessagesTPVInter.getString("TPV.lblImgCliente.text")); //$NON-NLS-1$
		lblImgCliente.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblImgCliente.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/cliente100.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblImgCliente = new GridBagConstraints();
		gbc_lblImgCliente.gridheight = 3;
		gbc_lblImgCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblImgCliente.gridx = 1;
		gbc_lblImgCliente.gridy = 1;
		pnlCliente.add(lblImgCliente, gbc_lblImgCliente);

		lblNombre_1 = new JLabel(MessagesTPVInter.getString("TPV.lblNombre_1.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblNombre_1 = new GridBagConstraints();
		gbc_lblNombre_1.anchor = GridBagConstraints.EAST;
		gbc_lblNombre_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre_1.gridx = 3;
		gbc_lblNombre_1.gridy = 1;
		pnlCliente.add(lblNombre_1, gbc_lblNombre_1);

		txtClNombre = new JTextField();
		txtClNombre.addFocusListener(new txtFocusListener());
		txtClNombre.setText(MessagesTPVInter.getString("TPV.txtClNombre.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtClNombre = new GridBagConstraints();
		gbc_txtClNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtClNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtClNombre.gridx = 4;
		gbc_txtClNombre.gridy = 1;
		pnlCliente.add(txtClNombre, gbc_txtClNombre);
		txtClNombre.setColumns(10);

		lblDireccion = new JLabel(MessagesTPVInter.getString("TPV.lblDireccion.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.anchor = GridBagConstraints.EAST;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 5;
		gbc_lblDireccion.gridy = 1;
		pnlCliente.add(lblDireccion, gbc_lblDireccion);

		txtClDireccion = new JTextField();
		txtClDireccion.addFocusListener(new txtFocusListener());
		txtClDireccion.setText(MessagesTPVInter.getString("TPV.txtClDireccion.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtClDireccion = new GridBagConstraints();
		gbc_txtClDireccion.gridwidth = 3;
		gbc_txtClDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_txtClDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtClDireccion.gridx = 6;
		gbc_txtClDireccion.gridy = 1;
		pnlCliente.add(txtClDireccion, gbc_txtClDireccion);
		txtClDireccion.setColumns(10);

		lblAlergias = new JLabel(MessagesTPVInter.getString("TPV.lblAlergias.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblAlergias = new GridBagConstraints();
		gbc_lblAlergias.anchor = GridBagConstraints.WEST;
		gbc_lblAlergias.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlergias.gridx = 9;
		gbc_lblAlergias.gridy = 1;
		pnlCliente.add(lblAlergias, gbc_lblAlergias);

		lblApellidos = new JLabel(MessagesTPVInter.getString("TPV.lblApellidos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 3;
		gbc_lblApellidos.gridy = 2;
		pnlCliente.add(lblApellidos, gbc_lblApellidos);

		txtClApellidos = new JTextField();
		txtClApellidos.addFocusListener(new txtFocusListener());
		txtClApellidos.setText(MessagesTPVInter.getString("TPV.txtClApellidos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtClApellidos = new GridBagConstraints();
		gbc_txtClApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtClApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtClApellidos.gridx = 4;
		gbc_txtClApellidos.gridy = 2;
		pnlCliente.add(txtClApellidos, gbc_txtClApellidos);
		txtClApellidos.setColumns(10);

		lblEmail = new JLabel(MessagesTPVInter.getString("TPV.lblEmail.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 5;
		gbc_lblEmail.gridy = 2;
		pnlCliente.add(lblEmail, gbc_lblEmail);

		txtClEmail = new JTextField();
		txtClEmail.addFocusListener(new txtFocusListener());
		txtClEmail.setText(MessagesTPVInter.getString("TPV.txtClEmail.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtClEmail = new GridBagConstraints();
		gbc_txtClEmail.gridwidth = 3;
		gbc_txtClEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtClEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtClEmail.gridx = 6;
		gbc_txtClEmail.gridy = 2;
		pnlCliente.add(txtClEmail, gbc_txtClEmail);
		txtClEmail.setColumns(10);

		txtaAlergias = new JTextArea();
		txtaAlergias.addFocusListener(new txtFocusListener());
		txtaAlergias.setText(MessagesTPVInter.getString("TPV.txtaAlergias.text")); //$NON-NLS-1$
		txtaAlergias.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_txtaAlergias = new GridBagConstraints();
		gbc_txtaAlergias.gridheight = 2;
		gbc_txtaAlergias.insets = new Insets(0, 0, 5, 5);
		gbc_txtaAlergias.fill = GridBagConstraints.BOTH;
		gbc_txtaAlergias.gridx = 9;
		gbc_txtaAlergias.gridy = 2;
		pnlCliente.add(txtaAlergias, gbc_txtaAlergias);

		btnGuardar = new JButton(MessagesTPVInter.getString("TPV.btnGuardar.text")); //$NON-NLS-1$
		btnGuardar.setToolTipText(MessagesTPVInter.getString("TPV.btnGuardar.toolTipText")); //$NON-NLS-1$
		btnGuardar.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/guardar32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.gridheight = 2;
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 10;
		gbc_btnGuardar.gridy = 2;
		pnlCliente.add(btnGuardar, gbc_btnGuardar);

		lblTelfono = new JLabel(MessagesTPVInter.getString("TPV.lblTelfono.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
		gbc_lblTelfono.anchor = GridBagConstraints.EAST;
		gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelfono.gridx = 3;
		gbc_lblTelfono.gridy = 3;
		pnlCliente.add(lblTelfono, gbc_lblTelfono);

		txtClTelefono = new JTextField();
		txtClTelefono.addFocusListener(new txtFocusListener());
		txtClTelefono.setText(MessagesTPVInter.getString("TPV.txtClTelefono.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtClTelefono = new GridBagConstraints();
		gbc_txtClTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_txtClTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtClTelefono.gridx = 4;
		gbc_txtClTelefono.gridy = 3;
		pnlCliente.add(txtClTelefono, gbc_txtClTelefono);
		txtClTelefono.setColumns(10);

		lblPuntos = new JLabel(MessagesTPVInter.getString("TPV.lblPuntos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPuntos = new GridBagConstraints();
		gbc_lblPuntos.anchor = GridBagConstraints.EAST;
		gbc_lblPuntos.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos.gridx = 5;
		gbc_lblPuntos.gridy = 3;
		pnlCliente.add(lblPuntos, gbc_lblPuntos);

		cmbxClPuntos = new JComboBox();
		GridBagConstraints gbc_cmbxClPuntos = new GridBagConstraints();
		gbc_cmbxClPuntos.insets = new Insets(0, 0, 5, 5);
		gbc_cmbxClPuntos.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbxClPuntos.gridx = 6;
		gbc_cmbxClPuntos.gridy = 3;
		pnlCliente.add(cmbxClPuntos, gbc_cmbxClPuntos);

		lblCaducanEl = new JLabel(MessagesTPVInter.getString("TPV.lblCaducanEl.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblCaducanEl = new GridBagConstraints();
		gbc_lblCaducanEl.anchor = GridBagConstraints.EAST;
		gbc_lblCaducanEl.insets = new Insets(0, 0, 5, 5);
		gbc_lblCaducanEl.gridx = 7;
		gbc_lblCaducanEl.gridy = 3;
		pnlCliente.add(lblCaducanEl, gbc_lblCaducanEl);

		ftxtCaducidad = new JFormattedTextField();
		ftxtCaducidad.addFocusListener(new txtFocusListener());
		ftxtCaducidad.setText(MessagesTPVInter.getString("TPV.ftxtCaducidad.text")); //$NON-NLS-1$
		GridBagConstraints gbc_ftxtCaducidad = new GridBagConstraints();
		gbc_ftxtCaducidad.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtCaducidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtCaducidad.gridx = 8;
		gbc_ftxtCaducidad.gridy = 3;
		pnlCliente.add(ftxtCaducidad, gbc_ftxtCaducidad);

		pnlPromociones = new JPanel();
		tabbedPane.addTab(MessagesTPVInter.getString("TPV.163"), null, pnlPromociones, null); //$NON-NLS-1$
		GridBagLayout gbl_pnlPromociones = new GridBagLayout();
		gbl_pnlPromociones.columnWidths = new int[] { 33, 165, 199, 32, 245, 65, 206, 0, 0, 165, 0, 29, 0 };
		gbl_pnlPromociones.rowHeights = new int[] { 36, 0, 0, 0, 125, 0, 0, 28, 0 };
		gbl_pnlPromociones.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0,
				Double.MIN_VALUE };
		gbl_pnlPromociones.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlPromociones.setLayout(gbl_pnlPromociones);

		txtPrmBuscarPromocion = new JTextField();
		txtPrmBuscarPromocion.addFocusListener(new txtFocusListener());
		txtPrmBuscarPromocion.setText(MessagesTPVInter.getString("TPV.txtPrmBuscarPromocion.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtPrmBuscarPromocion = new GridBagConstraints();
		gbc_txtPrmBuscarPromocion.gridwidth = 2;
		gbc_txtPrmBuscarPromocion.anchor = GridBagConstraints.NORTH;
		gbc_txtPrmBuscarPromocion.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrmBuscarPromocion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrmBuscarPromocion.gridx = 1;
		gbc_txtPrmBuscarPromocion.gridy = 1;
		pnlPromociones.add(txtPrmBuscarPromocion, gbc_txtPrmBuscarPromocion);
		txtPrmBuscarPromocion.setColumns(10);

		lstPrmPromociones = new JList();
		lstPrmPromociones.setFont(new Font("Courier New", Font.BOLD, 18)); //$NON-NLS-1$
		lstPrmPromociones.setBorder(new LineBorder(new Color(0, 0, 0)));
		lstPrmPromociones.setModel(new AbstractListModel() {
			String[] values = new String[] { MessagesTPVInter.getString("TPV.165"), //$NON-NLS-1$
					MessagesTPVInter.getString("TPV.166"), MessagesTPVInter.getString("TPV.167") }; //$NON-NLS-1$ //$NON-NLS-2$

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		GridBagConstraints gbc_lstPrmPromociones = new GridBagConstraints();
		gbc_lstPrmPromociones.gridwidth = 2;
		gbc_lstPrmPromociones.gridheight = 3;
		gbc_lstPrmPromociones.insets = new Insets(0, 0, 5, 5);
		gbc_lstPrmPromociones.fill = GridBagConstraints.BOTH;
		gbc_lstPrmPromociones.gridx = 1;
		gbc_lstPrmPromociones.gridy = 2;
		pnlPromociones.add(lstPrmPromociones, gbc_lstPrmPromociones);

		lblPrmId = new JLabel(MessagesTPVInter.getString("TPV.lblPrmId.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrmId = new GridBagConstraints();
		gbc_lblPrmId.anchor = GridBagConstraints.EAST;
		gbc_lblPrmId.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrmId.gridx = 3;
		gbc_lblPrmId.gridy = 2;
		pnlPromociones.add(lblPrmId, gbc_lblPrmId);

		txtPrmId = new JTextField();
		txtPrmId.addFocusListener(new txtFocusListener());
		txtPrmId.setText(MessagesTPVInter.getString("TPV.txtPrmId.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtPrmId = new GridBagConstraints();
		gbc_txtPrmId.anchor = GridBagConstraints.NORTH;
		gbc_txtPrmId.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrmId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrmId.gridx = 4;
		gbc_txtPrmId.gridy = 2;
		pnlPromociones.add(txtPrmId, gbc_txtPrmId);
		txtPrmId.setColumns(10);

		lblPrmNombre = new JLabel(MessagesTPVInter.getString("TPV.lblPrmNombre.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrmNombre = new GridBagConstraints();
		gbc_lblPrmNombre.anchor = GridBagConstraints.EAST;
		gbc_lblPrmNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrmNombre.gridx = 5;
		gbc_lblPrmNombre.gridy = 2;
		pnlPromociones.add(lblPrmNombre, gbc_lblPrmNombre);

		txtPrmNombre = new JTextField();
		txtPrmNombre.addFocusListener(new txtFocusListener());
		txtPrmNombre.setText(MessagesTPVInter.getString("TPV.txtPrmNombre.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtPrmNombre = new GridBagConstraints();
		gbc_txtPrmNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrmNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrmNombre.gridx = 6;
		gbc_txtPrmNombre.gridy = 2;
		pnlPromociones.add(txtPrmNombre, gbc_txtPrmNombre);
		txtPrmNombre.setColumns(10);

		lblBuscarProducto = new JLabel(MessagesTPVInter.getString("TPV.lblBuscarProducto.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblBuscarProducto = new GridBagConstraints();
		gbc_lblBuscarProducto.anchor = GridBagConstraints.EAST;
		gbc_lblBuscarProducto.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuscarProducto.gridx = 3;
		gbc_lblBuscarProducto.gridy = 3;
		pnlPromociones.add(lblBuscarProducto, gbc_lblBuscarProducto);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { MessagesTPVInter.getString("TPV.168"), //$NON-NLS-1$
				MessagesTPVInter.getString("TPV.169"), MessagesTPVInter.getString("TPV.170"), //$NON-NLS-1$ //$NON-NLS-2$
				MessagesTPVInter.getString("TPV.171"), MessagesTPVInter.getString("TPV.172"), //$NON-NLS-1$ //$NON-NLS-2$
				MessagesTPVInter.getString("TPV.173"), MessagesTPVInter.getString("TPV.174"), //$NON-NLS-1$ //$NON-NLS-2$
				MessagesTPVInter.getString("TPV.175"), MessagesTPVInter.getString("TPV.176") })); //$NON-NLS-1$ //$NON-NLS-2$
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 4;
		gbc_comboBox.gridy = 3;
		pnlPromociones.add(comboBox, gbc_comboBox);

		btnPrmEliminarProducto = new JButton(MessagesTPVInter.getString("TPV.btnPrmEliminarProducto.text")); //$NON-NLS-1$
		btnPrmEliminarProducto.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/eliminar20.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnPrmEliminarProducto = new GridBagConstraints();
		gbc_btnPrmEliminarProducto.gridwidth = 2;
		gbc_btnPrmEliminarProducto.insets = new Insets(0, 0, 5, 5);
		gbc_btnPrmEliminarProducto.gridx = 5;
		gbc_btnPrmEliminarProducto.gridy = 3;
		pnlPromociones.add(btnPrmEliminarProducto, gbc_btnPrmEliminarProducto);

		txtPrmBuscarCliente = new JTextField();
		txtPrmBuscarCliente.addFocusListener(new txtFocusListener());
		txtPrmBuscarCliente.setText(MessagesTPVInter.getString("TPV.txtPrmBuscarCliente.text")); //$NON-NLS-1$
		txtPrmBuscarCliente.setColumns(10);
		GridBagConstraints gbc_txtPrmBuscarCliente = new GridBagConstraints();
		gbc_txtPrmBuscarCliente.gridwidth = 2;
		gbc_txtPrmBuscarCliente.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrmBuscarCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrmBuscarCliente.gridx = 9;
		gbc_txtPrmBuscarCliente.gridy = 3;
		pnlPromociones.add(txtPrmBuscarCliente, gbc_txtPrmBuscarCliente);

		lblPrmProductos = new JLabel(MessagesTPVInter.getString("TPV.lblPrmProductos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrmProductos = new GridBagConstraints();
		gbc_lblPrmProductos.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblPrmProductos.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrmProductos.gridx = 3;
		gbc_lblPrmProductos.gridy = 4;
		pnlPromociones.add(lblPrmProductos, gbc_lblPrmProductos);

		lstPrmProductos = new JList();
		lstPrmProductos.setFont(new Font("Courier New", Font.BOLD, 18)); //$NON-NLS-1$
		lstPrmProductos.setModel(new AbstractListModel() {
			String[] values = new String[] { MessagesTPVInter.getString("TPV.179"), //$NON-NLS-1$
					MessagesTPVInter.getString("TPV.180"), MessagesTPVInter.getString("TPV.181") }; //$NON-NLS-1$ //$NON-NLS-2$

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lstPrmProductos.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_lstPrmProductos = new GridBagConstraints();
		gbc_lstPrmProductos.gridwidth = 3;
		gbc_lstPrmProductos.insets = new Insets(0, 0, 5, 5);
		gbc_lstPrmProductos.fill = GridBagConstraints.BOTH;
		gbc_lstPrmProductos.gridx = 4;
		gbc_lstPrmProductos.gridy = 4;
		pnlPromociones.add(lstPrmProductos, gbc_lstPrmProductos);

		lblPrmClientes = new JLabel(MessagesTPVInter.getString("TPV.lblPrmClientes.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrmClientes = new GridBagConstraints();
		gbc_lblPrmClientes.anchor = GridBagConstraints.NORTH;
		gbc_lblPrmClientes.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrmClientes.gridx = 8;
		gbc_lblPrmClientes.gridy = 4;
		pnlPromociones.add(lblPrmClientes, gbc_lblPrmClientes);

		list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "CL-003 - Antonio Merino Garcia", "CL-012 - Julia Rodriguez Campos", //$NON-NLS-1$ //$NON-NLS-2$
					"CL-015 - Vicente Rodriguez Martin" }; //$NON-NLS-1$

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setFont(new Font("Courier New", Font.BOLD, 18)); //$NON-NLS-1$
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridwidth = 2;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 9;
		gbc_list.gridy = 4;
		pnlPromociones.add(list, gbc_list);

		btnPrmAniadir = new JButton(MessagesTPVInter.getString("TPV.btnPrmAniadir.text")); //$NON-NLS-1$
		btnPrmAniadir.setToolTipText(MessagesTPVInter.getString("TPV.btnPrmAniadir.toolTipText")); //$NON-NLS-1$
		btnPrmAniadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPrmAniadir.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/aniadir32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnPrmAniadir = new GridBagConstraints();
		gbc_btnPrmAniadir.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPrmAniadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnPrmAniadir.gridx = 1;
		gbc_btnPrmAniadir.gridy = 5;
		pnlPromociones.add(btnPrmAniadir, gbc_btnPrmAniadir);

		btnPrmEliminarPromocion = new JButton(MessagesTPVInter.getString("TPV.btnPrmEliminarPromocion.text")); //$NON-NLS-1$
		btnPrmEliminarPromocion.setToolTipText(MessagesTPVInter.getString("TPV.btnPrmEliminarPromocion.toolTipText")); //$NON-NLS-1$
		btnPrmEliminarPromocion.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/eliminar32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnPrmEliminarPromocion = new GridBagConstraints();
		gbc_btnPrmEliminarPromocion.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPrmEliminarPromocion.insets = new Insets(0, 0, 5, 5);
		gbc_btnPrmEliminarPromocion.gridx = 2;
		gbc_btnPrmEliminarPromocion.gridy = 5;
		pnlPromociones.add(btnPrmEliminarPromocion, gbc_btnPrmEliminarPromocion);

		lblPrmDtoAplicable = new JLabel(MessagesTPVInter.getString("TPV.lblPrmDtoAplicable.text")); //$NON-NLS-1$
		lblPrmDtoAplicable.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblPrmDtoAplicable = new GridBagConstraints();
		gbc_lblPrmDtoAplicable.anchor = GridBagConstraints.EAST;
		gbc_lblPrmDtoAplicable.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrmDtoAplicable.gridx = 3;
		gbc_lblPrmDtoAplicable.gridy = 5;
		pnlPromociones.add(lblPrmDtoAplicable, gbc_lblPrmDtoAplicable);

		txtPrmDto = new JTextField();
		txtPrmDto.addFocusListener(new txtFocusListener());
		txtPrmDto.setText(MessagesTPVInter.getString("TPV.txtPrmDto.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtPrmDto = new GridBagConstraints();
		gbc_txtPrmDto.gridwidth = 3;
		gbc_txtPrmDto.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrmDto.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrmDto.gridx = 4;
		gbc_txtPrmDto.gridy = 5;
		pnlPromociones.add(txtPrmDto, gbc_txtPrmDto);
		txtPrmDto.setColumns(10);

		lblPrmNotificar = new JLabel(MessagesTPVInter.getString("TPV.lblPrmNotificar.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPrmNotificar = new GridBagConstraints();
		gbc_lblPrmNotificar.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrmNotificar.gridx = 8;
		gbc_lblPrmNotificar.gridy = 5;
		pnlPromociones.add(lblPrmNotificar, gbc_lblPrmNotificar);

		pnlPrmNotificar = new JPanel();
		GridBagConstraints gbc_pnlPrmNotificar = new GridBagConstraints();
		gbc_pnlPrmNotificar.gridwidth = 2;
		gbc_pnlPrmNotificar.insets = new Insets(0, 0, 5, 5);
		gbc_pnlPrmNotificar.fill = GridBagConstraints.BOTH;
		gbc_pnlPrmNotificar.gridx = 9;
		gbc_pnlPrmNotificar.gridy = 5;
		pnlPromociones.add(pnlPrmNotificar, gbc_pnlPrmNotificar);
		GridBagLayout gbl_pnlPrmNotificar = new GridBagLayout();
		gbl_pnlPrmNotificar.columnWidths = new int[] { 0, 0 };
		gbl_pnlPrmNotificar.rowHeights = new int[] { 0, 0, 0 };
		gbl_pnlPrmNotificar.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_pnlPrmNotificar.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		pnlPrmNotificar.setLayout(gbl_pnlPrmNotificar);

		chckbxPrmEmail = new JCheckBox(MessagesTPVInter.getString("TPV.chckbxPrmEmail.text")); //$NON-NLS-1$
		GridBagConstraints gbc_chckbxPrmEmail = new GridBagConstraints();
		gbc_chckbxPrmEmail.anchor = GridBagConstraints.WEST;
		gbc_chckbxPrmEmail.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxPrmEmail.gridx = 0;
		gbc_chckbxPrmEmail.gridy = 0;
		pnlPrmNotificar.add(chckbxPrmEmail, gbc_chckbxPrmEmail);

		chckbxPrmSMS = new JCheckBox(MessagesTPVInter.getString("TPV.chckbxPrmSMS.text")); //$NON-NLS-1$
		GridBagConstraints gbc_chckbxPrmSMS = new GridBagConstraints();
		gbc_chckbxPrmSMS.anchor = GridBagConstraints.WEST;
		gbc_chckbxPrmSMS.gridx = 0;
		gbc_chckbxPrmSMS.gridy = 1;
		pnlPrmNotificar.add(chckbxPrmSMS, gbc_chckbxPrmSMS);

		btnPrmGuardar = new JButton(MessagesTPVInter.getString("TPV.btnPrmGuardar.text")); //$NON-NLS-1$
		btnPrmGuardar.setToolTipText(MessagesTPVInter.getString("TPV.btnPrmGuardar.toolTipText")); //$NON-NLS-1$
		btnPrmGuardar.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/guardar32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnPrmGuardar = new GridBagConstraints();
		gbc_btnPrmGuardar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPrmGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnPrmGuardar.gridx = 5;
		gbc_btnPrmGuardar.gridy = 6;
		pnlPromociones.add(btnPrmGuardar, gbc_btnPrmGuardar);

		btnCargarImagendocumento = new JButton(MessagesTPVInter.getString("TPV.btnCargarImagendocumento.text")); //$NON-NLS-1$
		btnCargarImagendocumento.setToolTipText(MessagesTPVInter.getString("TPV.btnCargarImagendocumento.toolTipText")); //$NON-NLS-1$
		btnCargarImagendocumento.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/load32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnCargarImagendocumento = new GridBagConstraints();
		gbc_btnCargarImagendocumento.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCargarImagendocumento.insets = new Insets(0, 0, 5, 5);
		gbc_btnCargarImagendocumento.gridx = 9;
		gbc_btnCargarImagendocumento.gridy = 6;
		pnlPromociones.add(btnCargarImagendocumento, gbc_btnCargarImagendocumento);

		btnEnviar = new JButton(MessagesTPVInter.getString("TPV.btnEnviar.text")); //$NON-NLS-1$
		btnEnviar.setToolTipText(MessagesTPVInter.getString("TPV.btnEnviar.toolTipText")); //$NON-NLS-1$
		btnEnviar.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/enviar32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnEnviar = new GridBagConstraints();
		gbc_btnEnviar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEnviar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnviar.gridx = 10;
		gbc_btnEnviar.gridy = 6;
		pnlPromociones.add(btnEnviar, gbc_btnEnviar);

		pnlMapa = new JPanel();
		tabbedPane.addTab(MessagesTPVInter.getString("TPV.191"), null, pnlMapa, null); //$NON-NLS-1$
		GridBagLayout gbl_pnlMapa = new GridBagLayout();
		gbl_pnlMapa.columnWidths = new int[] { 47, 252, 237, 259, 0, 47, 108, 52, 136, 0, 0 };
		gbl_pnlMapa.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_pnlMapa.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_pnlMapa.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0,
				Double.MIN_VALUE };
		pnlMapa.setLayout(gbl_pnlMapa);
		
		btnPedidoFrio = new JButton(MessagesTPVInter.getString("TPV.btnPedidoFrio.text")); //$NON-NLS-1$
		btnPedidoFrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				modo = FRIO;
			}
		});
		btnPedidoFrio.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/frio32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnPedidoFrio = new GridBagConstraints();
		gbc_btnPedidoFrio.insets = new Insets(0, 0, 5, 5);
		gbc_btnPedidoFrio.gridx = 1;
		gbc_btnPedidoFrio.gridy = 1;
		pnlMapa.add(btnPedidoFrio, gbc_btnPedidoFrio);
		
		btnPedidoCaliente = new JButton(MessagesTPVInter.getString("TPV.btnPedidoCaliente.text")); //$NON-NLS-1$
		btnPedidoCaliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modo = CALIENTE;
			}
		});
		btnPedidoCaliente.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/caliente32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnPedidoCaliente = new GridBagConstraints();
		gbc_btnPedidoCaliente.insets = new Insets(0, 0, 5, 5);
		gbc_btnPedidoCaliente.gridx = 2;
		gbc_btnPedidoCaliente.gridy = 1;
		pnlMapa.add(btnPedidoCaliente, gbc_btnPedidoCaliente);
		
		btnAnotacion = new JButton(MessagesTPVInter.getString("TPV.btnAnotacion.text")); //$NON-NLS-1$
		btnAnotacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modo = TEXTO;
			}
		});
		btnAnotacion.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/anotacion32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnAnotacion = new GridBagConstraints();
		gbc_btnAnotacion.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnotacion.gridx = 3;
		gbc_btnAnotacion.gridy = 1;
		pnlMapa.add(btnAnotacion, gbc_btnAnotacion);

		scrollPane_3 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_3 = new GridBagConstraints();
		gbc_scrollPane_3.gridwidth = 3;
		gbc_scrollPane_3.gridheight = 9;
		gbc_scrollPane_3.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_3.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_3.gridx = 1;
		gbc_scrollPane_3.gridy = 2;
		pnlMapa.add(scrollPane_3, gbc_scrollPane_3);

		lblMpMapa = new MiAreaDibujo();
		lblMpMapa.addMouseListener(new MiAreaDibujoMouseListener());
		lblMpMapa.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/mapa.PNG"))); //$NON-NLS-1$
		scrollPane_3.setViewportView(lblMpMapa);

		lblMpIdPedido = new JLabel(MessagesTPVInter.getString("TPV.lblMpIdPedido.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblMpIdPedido = new GridBagConstraints();
		gbc_lblMpIdPedido.anchor = GridBagConstraints.EAST;
		gbc_lblMpIdPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblMpIdPedido.gridx = 4;
		gbc_lblMpIdPedido.gridy = 3;
		pnlMapa.add(lblMpIdPedido, gbc_lblMpIdPedido);

		txtMpIdPedido = new JTextField();
		txtMpIdPedido.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtMpIdPedido = new GridBagConstraints();
		gbc_txtMpIdPedido.gridwidth = 2;
		gbc_txtMpIdPedido.insets = new Insets(0, 0, 5, 5);
		gbc_txtMpIdPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMpIdPedido.gridx = 5;
		gbc_txtMpIdPedido.gridy = 3;
		pnlMapa.add(txtMpIdPedido, gbc_txtMpIdPedido);
		txtMpIdPedido.setColumns(10);
		mdlLista = new DefaultListModel();
		
		scrollPane_7 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_7 = new GridBagConstraints();
		gbc_scrollPane_7.gridheight = 6;
		gbc_scrollPane_7.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_7.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_7.gridx = 8;
		gbc_scrollPane_7.gridy = 3;
		pnlMapa.add(scrollPane_7, gbc_scrollPane_7);
		
		lstMpPedidos = new JList();
		mdlLista = new DefaultListModel();
		lstMpPedidos.setCellRenderer(new MiListCellRenderer());
		lstMpPedidos.setBorder(new TitledBorder(null, MessagesTPVInter.getString("TPV.258"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		scrollPane_7.setViewportView(lstMpPedidos);

		lblMpDireccion = new JLabel(MessagesTPVInter.getString("TPV.lblMpDireccion.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblMpDireccion = new GridBagConstraints();
		gbc_lblMpDireccion.anchor = GridBagConstraints.EAST;
		gbc_lblMpDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblMpDireccion.gridx = 4;
		gbc_lblMpDireccion.gridy = 4;
		pnlMapa.add(lblMpDireccion, gbc_lblMpDireccion);

		txtMpDireccion = new JTextField();
		txtMpDireccion.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtMpDireccion = new GridBagConstraints();
		gbc_txtMpDireccion.gridwidth = 2;
		gbc_txtMpDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_txtMpDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMpDireccion.gridx = 5;
		gbc_txtMpDireccion.gridy = 4;
		pnlMapa.add(txtMpDireccion, gbc_txtMpDireccion);
		txtMpDireccion.setColumns(10);

		lblHoraDeLlegada = new JLabel(MessagesTPVInter.getString("TPV.lblHoraDeLlegada.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblHoraDeLlegada = new GridBagConstraints();
		gbc_lblHoraDeLlegada.gridwidth = 2;
		gbc_lblHoraDeLlegada.anchor = GridBagConstraints.EAST;
		gbc_lblHoraDeLlegada.insets = new Insets(0, 0, 5, 5);
		gbc_lblHoraDeLlegada.gridx = 4;
		gbc_lblHoraDeLlegada.gridy = 5;
		pnlMapa.add(lblHoraDeLlegada, gbc_lblHoraDeLlegada);

		txtMpHora = new JTextField();
		txtMpHora.addFocusListener(new txtFocusListener());
		GridBagConstraints gbc_txtMpHora = new GridBagConstraints();
		gbc_txtMpHora.anchor = GridBagConstraints.NORTH;
		gbc_txtMpHora.insets = new Insets(0, 0, 5, 5);
		gbc_txtMpHora.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMpHora.gridx = 6;
		gbc_txtMpHora.gridy = 5;
		pnlMapa.add(txtMpHora, gbc_txtMpHora);
		txtMpHora.setColumns(10);

		chckbxMpPagado = new JCheckBox(MessagesTPVInter.getString("TPV.chckbxMpPagado.text")); //$NON-NLS-1$
		GridBagConstraints gbc_chckbxMpPagado = new GridBagConstraints();
		gbc_chckbxMpPagado.gridwidth = 2;
		gbc_chckbxMpPagado.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxMpPagado.gridx = 4;
		gbc_chckbxMpPagado.gridy = 6;
		pnlMapa.add(chckbxMpPagado, gbc_chckbxMpPagado);

		rdbtnMpFrio = new JRadioButton(MessagesTPVInter.getString("TPV.rdbtnMpFrio.text")); //$NON-NLS-1$
		buttonGroup.add(rdbtnMpFrio);
		GridBagConstraints gbc_rdbtnMpFrio = new GridBagConstraints();
		gbc_rdbtnMpFrio.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnMpFrio.gridx = 4;
		gbc_rdbtnMpFrio.gridy = 7;
		pnlMapa.add(rdbtnMpFrio, gbc_rdbtnMpFrio);

		rdbtnMpCaliente = new JRadioButton(MessagesTPVInter.getString("TPV.rdbtnMpCaliente.text")); //$NON-NLS-1$
		buttonGroup.add(rdbtnMpCaliente);
		GridBagConstraints gbc_rdbtnMpCaliente = new GridBagConstraints();
		gbc_rdbtnMpCaliente.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnMpCaliente.gridx = 5;
		gbc_rdbtnMpCaliente.gridy = 7;
		pnlMapa.add(rdbtnMpCaliente, gbc_rdbtnMpCaliente);

		chckbxMpVip = new JCheckBox(MessagesTPVInter.getString("TPV.chckbxMpVip.text")); //$NON-NLS-1$
		GridBagConstraints gbc_chckbxMpVip = new GridBagConstraints();
		gbc_chckbxMpVip.gridwidth = 2;
		gbc_chckbxMpVip.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxMpVip.gridx = 4;
		gbc_chckbxMpVip.gridy = 8;
		pnlMapa.add(chckbxMpVip, gbc_chckbxMpVip);

		btnMpAniadir = new JButton(MessagesTPVInter.getString("TPV.btnMpAniadir.text")); //$NON-NLS-1$
		btnMpAniadir.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/aniadir32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnMpAniadir = new GridBagConstraints();
		gbc_btnMpAniadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnMpAniadir.gridx = 5;
		gbc_btnMpAniadir.gridy = 9;
		pnlMapa.add(btnMpAniadir, gbc_btnMpAniadir);

		btnMpEliminar = new JButton(MessagesTPVInter.getString("TPV.btnMpEliminar.text")); //$NON-NLS-1$
		btnMpEliminar.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/eliminar32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnMpEliminar = new GridBagConstraints();
		gbc_btnMpEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnMpEliminar.gridx = 6;
		gbc_btnMpEliminar.gridy = 9;
		pnlMapa.add(btnMpEliminar, gbc_btnMpEliminar);
		
		btnLimpiarMapa = new JButton(MessagesTPVInter.getString("TPV.btnLimpiarMapa.text")); //$NON-NLS-1$
		btnLimpiarMapa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMpMapa.getObjetosGraficos().clear();
				lblMpMapa.repaint();
				mdlLista.removeAllElements();
			}
		});
		btnLimpiarMapa.setIcon(new ImageIcon(TPV.class.getResource("/presentacion/limpiar32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnLimpiarMapa = new GridBagConstraints();
		gbc_btnLimpiarMapa.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiarMapa.gridx = 2;
		gbc_btnLimpiarMapa.gridy = 11;
		pnlMapa.add(btnLimpiarMapa, gbc_btnLimpiarMapa);

		tblPedidos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent event) {
				if (tblPedidos.getSelectedRow() != -1) {
					txtPddIdPedido.setText((String) tblPedidos.getValueAt(tblPedidos.getSelectedRow(), 0));
					txtPddCliente.setText((String) tblPedidos.getValueAt(tblPedidos.getSelectedRow(), 4));
					DefaultTableModel model = (DefaultTableModel) tblPddProductos.getModel();
					model.setRowCount(0);
					model.addRow(new Object[] { "ID", (String) tblPedidos.getValueAt(tblPedidos.getSelectedRow(), 1), //$NON-NLS-1$
							(String) tblPedidos.getValueAt(tblPedidos.getSelectedRow(), 2),
							(String) tblPedidos.getValueAt(tblPedidos.getSelectedRow(), 3), "-", "-", "-" }); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					if (((String) tblPedidos.getValueAt(tblPedidos.getSelectedRow(), 8))
							.equals(MessagesTPVInter.getString("TPV.199"))) { //$NON-NLS-1$
						chckbxADomicilio.setSelected(true);
					} else {
						chckbxADomicilio.setSelected(false);
					}
					txtPddPrecioTotal.setText((String) tblPedidos.getValueAt(tblPedidos.getSelectedRow(), 6));
					txtPddDescuento.setText(String.valueOf(0 + (int) (Math.random() * ((7 - 0) + 1))));
					if (chckbxADomicilio.isSelected()) {
						txtPddTransporte.setText(String.valueOf(1 + (int) (Math.random() * ((3 - 1) + 1))));
					} else {
						txtPddTransporte.setText("0"); //$NON-NLS-1$
					}
					float preciofinal = 0;
					if (txtPddTransporte.isEnabled()) {
						preciofinal = Float.valueOf(txtPddPrecioTotal.getText())
								- Float.valueOf(txtPddDescuento.getText()) - Float.valueOf(txtPddTransporte.getText());
					} else {
						preciofinal = Float.valueOf(txtPddPrecioTotal.getText())
								- Float.valueOf(txtPddDescuento.getText());
					}
					txtPddPrecioFinal.setText(String.valueOf(preciofinal));
					txtPddPuntosObtenidos
							.setText(String.valueOf(Math.floor(0.2 * Float.valueOf(txtPddPrecioTotal.getText()))));
					/*
					 * String saltoLinea =
					 * ((String)tblPedidos.getValueAt(tblPedidosi.getSelectedRow(), 1));
					 * if(saltoLinea.contains("<br>")) { while() {
					 * 
					 * } }
					 */

				}
			}
		});
	}

	private class BtnMnVolverActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
			VentanaPrincipal Vppal = new VentanaPrincipal();
			Vppal.setVisible(true);
		}
	}

	private class BtnPddImprimirTicketActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		}
	}

	private class TblPedidosMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent arg0) {
		}
	}

	private class BtnPddAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			tblPedidos.setValueAt(txtPddIdPedido.getText(), tblPedidos.getSelectedRow(), 0);
			tblPedidos.setValueAt(txtPddCliente.getText(), tblPedidos.getSelectedRow(), 4);
		}
	}

	private class ChckbxADomicilioItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent arg0) {
			if (chckbxADomicilio.isSelected()) {
				txtPddDirecciondeEnvio.setEnabled(true);
				txtPddTransporte.setEnabled(true);
			} else {
				txtPddDirecciondeEnvio.setEnabled(false);
				txtPddTransporte.setEnabled(false);
			}
		}
	}

	private class BtnEliminarPedidoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			DefaultTableModel model = (DefaultTableModel) tblPedidos.getModel();
			if (tblPedidos.getSelectedRow() != -1) {
				model.removeRow(tblPedidos.getSelectedRow());
			}
		}
	}

	private class BtnAniadirPedidoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			DefaultTableModel model = (DefaultTableModel) tblPedidos.getModel();
			if (tblPddProductos.getSelectedRow() != -1) {
				model.addRow(new Object[] { txtPddIdPedido.getText(),
						(String) tblPddProductos.getValueAt(tblPddProductos.getSelectedRow(), 1),
						(String) tblPddProductos.getValueAt(tblPddProductos.getSelectedRow(), 2),
						(String) tblPddProductos.getValueAt(tblPddProductos.getSelectedRow(), 3),
						txtPddCliente.getText(), "0%", txtPddPrecioTotal.getText(), //$NON-NLS-1$
						MessagesTPVInter.getString("TPV.202"), MessagesTPVInter.getString("TPV.203"), "" }); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			} else {
				JOptionPane.showMessageDialog(null, MessagesTPVInter.getString("TPV.205"), //$NON-NLS-1$
						MessagesTPVInter.getString("TPV.206"), JOptionPane.WARNING_MESSAGE); //$NON-NLS-1$
			}
		}
	}

	private class txtFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(new Color(250, 255, 180));
		}

		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(new Color(255, 255, 255));
		}
	}

	private class TxtAPddInformacionAdicionalFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			if (txtAPddInformacionAdicional.getText().equals(MessagesTPVInter.getString("TPV.207"))) { //$NON-NLS-1$
				txtAPddInformacionAdicional.setText(""); //$NON-NLS-1$
			}
			e.getComponent().setBackground(new Color(250, 255, 180));
		}

		@Override
		public void focusLost(FocusEvent e) {
			if (txtAPddInformacionAdicional.getText().equals("")) { //$NON-NLS-1$
				txtAPddInformacionAdicional.setText(MessagesTPVInter.getString("TPV.210")); //$NON-NLS-1$
			}
			e.getComponent().setBackground(new Color(255, 255, 255));
		}

	}

	private class MiAreaDibujoMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			switch (modo) {
			case FRIO:
				lblMpMapa.addObjetoGrafico(new ImagenGrafico(x, y, imagFrio));
				lblMpMapa.repaint();
				mdlLista.addElement(MessagesTPVInter.getString("TPV.260")); //$NON-NLS-1$
				lstMpPedidos.setModel(mdlLista);
				break;
			case CALIENTE:
				lblMpMapa.addObjetoGrafico(new ImagenGrafico(x, y, imagCaliente));
				lblMpMapa.repaint();
				mdlLista.addElement(MessagesTPVInter.getString("TPV.261")); //$NON-NLS-1$
				lstMpPedidos.setModel(mdlLista);
				break;
			case TEXTO:
				txtTexto.setBounds(x, y, 200, 30);
				txtTexto.setVisible(true);
				txtTexto.requestFocus();
				txtTexto.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg) {
						if (!txtTexto.getText().equals("")) { //$NON-NLS-1$
							lblMpMapa.addObjetoGrafico(new TextoGrafico(x, y + 15, txtTexto.getText(), Color.BLUE));
							mdlLista.addElement(MessagesTPVInter.getString("TPV.263") + count + ": " + txtTexto.getText()); //$NON-NLS-1$ //$NON-NLS-2$
							lstMpPedidos.setModel(mdlLista);
							count++;
						}
						txtTexto.setText(""); //$NON-NLS-1$
						txtTexto.setVisible(false);
						lblMpMapa.repaint();

					}
				});
				lblMpMapa.add(txtTexto);
				break;

			}

		}
	}

	private class BtnBorrarTodoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lblMpMapa.getObjetosGraficos().clear();
			lblMpMapa.repaint();
			mdlLista.removeAllElements();
		}
	}

}
