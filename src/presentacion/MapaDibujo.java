package presentacion;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JLabel;

public class MapaDibujo extends JLabel {

	private ArrayList<ObjetoGrafico> objetosGraficos = new ArrayList<ObjetoGrafico>();

	public MapaDibujo() {
	}

	void addObjetoGrafico(ObjetoGrafico objg) {
		objetosGraficos.add(objg);
	}

	public ObjetoGrafico getUltimoObjetoGrafico() {
		return objetosGraficos.get(objetosGraficos.size() - 1);
	}
	
	

	public ArrayList<ObjetoGrafico> getObjetosGraficos() {
		return objetosGraficos;
	}

	public void setObjetosGraficos(ArrayList<ObjetoGrafico> objetosGraficos) {
		this.objetosGraficos = objetosGraficos;
	}

	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < objetosGraficos.size(); i++) {
			ObjetoGrafico objg = objetosGraficos.get(i);
			if (objg instanceof ImagenGrafico) {
				g.drawImage(((ImagenGrafico) objg).getImagen(), objg.getX(), objg.getY(), null);
			}else { // Es un objeto de tipo TextoGrafico
				g.setColor(((TextoGrafico) objg).getColor());
				g.drawString(((TextoGrafico) objg).getTexto(), objg.getX(), objg.getY());
			}

		}
	}

}
