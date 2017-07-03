// * @author Catalin Glavan
package emct;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panel_default extends JPanel {

    private final JPanel panel;
    private JLabel titleLabel;

    public panel_default(String title, String[] labels) {

        super.setLayout(new FlowLayout());
        panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));

        titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Dialog", Font.BOLD, 15));
        panel.add(titleLabel);

        for (String label : labels) {
            System.out.println(label);

            String[] splitLink = label.split("\\.");
            JLabel set = new JLabel(label);
            set.setFont(new Font("Dialog", Font.BOLD, 13));

            if (splitLink.length > 1) {
                set.setForeground(setColor2);
                set.setCursor(new Cursor(Cursor.HAND_CURSOR));
                set.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        new emct.en.forms.emct(splitLink[1]).setVisible(true);
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        set.setForeground(Color.BLACK);
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        set.setForeground(setColor2);
                    }
                });
            }
            panel.add(set);
        }

        super.add(panel);

    }

    private final Color setColor = new Color(255, 204, 0);
    private final Color setColor2 = new Color(15, 89, 193);
    private final Color setColor3 = new Color(242, 227, 196);
}
