
/**
 * This class runs the entire project.
 * 
 * @author Abby Lambert 
 * @version 1.0.0
 */
public class Runner
{
    /**
     * This is the main method that runs the project and creates all of its components.
     */
    public static void main(String[] args)
    {
        MiddleMan middle = new MiddleMan();

        AppFrame window = new AppFrame(middle);

        Main main = new Main(window, middle);

        int counter = 0;
        while(true)
        {
            window.paintNewPanel(main);
            window.pack();

            main.init();

            while(!(middle.getDone()))
            {
                middle.Waiting();
                //System.out.println("Waiting");
                middle.NoWorries();
            }
            middle.setDone(false);
            //main = null;
            window.remove(window.getPanel());

            EndPanel end = new EndPanel();
            window.add(end);
            window.repaint();
            window.pack();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            window.remove(end);
            counter++;
//             if(counter == 1)
//             {
//                 for(int i = 0; i < 100000; i++)
//                 {
//                     System.out.print("2x2x");
//                     if(i%100==0)
//                     {
//                         System.out.println();
//                     }
//                     if(i == 999)
//                     {
//                         System.out.println("Get rekd loser");
//                     }
//                 }
//                 
//             }
        }

    }
}
