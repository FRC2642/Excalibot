package org.usfirst.frc.team2642.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class REncoder extends Subsystem {
	public Encoder rencoder = new Encoder(2,3);
	
	public double getREncoder(){
		return rencoder.get();
	}
	
	public double getREncoderRate(){
		return rencoder.getRate();
	}
	
	public void resetREncoder(){
		rencoder.reset();
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

