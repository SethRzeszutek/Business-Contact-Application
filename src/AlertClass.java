// Project:		FINAL
// Class:		Java Programming
// Date:                12/6/17
// Author:              Seth Rzeszutek
// Description:         To complete the discription of the Final

import javax.swing.JOptionPane;

public class AlertClass
{

    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}