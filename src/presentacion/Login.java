package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import dominio.Usuario;
import dominio.login;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel lblImagen;
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;
	private JButton btnAcceder;
	private JLabel lblImagenUsuario;
	private JLabel lblImagenContrasena;
	private boolean firstU = true;
	private boolean firstP = true;
	private VentanaPrincipal vp1 = null;
	private static login domlogin;
	private JLabel lblInfo;
	private Login frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login getFrame() {
		frame = new Login();
		return frame;
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		Usuario prueba = new Usuario("Demo", "12345"); //$NON-NLS-1$ //$NON-NLS-2$
		LinkedList<Usuario> usuarios = new LinkedList<Usuario>();
		usuarios.add(prueba);
		domlogin = new login(usuarios);
		setTitle(MessagesLoginInter.getString("Login.this.title")); //$NON-NLS-1$
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, MessagesLoginInter.getString("Login.contentPane.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 75, 47, 95, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 47, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		lblImagen = new JLabel(MessagesLoginInter.getString("Login.lblImagen.text")); //$NON-NLS-1$
		lblImagen.setIcon(new ImageIcon(Login.class.getResource("/presentacion/cubiertos128.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblImagen = new GridBagConstraints();
		gbc_lblImagen.insets = new Insets(0, 0, 5, 5);
		gbc_lblImagen.gridx = 2;
		gbc_lblImagen.gridy = 1;
		contentPane.add(lblImagen, gbc_lblImagen);

		lblImagenUsuario = new JLabel(MessagesLoginInter.getString("Login.lblImagenUsuario.text")); //$NON-NLS-1$
		lblImagenUsuario.setIcon(new ImageIcon(Login.class.getResource("/presentacion/usuario32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblImagenUsuario = new GridBagConstraints();
		gbc_lblImagenUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblImagenUsuario.anchor = GridBagConstraints.SOUTH;
		gbc_lblImagenUsuario.gridx = 1;
		gbc_lblImagenUsuario.gridy = 2;
		contentPane.add(lblImagenUsuario, gbc_lblImagenUsuario);

		txtUsuario = new JTextField();
		txtUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (firstU == true) {
					txtUsuario.setText(""); //$NON-NLS-1$
					firstU = false;
				}
			}
		});
		txtUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if (firstU == true) {
					txtUsuario.setText(""); //$NON-NLS-1$
					firstU = false;
				}
				txtContrasena.setEnabled(true);
			}
		});
		txtUsuario.setText(MessagesLoginInter.getString("Login.txtUsuario.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsuario.gridx = 2;
		gbc_txtUsuario.gridy = 2;
		contentPane.add(txtUsuario, gbc_txtUsuario);
		txtUsuario.setColumns(10);

		lblImagenContrasena = new JLabel(MessagesLoginInter.getString("Login.lblImagenContrasena.text")); //$NON-NLS-1$
		lblImagenContrasena.setIcon(new ImageIcon(Login.class.getResource("/presentacion/candado32.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblImagenContrasena = new GridBagConstraints();
		gbc_lblImagenContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_lblImagenContrasena.gridx = 1;
		gbc_lblImagenContrasena.gridy = 3;
		contentPane.add(lblImagenContrasena, gbc_lblImagenContrasena);

		txtContrasena = new JPasswordField();
		txtContrasena.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (firstP == true) {
					txtContrasena.setText(""); //$NON-NLS-1$
					firstP = false;
				}
			}
		});
		txtContrasena.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (firstP == true) {
					txtContrasena.setText(""); //$NON-NLS-1$
					firstP = false;
				}
			}
		});
		txtContrasena.setEnabled(false);
		txtContrasena.setText(MessagesLoginInter.getString("Login.txtContrasena.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtContrasena = new GridBagConstraints();
		gbc_txtContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_txtContrasena.gridx = 2;
		gbc_txtContrasena.gridy = 3;
		contentPane.add(txtContrasena, gbc_txtContrasena);
		txtContrasena.setColumns(10);

		btnAcceder = new JButton(MessagesLoginInter.getString("Login.btnAcceder.text")); //$NON-NLS-1$
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = txtUsuario.getText();
				String pass = new String(txtContrasena.getPassword());
				int login = domlogin.signIn(user, pass);
				if (login == 1) {
					if (vp1 == null) {
						vp1 = new VentanaPrincipal();
					}
					lblInfo.setText(""); //$NON-NLS-1$
					JOptionPane.showMessageDialog(null, MessagesLoginInter.getString("Login.10"), MessagesLoginInter.getString("Login.11"), JOptionPane.PLAIN_MESSAGE); //$NON-NLS-1$ //$NON-NLS-2$
					vp1.setVisible(true);
				}else if(login == 0) {
					lblInfo.setForeground(Color.RED);
					lblInfo.setText(MessagesLoginInter.getString("Login.12")); //$NON-NLS-1$
				}else if(login == -1) {
					lblInfo.setForeground(Color.RED);
					lblInfo.setText(MessagesLoginInter.getString("Login.13")); //$NON-NLS-1$
				}else if(login == -2) {
					lblInfo.setForeground(Color.RED);
					lblInfo.setText(MessagesLoginInter.getString("Login.14")); //$NON-NLS-1$
				}
				
			}
		});
		GridBagConstraints gbc_btnAcceder = new GridBagConstraints();
		gbc_btnAcceder.insets = new Insets(0, 0, 5, 5);
		gbc_btnAcceder.gridx = 2;
		gbc_btnAcceder.gridy = 4;
		contentPane.add(btnAcceder, gbc_btnAcceder);
		
		lblInfo = new JLabel(MessagesLoginInter.getString("Login.lblInfo.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblInfo = new GridBagConstraints();
		gbc_lblInfo.insets = new Insets(0, 0, 0, 5);
		gbc_lblInfo.gridx = 2;
		gbc_lblInfo.gridy = 5;
		contentPane.add(lblInfo, gbc_lblInfo);
	}

}
