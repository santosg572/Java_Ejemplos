import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RealTimeImageDisplay extends JPanel {
    private BufferedImage image;
    private int x = 0;
    private int y = 0;

    public RealTimeImageDisplay() {
        // Cargar imagen inicial
        try {
            // Reemplaza con la ruta de tu imagen
            image = ImageIO.read(new File("./imagenes/pajaro01.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Temporizador para simular actualización en tiempo real (cada 30ms)
        Timer timer = new Timer(30, e -> {
            x += 2; // Mover la imagen
            if (x > getWidth()) x = -image.getWidth();
            repaint(); // Solicitar repintado
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            // Dibujar la imagen en la posición actual
            g.drawImage(image, x, y, this);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Despliegue de Imagen en Tiempo Real");
        RealTimeImageDisplay panel = new RealTimeImageDisplay();
        
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

