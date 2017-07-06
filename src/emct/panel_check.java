// * @author Catalin Glavan
package emct;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panel_check extends JPanel {

    private final JPanel panel;
    private final JLabel titleLabel;

    public panel_check(String title, String[] labels) {

        super.setLayout(new FlowLayout());
        panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));

        titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Dialog", Font.BOLD, 15));
        panel.add(titleLabel);

        for (String label : labels) {
            panel.add(new label_check(label));
        }
        super.add(panel);
    }
}
