package org.usfirst.frc.team2642.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team2642.robot.*;
import edu.wpi.first.wpilibj.Encoder;

/**
 *
 */
public class EncoderSubsystem extends Subsystem {
    Encoder Lencoder = new Encoder(RobotMap.frontleft,RobotMap.rearleft);
    Encoder Rencoder = new Encoder(RobotMap.frontright,RobotMap.rearright);
    public double rightDistance;
    public double leftDistance;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public void resetEncoders(){
    	Lencoder.reset();
    	Rencoder.reset();
    }
    
    public double getRightDistanceTraveled() {
    	rightDistance = Rencoder.getDistance()*0.0167;
    	return rightDistance;
    }
    
    public double getLeftDistanceTraveled() {
    	leftDistance = Lencoder.getDistance()*0.0167;
    	return leftDistance;
    }
    
    public double getRawRightCount() {
    	return Rencoder.getDistance();
    }
    
    public double getRawLeftCOunt(){
    	return Lencoder.getDistance();
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

