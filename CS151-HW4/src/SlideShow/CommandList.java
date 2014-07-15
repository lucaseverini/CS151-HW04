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

    private ArrayList<AbstractAction> actionList;
    private final int MAX_UNDO = 10;
    public CommandList()
    {
        actionList = new ArrayList<>();
        
    }
    //perform the action
    public void performAction(AbstractAction a)
    {
        actionList.add(a);
        if (actionList.size() > MAX_UNDO)
        {
            actionList.remove(0);
        }
        a.actionPerformed(null);
    }
    
    public void undo()
    {
        if (actionList.size() > 0)
        {
            AbstractAction a = actionList.remove(actionList.size() - 1);
            //TODO: call a's undo method.
        }
    }
    
    public void clear()
    {
        actionList.clear();
        //TODO: diable undo button
    }
}
