package emct.ro.forms;

import javax.swing.JButton;
import javax.swing.JPanel;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Catalin Glavan
 */
public interface language {

    final String service_txt1 = "• Viteza la Relanti";
    final String service_txt2 = "• Nivelul de Dioxid de Carbon";
    final String service_txt3 = "• Pozitia initiala a Pedalei de Acceleratie";
    
    final String fuel_txt1 = "• Presiunea Combustibilului";
    final String fuel_txt2 = "• Rata de livrare a Combustibilului";
    final String fuel_txt3 = "• Injectoarele";
    final String fuel_txt4 = "• Injector de pornire la rece";
    final String fuel_txt5 = "• Pompa de combustibil";
    
    final String intake_txt1 = "• Senzorul de pozitie al pedalei de acceleratie (TP) ";
    final String intake_txt2 = "• Senzorul pentru volumul fluxului de aer (VAF) ";
    final String intake_txt3 = "• Senzorul temperaturii aerului la admisie (IAT) ";
    final String intake_txt4 = "• Senzor pentru supapa de control a aerului (IAC) ";
    
    final String ignition_txt1 = "• Scanteie de inalta tensiune";
    final String ignition_txt2 = "• Timpii de aprindere si ordinea de ardere";
    final String ignition_txt3 = "• Bobina de aprindere";
    final String ignition_txt4 = "• Amplificator de aprindere";
    
    final String engine_txt1 = "• Senzorul de temperatura pentru lichidul de racire al motorului (ECT) ";
    final String engine_txt2 = "• Senzorul de pozitie al arborelui cotit (CKP) ";
    final String engine_txt3 = "• Senzor de bataie (KS) ";
    
    final String emission_txt1 = "• Rezistorul de ajustare al Dioxidului de Carbon - Passat";
    final String emission_txt2 = "• Senzor de temperatura a oxigenului (HO2S)";
    final String emission_txt3 = "• Incalzitor pentru senzorul de oxigen";
    
    final String control_txt1 = "• Releul de control al Motorului";
    final String control_txt2 = "• Releul de control al pompei de combustibil";
    final String control_txt3 = "• Modulul de control al motorului (ECM)";

    public void showPanel(JPanel component_panel);
    public void buttonState(JButton button);
}
