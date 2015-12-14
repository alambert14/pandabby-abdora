import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

import java.awt.image.*;
import java.io.*;
import java.awt.event.*;
import javax.imageio.*;
/**
 * Pane in which the GUI components lie
 * 
 * @author Abby Lambert
 * @version 1.0.0
 */
public class TextPanel extends JPanel implements ActionListener
{
    private Main main;
    private String text;
    private String file;
    private JLabel label1;
    private JLabel genreLabel;
    private JComboBox drop;
    private JButton button;
    private ImageIcon icon;
    private MiddleMan middle;
    private AppFrame frame;
    private JLabel backgroundLabel;
    /**
     * Constructor for the TextPanel class.  Initializes variables and creates components.
     */
    public TextPanel(AppFrame f, MiddleMan m, Main ma)
    {
        frame = f;
        middle = m;
        main = ma;

        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        String[] colors = {"White", "Purple", "Indigo", "Dark Blue", "Blue", "Light Blue", "Teal", "Green", "Dark Green", "Yellow", "Orange", "Red", "Pink", "Magenta", "Black"};
        drop = new JComboBox(colors);
        drop.addActionListener(this);
        drop.setMaximumSize(new Dimension(150, 40));
        file = "question.png";
        this.setBackground(new Color(255,255,255));

        text = "Choose a Genre:";
        ImageIcon icon = new ImageIcon(file);
        Image img = icon.getImage();
        Image img2 = img.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(img2);
        label1 = new JLabel("Image and Text", JLabel.CENTER);
        label1.setText(text);
        label1.setIcon(newIcon);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);

        ImageIcon bIcon = new ImageIcon("ff.png");
        button = new JButton(bIcon);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(this);

        genreLabel = new JLabel("Select a genre:");
        genreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        backgroundLabel = new JLabel("Select a background color:");
        backgroundLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        //index 0
        this.add(Box.createRigidArea(new Dimension(50,50)));
        //index 1
        this.add(label1);        
        //index 2
        this.add(Box.createRigidArea(new Dimension(25,25)));       
        //index 3 --> 5
        this.add(genreLabel);
        //index 4 --> 8
        this.add(backgroundLabel);
        //index 5 --> 9
        this.add(drop);

