/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SlideShow;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

/**
 *
 * @author omari
 */
public class CommandAction extends AbstractAction {
    
    protected String SLIDE_IMAGE = "Slide Image";
    public CommandAction(String name) {
        super(name);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
    public void undo()
    {
        
    }
}
