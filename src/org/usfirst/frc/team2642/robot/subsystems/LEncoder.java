package org.usfirst.frc.team2642.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LEncoder extends Subsystem {
	public Encoder lencoder = new Encoder(2, 3);
	
	public double getLEncoder(){
		return lencoder.get();
	}
	
	public double getLEncoderRate(){
		return lencoder.getRate();
	}
	
	public void resetLEncoder(){
		lencoder.reset();
	}

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

