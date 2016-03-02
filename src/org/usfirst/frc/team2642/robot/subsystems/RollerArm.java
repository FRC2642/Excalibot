package org.usfirst.frc.team2642.robot.subsystems;

import org.usfirst.frc.team2642.robot.Robot;
import org.usfirst.frc.team2642.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class RollerArm extends PIDSubsystem {
	public Talon rollermotor = new Talon(RobotMap.rollermotor);
	//Encoder encoder = new Encoder(0,1);
    AnalogPotentiometer rollerpot = new AnalogPotentiometer(RobotMap.rollerpot);
	public double rollerset = 0.492;
    // Initialize your subsystem here
    public RollerArm() {
    	super("RollerSet", 7,0,0);
    	setSetpoint(rollerset);
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
    	//System.out.println(rollerpot.pidGet());
//    	System.out.println(this.getSetpoint());
//    	System.out.println(encoder.pidGet());
//    	return encoder.pidGet();
    	return rollerpot.pidGet();
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
   // 	return shooterpot.get();
    }
    
    protected void usePIDOutput(double output) {
    	rollermotor.set(-output);
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    }
    
//    public void setSetpoint(double setpoint) {
//    	shooterset = setpoint;
//    }
}
