/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SlideShow;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;


public class DraggableImage extends JPanel {

    /**
	 * Used as the JPanel UID
	 */
	private static final long serialVersionUID = -2592214093625164095L;
	
    private static JLabel draggableImage;
    private static JPanel topPanel = new JPanel();
    
    
    
    /**
     * Default constructor for the object.  Adds two listeners that listen to the entire component.
     * The first listened lists for mouse movement and the secondr listens for mouse motion.
     */
    public DraggableImage(JLabel imageLabel, Point defaultLocation) {
    	
    	//---- Not needed but added for clarity.
    	super();
    	
    	//---- Create a draggable image.
        imageLabel.setLocation(defaultLocation);
    	draggableImage = imageLabel;
    	this.add(draggableImage);
    	draggableImage.setSize(new Dimension(100,66));
    	draggableImage.setLocation(defaultLocation);
    	//---- Add a listener on the draggable image.
    	MouseInputAdapter draggedImageMouseListener = this.createDraggableImageMouseMotionAdapter();
    	draggableImage.addMouseListener(draggedImageMouseListener);
    	draggableImage.addMouseMotionListener(draggedImageMouseListener);
    	    
    }

    
    /**
     * Paint method for the JPanel that redraws reticle, line, and JLabel with the image.
     */
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
        g2d.setColor(Color.BLACK);
      
        

        //---- Redraw the draggableImage
    	draggableImage.revalidate();
    	draggableImage.repaint();
        super.paintComponents(g);
    }
    
    
    /**
     * Creates a listener to be used for the draggableImage variable.
     * 
     * @return MouseInputAdapter variable that is used for motion on the variable "draggableImage"
     */
    private MouseInputAdapter createDraggableImageMouseMotionAdapter(){
    	return new MouseInputAdapter(){
    		
    		int dx;		//---- Last X location
    		int dy;		//---- Last Y Location
    		

    		@Override
    		public void mousePressed(MouseEvent e){
    			dx = e.getXOnScreen();
    			dy = e.getYOnScreen();
    		}
		

    		/**
    		 * Listens for mouse drag events.  All mouse motions are treated as the change between the new and last locations.
    		 */
    		@Override
    		public void mouseDragged(MouseEvent e){
    			Point imageLocation;
    			
    			//----Calculate the new position
    			imageLocation = draggableImage.getLocation();
    			imageLocation.setLocation(imageLocation.getX() + (e.getXOnScreen()-dx), 
    									  imageLocation.getY() + (e.getYOnScreen()-dy));
    			
    			//---- Update the image location
    			draggableImage.setLocation(imageLocation);
    			
    			//----- Reset the last reference point.
    			dx = e.getXOnScreen();
    			dy = e.getYOnScreen();
    			
    			
    			//---- Repaint the objects
                revalidate();
                repaint();   
    		}

    	};
    }
}
