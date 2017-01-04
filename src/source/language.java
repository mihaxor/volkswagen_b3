package source;



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

    final String service_txt1 = "• Idle speed";
    final String service_txt2 = "• CO level";
    final String service_txt3 = "• Throttle initial position";
    
    final String fuel_txt1 = "• Fuel pressure";
    final String fuel_txt2 = "• Fuel delivery rate";
    final String fuel_txt3 = "• Injectors";
    final String fuel_txt4 = "• Cold start injector";
    final String fuel_txt5 = "• Fuel pump";
    
    final String intake_txt1 = "• Throttle position (TP) sensor";
    final String intake_txt2 = "• Volume air flow (VAF) sensor";
    final String intake_txt3 = "• Intake air temperature (IAT) sensor";
    final String intake_txt4 = "• Idle air control (IAC) valve";
    
    final String ignition_txt1 = "• High-tension spark";
    final String ignition_txt2 = "• Ignition timing & firing order";
    final String ignition_txt3 = "• Ignition coil";
    final String ignition_txt4 = "• Ignition amplifier";
    
    final String engine_txt1 = "• Engine coolant temperature (ECT) sensor";
    final String engine_txt2 = "• Crankshaft position (CKP) sensor";
    final String engine_txt3 = "• Knock sensor (KS)";
    
    final String emission_txt1 = "• CO adjustment resistor - Passat";
    final String emission_txt2 = "• Heated oxygen sensor (HO2S)";
    final String emission_txt3 = "• Oxygen sensor heater";
    
    final String control_txt1 = "• Engine control relay";
    final String control_txt2 = "• Fuel pump relay";
    final String control_txt3 = "• Engine control module (ECM)";

    public void showScroll(String scroll);
}
