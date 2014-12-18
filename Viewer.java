import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Viewer extends JFrame {
	
	private static final int FRAME_WIDTH  = 600;
	private static final int FRAME_HEIGHT = 600;
	
	protected Card firstCard;
	
	public Viewer() {
		
		super();
		
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setTitle("Texas Hold Em");
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		firstCard = new Card();
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		repaint();
	}
	
	public int returnHeight() {
		return FRAME_HEIGHT;
	}
	
	public int returnWidth() {
		return FRAME_WIDTH;
	}
	
	public void reDraw() {
		if (this.FRAME_HEIGHT != 600) {
			repaint();
		}
		
		if (this.FRAME_WIDTH != 600) {
			repaint();
		}
	}
	
}
