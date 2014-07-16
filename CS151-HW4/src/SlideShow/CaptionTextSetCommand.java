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
public class CaptionTextSetCommand extends CommandAction{
    
    String CURRENT_CAPTION = "Current Caption";
    String OLD_CAPTION = "Old Caption";
    public CaptionTextSetCommand(String name, SlideImage slideChanged, String oldCaption, String newCaption)
    {
        super(name);
        putValue(OLD_CAPTION,oldCaption);
        putValue(CURRENT_CAPTION, newCaption);
        putValue(SLIDE_IMAGE, slideChanged);
        slideChanged.setCaption(newCaption);
        //or do we put the default caption here?
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //use put value to store old caption in OLD_CAPTION mneumonic making changes
        //not exactly sure what goes here, is there where the caption would get set in slideimage?
        //or do we just store the new caption under the CURRENT_CAPTION mneumonic here?
    
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void undo()
    {
        ((SlideImage)getValue(SLIDE_IMAGE)).setCaption(getValue(OLD_CAPTION).toString());
        //set caption back to old caption
    }
}
