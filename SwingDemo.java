import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class SwingDemo {
   public static void main(String[] args) {
      GraphicsEnvironment graphics =
      GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice device = graphics.getDefaultScreenDevice();
      JFrame frame = new JFrame("Fullscreen");
      scl90_datos dd = new scl90_datos();
//      JPanel panel = new JPanel();
//      JLabel label = new JLabel("", JLabel.CENTER);
//      label.setText("This is in fullscreen mode!");
//      label.setpaque(true);
      frame.add(dd, BorderLayout.CENTER);
//      frame.add(dd);
      frame.setUndecorated(true);
      frame.setResizable(false);
      device.setFullScreenWindow(frame);
   }
}

class scl90_datos extends JPanel{
   scl90_datos(){
   JPanel pp = new JPanel();
      JLabel label = new JLabel("", JLabel.CENTER);
      label.setText("This is in fullscreen mode!");
      pp.add(label);
      add(pp);
   }
}

