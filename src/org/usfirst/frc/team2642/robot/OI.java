package org.usfirst.frc.team2642.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team2642.robot.commands.*;

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
	public Button xboxIntake = new JoystickButton(xboxStick, 1);
	public Button xboxRelease = new JoystickButton(xboxStick, 2);
	public Button xboxSpinUp = new JoystickButton(xboxStick, 3);
	public Button xboxY = new JoystickButton(xboxStick, 4);
	//public Button xboxToggleAim = new JoystickButton(xboxStick, 5);
	//public Button xboxRB= new JoystickButton(xboxStick, 6);
	//public Button xboxBack = new JoystickButton(xboxStick, 7);
	//public Button xboxStart = new JoystickButton(xboxStick, 8);
	public Button xboxLeftClick = new JoystickButton(xboxStick, 9);
	public Button xboxRightClick = new JoystickButton(xboxStick, 10);
	
	
	
	Joystick armStick = new Joystick(1);
	public Joystick getarm(){
			 return armStick;
	}
	public Button armIntake = new JoystickButton(armStick, 1);
	public Button armRetract = new JoystickButton(armStick, 2);
	public Button armExtend = new JoystickButton(armStick, 3);
	
	
	public Joystick auxillary = new Joystick(2);
	public Button auxFire = new JoystickButton(auxillary, 1);			//Fire
	public Button auxSlow = new JoystickButton(auxillary, 2);			//Slow Release
	public Button auxSpinUp = new JoystickButton(auxillary, 3);			//Spin Up
	public Button auxDeployOut = new JoystickButton(auxillary, 4);		//Deployer
	public Button auxDeployIn = new JoystickButton(auxillary, 5);				
	public Button auxDToggleSet = new JoystickButton(auxillary, 6);		//Deployer Toggle
	public Button auxDToggleCustom = new JoystickButton(auxillary, 7);
	
	/***********************************************/
	Button btnShooterTurrentUp = new JoystickButton(xboxStick, RobotMap.btnShooterTurrentUp);
	Button btnShooterTurrentDown = new JoystickButton(xboxStick, RobotMap.btnShooterTurrentDown);
	Button btnRollerArmUp = new JoystickButton(auxillary, RobotMap.btnRollerArmUp);
	Button btnRollerArmDown = new JoystickButton(auxillary, RobotMap.btnRollerArmDown);
	/***********************************************/

		
	public OI() {
		//xboxToggleAim.whileHeld(new ShooterAim());
		
		/********************************************************/
		btnShooterTurrentUp.whileHeld(new ShooterTurrentUp());
		btnShooterTurrentDown.whileHeld(new ShooterTurrentDown());
		btnRollerArmUp.whileHeld(new RollerArmUp());
		btnRollerArmDown.whileHeld(new RollerArmDown());
		armRetract.whileHeld(new RetractArm());
		armExtend.whileHeld(new ExtendArm());

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

