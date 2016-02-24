package org.usfirst.frc.team2642.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team2642.robot.RobotMap;
import org.usfirst.frc.team2642.robot.commands.ShooterTurrentStop;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.DigitalInput;
/**
 *
 */
public class ShooterTurrent extends Subsystem {
	Talon shooterTurrentMotor = new Talon(RobotMap.shooterTurrentMotor);
	AnalogPotentiometer shooterTurrentPot = new AnalogPotentiometer(RobotMap.shooterTurrentPot);
	DigitalInput lowerLimitSwitch = new DigitalInput(RobotMap.shooterTurrentLowerLimitSwitch);
	DigitalInput upperLimitSwitch = new DigitalInput(RobotMap.shooterTurrentUpperLimitSwitch);
	
	// Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new ShooterTurrentStop());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void down()
    {
    	shooterTurrentMotor.set(RobotMap.shooterTurrentMotorSpeed * -1.0);
    }
    
    public void up()
    {
    	shooterTurrentMotor.set(RobotMap.shooterTurrentMotorSpeed);
    }
    
    public void stop()
    {
    	shooterTurrentMotor.set(0);
    }
    
    public boolean getIsLowerLimit()
    {
    	return lowerLimitSwitch.get();
    }
    public boolean getIsUpperLimit()
    {
    	return upperLimitSwitch.get();
    }
}

