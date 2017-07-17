// * @author Catalin Glavan
package emct;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ResourceBundle;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panel_check extends JPanel {

    private final JPanel panel;
    private final JLabel titleLabel;
    private static ResourceBundle resourceBundle;

    public panel_check(ResourceBundle bundle, String title, String[] labels) {

        this.resourceBundle = bundle;

        super.setLayout(new FlowLayout());
        panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));

        titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Dialog", Font.BOLD, 15));
        panel.add(titleLabel);

        for (String label : labels) {
            if (resourceBundle.getBaseBundleName().contains("_en")) {
                panel.add(new label_check(label, "_en"));
            }
            if (resourceBundle.getBaseBundleName().contains("_ro")) {
                panel.add(new label_check(label, "_ro"));
            }
        }
        super.add(panel);
    }
}
