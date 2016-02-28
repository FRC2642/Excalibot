package org.usfirst.frc.team2642.robot.subsystems;

import org.usfirst.frc.team2642.robot.Robot;
import org.usfirst.frc.team2642.robot.RobotMap;
import org.usfirst.frc.team2642.robot.commands.SetShooterSetpoint;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class ShooterAim extends PIDSubsystem {
	Talon shootermotor = new Talon(RobotMap.shootermotor);
	//Encoder encoder = new Encoder(0,1);
    AnalogPotentiometer shooterpot = new AnalogPotentiometer(RobotMap.shooterpot);
	public double shooterset = 0.6;
    // Initialize your subsystem here
    public ShooterAim() {
    	super("ShooterAim", 5,0,0.1);
    	setSetpoint(shooterset);
    	enable();
        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    }
    
    public void initDefaultCommand() {
//    	setDefaultCommand(new SetShooterSetpoint());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    protected double returnPIDInput() {
    	System.out.println(shooterpot.pidGet());
//    	System.out.println(this.getSetpoint());
//    	System.out.println(encoder.pidGet());
//    	return encoder.pidGet();
    	return shooterpot.pidGet();
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
   // 	return shooterpot.get();
    }
    
    protected void usePIDOutput(double output) {
    	shootermotor.set(-output);
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    }
    
//    public void setSetpoint(double setpoint) {
//    	shooterset = setpoint;
//    }
}
