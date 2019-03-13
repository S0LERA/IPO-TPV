package presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class SeleccionIdioma extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnIngls;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SeleccionIdioma dialog = new SeleccionIdioma();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SeleccionIdioma() {
		setTitle("Selecci\u00F3n del Idioma");
		setResizable(false);
		setBounds(100, 100, 360, 177);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JRadioButton rdbtnEspaol = new JRadioButton("Espa\u00F1ol");
			rdbtnEspaol.setIcon(new ImageIcon(SeleccionIdioma.class.getResource("/presentacion/espana32.png")));
			buttonGroup.add(rdbtnEspaol);
			GridBagConstraints gbc_rdbtnEspaol = new GridBagConstraints();
			gbc_rdbtnEspaol.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnEspaol.gridx = 1;
			gbc_rdbtnEspaol.gridy = 1;
			contentPanel.add(rdbtnEspaol, gbc_rdbtnEspaol);
		}
		{
			rdbtnIngls = new JRadioButton("Ingl\u00E9s");
			rdbtnIngls.setIcon(new ImageIcon(SeleccionIdioma.class.getResource("/presentacion/USA32.png")));
			buttonGroup.add(rdbtnIngls);
			GridBagConstraints gbc_rdbtnIngls = new GridBagConstraints();
			gbc_rdbtnIngls.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnIngls.gridx = 2;
			gbc_rdbtnIngls.gridy = 1;
			contentPanel.add(rdbtnIngls, gbc_rdbtnIngls);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						if(rdbtnIngls.isSelected()) {
							MessagesTPVInter.setIdioma("inglés");
							MessagesVPinter.setIdioma("inglés");
							MessagesLoginInter.setIdioma("inglés");
						}
						
						Login ventanalogin = new Login();
						ventanalogin.getFrame().setVisible(true);
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

}
