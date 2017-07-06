// * @author Catalin Glavan
package emct;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.TableCellRenderer;

public class ecu extends JFrame {

    private final JPanel panel;
    private Image image;
    private final ResourceBundle rsBundle;

    public ecu(ResourceBundle bundle) {

        this.rsBundle = bundle;
        super.setLayout(new BorderLayout());
        this.image = new ImageIcon(getClass().getResource("/emct/images/pins.png")).getImage();

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2D = (Graphics2D) g;
                g2D.drawImage(image, 0, 0, null);
            }
        };
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(new Color(0, 170, 222));
        super.add(panel, BorderLayout.NORTH);

        JTable table = new JTable(new DefaultTableCheck(rsBundle));
        table.getColumn(rsBundle.getString("key_comp")).setCellRenderer(new ButtonRenderer());
        table.getColumn(rsBundle.getString("key_comp")).setCellEditor(new ButtonEditor(new JCheckBox()));
        JScrollPane scroll = new JScrollPane(table);
        table.setAutoCreateRowSorter(true);
        table.setAutoCreateColumnsFromModel(true);
        table.setRowHeight(22);
        table.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
        table.getTableHeader().setFont(new Font("Calibri", Font.BOLD, 15));
        table.setFont(new Font("Calibri", Font.PLAIN, 14));
        table.getColumnModel().getColumn(0).setPreferredWidth(250);
        table.getColumnModel().getColumn(1).setPreferredWidth(5);
        table.getColumnModel().getColumn(2).setPreferredWidth(30);
        table.getColumnModel().getColumn(3).setPreferredWidth(250);
        table.getColumnModel().getColumn(4).setPreferredWidth(300);
        table.getColumnModel().getColumn(5).setPreferredWidth(5);

        super.add(scroll, BorderLayout.CENTER);
        super.setTitle(bundle.getString("key_ecu"));
        super.setSize(1200, 700);
        super.setLocationRelativeTo(null);
        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    class DefaultTableCheck extends javax.swing.table.DefaultTableModel {

        private final Object[][] data;
        private final String[] cols;

        public DefaultTableCheck(ResourceBundle bundle) {

            this.cols = new String[]{
                bundle.getString("key_comp"),
                bundle.getString("key_ecm"),
                bundle.getString("key_cond"),
                bundle.getString("key_type"),
                bundle.getString("key_oscillo"),
                bundle.getString("key_wave")
            };

            this.data = new Object[][]{
                {bundle.getString("key_air"), "37", "", bundle.getString("key_connected_pin"), "", ""},
                {bundle.getString("key_alarm"), "07", "", bundle.getString("key_connected_pin"), "", ""},
                {bundle.getString("key_automatic"), "31", "", bundle.getString("key_connected_pin"), "", ""},
                {bundle.getString("key_co_ad"), "13", bundle.getString("key_ig_on"), "0 V", "", ""},
                {bundle.getString("key_co_ad"), "35", bundle.getString("key_ig_on"), bundle.getString("key_values_35"), "", ""},
                {bundle.getString("key_injector_cold"), "03", bundle.getString("key_ig_on"), "11-14 V", "", ""},
                {bundle.getString("key_injector_cold"), "03", bundle.getString("key_flap4"), bundle.getString("key_values_3_2"), "", ""},
                {bundle.getString("key_crankshaft_sensor"), "11", bundle.getString("key_turned"), "0 V or 10-14 V", "", ""},
                {bundle.getString("key_crankshaft_sensor"), "11", bundle.getString("key_status1"), "30 Hz", "5 V/20 ms", "WAVE"},
                {bundle.getString("key_crankshaft_sensor"), "11", "3000 rpm", "100 Hz", "", ""},
                {bundle.getString("key_crankshaft_sensor"), "13", bundle.getString("key_ig_on"), "0 V", "", ""},
                {bundle.getString("key_crankshaft_sensor"), "30", bundle.getString("key_ig_off"), "0 V", "", ""},
                {bundle.getString("key_crankshaft_sensor"), "30", bundle.getString("key_ig_on"), "10 V min.", "", ""},
                {bundle.getString("key_datalink"), "32", "", bundle.getString("key_connected_pin"), "", ""},
                {bundle.getString("key_ea"), "20", bundle.getString("key_ig_on"), "0 V","", ""},
                {bundle.getString("key_ea2"), "29", bundle.getString("key_ig_on"), "0 V","", ""},
                {bundle.getString("key_relay"), "38", bundle.getString("key_ig_off"), "0 V", "", ""},
                {bundle.getString("key_relay"), "38", bundle.getString("key_ig_on"), "11-14V", "", ""},
                {bundle.getString("key_temp_sensor"), "13", bundle.getString("key_ig_on"), "0 V", "", ""},
                {bundle.getString("key_temp_sensor"), "14", bundle.getString("key_col_temp"), "1 V", "", ""},
                {bundle.getString("key_temp_sensor"), "14", bundle.getString("key_col_temp2"), "0.2 V", "", ""},
                {bundle.getString("key_pump"), "07", bundle.getString("key_ig_on"), bundle.getString("key_values_3_2"), "", ""},
                {bundle.getString("key_pump"), "07", bundle.getString("key_status2"), "0-1 V", "", ""},
                {bundle.getString("key_heated"), "08", bundle.getString("key_flap3"), bundle.getString("key_values_8"), "0,2 V/1 sec.", "WAVE"},
                {bundle.getString("key_oxy2"), "29", bundle.getString("key_status1"), "0 V", "", ""},
                {bundle.getString("key_oxy"), "33", bundle.getString("key_status1"), "0 V", "", ""},
                {bundle.getString("key_idleair"), "25", bundle.getString("key_status1"), "", "2 V/5 ms", "WAVE"},
                {bundle.getString("key_ignition_amp"), "27", bundle.getString("key_status2"), "10 Hz", "", ""},
                {bundle.getString("key_ignition_amp"), "27", bundle.getString("key_status1"), "30 Hz", "2 V/10 ms", "WAVE"},
                {bundle.getString("key_ignition_amp"), "27", "3000 rpm", "100 Hz", "", ""},
                {bundle.getString("key_ign2"), "26", bundle.getString("key_status2"), "10 V", "", ""},
                {bundle.getString("key_ign"), "36", bundle.getString("key_ig_off"), "0 V", "", ""},
                {bundle.getString("key_ign"), "36", bundle.getString("key_ig_on"), "11- 14 V", "", ""},
                {bundle.getString("key_inj"), "02", bundle.getString("key_ig_on"), bundle.getString("key_values_2"), "", ""},
                {bundle.getString("key_inj"), "02", bundle.getString("key_flap3"), "2,3 ms", "10 V/2 ms", "WAVE"},
                {bundle.getString("key_instrument"), "10", "", bundle.getString("key_connected_pin"), "", ""},
                {bundle.getString("key_instrument2"), "24", "", bundle.getString("key_connected_pin"), "", ""},
                {bundle.getString("key_iat"), "13", bundle.getString("key_ig_on"), "0 V", "", ""},
                {bundle.getString("key_iat"), "15", bundle.getString("key_temp"), "1,4 V", "", ""},
                {bundle.getString("key_ks"), "16", bundle.getString("key_status4"), "", "50 mV/1 ms", "WAVE"},
                {bundle.getString("key_ks"), "17", bundle.getString("key_status3"), "0 V", "", ""},
                {bundle.getString("key_ks2"), "34", bundle.getString("key_status3"), "0 V", "", ""},
                {bundle.getString("key_spare"), "06", "", bundle.getString("key_connected_pin"), "", ""},
                {bundle.getString("key_tp"), "01", bundle.getString("key_ig_on"), "5V", "", ""},
                {bundle.getString("key_tp"), "12", bundle.getString("key_throttle_status"), "0,5-1,5 V", "", ""},
                {bundle.getString("key_tp"), "12", bundle.getString("key_throttle_status2"), "3-5 V", "", ""},
                {bundle.getString("key_vaf"), "13", bundle.getString("key_ig_on"), "0 V", "", ""},
                {bundle.getString("key_vaf"), "19", bundle.getString("key_flap"), "0,3 V", "", ""},
                {bundle.getString("key_vaf"), "19", bundle.getString("key_flap2"), "4,4 V", "", ""},
                {bundle.getString("key_vaf"), "19", bundle.getString("key_flap3"), "0,8 V", "", ""},
                {bundle.getString("key_vaf"), "28", bundle.getString("key_ig_on"), "5 V", "", ""}
            };

            for (Object c : cols) {
                this.addColumn(c);
            }

            for (Object[] r : data) {
                addRow(r);
            }
        }

        @Override
        public Class getColumnClass(int columnIndex) {
            if (columnIndex == 0) {
                return getValueAt(0, columnIndex).getClass();
            } else {
                return super.getColumnClass(columnIndex);
            }
        }
    }

    class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
            super.setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

            if (isSelected) {
                setForeground(UIManager.getColor("Synthetica.foreground"));
                setBackground(UIManager.getColor("Synthetica.background"));
            } else {
                setForeground(UIManager.getColor("Synthetica.foreground"));
                setBackground(UIManager.getColor("Synthetica.background"));
            }
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

    class ButtonEditor extends DefaultCellEditor {

        protected JButton button;
        private String label;
        private boolean isPushed;

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener((ActionEvent e) -> {
                fireEditingStopped();
            });
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {

            if (isSelected) {
                button.setForeground(table.getSelectionForeground());
                button.setBackground(table.getSelectionBackground());
            } else {
                button.setForeground(table.getForeground());
                button.setBackground(table.getBackground());
            }
            label = (value == null) ? "" : value.toString();
            button.setText(label);
            isPushed = true;
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            if (isPushed && button.getText().contains("<html>")) {
                JOptionPane.showMessageDialog(button, label + ": Ouch!");
            }
            isPushed = false;
            return label;
        }

        @Override
        public boolean stopCellEditing() {
            isPushed = false;
            return super.stopCellEditing();
        }
    }

    public static void main(String[] args) {

        try {

            javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
            java.awt.EventQueue.invokeLater(() -> {
                final Locale RO = new Locale("ro", "Romania");
                final Locale EN = new Locale("en", "US");
                ResourceBundle bundle1 = ResourceBundle.getBundle("emct/trouble_shooter_en", EN);
                new ecu(bundle1);
            });
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ecu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
