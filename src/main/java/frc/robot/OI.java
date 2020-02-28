/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.FindTargetCommand;
import frc.robot.commands.IntakeCommand;
// import frc.robot.commands.LimelighRotationCommand;
import frc.robot.commands.PneumaticShooterCommand;
import frc.robot.commands.ReverseIntakeCommand;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ColorSelectionCommand;
import frc.robot.commands.DistanceAdjustCommand;





/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  public XboxController stick = new XboxController(0);
  
  public OI() {
    Button buttonAButton = new JoystickButton(stick, RobotMap.buttonAPort);
    buttonAButton.whenPressed(new DistanceAdjustCommand());
  
    Button buttonBButton = new JoystickButton(stick, RobotMap.buttonBPort);
    buttonBButton.whileHeld(new FindTargetCommand());
  
    Button rightBumperButton = new JoystickButton(stick, RobotMap.rightBumperPort);
    rightBumperButton.whileHeld(new IntakeCommand());

    Button leftBumperButton = new JoystickButton (stick, RobotMap.leftBumperPort);
    leftBumperButton.whileHeld(new ReverseIntakeCommand());

    Button buttonXButton = new JoystickButton(stick, RobotMap.buttonXPort);
    buttonXButton.whenPressed(new PneumaticShooterCommand());

    Button buttonYButton = new JoystickButton(stick, RobotMap.buttonYPort);
    buttonYButton.whenActive(new ColorSelectionCommand());
    
  }
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

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
