package emct.forms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import emct.frames.a_service_adjustments.co_level;
import emct.frames.a_service_adjustments.idle_speed;
import emct.frames.a_service_adjustments.throttle;
import emct.frames.b_fuel_system.cold_start;
import emct.frames.b_fuel_system.fuel_delivery;
import emct.frames.b_fuel_system.fuel_presure;
import emct.frames.b_fuel_system.fuel_pump;
import emct.frames.b_fuel_system.injectors;
import emct.frames.c_intake_system.idle_air;
import emct.frames.c_intake_system.intake_air;
import emct.frames.c_intake_system.throttle_position;
import emct.frames.c_intake_system.volume_air;
import emct.frames.d_ignition_system.high_tension;
import emct.frames.d_ignition_system.ignition_amplifier;
import emct.frames.d_ignition_system.ignition_coil;
import emct.frames.d_ignition_system.ignition_timing;
import emct.frames.e_engine_sensors.crankshaft;
import emct.frames.e_engine_sensors.engine_coolant;
import emct.frames.e_engine_sensors.knock_sensor;
import emct.frames.f_emission_control.co_adjustment;
import emct.frames.f_emission_control.heated_oxygen;
import emct.frames.f_emission_control.oxygen_sensor;
import emct.frames.g_control_system.engine_control_module;
import emct.frames.g_control_system.engine_control_relay;
import emct.frames.g_control_system.fuel_pump_relay;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Catalin Glavan
 */
public class emct extends javax.swing.JFrame implements language {

    public emct() {
        initComponents();
        super.setLocationRelativeTo(null);
        splitter.setDividerLocation(300);
        icon = new ImageIcon(getClass().getResource("/emct/images/vw_ico.png")).getImage();
        super.setIconImage(icon);
    }

    private void submenu_service(String set) {
        if (set.equals("ADD")) {
            service_sub1 = new JButton(service_txt1);
            service_sub1.setFont(setFont);
            service_sub1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            service_sub1.setBackground(setColor3);
            service_sub1.setFocusable(false);
            service_sub1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            service_sub1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            service_sub1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            service_sub1.setPreferredSize(setDim);
            service_sub1.addActionListener(new EVENT(new idle_speed(super.getLocation()), this, service_sub1));

            service_sub2 = new JButton(service_txt2);
            service_sub2.setFont(setFont);
            service_sub2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            service_sub2.setBackground(setColor3);
            service_sub2.setFocusable(false);
            service_sub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            service_sub2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            service_sub2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            service_sub2.setPreferredSize(setDim);
            service_sub2.addActionListener(new EVENT(new co_level(super.getLocation()), this, service_sub2));

            service_sub3 = new JButton(service_txt3);
            service_sub3.setFont(setFont);
            service_sub3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            service_sub3.setBackground(setColor3);
            service_sub3.setFocusable(false);
            service_sub3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            service_sub3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            service_sub3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            service_sub3.setPreferredSize(setDim);
            service_sub3.addActionListener(new EVENT(new throttle(super.getLocation()), this, service_sub3));

            panel1.add(service_sub1);
            panel1.add(service_sub2);
            panel1.add(service_sub3);
        }
        if (set.equals("REMOVE")) {
            panel1.remove(service_sub1);
            panel1.remove(service_sub2);
            panel1.remove(service_sub3);
        }
        if (set.equals("NULL")) {

        }
    }

