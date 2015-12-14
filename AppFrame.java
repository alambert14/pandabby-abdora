
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;

/**
 * Frame which holds the GUI.
 * 
 * @author Abby Lambert
 * @version 1.0.0
 */
public class AppFrame extends JFrame
{
    private TextPanel text;
    private MiddleMan middle;
    /**
     * Constructor for the AppFrame class
     * @param MiddleMan the class that allows the threads to interact.
     */
    public AppFrame(MiddleMan m)
    {
        middle = m;
        this.setPreferredSize(new Dimension(800,600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Abby's Radio App");
        //this.setResizable(false);
        //this.setBackground(new Color(0,0,0));
        //text = new TextPanel(middle);
        
        //this.getContentPane().setLayout(null);
        //this.add(text, BorderLayout.CENTER);
    }
    
    /**
     * This method paints a new TextPanel in order for the program to "start over."
     */
    public void paintNewPanel(Main m)
    {
        //this.removeAll();
        text = null;
        text = new TextPanel(this, middle, m);
        this.add(text, BorderLayout.CENTER);
        //System.out.println("Making a new panel");
        this.update(this.getGraphics());
    }

    /**
     * @return String
     */
    public String getText()
    {
        return text.getText();
    }

    /**
     * @param String
     */
    public void setText(String s)
    {
      text.setText(s);
    }
    
    /**
     * @return String
     */
    public String getFile()
    {
        return text.getFile();
    }
    
    /**
     * @param String
     */
    public void setFile(String f)
    {
        text.setFile(f);
    }
    
    /**
     * @return TextPanel currently running on the frame.
     */
    public TextPanel getPanel()
    {
        return text;
    }

}
