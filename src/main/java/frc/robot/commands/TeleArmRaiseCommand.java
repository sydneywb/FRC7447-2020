/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import jdk.jfr.Percentage;

public class TeleArmRaiseCommand extends Command {

    //One motor raises telescope
    //
  // double percentVoltage = .7;
  int direction;
  double percentVoltage;
  public TeleArmRaiseCommand(int directionParam, double voltage) {
    requires(Robot.winchsystem);
    direction = directionParam;
    percentVoltage = voltage;
  
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    Robot.winchsystem.teleArmRaise(percentVoltage*direction);


   



     //direction may change depending on how the motor is placed

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.winchsystem.teleArmRaise(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
