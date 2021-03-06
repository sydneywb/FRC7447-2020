/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.WPI_MotorSafetyImplem;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.ManualColorSpinner;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class ManualColor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public WPI_VictorSPX colorSpinner = new WPI_VictorSPX(7);
  


  public void scrollMovement(double percentVoltage) {
    System.out.println(percentVoltage);
    colorSpinner.set(ControlMode.PercentOutput, percentVoltage);

  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
  }
}