    private void submenu_fuel(String set) {
        if (set.equals("ADD")) {
            fuel_sub1 = new JButton(fuel_txt1);
            fuel_sub1.setFont(setFont);
            fuel_sub1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            fuel_sub1.setBackground(setColor3);
            fuel_sub1.setFocusable(false);
            fuel_sub1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            fuel_sub1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            fuel_sub1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            fuel_sub1.setPreferredSize(setDim);
            fuel_sub1.addActionListener(new EVENT(new fuel_presure(super.getLocation()), this, fuel_sub1));

            fuel_sub2 = new JButton(fuel_txt2);
            fuel_sub2.setFont(setFont);
            fuel_sub2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            fuel_sub2.setBackground(setColor3);
            fuel_sub2.setFocusable(false);
            fuel_sub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            fuel_sub2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            fuel_sub2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            fuel_sub2.setPreferredSize(setDim);
            fuel_sub2.addActionListener(new EVENT(new fuel_delivery(super.getLocation()), this, fuel_sub2));

            fuel_sub3 = new JButton(fuel_txt3);
            fuel_sub3.setFont(setFont);
            fuel_sub3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            fuel_sub3.setBackground(setColor3);
            fuel_sub3.setFocusable(false);
            fuel_sub3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            fuel_sub3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            fuel_sub3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            fuel_sub3.setPreferredSize(setDim);
            fuel_sub3.addActionListener(new EVENT(new injectors(super.getLocation()), this, fuel_sub3));

            fuel_sub4 = new JButton(fuel_txt4);
            fuel_sub4.setFont(setFont);
            fuel_sub4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            fuel_sub4.setBackground(setColor3);
            fuel_sub4.setFocusable(false);
            fuel_sub4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            fuel_sub4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            fuel_sub4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            fuel_sub4.setPreferredSize(setDim);
            fuel_sub4.addActionListener(new EVENT(new cold_start(super.getLocation()), this, fuel_sub4));

            fuel_sub5 = new JButton(fuel_txt5);
            fuel_sub5.setFont(setFont);
            fuel_sub5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            fuel_sub5.setBackground(setColor3);
            fuel_sub5.setFocusable(false);
            fuel_sub5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            fuel_sub5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            fuel_sub5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            fuel_sub5.setPreferredSize(setDim);
            fuel_sub5.addActionListener(new EVENT(new fuel_pump(super.getLocation()), this, fuel_sub5));

            panel2.add(fuel_sub1);
            panel2.add(fuel_sub2);
            panel2.add(fuel_sub3);
            panel2.add(fuel_sub4);
            panel2.add(fuel_sub5);
        }
        if (set.equals("REMOVE")) {
            panel2.remove(fuel_sub1);
            panel2.remove(fuel_sub2);
            panel2.remove(fuel_sub3);
            panel2.remove(fuel_sub4);
            panel2.remove(fuel_sub5);
        }
        if (set.equals("NULL")) {

        }
    }

    private void submenu_intake(String set) {
        if (set.equals("ADD")) {
            intake_sub1 = new JButton(intake_txt1);
            intake_sub1.setFont(setFont);
            intake_sub1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            intake_sub1.setBackground(setColor3);
            intake_sub1.setFocusable(false);
            intake_sub1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            intake_sub1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            intake_sub1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            intake_sub1.setPreferredSize(setDim);
            intake_sub1.addActionListener(new EVENT(new throttle_position(super.getLocation()), this, intake_sub1));

            intake_sub2 = new JButton(intake_txt2);
            intake_sub2.setFont(setFont);
            intake_sub2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            intake_sub2.setBackground(setColor3);
            intake_sub2.setFocusable(false);
            intake_sub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            intake_sub2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            intake_sub2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            intake_sub2.setPreferredSize(setDim);
            intake_sub2.addActionListener(new EVENT(new volume_air(super.getLocation()), this, intake_sub2));

            intake_sub3 = new JButton(intake_txt3);
            intake_sub3.setFont(setFont);
            intake_sub3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            intake_sub3.setBackground(setColor3);
            intake_sub3.setFocusable(false);
            intake_sub3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            intake_sub3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            intake_sub3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            intake_sub3.setPreferredSize(setDim);
            intake_sub3.addActionListener(new EVENT(new intake_air(super.getLocation()), this, intake_sub3));

            intake_sub4 = new JButton(intake_txt4);
            intake_sub4.setFont(setFont);
            intake_sub4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            intake_sub4.setBackground(setColor3);
            intake_sub4.setFocusable(false);
            intake_sub4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            intake_sub4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            intake_sub4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            intake_sub4.setPreferredSize(setDim);
            intake_sub4.addActionListener(new EVENT(new idle_air(super.getLocation()), this, intake_sub4));

            panel3.add(intake_sub1);
            panel3.add(intake_sub2);
            panel3.add(intake_sub3);
            panel3.add(intake_sub4);
        }
        if (set.equals("REMOVE")) {
            panel3.remove(intake_sub1);
            panel3.remove(intake_sub2);
            panel3.remove(intake_sub3);
            panel3.remove(intake_sub4);
        }
        if (set.equals("NULL")) {

        }
    }

