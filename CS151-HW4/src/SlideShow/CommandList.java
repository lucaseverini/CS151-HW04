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
    public CommandList()
    {
        actionList = new ArrayList<>();      
    }
    //perform the action
    public void performAction(CommandAction a)
    {
        actionList.add(a);
        if (actionList.size() > MAX_UNDO)
        {
            actionList.remove(0);
        }
    }
    
    public void undo()
    {
        if (actionList.size() > 0)
        {
            CommandAction a = actionList.remove(actionList.size() - 1);
            a.undo();
        }
    }
    
    public void clear()
    {
        actionList.clear();
        //TODO: diable undo button
    }
}
