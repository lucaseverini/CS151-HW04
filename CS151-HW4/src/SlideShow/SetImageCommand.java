/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SlideShow;

import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 *
 * @author omari
 */
public class SetImageCommand extends AbstractAction{

    String CURRENT_IMAGE = "Current Location";
    String OLD_IMAGE = "Old Location";
    
    public SetImageCommand(String name, Image pic)
    {
        super(name);
        putValue(CURRENT_IMAGE,pic);
        //or do we put the default location here?
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //use put value to store old IMAGE in OLD_LOCATION mneumonic making changes
        //not exactly sure what goes here, is there where the image would get set in slideimage?
        //or do we just store the new IMAGE under the CURRENT_IMAGE mneumonic here?
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void undo()
    {
        //Set IMAGE of caption to the value stored in old image
        //update slide image to equal old image?
    }
    
}