    private void submenu_ignition(String set) {
        if (set.equals("ADD")) {
            ignition_sub1 = new JButton(ignition_txt1);
            ignition_sub1.setFont(setFont);
            ignition_sub1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ignition_sub1.setBackground(setColor3);
            ignition_sub1.setFocusable(false);
            ignition_sub1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            ignition_sub1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            ignition_sub1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            ignition_sub1.setPreferredSize(setDim);
            ignition_sub1.addActionListener(new EVENT(new high_tension(super.getLocation()), this, ignition_sub1));

            ignition_sub2 = new JButton(ignition_txt2);
            ignition_sub2.setFont(setFont);
            ignition_sub2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ignition_sub2.setBackground(setColor3);
            ignition_sub2.setFocusable(false);
            ignition_sub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            ignition_sub2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            ignition_sub2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            ignition_sub2.setPreferredSize(setDim);
            ignition_sub2.addActionListener(new EVENT(new ignition_timing(super.getLocation()), this, ignition_sub2));

            ignition_sub3 = new JButton(ignition_txt3);
            ignition_sub3.setFont(setFont);
            ignition_sub3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ignition_sub3.setBackground(setColor3);
            ignition_sub3.setFocusable(false);
            ignition_sub3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            ignition_sub3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            ignition_sub3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            ignition_sub3.setPreferredSize(setDim);
            ignition_sub3.addActionListener(new EVENT(new ignition_coil(super.getLocation()), this, ignition_sub3));

            ignition_sub4 = new JButton(ignition_txt4);
            ignition_sub4.setFont(setFont);
            ignition_sub4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ignition_sub4.setBackground(setColor3);
            ignition_sub4.setFocusable(false);
            ignition_sub4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            ignition_sub4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            ignition_sub4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            ignition_sub4.setPreferredSize(setDim);
            ignition_sub4.addActionListener(new EVENT(new ignition_amplifier(super.getLocation()), this, ignition_sub4));

            panel4.add(ignition_sub1);
            panel4.add(ignition_sub2);
            panel4.add(ignition_sub3);
            panel4.add(ignition_sub4);

        }
        if (set.equals("REMOVE")) {
            panel4.remove(ignition_sub1);
            panel4.remove(ignition_sub2);
            panel4.remove(ignition_sub3);
            panel4.remove(ignition_sub4);

        }
        if (set.equals("NULL")) {

        }
    }

    private void submenu_engine(String set) {
        if (set.equals("ADD")) {
            engine_sub1 = new JButton(engine_txt1);
            engine_sub1.setFont(setFont);
            engine_sub1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            engine_sub1.setBackground(setColor3);
            engine_sub1.setFocusable(false);
            engine_sub1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            engine_sub1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            engine_sub1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            engine_sub1.setPreferredSize(setDim);
            engine_sub1.addActionListener(new EVENT(new engine_coolant(super.getLocation()), this, engine_sub1));

            engine_sub2 = new JButton(engine_txt2);
            engine_sub2.setFont(setFont);
            engine_sub2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            engine_sub2.setBackground(setColor3);
            engine_sub2.setFocusable(false);
            engine_sub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            engine_sub2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            engine_sub2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            engine_sub2.setPreferredSize(setDim);
            engine_sub2.addActionListener(new EVENT(new crankshaft(super.getLocation()), this, engine_sub2));

            engine_sub3 = new JButton(engine_txt3);
            engine_sub3.setFont(setFont);
            engine_sub3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            engine_sub3.setBackground(setColor3);
            engine_sub3.setFocusable(false);
            engine_sub3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            engine_sub3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            engine_sub3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            engine_sub3.setPreferredSize(setDim);
            engine_sub3.addActionListener(new EVENT(new knock_sensor(), this, engine_sub3));

            panel5.add(engine_sub1);
            panel5.add(engine_sub2);
            panel5.add(engine_sub3);
        }
        if (set.equals("REMOVE")) {
            panel5.remove(engine_sub1);
            panel5.remove(engine_sub2);
            panel5.remove(engine_sub3);
        }
        if (set.equals("NULL")) {

        }
    }

