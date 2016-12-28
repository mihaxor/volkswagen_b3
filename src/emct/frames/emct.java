package emct.frames;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import emct.frames.service_adjustments.fuel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Catalin Glavan
 */
public class emct extends javax.swing.JFrame implements language {

    /**
     * Creates new form emct
     */
    public emct() {
        initComponents();
        super.setLocationRelativeTo(null);
        showScroll("fuel_delivery");

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
            service_sub1.addActionListener(new EVENT("idle_speed", this));

            service_sub2 = new JButton(service_txt2);
            service_sub2.setFont(setFont);
            service_sub2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            service_sub2.setBackground(setColor3);
            service_sub2.setFocusable(false);
            service_sub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            service_sub2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            service_sub2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            service_sub2.setPreferredSize(setDim);
            service_sub2.addActionListener(new EVENT("co_level", this));

            service_sub3 = new JButton(service_txt3);
            service_sub3.setFont(setFont);
            service_sub3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            service_sub3.setBackground(setColor3);
            service_sub3.setFocusable(false);
            service_sub3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            service_sub3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            service_sub3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            service_sub3.setPreferredSize(setDim);
            service_sub3.addActionListener(new EVENT("throttle", this));

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
            fuel_sub1.addActionListener(new EVENT("fuel_pressure", this));

            fuel_sub2 = new JButton(fuel_txt2);
            fuel_sub2.setFont(setFont);
            fuel_sub2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            fuel_sub2.setBackground(setColor3);
            fuel_sub2.setFocusable(false);
            fuel_sub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            fuel_sub2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            fuel_sub2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            fuel_sub2.setPreferredSize(setDim);
            fuel_sub2.addActionListener(new EVENT("fuel_delivery", this));

            fuel_sub3 = new JButton(fuel_txt3);
            fuel_sub3.setFont(setFont);
            fuel_sub3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            fuel_sub3.setBackground(setColor3);
            fuel_sub3.setFocusable(false);
            fuel_sub3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            fuel_sub3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            fuel_sub3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            fuel_sub3.setPreferredSize(setDim);
            fuel_sub3.addActionListener(new EVENT("injectors", this));

            fuel_sub4 = new JButton(fuel_txt4);
            fuel_sub4.setFont(setFont);
            fuel_sub4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            fuel_sub4.setBackground(setColor3);
            fuel_sub4.setFocusable(false);
            fuel_sub4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            fuel_sub4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            fuel_sub4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            fuel_sub4.setPreferredSize(setDim);
            fuel_sub4.addActionListener(new EVENT("cold_start", this));

            fuel_sub5 = new JButton(fuel_txt5);
            fuel_sub5.setFont(setFont);
            fuel_sub5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            fuel_sub5.setBackground(setColor3);
            fuel_sub5.setFocusable(false);
            fuel_sub5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            fuel_sub5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            fuel_sub5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            fuel_sub5.setPreferredSize(setDim);
            fuel_sub5.addActionListener(new EVENT("fuel_pump", this));

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
            intake_sub1.addActionListener(new EVENT("throttle_position", this));

            intake_sub2 = new JButton(intake_txt2);
            intake_sub2.setFont(setFont);
            intake_sub2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            intake_sub2.setBackground(setColor3);
            intake_sub2.setFocusable(false);
            intake_sub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            intake_sub2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            intake_sub2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            intake_sub2.setPreferredSize(setDim);
            intake_sub2.addActionListener(new EVENT("volume_air", this));

            intake_sub3 = new JButton(intake_txt3);
            intake_sub3.setFont(setFont);
            intake_sub3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            intake_sub3.setBackground(setColor3);
            intake_sub3.setFocusable(false);
            intake_sub3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            intake_sub3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            intake_sub3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            intake_sub3.setPreferredSize(setDim);
            intake_sub3.addActionListener(new EVENT("intake_air", this));

            intake_sub4 = new JButton(intake_txt4);
            intake_sub4.setFont(setFont);
            intake_sub4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            intake_sub4.setBackground(setColor3);
            intake_sub4.setFocusable(false);
            intake_sub4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            intake_sub4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            intake_sub4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            intake_sub4.setPreferredSize(setDim);
            intake_sub4.addActionListener(new EVENT("idle_air", this));

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
            ignition_sub1.addActionListener(new EVENT("high_tension", this));

            ignition_sub2 = new JButton(ignition_txt2);
            ignition_sub2.setFont(setFont);
            ignition_sub2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ignition_sub2.setBackground(setColor3);
            ignition_sub2.setFocusable(false);
            ignition_sub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            ignition_sub2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            ignition_sub2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            ignition_sub2.setPreferredSize(setDim);
            ignition_sub2.addActionListener(new EVENT("ignition_timing", this));

            ignition_sub3 = new JButton(ignition_txt3);
            ignition_sub3.setFont(setFont);
            ignition_sub3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ignition_sub3.setBackground(setColor3);
            ignition_sub3.setFocusable(false);
            ignition_sub3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            ignition_sub3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            ignition_sub3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            ignition_sub3.setPreferredSize(setDim);
            ignition_sub3.addActionListener(new EVENT("ignition_coil", this));

            ignition_sub4 = new JButton(ignition_txt4);
            ignition_sub4.setFont(setFont);
            ignition_sub4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ignition_sub4.setBackground(setColor3);
            ignition_sub4.setFocusable(false);
            ignition_sub4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            ignition_sub4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            ignition_sub4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            ignition_sub4.setPreferredSize(setDim);
            ignition_sub4.addActionListener(new EVENT("ignition_amplifier", this));

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
            engine_sub1.addActionListener(new EVENT("engine_coolant", this));

            engine_sub2 = new JButton(engine_txt2);
            engine_sub2.setFont(setFont);
            engine_sub2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            engine_sub2.setBackground(setColor3);
            engine_sub2.setFocusable(false);
            engine_sub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            engine_sub2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            engine_sub2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            engine_sub2.setPreferredSize(setDim);
            engine_sub2.addActionListener(new EVENT("crankshaft_position", this));

            engine_sub3 = new JButton(engine_txt3);
            engine_sub3.setFont(setFont);
            engine_sub3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            engine_sub3.setBackground(setColor3);
            engine_sub3.setFocusable(false);
            engine_sub3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            engine_sub3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            engine_sub3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            engine_sub3.setPreferredSize(setDim);
            engine_sub3.addActionListener(new EVENT("knock_sensor", this));

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
            emission_sub1.addActionListener(new EVENT("co_resistor", this));

            emission_sub2 = new JButton(emission_txt2);
            emission_sub2.setFont(setFont);
            emission_sub2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            emission_sub2.setBackground(setColor3);
            emission_sub2.setFocusable(false);
            emission_sub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            emission_sub2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            emission_sub2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            emission_sub2.setPreferredSize(setDim);
            emission_sub2.addActionListener(new EVENT("heated_sensor", this));

            emission_sub3 = new JButton(emission_txt3);
            emission_sub3.setFont(setFont);
            emission_sub3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            emission_sub3.setBackground(setColor3);
            emission_sub3.setFocusable(false);
            emission_sub3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            emission_sub3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            emission_sub3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            emission_sub3.setPreferredSize(setDim);
            emission_sub3.addActionListener(new EVENT("oxygen_sensor", this));

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
            control_sub1.addActionListener(new EVENT("engine_control", this));

            control_sub2 = new JButton(control_txt2);
            control_sub2.setFont(setFont);
            control_sub2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            control_sub2.setBackground(setColor3);
            control_sub2.setFocusable(false);
            control_sub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            control_sub2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            control_sub2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            control_sub2.setPreferredSize(setDim);
            control_sub2.addActionListener(new EVENT("fuel_pump_relay", this));

            control_sub3 = new JButton(control_txt3);
            control_sub3.setFont(setFont);
            control_sub3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            control_sub3.setBackground(setColor3);
            control_sub3.setFocusable(false);
            control_sub3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emct/images/Services_48px.png")));
            control_sub3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            control_sub3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
            control_sub3.setPreferredSize(setDim);
            control_sub3.addActionListener(new EVENT("engine_control", this));

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
    public void showScroll(String scroll) {
        HashMap<String, JScrollPane> hashMap = new HashMap<>();
        hashMap.put("idle_speed", idle_speed);
        hashMap.put("co_level", co_level);
        hashMap.put("throttle", throttle);
        hashMap.put("fuel_pressure", fuel_pressure);
        hashMap.put("fuel_delivery", fuel_delivery);
        hashMap.put("injectors", injectors);
        hashMap.put("cold_start", cold_start);
        hashMap.put("fuel_pump", fuel_pump);
        idle_speed.setVisible(false);
        co_level.setVisible(false);
        throttle.setVisible(false);
        fuel_pressure.setVisible(false);
        fuel_delivery.setVisible(false);
        injectors.setVisible(false);
        cold_start.setVisible(false);
        fuel_pump.setVisible(false);

        hashMap.get(scroll).setVisible(true);
        refreshFrame();
        if (super.getSize().getWidth() < 1300) {
            super.pack();
        }
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
        panel_right = new javax.swing.JPanel();
        idle_speed = new javax.swing.JScrollPane();
        p = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        co_level = new javax.swing.JScrollPane();
        p1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        throttle = new javax.swing.JScrollPane();
        p2 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jButton14 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        fuel_pressure = new javax.swing.JScrollPane();
        p3 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        fuel_delivery = new javax.swing.JScrollPane();
        p4 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jButton13 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        injectors = new javax.swing.JScrollPane();
        p5 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jButton19 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jButton22 = new javax.swing.JButton();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jLabel96 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel98 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jLabel101 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        cold_start = new javax.swing.JScrollPane();
        p6 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jButton32 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jLabel136 = new javax.swing.JLabel();
        jButton43 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        fuel_pump = new javax.swing.JScrollPane();
        p7 = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jButton33 = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jLabel146 = new javax.swing.JLabel();
        jButton50 = new javax.swing.JButton();
        jLabel124 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        fuel1 = new fuel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitter.setPreferredSize(new java.awt.Dimension(1142, 803));
        splitter.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                splitterPropertyChange(evt);
            }
        });

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
            .addComponent(panel_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );
        panel_leftLayout.setVerticalGroup(
            panel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_leftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(355, Short.MAX_VALUE))
        );

        splitter.setLeftComponent(panel_left);

        idle_speed.getVerticalScrollBar().setUnitIncrement(15);
        idle_speed.getHorizontalScrollBar().setUnitIncrement(15);
        idle_speed.setMinimumSize(new java.awt.Dimension(0, 0));
        idle_speed.setName(""); // NOI18N

        p.setBackground(Color.LIGHT_GRAY);

        jLabel3.setForeground(setColor2);
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Idle speed");

        jLabel4.setForeground(setColor2);
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Adjustment - except Passat");

        jScrollPane1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setWheelScrollingEnabled(false);

        jTable1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"All models", "770-870 rpm"}
            },
            new String [] {
                "Technical Data", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleParent(idle_speed);

        jLabel1.setText("• Idle speed electronically controlled.");

        jLabel2.setText("• No adjustment possible.");

        jLabel5.setText("• If idle speed not as specified: Check for air leaks in intake system. Carry out component and electrical tests.");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(setColor2);
        jLabel6.setText("Adjustment  -  Passat  -");

        jLabel7.setForeground(setColor2);
        jLabel7.setText("&");

        jButton1.setBackground(Color.ORANGE);
        jButton1.setText("FIG 1");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton2.setBackground(Color.ORANGE);
        jButton2.setText("FIG 2");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setText("• Can only be adjusted using suitable diagnostic equipment.");

        jLabel9.setText("• Ensure ignition switched OFF.");

        jLabel10.setText("• Disconnect crankcase breather hose from pressure regulating valve.");

        jLabel11.setText("• Plug crankcase breather hose.");

        jLabel12.setText("• Start engine.");

        jLabel13.setText("• Initiate basic setting using suitable diagnostic equipment.");

        jLabel14.setText("• Allow to idle for 2 minutes.");

        jLabel15.setText("• Adjust idle speed with idle speed screw.");

        jScrollPane3.setWheelScrollingEnabled(false);

        jTable3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"All models", "770-870 rpm"}
            },
            new String [] {
                "Technical Data", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jButton3.setBackground(Color.ORANGE);
        jButton3.setText("FIG 1");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton4.setBackground(Color.ORANGE);
        jButton4.setText("FIG 2");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pLayout = new javax.swing.GroupLayout(p);
        p.setLayout(pLayout);
        pLayout.setHorizontalGroup(
            pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pLayout.createSequentialGroup()
                        .addGroup(pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addGroup(pLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pLayout.createSequentialGroup()
                        .addGroup(pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pLayout.createSequentialGroup()
                .addGroup(pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(pLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addComponent(jLabel10)
                            .addGroup(pLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1))))
                .addContainerGap())
        );
        pLayout.setVerticalGroup(
            pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(60, 60, 60)
                .addGroup(pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.getAccessibleContext().setAccessibleParent(idle_speed);

        idle_speed.setViewportView(p);

        co_level.getVerticalScrollBar().setUnitIncrement(15);
        co_level.getHorizontalScrollBar().setUnitIncrement(15);

        p1.setBackground(Color.LIGHT_GRAY);

        jLabel16.setForeground(setColor2);
        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("CO level");

        jLabel17.setForeground(setColor2);
        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Adjustment - except Passat");

        jTable2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"All models", "0,2-1,2% - at sample pipe"}
            },
            new String [] {
                "Technical Data", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel18.setText("• CO level electronically controlled .");

        jLabel19.setText("• No adjustment possible.");

        jLabel20.setText("• If CO level not as specified: Check for air leaks in intake and exhaust systems. Carry out component and electrical tests.");

        jLabel21.setForeground(setColor2);
        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("Adjustment  -  Passat  -");

        jLabel22.setForeground(setColor2);
        jLabel22.setText("&");

        jButton6.setBackground(Color.ORANGE);
        jButton6.setText("FIG 1");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton7.setBackground(Color.ORANGE);
        jButton7.setText("FIG 2");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel23.setText("• Can only be adjusted using suitable diagnostic equipment.");

        jLabel24.setText("• Ensure ignition switched OFF.");

        jLabel25.setText("• Disconnect crankcase breather hose from pressure regulating valve.");

        jLabel26.setText("• Plug crankcase breather hose.");

        jLabel27.setText("• Start engine.");

        jLabel28.setText("• Initiate basic setting using suitable diagnostic equipment.");

        jLabel29.setText("• Allow to idle for 2 minutes.");

        jLabel30.setText("• Check CO level.");

        jTable4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"All models", "0,3-1, 1 % - at sample pipe"}
            },
            new String [] {
                "Technical Data", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jButton8.setBackground(Color.ORANGE);
        jButton8.setText("FIG 1");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel31.setText("• If CO level not as specified: Remove CO adjustment resistor tamperproof plug.");

        jLabel32.setText("• Adjust CO level by turning CO adjustment resistor.");

        jLabel33.setText("• Check that idle speed remains within specification.");

        jButton10.setBackground(Color.ORANGE);
        jButton10.setText("FIG 3");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p1Layout.createSequentialGroup()
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)))
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel32)
                                    .addGroup(p1Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton10))
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel25)
                                    .addGroup(p1Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton8))
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel24))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2))))
                .addContainerGap())
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(49, 49, 49)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        co_level.setViewportView(p1);

        throttle.getVerticalScrollBar().setUnitIncrement(15);
        throttle.getHorizontalScrollBar().setUnitIncrement(15);

        p2.setBackground(Color.LIGHT_GRAY);

        jLabel34.setForeground(setColor2);
        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setText("Throttle initial position");

        jLabel35.setForeground(setColor2);
        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setText("Adjustment -");

        jButton14.setBackground(Color.ORANGE);
        jButton14.setText("FIG 4");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel52.setText("• Thro ttle initial position set by manufacturer.");

        jLabel53.setText("• If adjustment is inadvertently altered, adjust as follows:");

        jLabel54.setText("• Ensure accelerator cable has adequate free play.");

        jLabel55.setText("• Turn throttle lever stop screw");

        jLabel56.setText("• Ensure throttle valve is closed.");

        jLabel57.setText("• Turn stop screw clockwise until it just contacts throttle lever. ");

        jLabel58.setText("• Turn stop screw clockwise further 180°. ");

        jLabel59.setText("• Adjust accelerator cable,if necessary. ");

        jLabel60.setText(" • Check idle speed and throttle position (TP) sensor adjustment. ");

        jLabel61.setText(" • Check that throttle valve opens fully when accelerator pedal is fully depressed. ");

        jLabel36.setText("anti-clockwise until clearance exists between stop screw and throttle lever. ");

        jButton9.setBackground(Color.ORANGE);
        jButton9.setText("FIG 4");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton11.setBackground(Color.ORANGE);
        jButton11.setText("FIG 4");
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61)
                    .addComponent(jLabel60)
                    .addComponent(jLabel59)
                    .addComponent(jLabel58)
                    .addComponent(jLabel57)
                    .addComponent(jLabel56)
                    .addComponent(jLabel53)
                    .addComponent(jLabel52)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14))
                    .addComponent(jLabel34)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11))
                    .addComponent(jLabel54))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel34)
                .addGap(13, 13, 13)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jButton14))
                .addGap(55, 55, 55)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jButton9)
                    .addComponent(jLabel36)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61)
                .addGap(20, 20, 20)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        throttle.setViewportView(p2);

        co_level.getVerticalScrollBar().setUnitIncrement(15);
        co_level.getHorizontalScrollBar().setUnitIncrement(15);

        p3.setBackground(Color.LIGHT_GRAY);
        p3.setToolTipText("");

        jLabel37.setForeground(setColor2);
        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setText("Fuel pressure");

        jLabel38.setForeground(setColor2);
        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel38.setText("Checking -");

        jScrollPane5.setBorder(javax.swing.BorderFactory.createTitledBorder("Technical Data"));

        jTable5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"System", "Vacuum OFF", "3,0 bar"},
                {"Regulated", "Vacuum ON", "2,5 bar"},
                {"Holding", "After 10 minutes", "2 bar"}
            },
            new String [] {
                "Pressure", "Condition", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane5.setViewportView(jTable5);

        jLabel39.setText("• Ensure ignition switched OFF.");

        jLabel40.setText("• Remove cold start injector fuel supply pipe.");

        jLabel41.setText("• Connect pressure gauge to fuel supply pipe.");

        jButton5.setBackground(Color.ORANGE);
        jButton5.setFocusable(false);
        jButton5.setBackground(java.awt.Color.orange);
        jButton5.setText("FIG 5");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);

        jLabel42.setText("• Ensure gauge tap is closed");

        jLabel43.setText("• Start engine. ");

        jLabel44.setText("• Allow to idle . ");

        jLabel45.setText("• Compare regulated pressure indicated with that specified . ");

        jLabel46.setText("• Disconnect vacuum hose fromfuel pressure regulator. ");

        jLabel47.setText("• Compare system pressure indicated with that specified. ");

        jLabel48.setText("• Switch ignition OFF. ");

        jLabel49.setText("• After 10 minutes check holding pressure ");

        jLabel50.setText("• Reconnect vacuum hose. ");

        jButton12.setBackground(java.awt.Color.orange);
        jButton12.setText("FIG 5");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setFocusable(false);

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p3Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addComponent(jLabel37))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48)
                    .addComponent(jLabel47)
                    .addComponent(jLabel46)
                    .addComponent(jLabel45)
                    .addComponent(jLabel44)
                    .addComponent(jLabel43)
                    .addGroup(p3Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12))
                    .addComponent(jLabel40)
                    .addComponent(jLabel39)
                    .addComponent(jLabel41)
                    .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel49)
                        .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(jSeparator4))
                .addContainerGap())
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel37)
                .addGap(18, 18, 18)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jButton5))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fuel_pressure.setViewportView(p3);

        co_level.getVerticalScrollBar().setUnitIncrement(15);
        co_level.getHorizontalScrollBar().setUnitIncrement(15);

        p4.setBackground(Color.LIGHT_GRAY);
        p4.setToolTipText("");

        jLabel51.setForeground(setColor2);
        jLabel51.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel51.setText("Fuel delivery rate ");

        jLabel62.setForeground(setColor2);
        jLabel62.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel62.setText("Checking -");

        jScrollPane6.setBorder(javax.swing.BorderFactory.createTitledBorder("Technical Data"));

        jTable6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"3 bar", "10-12 V", "0,5-0,7 litre/30 secs. min."}
            },
            new String [] {
                "Pressure", "Supply voltage", "Delivery rate "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane6.setViewportView(jTable6);

        jLabel63.setText("• Ensure ignition switched OFF.");

        jLabel64.setText("• Remove cold start injector fuel supply pipe.");

        jLabel65.setText("• Connect pressure gauge to fuel supply pipe.");

        jButton5.setBackground(Color.ORANGE);
        jButton5.setFocusable(false);
        jButton13.setBackground(java.awt.Color.orange);
        jButton13.setText("FIG 5");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setFocusable(false);

        jLabel66.setText("• Connect test pipe to fuel pressure gauge.");

        jLabel67.setText("• Ensure gauge tap is open");

        jLabel68.setText("• Insert end of pipe into measuring flask ");

        jLabel69.setText("• Remove fuel pump relay.");

        jLabel70.setText("• Connect battery voltage supply to relay base terminal 4 with switched lead.");

        jLabel71.setText("• Operate switch to run fuel pump.");

        jLabel72.setText("• Slowly close gauge tap untilfuel pressure is as specified.");

        jLabel73.setText("• Switch fuel pump OFF. ");

        jLabel74.setText("• Ensure gauge tap is not moved. ");

        jButton15.setBackground(java.awt.Color.orange);
        jButton15.setText("FIG 5");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.setFocusable(false);

        jLabel75.setForeground(setColor2);
        jLabel75.setText("&");

        jButton5.setBackground(Color.ORANGE);
        jButton5.setFocusable(false);
        jButton16.setBackground(java.awt.Color.orange);
        jButton16.setText("FIG 6");
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.setFocusable(false);

        jButton5.setBackground(Color.ORANGE);
        jButton5.setFocusable(false);
        jButton17.setBackground(java.awt.Color.orange);
        jButton17.setText("FIG 7");
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.setFocusable(false);

        jLabel76.setText("• Empty measuring flask. ");

        jLabel77.setText("• Insert end of pipe into measuring flask ");

        jLabel78.setText("• Operate switch to run fuel pump.");

        jLabel79.setText("• Compare delivery rate indicated with that specified. ");

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p4Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17))
                    .addComponent(jLabel51))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel79)
                    .addComponent(jLabel77)
                    .addComponent(jLabel76)
                    .addComponent(jLabel72)
                    .addComponent(jLabel71)
                    .addComponent(jLabel70)
                    .addComponent(jLabel69)
                    .addComponent(jLabel68)
                    .addComponent(jLabel67)
                    .addComponent(jLabel66)
                    .addComponent(jLabel64)
                    .addComponent(jLabel63)
                    .addGroup(p4Layout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15))
                    .addComponent(jLabel74)
                    .addComponent(jLabel73)
                    .addComponent(jLabel78))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(p4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel51)
                .addGap(18, 18, 18)
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jButton13)
                    .addComponent(jLabel75)
                    .addComponent(jButton16)
                    .addComponent(jButton17))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fuel_delivery.setViewportView(p4);

        injectors.getVerticalScrollBar().setUnitIncrement(15);
        injectors.getHorizontalScrollBar().setUnitIncrement(15);

        p5.setBackground(Color.LIGHT_GRAY);
        p5.setToolTipText("");

        jLabel51.setForeground(setColor2);
        jLabel80.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel80.setText("Injectors ");

        jLabel62.setForeground(setColor2);
        jLabel81.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel81.setText("Checking resistance - combined - ");

        jScrollPane7.setBorder(null);

        jTable7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Resistance", "15 - 20 \u2126"}
            },
            new String [] {
                "Technical Data", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane7.setViewportView(jTable7);

        jLabel82.setText("• Ensure ignition switched OFF.");

        jLabel83.setText("• Disconnect injector harness multi-plug.");

        jLabel84.setText("• Check resistance between injector terminals.");

        jButton19.setBackground(java.awt.Color.orange);
        jButton19.setText("FIG 8");
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton19.setFocusable(false);

        jButton5.setBackground(Color.ORANGE);
        jButton5.setFocusable(false);
        jButton21.setBackground(java.awt.Color.orange);
        jButton21.setText("FIG 8");
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton21.setFocusable(false);

        jLabel99.setText("Injector checking and cleaning: Refer to General Test Procedures.");

        jLabel100.setText("NOTE: Injectors have a common multi-plug. ");

        jButton20.setBackground(java.awt.Color.orange);
        jButton20.setText("FIG 8");
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton20.setFocusable(false);

        jLabel94.setForeground(setColor2);
        jLabel94.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel94.setText("Checking resistance .individually -");

        jScrollPane8.setBorder(null);

        jTable8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Resistance", "3.7 - 5 \u2126"}
            },
            new String [] {
                "Technical Data", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane8.setViewportView(jTable8);

        jButton22.setBackground(java.awt.Color.orange);
        jButton22.setText("FIG 9");
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton22.setFocusable(false);

        jLabel85.setText("• Ensure ignition switched OFF.");

        jLabel86.setText("• Remove fuel railwith injectors . ");

        jLabel87.setText("• Access injectors.");

        jLabel88.setText("• Check resistance between injector terminals. ");

        jLabel89.setText("• Repeat test for each injector. ");

        jLabel95.setForeground(setColor2);
        jLabel95.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel95.setText("Checking supply voltage -");

        jButton23.setBackground(java.awt.Color.orange);
        jButton23.setText("FIG 8");
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton23.setFocusable(false);

        jLabel96.setForeground(setColor2);
        jLabel96.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel96.setText("&");

        jButton24.setBackground(java.awt.Color.orange);
        jButton24.setText("FIG 10");
        jButton24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton24.setFocusable(false);

        jScrollPane9.setBorder(javax.swing.BorderFactory.createTitledBorder("Technical Data"));

        jTable9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1 (red wire) & earth ", "Battery voltage "}
            },
            new String [] {
                "Terminals", "Voltage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane9.setViewportView(jTable9);

        jLabel90.setText("• Ensure ignition switched OFF.");

        jLabel91.setText("• Disconnect injector harness multi-plug");

        jLabel92.setText("• Briefly crank engine.");

        jLabel93.setText("• Check voltage between harness multi-plug terminal and earth ");

        jLabel97.setText("• If voltage not as specified:Check wiring and fuel pump relay.");

        jButton25.setBackground(java.awt.Color.orange);
        jButton25.setText("FIG 8");
        jButton25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton25.setFocusable(false);

        jButton26.setBackground(java.awt.Color.orange);
        jButton26.setText("FIG 10");
        jButton26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton26.setFocusable(false);

        jLabel98.setForeground(setColor2);
        jLabel98.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel98.setText("Checking signal -");

        jButton27.setBackground(java.awt.Color.orange);
        jButton27.setText("FIG 8");
        jButton27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton27.setFocusable(false);

        jLabel101.setForeground(setColor2);
        jLabel101.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel101.setText("&");

        jButton28.setBackground(java.awt.Color.orange);
        jButton28.setText("FIG 11");
        jButton28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton28.setFocusable(false);

        jLabel102.setText("• Ensure ignition switched OFF. ");

        jLabel103.setText("• Disconnect injector harness multi-plug");

        jLabel104.setText("• Connect LEO test lamp between harness multi-plug terminals");

        jLabel105.setText("• Briefly crank engine. ");

        jLabel106.setText("• Check that LEO flashes.");

        jLabel107.setText("• If LEO does not flash: Check wiring. ");

        jButton29.setBackground(java.awt.Color.orange);
        jButton29.setText("FIG 8");
        jButton29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton29.setFocusable(false);

        jButton30.setBackground(java.awt.Color.orange);
        jButton30.setText("FIG 11");
        jButton30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton30.setFocusable(false);

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p5Layout.createSequentialGroup()
                                .addComponent(jLabel94)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton22))
                            .addGroup(p5Layout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton19))
                            .addComponent(jLabel82)
                            .addGroup(p5Layout.createSequentialGroup()
                                .addComponent(jLabel84)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton20))))
                    .addGroup(p5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel99)
                            .addComponent(jLabel100)
                            .addGroup(p5Layout.createSequentialGroup()
                                .addComponent(jLabel81)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton21))
                            .addComponent(jLabel80)))
                    .addGroup(p5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p5Layout.createSequentialGroup()
                                .addComponent(jLabel95)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel96)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton24))
                            .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel88)
                                .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel87, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel89, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(p5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel90)
                            .addComponent(jLabel92)
                            .addGroup(p5Layout.createSequentialGroup()
                                .addComponent(jLabel91)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton25))
                            .addComponent(jLabel97)
                            .addGroup(p5Layout.createSequentialGroup()
                                .addComponent(jLabel93)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton26))
                            .addComponent(jLabel102)
                            .addGroup(p5Layout.createSequentialGroup()
                                .addComponent(jLabel103)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton29))
                            .addGroup(p5Layout.createSequentialGroup()
                                .addComponent(jLabel104)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton30))
                            .addComponent(jLabel106)
                            .addComponent(jLabel107)
                            .addGroup(p5Layout.createSequentialGroup()
                                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(p5Layout.createSequentialGroup()
                                        .addComponent(jLabel98)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel101))
                                    .addComponent(jLabel105))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton28))))
                    .addGroup(p5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane8))))
                .addContainerGap())
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel80)
                .addGap(10, 10, 10)
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100)
                .addGap(3, 3, 3)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(jButton21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(jButton19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(jButton20))
                .addGap(50, 50, 50)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(jButton22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel86)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel89)
                .addGap(48, 48, 48)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(jButton23)
                    .addComponent(jLabel96)
                    .addComponent(jButton24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(jButton25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(jButton26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel97)
                .addGap(21, 21, 21)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98)
                    .addComponent(jButton27)
                    .addComponent(jLabel101)
                    .addComponent(jButton28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel102)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(jButton29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(jButton30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel105)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel107)
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        injectors.setViewportView(p5);

        injectors.getVerticalScrollBar().setUnitIncrement(15);
        injectors.getHorizontalScrollBar().setUnitIncrement(15);

        p6.setBackground(Color.LIGHT_GRAY);
        p6.setToolTipText("");

        jLabel108.setForeground(setColor2);
        jLabel108.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel108.setText("Cold start injector");

        jLabel109.setForeground(setColor2);
        jLabel109.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel109.setText("&");

        jButton32.setBackground(java.awt.Color.orange);
        jButton32.setText("FIG 12");
        jButton32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton32.setFocusable(false);

        jScrollPane12.setBorder(javax.swing.BorderFactory.createTitledBorder("Technical Data"));

        jTable12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Engine cranking ", "Flashing for 1-4 secs. "},
                {"Resistor between terminals", "3800 \u2126"}
            },
            new String [] {
                "Condition", "LED"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane12.setViewportView(jTable12);

        jLabel136.setForeground(setColor2);
        jLabel136.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel136.setText("Checking signal -");

        jButton43.setBackground(java.awt.Color.orange);
        jButton43.setText("FIG 13");
        jButton43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton43.setFocusable(false);

        jScrollPane13.setBorder(javax.swing.BorderFactory.createTitledBorder("Technical Data"));

        jTable13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Engine cranking", "Fuel spray for 1-4 secs."},
                {"Resistor between terminals", "3800 \u2126"}
            },
            new String [] {
                "Condition", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane13.setViewportView(jTable13);

        jLabel113.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel113.setText("NOTE: Disconnect injector harness multi-plug before cranking tests,to prevent engine from starting. ");

        jLabel114.setText("• Ensure ignition switched OFF. ");

        jLabel137.setText("• Disconnect cold start injector multi-plug. ");

        jLabel138.setText("• Disconnect engine coolant temperature (ECT) sensor multi-plug. ");

        jLabel139.setText("• Connect resistor between ECT sensor harness multi-plug terminals ");

        jLabel140.setText("• Connect LEO test lamp between cold start injector harness multi-plug terminals ");

        jLabel141.setText("• Briefly crank engine. ");

        jLabel142.setText("• Check that LEO flashes.");

        jLabel143.setText("• If LEO does not flash:Check wiring. ");

        jButton44.setBackground(java.awt.Color.orange);
        jButton44.setText("FIG 12");
        jButton44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton44.setFocusable(false);

        jButton45.setBackground(java.awt.Color.orange);
        jButton45.setText("FIG 13");
        jButton45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton45.setFocusable(false);

        jLabel144.setForeground(setColor2);
        jLabel144.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel144.setText("Checking operation -");

        jLabel145.setForeground(setColor2);
        jLabel145.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel145.setText("&");

        jButton46.setBackground(java.awt.Color.orange);
        jButton46.setText("FIG 12");
        jButton46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton46.setFocusable(false);

        jButton47.setBackground(java.awt.Color.orange);
        jButton47.setText("FIG 14");
        jButton47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton47.setFocusable(false);

        jLabel110.setText("• Ensure ignition switched OFF. ");

        jLabel111.setText("• Do not disconnect multi-plug. Remove cold start injector. ");

        jLabel112.setText("• Position injector over suitable container ");

        jLabel115.setText("• Disconnect engine coolant temperature (ECT) sensor multi-plug. ");

        jLabel116.setText("• Connect resistor between ECT sensor harness multi-plug terminals ");

        jLabel117.setText("• Crank engine.");

        jLabel118.setText("• Check for even conical spray.");

        jLabel119.setText("• Dry nozzle of cold start injector. ");

        jLabel120.setText("• Check that no drips of fuel leak from nozzle.");

        jButton48.setBackground(java.awt.Color.orange);
        jButton48.setText("FIG 14");
        jButton48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton48.setFocusable(false);

        jButton49.setBackground(java.awt.Color.orange);
        jButton49.setText("FIG 12");
        jButton49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton49.setFocusable(false);

        javax.swing.GroupLayout p6Layout = new javax.swing.GroupLayout(p6);
        p6.setLayout(p6Layout);
        p6Layout.setHorizontalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p6Layout.createSequentialGroup()
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p6Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel108)
                                    .addGroup(p6Layout.createSequentialGroup()
                                        .addComponent(jLabel136)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel109)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton43))))
                            .addGroup(p6Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel137)
                                    .addComponent(jLabel114)
                                    .addComponent(jLabel138)
                                    .addGroup(p6Layout.createSequentialGroup()
                                        .addComponent(jLabel139)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton44))
                                    .addComponent(jLabel141)
                                    .addComponent(jLabel142)
                                    .addComponent(jLabel143)
                                    .addGroup(p6Layout.createSequentialGroup()
                                        .addComponent(jLabel140)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton45))))
                            .addGroup(p6Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(p6Layout.createSequentialGroup()
                                        .addComponent(jLabel144)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel145)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton47))
                                    .addComponent(jLabel113))))
                        .addGap(0, 198, Short.MAX_VALUE))
                    .addGroup(p6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator7)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(p6Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p6Layout.createSequentialGroup()
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel110)
                            .addGroup(p6Layout.createSequentialGroup()
                                .addComponent(jLabel112)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton48))
                            .addComponent(jLabel111)
                            .addComponent(jLabel117)
                            .addComponent(jLabel118)
                            .addComponent(jLabel119))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(p6Layout.createSequentialGroup()
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel120)
                            .addComponent(jLabel115)
                            .addGroup(p6Layout.createSequentialGroup()
                                .addComponent(jLabel116)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton49)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        p6Layout.setVerticalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel108)
                .addGap(18, 18, 18)
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109)
                    .addComponent(jButton32)
                    .addComponent(jLabel136)
                    .addComponent(jButton43))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel113)
                .addGap(26, 26, 26)
                .addComponent(jLabel114)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel137)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel138)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel139)
                    .addComponent(jButton44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel140)
                    .addComponent(jButton45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel141)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel142)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel143)
                .addGap(34, 34, 34)
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel144)
                    .addComponent(jButton46)
                    .addComponent(jLabel145)
                    .addComponent(jButton47))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel110)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112)
                    .addComponent(jButton48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116)
                    .addComponent(jButton49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel117)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel118)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel119)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel120)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cold_start.setViewportView(p6);

        injectors.getVerticalScrollBar().setUnitIncrement(15);
        injectors.getHorizontalScrollBar().setUnitIncrement(15);

        p7.setBackground(Color.LIGHT_GRAY);
        p7.setToolTipText("");

        jLabel108.setForeground(setColor2);
        jLabel121.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel121.setText("Fuel pump ");

        jLabel109.setForeground(setColor2);
        jLabel122.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel122.setText("&");

        jButton33.setBackground(java.awt.Color.orange);
        jButton33.setText("FIG 7");
        jButton33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton33.setFocusable(false);

        jScrollPane14.setBorder(javax.swing.BorderFactory.createTitledBorder("Technical Data"));

        jTable14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1 & 4", "Battery voltage"}
            },
            new String [] {
                "Terminals", "Voltage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane14.setViewportView(jTable14);

        jLabel136.setForeground(setColor2);
        jLabel146.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel146.setText("Checking operation -");

        jButton50.setBackground(java.awt.Color.orange);
        jButton50.setText("FIG 15");
        jButton50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton50.setFocusable(false);

        jLabel124.setText("• Switch ignition ON. ");

        jLabel147.setText("• Fuel pump should run for approximately 1 second. ");

        jLabel148.setText("• If pump does not run:Switch ignition OFF. ");

        jLabel149.setText("• Remove fuel pump relay.");

        jLabel150.setText("• Connect battery voltage supply to relay base terminal 4 with switched lead");

        jLabel151.setText("• Fuel pump should run continuously when switch is operated.");

        jLabel152.setText("• If pump does not run:Switch ignition OFF.");

        jLabel153.setText("• Disconnect fuel pump multi-plug.");

        jButton51.setBackground(java.awt.Color.orange);
        jButton51.setText("FIG 15");
        jButton51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton51.setFocusable(false);

        jButton52.setBackground(java.awt.Color.orange);
        jButton52.setText("FIG 7");
        jButton52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton52.setFocusable(false);

        jLabel134.setText("• Switch ignition ON. ");

        jLabel135.setText("• Check for battery voltage between harness multi-plug terminals");

        jLabel156.setText("• If battery voltage is not indicated: Check wiring.");

        javax.swing.GroupLayout p7Layout = new javax.swing.GroupLayout(p7);
        p7.setLayout(p7Layout);
        p7Layout.setHorizontalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane14))
                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p7Layout.createSequentialGroup()
                        .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p7Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel147)
                                    .addComponent(jLabel124)
                                    .addComponent(jLabel148)
                                    .addComponent(jLabel149)
                                    .addComponent(jLabel151)
                                    .addComponent(jLabel152)
                                    .addComponent(jLabel153)
                                    .addGroup(p7Layout.createSequentialGroup()
                                        .addComponent(jLabel150)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton52))
                                    .addComponent(jLabel134)
                                    .addGroup(p7Layout.createSequentialGroup()
                                        .addComponent(jLabel135)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton51))
                                    .addComponent(jLabel156)))
                            .addGroup(p7Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel121)
                                    .addGroup(p7Layout.createSequentialGroup()
                                        .addComponent(jLabel146)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel122)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton50)))))
                        .addGap(0, 331, Short.MAX_VALUE)))
                .addContainerGap())
        );
        p7Layout.setVerticalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel121)
                .addGap(18, 18, 18)
                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel122)
                    .addComponent(jButton33)
                    .addComponent(jLabel146)
                    .addComponent(jButton50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel124)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel147)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel148)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel149)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel150)
                    .addComponent(jButton52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel151)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel152)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel153)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel134)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel135)
                    .addComponent(jButton51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel156)
                .addGap(18, 18, 18)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(573, Short.MAX_VALUE))
        );

        fuel_pump.setViewportView(p7);

        fuel1.setVisible(false);

        javax.swing.GroupLayout panel_rightLayout = new javax.swing.GroupLayout(panel_right);
        panel_right.setLayout(panel_rightLayout);
        panel_rightLayout.setHorizontalGroup(
            panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_rightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(throttle, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE))
            .addGroup(panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_rightLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(idle_speed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_rightLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(co_level)))
            .addGroup(panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_rightLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fuel_pressure)))
            .addGroup(panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_rightLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fuel_delivery)))
            .addGroup(panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_rightLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(injectors)))
            .addGroup(panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_rightLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cold_start, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)))
            .addGroup(panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_rightLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fuel_pump, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)))
            .addGroup(panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fuel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE))
        );
        panel_rightLayout.setVerticalGroup(
            panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_rightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(throttle, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE))
            .addGroup(panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_rightLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(idle_speed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_rightLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(co_level)))
            .addGroup(panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_rightLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fuel_pressure)))
            .addGroup(panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_rightLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fuel_delivery)))
            .addGroup(panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_rightLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(injectors, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)))
            .addGroup(panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_rightLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cold_start, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)))
            .addGroup(panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_rightLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fuel_pump)))
            .addGroup(panel_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_rightLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fuel1, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)))
        );

        splitter.setRightComponent(panel_right);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(splitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            showScroll("idle_speed");
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
            showScroll("fuel_pressure");
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
            showScroll("throttle_position");
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
            showScroll("high_tension");
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
            showScroll("high_tension");
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
            showScroll("high_tension");
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
            showScroll("high_tension");
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

//<editor-fold defaultstate="collapsed" desc="Generated Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JScrollPane co_level;
    private javax.swing.JScrollPane cold_start;
    private javax.swing.JButton control;
    private javax.swing.JButton emission;
    private javax.swing.JButton engine;
    private javax.swing.JButton fuel;
    private fuel fuel1;
    private javax.swing.JScrollPane fuel_delivery;
    private javax.swing.JScrollPane fuel_pressure;
    private javax.swing.JScrollPane fuel_pump;
    private javax.swing.JScrollPane idle_speed;
    private javax.swing.JButton ignition;
    private javax.swing.JScrollPane injectors;
    private javax.swing.JButton intake;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JPanel p;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
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
    private javax.swing.JButton service;
    private javax.swing.JSplitPane splitter;
    private javax.swing.JScrollPane throttle;
    // End of variables declaration//GEN-END:variables
//</editor-fold>

    private static class EVENT implements ActionListener {

        private String scroll;
        private language lg;

        public EVENT(String sc, language g) {
            this.scroll = sc;
            this.lg = g;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            lg.showScroll(scroll);
        }
    }
}
