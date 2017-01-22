package emct.forms;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class default_panel extends JPanel {

    private Image mainImage = null;
    private final Image scaledImage = null;

    public default_panel() {

        super.setPreferredSize(new Dimension(1541, 991));
        mainImage = new ImageIcon(getClass().getResource("/emct/images/default_panel.jpg")).getImage();
        mainImage = mainImage.getScaledInstance(super.getPreferredSize().width, super.getPreferredSize().height, Image.SCALE_DEFAULT);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d = (Graphics2D) g2d.create();
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (scaledImage == null) {
            g2d.drawImage(mainImage, 0, 0, this.getWidth(), this.getHeight(), Color.white, this);
        } else {
            g2d.drawImage(scaledImage, 0, 0, this);
            g2d.drawImage(scaledImage, 0, 0, this.getWidth(), this.getHeight(), Color.white, this);
        }
        g2d.dispose();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new default_panel());
        frame.pack();
        frame.setVisible(true);
    }
}
