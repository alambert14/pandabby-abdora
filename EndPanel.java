import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

import java.awt.image.*;
import java.io.*;
import java.awt.event.*;
import javax.imageio.*;
/**
 * Panel which is shown when a list runs out of songs.
 * 
 * @author Abby Lambert
 * @version 1.0.0
 */
public class EndPanel extends JPanel
{
    /**
     * Constructor for the EndPanel class
     */
    public EndPanel()
    {
        setBackground(Color.white);
    }
    /**
     * @param Graphics
     * Paints the panel with a message stating that the user ran out of songs.
     */
    public void paintComponent(Graphics g)
    {
        String message = "You've run out of songs! You can now choose a new genre. lol get rekd son";
        Graphics2D g2d = (Graphics2D) g;
        FontMetrics fm = g2d.getFontMetrics();
        Rectangle2D r = fm.getStringBounds(message, g2d);
        int x = (this.getWidth() - (int) r.getWidth()) / 2;
        int y = (this.getHeight() - (int) r.getHeight()) / 2 + fm.getAscent();
        g.drawString(message, x, y);
    }

}
