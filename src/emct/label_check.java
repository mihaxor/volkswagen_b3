// * @author mihai-catalin.glavan
package emct;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class label_check extends JLabel {

    private final Color setColor = new Color(15, 89, 193);

    public label_check(String label, String lang) {

        String[] splitLink = label.split("\\.");
        super.setText(label);
        super.setFont(new Font("Dialog", Font.BOLD, 13));

        if (splitLink.length > 1) {
            super.setForeground(setColor);
            super.setCursor(new Cursor(Cursor.HAND_CURSOR));
            super.addMouseListener(new MouseAdapterImpl(this, splitLink, setColor, lang));
        }
    }

    private static class MouseAdapterImpl extends MouseAdapter {

        private final String[] splitLink;
        private final JLabel label;
        private final Color setColor;
        private final String lang;

        public MouseAdapterImpl(JLabel label, String[] splitLink, Color color, String lang) {
            this.splitLink = splitLink;
            this.label = label;
            this.setColor = color;
            this.lang = lang;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if (lang.contains("_en")) {
                new emct.en.forms.emct(splitLink[1]).setVisible(true);
            }
            if (lang.contains("_ro")) {
                new emct.ro.forms.emct(splitLink[1]).setVisible(true);
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            label.setForeground(Color.BLACK);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            label.setForeground(setColor);
        }
    }
}
