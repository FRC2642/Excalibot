package org.usfirst.frc.team2642.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team2642.robot.commands.*;
import org.usfirst.frc.team2642.robot.subsystems.ShooterAim;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	Joystick xboxStick = new Joystick(0);
	public Joystick getxbox(){
		return xboxStick;
	}
	public Button xboxA = new JoystickButton(xboxStick, 1);
	public Button xboxB = new JoystickButton(xboxStick, 2);
	public Button xboxSpinUp = new JoystickButton(xboxStick, 3);
	public Button xboxY = new JoystickButton(xboxStick, 4);
	//public Button xboxToggleAim = new JoystickButton(xboxStick, 5);
	//public Button xboxRB= new JoystickButton(xboxStick, 6);
	//public Button xboxBack = new JoystickButton(xboxStick, 7);
	//public Button xboxStart = new JoystickButton(xboxStick, 8);
	//public Button xboxLeftClick = new JoystickButton(xboxStick, 9);
	//public Button xboxRightClick = new JoystickButton(xboxStick, 10);
	
	
	
	Joystick armStick = new Joystick(1);
	public Joystick getarm(){
			 return armStick;
	}
	// Note to self: Make new commands for raising and lowering the big arm,
	// then declare buttons to run each command
	public Button armIntake = new JoystickButton(armStick, 1);
	public Button shooterTop = new JoystickButton(armStick, 3);
	public Button shooterBottom = new JoystickButton(armStick, 2);
	public Button shooterCorner = new JoystickButton(armStick, 4);
	//Roller Arm is the Y axis
	public Button armRaise = new JoystickButton(armStick, 7);
	public Button armLower = new JoystickButton(armStick, 6);
	public Button armExtend = new JoystickButton(armStick, 11);
	public Button armRetract = new JoystickButton(armStick, 10);
	public Button rollerTurbo = new JoystickButton(armStick, 8);
	//public Button armShooterUp = new JoystickButton(armStick, RobotMap.btn)
	
	
	public Joystick auxillary = new Joystick(2);
	public Button auxFire = new JoystickButton(auxillary, 1);			//Fire
	public Button auxSlow = new JoystickButton(auxillary, 3);			//Slow Release
	public Button auxSpinUp = new JoystickButton(auxillary, 2);			//Spin Up
	//public Button auxDeployOut = new JoystickButton(auxillary, 4);		//Deployer
	//public Button auxDeployIn = new JoystickButton(auxillary, 5);				
	//public Button auxDToggleSet = new JoystickButton(auxillary, 6);		//Deployer Toggle
	//public Button auxDToggleCustom = new JoystickButton(auxillary, 7);
	
	/***********************************************/
	Button btnShooterTurretUp = new JoystickButton(xboxStick, RobotMap.btnShooterTurretUp);
	Button btnShooterTurretDown = new JoystickButton(xboxStick, RobotMap.btnShooterTurretDown);
	//Button btnRollerArmUp = new JoystickButton(auxillary, RobotMap.btnRollerArmUp);
	//Button btnRollerArmDown = new JoystickButton(auxillary, RobotMap.btnRollerArmDown);
	/***********************************************/

		
	public OI() {
		shooterTop.whenReleased(new SetShooterSetpoint(RobotMap.shootermid));
		shooterBottom.whenReleased(new SetShooterSetpoint(RobotMap.shootermid));
		shooterCorner.whenReleased(new SetShooterSetpoint(RobotMap.shootermid));
		shooterTop.whenPressed(new SetShooterSetpoint(RobotMap.shootertop));
		shooterBottom.whenPressed(new SetShooterSetpoint(RobotMap.shooterlow));
		shooterCorner.whenPressed(new SetShooterSetpoint(RobotMap.shootercorner));
		
		//xboxToggleAim.whileHeld(new ShooterAim());
		
		/********************************************************/
		
	//	btnRollerArmUp.whileHeld(new RollerArmUp());
	//	btnRollerArmDown.whileHeld(new RollerArmDown());
		armRetract.whileHeld(new RetractArm());
		armExtend.whileHeld(new ExtendArm());
		if((armStick.getRawAxis(1) >= .5) || (armStick.getRawAxis(1) <= -.5)){
			new ManualRollerArm();
		}else{
			xboxB.whenPressed(new SetRollerSetpoint(0.502));
			xboxA.whenPressed(new SetRollerSetpoint(0.557));
			xboxY.whenPressed(new SetRollerSetpoint(0.220));
		}
		armRaise.whileHeld(new RaiseArm());
		armLower.whileHeld(new LowerArm());
		
		/********************************************************/
		
	}
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

