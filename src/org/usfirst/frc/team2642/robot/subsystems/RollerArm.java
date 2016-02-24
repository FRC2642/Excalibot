package org.usfirst.frc.team2642.robot.subsystems;

import org.usfirst.frc.team2642.robot.RobotMap;
import org.usfirst.frc.team2642.robot.commands.RollerArmStop;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RollerArm extends Subsystem {
	Talon rollerArmMotor = new Talon(RobotMap.rollerArmMotor);
	AnalogPotentiometer rollerArmPot = new AnalogPotentiometer(RobotMap.rollerArmPot);
	DigitalInput lowerLimitSwitch = new DigitalInput(RobotMap.rollerArmLowerLimitSwitch);
	DigitalInput upperLimitSwitch = new DigitalInput(RobotMap.rollerArmUpperLimitSwitch);
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new RollerArmStop());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void down()
    {
    	rollerArmMotor.set(RobotMap.rollerArmMotorSpeed * -1.0);
    }
    
    public void up()
    {
    	rollerArmMotor.set(RobotMap.rollerArmMotorSpeed);
    }
    
    public void stop()
    {
    	rollerArmMotor.set(0);
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

