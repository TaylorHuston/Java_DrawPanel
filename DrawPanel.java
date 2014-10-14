
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Simple program to draw some lines
 * From "Java How To Program, 10/e, Early Objects" - Chapter 4
 */



public class DrawPanel extends JPanel {

    //Draws an X from the corners of the panel
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g); //Call paintCompnenet to ensure the panel displays correctly
        
        int width = getWidth();
        int height = getHeight();
        
        g.drawLine(0, 0, width,height);
        g.drawLine(0,height,width, 0);
        
    }//End class paintComponent
    
    public static void main(String[] args) {
        
        DrawPanel myPanel = new DrawPanel(); //Create panel to hold drawing
        JFrame app = new JFrame();  //Create fram to hold panel
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(myPanel); // add the panel to the frame      
        app.setSize(250, 250); // set the size of the frame 
        app.setVisible(true); // make the frame visible
    }//End main
    
}//End class DrawPanel
