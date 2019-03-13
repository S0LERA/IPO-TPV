package presentacion;

import javax.swing.*;
import java.awt.*;

class MiListCellRenderer extends DefaultListCellRenderer {
	protected DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
	ImageIcon imgFrio;
	ImageIcon imgCaliente;
	ImageIcon imgAnot;

	public MiListCellRenderer() {
		imgFrio = new ImageIcon(MiListCellRenderer.class.getResource("frio32.png"));
		imgCaliente = new ImageIcon(MiListCellRenderer.class.getResource("caliente32.png"));
		imgAnot = new ImageIcon(MiListCellRenderer.class.getResource("anotacion32.png"));
	}

	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean hasFocus) {
		JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index, isSelected,
				hasFocus);
		if (list.getModel().getElementAt(index) == "FRIO" || list.getModel().getElementAt(index) == "COLD") {
			renderer.setIcon(imgFrio);
		} else if (list.getModel().getElementAt(index) == "CALIENTE" || list.getModel().getElementAt(index) == "HOT") {
			renderer.setIcon(imgCaliente);
		}else
			renderer.setIcon(imgAnot);
		return renderer;
	}
}