    private void submenu_emission(String set) {
        if (set.equals("ADD")) {
            emission_sub1 = new JButton(emission_txt1);
            emission_sub1.setFont(setFont);
            emission_sub1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            emission_sub1.setBackground(setColor3);
            emission_sub1.setFocusable(false);
            emission_sub1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            emission_sub1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            emission_sub1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            emission_sub1.setPreferredSize(setDim);
            emission_sub1.addActionListener(new EVENT(new co_adjustment(super.getLocation()), this, emission_sub1));

            emission_sub2 = new JButton(emission_txt2);
            emission_sub2.setFont(setFont);
            emission_sub2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            emission_sub2.setBackground(setColor3);
            emission_sub2.setFocusable(false);
            emission_sub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            emission_sub2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            emission_sub2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            emission_sub2.setPreferredSize(setDim);
            emission_sub2.addActionListener(new EVENT(new heated_oxygen(super.getLocation()), this, emission_sub2));

            emission_sub3 = new JButton(emission_txt3);
            emission_sub3.setFont(setFont);
            emission_sub3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            emission_sub3.setBackground(setColor3);
            emission_sub3.setFocusable(false);
            emission_sub3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            emission_sub3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            emission_sub3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            emission_sub3.setPreferredSize(setDim);
            emission_sub3.addActionListener(new EVENT(new oxygen_sensor(super.getLocation()), this, emission_sub3));

            panel6.add(emission_sub1);
            panel6.add(emission_sub2);
            panel6.add(emission_sub3);

        }
        if (set.equals("REMOVE")) {
            panel6.remove(emission_sub1);
            panel6.remove(emission_sub2);
            panel6.remove(emission_sub3);

        }
        if (set.equals("NULL")) {

        }
    }

    private void submenu_control(String set) {
        if (set.equals("ADD")) {
            control_sub1 = new JButton(control_txt1);
            control_sub1.setFont(setFont);
            control_sub1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            control_sub1.setBackground(setColor3);
            control_sub1.setFocusable(false);
            control_sub1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            control_sub1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            control_sub1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            control_sub1.setPreferredSize(setDim);
            control_sub1.addActionListener(new EVENT(new engine_control_relay(super.getLocation()), this, control_sub1));

            control_sub2 = new JButton(control_txt2);
            control_sub2.setFont(setFont);
            control_sub2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            control_sub2.setBackground(setColor3);
            control_sub2.setFocusable(false);
            control_sub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            control_sub2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            control_sub2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            control_sub2.setPreferredSize(setDim);
            control_sub2.addActionListener(new EVENT(new fuel_pump_relay(super.getLocation()), this, control_sub2));

            control_sub3 = new JButton(control_txt3);
            control_sub3.setFont(setFont);
            control_sub3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            control_sub3.setBackground(setColor3);
            control_sub3.setFocusable(false);
            control_sub3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            control_sub3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            control_sub3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            control_sub3.setPreferredSize(setDim);
            control_sub3.addActionListener(new EVENT(new engine_control_module(super.getLocation()), this, control_sub3));

            panel7.add(control_sub1);
            panel7.add(control_sub2);
            panel7.add(control_sub3);

        }
        if (set.equals("REMOVE")) {
            panel7.remove(control_sub1);
            panel7.remove(control_sub2);
            panel7.remove(control_sub3);

        }
        if (set.equals("NULL")) {

        }
    }

    @Override
    public void showPanel(JPanel component_panel) {

        scroll.setViewportView(component_panel);
        scroll.setVisible(true);
        refreshFrame();
        if (super.getSize().getWidth() < 1300) {
            super.pack();
        }
    }

    @Override
    public void buttonState(JButton button) {
        JButton[] iterateButtons = {service_sub1, service_sub2, service_sub3,
            fuel_sub1, fuel_sub2, fuel_sub3, fuel_sub4, fuel_sub5,
            intake_sub1, intake_sub2, intake_sub3, intake_sub4,
            ignition_sub1, ignition_sub2, ignition_sub3, ignition_sub4,
            engine_sub1, engine_sub2, engine_sub3,
            emission_sub1, emission_sub2, emission_sub3,
            control_sub1, control_sub2, control_sub3};
        for (JButton set : iterateButtons) {
            if (set != null) {
                set.setBackground(setColor3);
            }
        }
        button.setBackground(setColor2);
    }

