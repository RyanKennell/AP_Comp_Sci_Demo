import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example extends JPanel {
	
	//The dimensions of the screen
	private final static int SCREEN_WIDTH = 450;
	private final static int SCREEN_HEIGHT = 475;
	
	private final static int WAIT = 120;
	/*
	 * While this variable is false, the game will continue 
	 * to run.
	 */
	private static boolean gameover = false;
	
	/*
	 * Instantiates the Keyboard class used
	 * to take key inputs
	 */
	public Example() {
		Keyboard keyboard = new Keyboard();
		addKeyListener(keyboard);
		setFocusable(true);
	}
	
	/*
	 * This is the main method of the game
	 * 
	 * The main game loop is within this method. The
	 * purpose of this method is to execute the logic
	 * of the program from within that loop after setting
	 * up the game environment.
	 */
	public static void main(String args[]) {
		//Creating the JFrame and adding our instance as the panel
		JFrame frame = new JFrame("Game Example");
		Example panel = new Example();
		frame.add(panel);
		
		//Setting JFrame variables
		frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
	    frame.setResizable(false);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    
		//this is where you should perform any
		//logic the game needs to run prior to start
	    
	    /*
	     * The main game loop that will run as long 
	     * as our game is not over.
	     */
		while(!gameover) {
			
			//This is where you should execute any logic of the game
			
			frame.repaint();
			
			/*
			 * Make sure this loop only iterates
			 * once every 'WAIT' milliseconds this
			 * method is called a Fixed FPS
			 */
			try {
				Thread.sleep(WAIT);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * The paint method, which is inherited through
	 * the Java Swing Package is used to draw all 
	 * the graphics
	 * 
	 * (non-Javadoc)
	 * @see javax.swing.JComponent#paint(java.awt.Graphics)
	 */
    public void paint ( Graphics g ){
		g.setColor(Color.BLACK);
		g.drawOval(50,50,50,50);
		
		g.setColor(Color.RED);
		g.fillRect(200, 200, 50, 50);
    }
    
    /*
     * The keyboard class retrieves input from the 
     * player. This class is a inner class to 'Example'
     * so it can have access to the local variables of the class
     */
    public class Keyboard implements KeyListener {
		
		/*
		* When a key is pressed, it is taken care of here
		*/
    	@Override
    	public void keyPressed(KeyEvent e) {
    		
    		//Handling the pressing of 'w'
    		if( KeyEvent.getKeyText(e.getKeyCode()).equals("W")){
    		}
    		
    		//Handling the pressing of 's'
    		else if ( KeyEvent.getKeyText(e.getKeyCode()).equals("S")){
    		}
    		
    		//Handling the pressing of 'a'
    		else if( KeyEvent.getKeyText(e.getKeyCode()).equals("A")){
    		}
    		
    		//Handling the pressing of 'd'
    		else if ( KeyEvent.getKeyText(e.getKeyCode()).equals("D")){
				
    		}
    	}
    	
    	@Override
    	public void keyReleased(KeyEvent arg0) {
    	}
    	
    	@Override
    	public void keyTyped(KeyEvent e) {
    	}
    	
    }
}
