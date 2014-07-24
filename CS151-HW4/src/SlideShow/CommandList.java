/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SlideShow;

import java.util.ArrayList;
import javax.swing.AbstractAction;

/**
 *
 * @author omari
 */
public class CommandList {

    private ArrayList<CommandAction> actionList;
    private final int MAX_UNDO = 10;
    private GUIImageViewer viewer;
    public CommandList()
    {
        actionList = new ArrayList<>();
        viewer = new GUIImageViewer();
    }
    //perform the action
    public void performAction(CommandAction a)
    {
        actionList.add(a);
        if (actionList.size() > MAX_UNDO)
        {
            actionList.remove(0);
        }
        viewer.updateUndoMenuButton();
    }
    
    public void undo()
    {
        if (actionList.size() > 0)
        {
            CommandAction a = actionList.remove(actionList.size() - 1);
            a.undo();
        }
        viewer.updateUndoMenuButton();
    }
    
    public void clear()
    {
        actionList.clear();
        
        viewer.updateUndoMenuButton();
        //TODO: diable undo button
    }
    
    public boolean updateUndoMenu()
    {
        if(actionList.isEmpty())
        {
            return false;
        }
        
       return true;
    }
}