    private void refreshFrame() {
        super.invalidate();
        super.validate();
        super.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        splitter = new javax.swing.JSplitPane();
        scroll_left = new javax.swing.JScrollPane();
        panel_left = new javax.swing.JPanel();
        panel_menu = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        service = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        fuel = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        intake = new javax.swing.JButton();
        panel4 = new javax.swing.JPanel();
        ignition = new javax.swing.JButton();
        panel5 = new javax.swing.JPanel();
        engine = new javax.swing.JButton();
        panel6 = new javax.swing.JPanel();
        emission = new javax.swing.JButton();
        panel7 = new javax.swing.JPanel();
        control = new javax.swing.JButton();
        panel8 = new javax.swing.JPanel();
        BACK = new javax.swing.JButton();
        panel_right = default_panel;
        scroll = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ENGINE MANAGEMENT COMPONENT TESTING");

        splitter.setPreferredSize(new java.awt.Dimension(1142, 803));
        splitter.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                splitterPropertyChange(evt);
            }
        });

        scroll_left.getHorizontalScrollBar().setUnitIncrement(10);
        scroll_left.getVerticalScrollBar().setUnitIncrement(10);

        panel_menu.setBackground(Color.BLACK);
        panel_menu.setLayout(new javax.swing.BoxLayout(panel_menu, javax.swing.BoxLayout.PAGE_AXIS));

        panel1.setLayout(new java.awt.GridLayout(0, 1));

        service.setFocusable(false);
        service.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        service.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png"))); // NOI18N
        service.setText("Service adjustments");
        service.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        service.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        service.setPreferredSize(new java.awt.Dimension(157, 55));
        service.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        service.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                serviceItemStateChanged(evt);
            }
        });
        service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceActionPerformed(evt);
            }
        });
        panel1.add(service);

        panel_menu.add(panel1);

        panel2.setLayout(new java.awt.GridLayout(0, 1));

        fuel.setFocusable(false);
        fuel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png"))); // NOI18N
        fuel.setText("Fuel system");
        fuel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fuel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fuel.setPreferredSize(new java.awt.Dimension(157, 55));
        fuel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        fuel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fuelItemStateChanged(evt);
            }
        });
        fuel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuelActionPerformed(evt);
            }
        });
        panel2.add(fuel);

        panel_menu.add(panel2);

        panel3.setLayout(new java.awt.GridLayout(0, 1));

        intake.setFocusable(false);
        intake.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        intake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png"))); // NOI18N
        intake.setText("Intake system");
        intake.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        intake.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        intake.setPreferredSize(new java.awt.Dimension(157, 55));
        intake.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        intake.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                intakeItemStateChanged(evt);
            }
        });
        intake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intakeActionPerformed(evt);
            }
        });
        panel3.add(intake);

        panel_menu.add(panel3);

        panel4.setLayout(new java.awt.GridLayout(0, 1));

        ignition.setFocusable(false);
        ignition.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ignition.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png"))); // NOI18N
        ignition.setText("Ignition system");
        ignition.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ignition.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ignition.setPreferredSize(new java.awt.Dimension(157, 55));
        ignition.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        ignition.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ignitionItemStateChanged(evt);
            }
        });
        ignition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ignitionActionPerformed(evt);
            }
        });
        panel4.add(ignition);

        panel_menu.add(panel4);

        panel5.setLayout(new java.awt.GridLayout(0, 1));

        engine.setFocusable(false);
        engine.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        engine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png"))); // NOI18N
        engine.setText("Engine sensors");
        engine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        engine.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        engine.setPreferredSize(new java.awt.Dimension(157, 55));
        engine.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        engine.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                engineItemStateChanged(evt);
            }
        });
        engine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engineActionPerformed(evt);
            }
        });
        panel5.add(engine);

        panel_menu.add(panel5);

        panel6.setLayout(new java.awt.GridLayout(0, 1));

        emission.setFocusable(false);
        emission.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        emission.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png"))); // NOI18N
        emission.setText("Emission control system");
        emission.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emission.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emission.setPreferredSize(new java.awt.Dimension(157, 55));
        emission.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        emission.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                emissionItemStateChanged(evt);
            }
        });
        emission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emissionActionPerformed(evt);
            }
        });
        panel6.add(emission);

        panel_menu.add(panel6);

        panel7.setLayout(new java.awt.GridLayout(0, 1));

        control.setFocusable(false);
        control.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        control.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png"))); // NOI18N
        control.setText("Control system");
        control.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        control.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        control.setPreferredSize(new java.awt.Dimension(157, 55));
        control.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        control.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                controlItemStateChanged(evt);
            }
        });
        control.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlActionPerformed(evt);
            }
        });
        panel7.add(control);

        panel_menu.add(panel7);

        panel8.setLayout(new java.awt.GridLayout(0, 1));

        BACK.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BACK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Return_48px.png"))); // NOI18N
        BACK.setText("BACK");
        BACK.setFocusable(false);
        BACK.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BACK.setPreferredSize(new java.awt.Dimension(157, 55));
        panel8.add(BACK);

        panel_menu.add(panel8);

        javax.swing.GroupLayout panel_leftLayout = new javax.swing.GroupLayout(panel_left);
        panel_left.setLayout(panel_leftLayout);
        panel_leftLayout.setHorizontalGroup(
            panel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_leftLayout.setVerticalGroup(
            panel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_leftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scroll_left.setViewportView(panel_left);

        splitter.setLeftComponent(scroll_left);

        scroll.getHorizontalScrollBar().setUnitIncrement(16);
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        scroll.setVisible(false);

        javax.swing.GroupLayout panel_rightLayout = new javax.swing.GroupLayout(panel_right);
        panel_right.setLayout(panel_rightLayout);
        panel_rightLayout.setHorizontalGroup(
            panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_rightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_rightLayout.setVerticalGroup(
            panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_rightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );

        splitter.setRightComponent(panel_right);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitter, javax.swing.GroupLayout.DEFAULT_SIZE, 1228, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(splitter, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceActionPerformed
        if (!service.isSelected()) {
            service.setSelected(true);
            service.setBackground(setColor);
            submenu_service("ADD");
            refreshFrame();
        } else {
            service.setSelected(false);
        }
    }//GEN-LAST:event_serviceActionPerformed

    private void serviceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_serviceItemStateChanged
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
            submenu_service("REMOVE");
            refreshFrame();
            service.setBackground(Color.WHITE);
            scroll.setVisible(false);
        }
    }//GEN-LAST:event_serviceItemStateChanged

    private void fuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuelActionPerformed
        if (!fuel.isSelected()) {
            fuel.setSelected(true);
            fuel.setBackground(setColor);
            submenu_fuel("ADD");
            refreshFrame();
        } else {
            fuel.setSelected(false);
        }
    }//GEN-LAST:event_fuelActionPerformed

    private void fuelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fuelItemStateChanged
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
            submenu_fuel("REMOVE");
            refreshFrame();
            fuel.setBackground(Color.WHITE);
            scroll.setVisible(false);
        }
    }//GEN-LAST:event_fuelItemStateChanged

    private void intakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intakeActionPerformed
        if (!intake.isSelected()) {
            intake.setSelected(true);
            intake.setBackground(setColor);
            submenu_intake("ADD");
            refreshFrame();
        } else {
            intake.setSelected(false);
        }
    }//GEN-LAST:event_intakeActionPerformed

    private void intakeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_intakeItemStateChanged
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
            submenu_intake("REMOVE");
            refreshFrame();
            intake.setBackground(Color.WHITE);
            scroll.setVisible(false);
        }
    }//GEN-LAST:event_intakeItemStateChanged

    private void ignitionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ignitionActionPerformed
        if (!ignition.isSelected()) {
            ignition.setSelected(true);
            ignition.setBackground(setColor);
            submenu_ignition("ADD");
            refreshFrame();
        } else {
            ignition.setSelected(false);
        }
    }//GEN-LAST:event_ignitionActionPerformed

    private void ignitionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ignitionItemStateChanged
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
            submenu_ignition("REMOVE");
            refreshFrame();
            ignition.setBackground(Color.WHITE);
            scroll.setVisible(false);
        }
    }//GEN-LAST:event_ignitionItemStateChanged

    private void engineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engineActionPerformed
        if (!engine.isSelected()) {
            engine.setSelected(true);
            engine.setBackground(setColor);
            submenu_engine("ADD");
            refreshFrame();
        } else {
            engine.setSelected(false);
        }
    }//GEN-LAST:event_engineActionPerformed

    private void engineItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_engineItemStateChanged
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
            submenu_engine("REMOVE");
            refreshFrame();
            engine.setBackground(Color.WHITE);
            scroll.setVisible(false);
        }
    }//GEN-LAST:event_engineItemStateChanged

    private void emissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emissionActionPerformed
        if (!emission.isSelected()) {
            emission.setSelected(true);
            emission.setBackground(setColor);
            submenu_emission("ADD");
            refreshFrame();
        } else {
            emission.setSelected(false);
        }
    }//GEN-LAST:event_emissionActionPerformed

    private void emissionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_emissionItemStateChanged
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
            submenu_emission("REMOVE");
            refreshFrame();
            emission.setBackground(Color.WHITE);
            scroll.setVisible(false);
        }
    }//GEN-LAST:event_emissionItemStateChanged

    private void controlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlActionPerformed
        if (!control.isSelected()) {
            control.setSelected(true);
            control.setBackground(setColor);
            submenu_control("ADD");
            refreshFrame();
        } else {
            control.setSelected(false);
        }
    }//GEN-LAST:event_controlActionPerformed

    private void controlItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_controlItemStateChanged
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
            submenu_control("REMOVE");
            refreshFrame();
            control.setBackground(Color.WHITE);
            scroll.setVisible(false);
        }
    }//GEN-LAST:event_controlItemStateChanged

    private void splitterPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_splitterPropertyChange
        System.out.println(splitter.getDividerLocation());
        System.out.println("---------------------");
    }//GEN-LAST:event_splitterPropertyChange

    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(emct.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new emct().setVisible(true);
        });
    }

    private final default_panel default_panel = new default_panel();
    private final Font setFont = new Font("Dialog", Font.BOLD, 11);
    private final Color setColor = new Color(255, 204, 0);
    private final Color setColor2 = new Color(15, 89, 193);
    private final Color setColor3 = new Color(242, 227, 196);
    private final Dimension setDim = new Dimension(157, 55);
    private static JButton service_sub1;
    private static JButton service_sub2;
    private static JButton service_sub3;
    private static JButton fuel_sub1;
    private static JButton fuel_sub2;
    private static JButton fuel_sub3;
    private static JButton fuel_sub4;
    private static JButton fuel_sub5;
    private static JButton intake_sub1;
    private static JButton intake_sub2;
    private static JButton intake_sub3;
    private static JButton intake_sub4;
    private static JButton ignition_sub1;
    private static JButton ignition_sub2;
    private static JButton ignition_sub3;
    private static JButton ignition_sub4;
    private static JButton engine_sub1;
    private static JButton engine_sub2;
    private static JButton engine_sub3;
    private static JButton emission_sub1;
    private static JButton emission_sub2;
    private static JButton emission_sub3;
    private static JButton control_sub1;
    private static JButton control_sub2;
    private static JButton control_sub3;
    private final Image icon;

//<editor-fold defaultstate="collapsed" desc="Generated Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JButton control;
    private javax.swing.JButton emission;
    private javax.swing.JButton engine;
    private javax.swing.JButton fuel;
    private javax.swing.JButton ignition;
    private javax.swing.JButton intake;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JPanel panel7;
    private javax.swing.JPanel panel8;
    private javax.swing.JPanel panel_left;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JPanel panel_right;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll_left;
    private javax.swing.JButton service;
    private javax.swing.JSplitPane splitter;
    // End of variables declaration//GEN-END:variables
//</editor-fold>

    private static class EVENT implements ActionListener {

        private final JPanel panel;
        private final JButton button;
        private final language lg;

        public EVENT(JPanel component_panel, language g, JButton b) {
            this.panel = component_panel;
            this.lg = g;
            this.button = b;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            lg.showPanel(panel);
            lg.buttonState(button);
        }
    }
}
