package emct.ro.forms;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class default_images extends JFrame {

    private final panel_images image;
    private final String file_path;
    private final String frame_title;
    private final Image icon;
    private Point pointLocation;

    public default_images(String title, String path, Point point) {

        this.file_path = path;
        this.frame_title = title;
        this.pointLocation = point;

        image = new panel_images(file_path);
        icon = new ImageIcon(getClass().getResource("/emct/images/vw_ico.png")).getImage();

        super.setTitle(frame_title);
        super.setIconImage(icon);
        super.setLocation((int) pointLocation.getX() + 400, (int) pointLocation.getY() + 70);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        super.getContentPane().add(image);
        super.setVisible(true);
        super.setAlwaysOnTop(true);
        super.pack();
    }

    class panel_images extends JPanel {

        private Image mainImage = null;
        private ImageIcon img = null;
        private final Image scaledImage = null;
        private final String file_path;

        public panel_images(String path) {

            this.file_path = path;
            img = new ImageIcon(getClass().getResource(file_path));
            super.setPreferredSize(new Dimension(img.getIconWidth(), img.getIconHeight()));
            mainImage = img.getImage();
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
    }
}
