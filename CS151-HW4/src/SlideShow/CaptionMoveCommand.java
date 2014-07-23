/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SlideShow;

import java.awt.Point;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 *
 * @author omari
 */
public class CaptionMoveCommand extends CommandAction{

    String OLD_LOCATION = "Old Location";
    String NEW_LOCATION = "Old Location";
    
    public CaptionMoveCommand(String name, SlideImage slideChanged, Point oldLocation, Point newLocation)
    {
        super(name);
		
        putValue(SLIDE_IMAGE, slideChanged); 
		
        putValue(OLD_LOCATION, oldLocation);
        putValue(NEW_LOCATION, newLocation);
		
        slideChanged.setCaptionLocation(newLocation);
    }
	
    @Override
    public void actionPerformed(ActionEvent e) 
	{
        //use put value to store old location in OLD_LOCATION mneumonic making changes
        //not exactly sure what goes here, is there where the location would get set in slideimage?
        //or do we just store the new location under the CURRENT_LOCATION mneumonic here?
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void undo()
    {
        // Set location of caption to the value stored in old location
        ((SlideImage)getValue(SLIDE_IMAGE)).setCaptionLocation((Point)getValue(OLD_LOCATION));        
    }
    
}
