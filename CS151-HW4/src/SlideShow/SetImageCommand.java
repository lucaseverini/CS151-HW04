/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SlideShow;

import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import javax.swing.AbstractAction;

/**
 *
 * @author omari
 */
public class SetImageCommand extends AbstractAction{

    String CURRENT_IMAGE = "Current Location";
    String OLD_IMAGE = "Old Location";
    String SLIDE_IMAGE = "Slide Image";
    
    public SetImageCommand(String name, SlideImage slideChanged, BufferedImage oldPic, BufferedImage newPic)
    {
        super(name);
        putValue(SLIDE_IMAGE, slideChanged);
        putValue(OLD_IMAGE, oldPic);
        putValue(CURRENT_IMAGE,newPic);
        slideChanged.setImage(newPic);
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
        ((SlideImage)getValue(SLIDE_IMAGE)).setImage((BufferedImage)getValue(OLD_IMAGE));        
    }
    
}
