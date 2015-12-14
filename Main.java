import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import java.awt.event.*;
import javax.imageio.*;
/**
 * Main class which executes all of the threads.
 * 
 * @author Abby Lambert
 * @version 1.0.0
 */
public class Main implements ActionListener
{
    private AppFrame frame;
    private MiddleMan middle;
    private Thread chooser;
    private ListMaker listMaker;
    private JComboBox genre;
    private JButton button;
    private boolean shuffle;
    private String genreChosen;
    private ButtonGroup group;
    private JRadioButton s;
    private JRadioButton n;
    /**
     * Constructor for the Main class
     * @param AppFrame the frame of the application
     * @param MiddleMan the class interfering between different threads
     */
    public Main(AppFrame f, MiddleMan m)
    {
        frame = f;
        middle = m;
    }
    /**
     * This class initializes all of the components of the application and can be run multiple 
     * times.
     */
    public void init()
    {
        String[] genreList = {"Alternative", "Country", "Electronic", "Metal", "Pop", "Rock"};
        genre = new JComboBox(genreList);
        genre.addActionListener(this);
        genre.setMaximumSize(new Dimension(150, 40));
        
        s = new JRadioButton("Shuffle");
        //s.setActionCommand(true);
        n = new JRadioButton("Normal");
        //n.setActionCommand(false);
        group = new ButtonGroup();
        group.add(s);
        group.add(n);
        
        
        s.addActionListener(this);
        n.addActionListener(this);
        s.setAlignmentX(Component.CENTER_ALIGNMENT);
        n.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        button = new JButton("Go");
        button.addActionListener(this);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        genreChosen = "Alternative";
        shuffle = false;
        
        s.setBackground(new Color(255,255,255));
        n.setBackground(new Color(255,255,255));
        
        //index 3
        frame.getPanel().add(button, 3); //GO
        //index 4
        frame.getPanel().add(Box.createRigidArea(new Dimension(25,25)),4);
        //index 6
        frame.getPanel().add(genre,6);
        //index 7
        frame.getPanel().add(Box.createRigidArea(new Dimension(25,25)),7);
        //index 10
        frame.getPanel().add(Box.createRigidArea(new Dimension(25,25)),10);
        //index 11
        frame.getPanel().add(s,11);
        //index 12
        frame.getPanel().add(n,12);
        
        frame.pack();
    }
    /**
     * This method is run when the user presses "go" and initializes all of the threads and runs them.
     */
    public void main()
    {
        
        
//         Scanner scan = new Scanner(System.in);
//         String text = "y";
//         
//         System.out.println("What genre do you want to listen to?");
//         String genre = scan.nextLine();
//         
//         listMaker = new ListMaker(genre);
//  
//         System.out.println("Shuffle? (y/n)");
//         String shuffle = scan.nextLine();

        frame.getPanel().remove(genre);
        frame.getPanel().remove(button);
        frame.getPanel().remove(s);
        frame.getPanel().remove(n);
        frame.getPanel().remove(frame.getPanel().getGenreLabel());
        listMaker = new ListMaker(genreChosen.toLowerCase());
        if(shuffle)
        {
            chooser = new Thread(new Shuffle(listMaker, middle, frame));
            frame.getPanel().add(frame.getPanel().getButton(), 2);
            frame.getPanel().add(Box.createVerticalGlue(),3);
            //System.out.println("Shuffle");
            //f.getPanel().getButton().setEnabled(true);
        }
        else
        {
            chooser = new Thread(new Normal(listMaker, middle, frame));
            frame.getPanel().add(frame.getPanel().getButton(), 2);
            //System.out.println("Normal");
           // f.getPanel().getButton().setEnabled(true);
        }
    }
    
    /**
     * This method checks for events from the GUI and reacts accordingly.
     */
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(genre))
        {
            JComboBox cb = (JComboBox)e.getSource();
            genreChosen = (String)cb.getSelectedItem();
            frame.getPanel().updateFile(genreChosen);
        }
        
        if(e.getSource().equals(button))
        {
            this.main();
        }
        
        if(e.getSource().equals(s))
        {
            shuffle = true;
        }
        else if(e.getSource().equals(n))
        {
            shuffle = false;
        }
    }
    
    /**
     * This method returns one of the radio buttons for use by the TextPanel.
     */
    public JRadioButton getRadioS()
    {
        return s;
    }
    /**
     * This method returns one of the radio buttons for us by the TextPanel.
     */
    public JRadioButton getRadioN()
    {
        return n;
    }
        
}
