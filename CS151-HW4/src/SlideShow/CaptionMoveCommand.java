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
public class CaptionMoveCommand extends AbstractAction{

    String CURRENT_LOCATION = "Current Location";
    String OLD_LOCATION = "Old Location";
    
    public CaptionMoveCommand(String name, Point location)
    {
        super(name);
        putValue(CURRENT_LOCATION,location);
        //or do we put the default location here?
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //use put value to store old location in OLD_LOCATION mneumonic making changes
        //not exactly sure what goes here, is there where the location would get set in slideimage?
        //or do we just store the new location under the CURRENT_LOCATION mneumonic here?
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void undo()
    {
        //Set location of caption to the value stored in old location
        //update slide image to equal old location?
    }
    
}
