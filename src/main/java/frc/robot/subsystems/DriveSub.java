/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotIO;

/**
 * Add your docs here.
 */
public class DriveSub extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
     
  }
  public static double getRate() {
    double leftRate = RobotIO.leftEncoder.getRate();
    double rightRate = RobotIO.rightEncoder.getRate();
    double rate = (leftRate * rightRate) / 2.0;
    return rate;
  }
}