        this.setVisible(true);
        frame.update(frame.getGraphics());
    }

    /**
     * Paints the components on the panel
     * @param Graphics
     */
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        label1.setText(text);
        icon = new ImageIcon(file);
        Image img = icon.getImage();
        Image img2 = img.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(img2);

        label1.setIcon(icon);
        //super.paintComponent(g);
    }

    /**
     * @returns String
     */
    public String getText()
    {
        return text;
    }

    /**
     * @param String
     */
    public void setText(String s)
    {
        text = s;
    }

    /**
     * @returns String 
     */
    public String getFile()
    {
        return file;
    }

    /**
     * @return JLabel
     */
    public JLabel getGenreLabel()
    {
        return genreLabel;
    }

    /**
     * @param String file of a song cover
     */
    public void setFile(String f)
    {
        file = f;
    }

    /**
     * @return JComboBox
     */
    public JComboBox getDropMenu()
    {
        return drop;
    }

    /**
     * @return JButton
     */
    public JButton getButton()
    {
        return button;
    }

    /**
     * @param String color
     * Updates the color of the background of a frame
     */
    public void updateColor(String color)
    {
        if(color.equals("Purple"))
        {
            this.setBackground(new Color(150,0,255));
            main.getRadioS().setBackground(new Color(150,0,255));
            main.getRadioN().setBackground(new Color(150,0,255));
            label1.setForeground(Color.white);
            genreLabel.setForeground(Color.white);
            backgroundLabel.setForeground(Color.white);
            main.getRadioS().setForeground(Color.white);
            main.getRadioN().setForeground(Color.white);
        }
        else if(color.equals("Indigo"))
        {
            this.setBackground(new Color(80,0,255));
            main.getRadioS().setBackground(new Color(80,0,255));
            main.getRadioN().setBackground(new Color(80,0,255));
            label1.setForeground(Color.white);
            genreLabel.setForeground(Color.white);
            backgroundLabel.setForeground(Color.white);
            main.getRadioS().setForeground(Color.white);
            main.getRadioN().setForeground(Color.white);
        }
        else if(color.equals("Dark Blue"))
        {
            this.setBackground(new Color(0,0,150));
            main.getRadioS().setBackground(new Color(0,0,150));
            main.getRadioN().setBackground(new Color(0,0,150));
            label1.setForeground(Color.white);
            genreLabel.setForeground(Color.white);
            backgroundLabel.setForeground(Color.white);
            main.getRadioS().setForeground(Color.white);
            main.getRadioN().setForeground(Color.white);
        }
        else if(color.equals("Blue"))
        {
            this.setBackground(new Color(0,0,255));
            main.getRadioS().setBackground(new Color(0,0,255));
            main.getRadioN().setBackground(new Color(0,0,255));
            label1.setForeground(Color.white);
            genreLabel.setForeground(Color.white);
            backgroundLabel.setForeground(Color.white);
            main.getRadioS().setForeground(Color.white);
            main.getRadioN().setForeground(Color.white);
        }
        else if(color.equals("Light Blue"))
        {
            this.setBackground(new Color(0,255,255));
            main.getRadioS().setBackground(new Color(0,255,255));
            main.getRadioN().setBackground(new Color(0,255,255));
            label1.setForeground(Color.black);
            genreLabel.setForeground(Color.black);
            backgroundLabel.setForeground(Color.black);
            main.getRadioS().setForeground(Color.black);
            main.getRadioN().setForeground(Color.black);
        }
        else if(color.equals("Teal"))
        {
            this.setBackground(new Color(0,200,185));
            main.getRadioS().setBackground(new Color(0,200,185));
            main.getRadioN().setBackground(new Color(0,200,185));
            label1.setForeground(Color.black);
            genreLabel.setForeground(Color.black);
            backgroundLabel.setForeground(Color.black);
            main.getRadioS().setForeground(Color.black);
            main.getRadioN().setForeground(Color.black);
        }
        else if(color.equals("Green"))
        {
            this.setBackground(new Color(0,255,0));
            main.getRadioS().setBackground(new Color(0,255,0));
            main.getRadioN().setBackground(new Color(0,255,0));
            label1.setForeground(Color.black);
            genreLabel.setForeground(Color.black);
            backgroundLabel.setForeground(Color.black);
            main.getRadioS().setForeground(Color.black);
            main.getRadioN().setForeground(Color.black);
        }
        else if(color.equals("Dark Green"))
        {
            this.setBackground(new Color(0,150,0));
            main.getRadioS().setBackground(new Color(0,150,0));
            main.getRadioN().setBackground(new Color(0,150,0));
            label1.setForeground(Color.white);
            genreLabel.setForeground(Color.white);
            backgroundLabel.setForeground(Color.white);
            main.getRadioS().setForeground(Color.white);
            main.getRadioN().setForeground(Color.white);
        }
        else if(color.equals("Yellow"))
        {
            this.setBackground(new Color(255,255,0));
            main.getRadioS().setBackground(new Color(255,255,0));
            main.getRadioN().setBackground(new Color(255,255,0));
            label1.setForeground(Color.black);
            genreLabel.setForeground(Color.black);
            backgroundLabel.setForeground(Color.black);
            main.getRadioS().setForeground(Color.black);
            main.getRadioN().setForeground(Color.black);
        }
        else if(color.equals("Orange"))
        {
            this.setBackground(new Color(255,150,0));
            main.getRadioS().setBackground(new Color(255,150,0));
            main.getRadioN().setBackground(new Color(255,150,0));
            label1.setForeground(Color.black);
            genreLabel.setForeground(Color.black);
            backgroundLabel.setForeground(Color.black);
            main.getRadioS().setForeground(Color.black);
            main.getRadioN().setForeground(Color.black);
        }
        else if(color.equals("Red"))
        {
            this.setBackground(new Color(255,0,0));
            main.getRadioS().setBackground(new Color(255,0,0));
            main.getRadioN().setBackground(new Color(255,0,0));
            label1.setForeground(Color.white);
            genreLabel.setForeground(Color.white);
            backgroundLabel.setForeground(Color.white);
            main.getRadioS().setForeground(Color.white);
            main.getRadioN().setForeground(Color.white);
        }
        else if(color.equals("Pink"))
        {
            this.setBackground(new Color(255,150,255));
            main.getRadioS().setBackground(new Color(255,150,255));
            main.getRadioN().setBackground(new Color(255,150,255));
            label1.setForeground(Color.black);
            genreLabel.setForeground(Color.black);
            backgroundLabel.setForeground(Color.black);
            main.getRadioS().setForeground(Color.black);
            main.getRadioN().setForeground(Color.black);
        }
        else if(color.equals("Magenta"))
        {
            this.setBackground(new Color(255,0,255));
            main.getRadioS().setBackground(new Color(255,0,255));
            main.getRadioN().setBackground(new Color(255,0,255));
            label1.setForeground(Color.black);
            genreLabel.setForeground(Color.black);
            backgroundLabel.setForeground(Color.black);
            main.getRadioS().setForeground(Color.black);
            main.getRadioN().setForeground(Color.black);
        }
        else if(color.equals("White"))
        {
            this.setBackground(new Color(255,255,255));
            main.getRadioS().setBackground(new Color(255,255,255));
            main.getRadioN().setBackground(new Color(255,255,255));
            label1.setForeground(Color.black);
            genreLabel.setForeground(Color.black);
            backgroundLabel.setForeground(Color.black);
            main.getRadioS().setForeground(Color.black);
            main.getRadioN().setForeground(Color.black);
        }
        else if(color.equals("Black"))
        {
            this.setBackground(new Color(0,0,0));
            main.getRadioS().setBackground(new Color(0,0,0));
            main.getRadioN().setBackground(new Color(0,0,0));
            label1.setForeground(Color.white);
            genreLabel.setForeground(Color.white);
            backgroundLabel.setForeground(Color.white);
            main.getRadioS().setForeground(Color.white);
            main.getRadioN().setForeground(Color.white);
        }
        
        else
        {
            this.setBackground(new Color(255,255,255));
            main.getRadioS().setBackground(new Color(255,255,255));
            main.getRadioN().setBackground(new Color(255,255,255));
            label1.setForeground(Color.black);
            genreLabel.setForeground(Color.black);
            backgroundLabel.setForeground(Color.black);
            main.getRadioS().setForeground(Color.black);
            main.getRadioN().setForeground(Color.black);
        }

        //repaint();
    }

    /**
     * @param String genre
     * Updates the cover art with a certain file depending on the genre chosen
     */
    public void updateFile(String genre)
    {
        if(genre.toLowerCase().equals("country"))
        {
            setFile("country.jpg");
        }
        else if(genre.toLowerCase().equals("alternative"))
        {
            setFile("alternative.jpg");
        }
        else if(genre.toLowerCase().equals("electronic"))
        {
            setFile("electronic.jpg");
        }
        else if(genre.toLowerCase().equals("pop"))
        {
            setFile("pop.jpg");
        }
        else if(genre.toLowerCase().equals("metal"))
        {
            setFile("metal.png");
        }
        else if(genre.toLowerCase().equals("rock"))
        {
            setFile("rock.jpg");
        }
        repaint();
    }

    /**
     * @param ActionEvent
     * Checks for actions performed and reacts accordingly
     */
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(drop))
        {
            JComboBox cb = (JComboBox)e.getSource();
            String color = (String)cb.getSelectedItem();
            updateColor(color);
        }
        else if(e.getSource().equals(button))
        {
            if (button.isEnabled())
            {
                //button.setLabel("You Fast Forwarded!");
                middle.setSkipped(true);
            }
        }
    }
}