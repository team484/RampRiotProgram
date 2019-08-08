/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.BackClimber;
import frc.robot.commands.BackClimberDown;
import frc.robot.commands.FrontClimber;
import frc.robot.commands.FrontClimberDown;
import frc.robot.commands.IntakePrepareToShoot;
import frc.robot.commands.IntakeSuccTheBalls;
import frc.robot.commands.ShootCargo;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public static JoystickButton driveButton1 = new JoystickButton(RobotIO.driverStick, RobotSettings.DRIVERSTICK_BUTTON_1_ID);
  public static JoystickButton driveButton2 = new JoystickButton(RobotIO.driverStick, RobotSettings.DRIVERSTICK_BUTTON_2_ID);
  public static JoystickButton driveButton3 = new JoystickButton(RobotIO.driverStick, RobotSettings.DRIVERSTICK_BUTTON_3_ID);
  public static JoystickButton driveButton4 = new JoystickButton(RobotIO.driverStick, RobotSettings.DRIVERSTICK_BUTTON_4_ID);
  public static JoystickButton driveButton5 = new JoystickButton(RobotIO.driverStick, RobotSettings.DRIVERSTICK_BUTTON_5_ID);
  public static JoystickButton frontClimbButton = new JoystickButton(RobotIO.driverStick, RobotSettings.DRIVERSTICK_BUTTON_6_ID);
  public static JoystickButton backClimbButton = new JoystickButton(RobotIO.driverStick, RobotSettings.DRIVERSTICK_BUTTON_7_ID);
  public static JoystickButton driveButton8 = new JoystickButton(RobotIO.driverStick, RobotSettings.DRIVERSTICK_BUTTON_8_ID);
  public static JoystickButton driveButton9 = new JoystickButton(RobotIO.driverStick, RobotSettings.DRIVERSTICK_BUTTON_9_ID);
  public static JoystickButton frontClimbDownButton = new JoystickButton(RobotIO.driverStick, RobotSettings.DRIVERSTICK_BUTTON_10_ID);
  public static JoystickButton backClimbDownButton = new JoystickButton(RobotIO.driverStick, RobotSettings.DRIVERSTICK_BUTTON_11_ID);
  public static JoystickButton cargoShootButton = new JoystickButton(RobotIO.operatorStickBall, RobotSettings.BALLSTICK_BUTTON_1_ID);
  public static JoystickButton ballStickButton2 = new JoystickButton(RobotIO.operatorStickBall, RobotSettings.BALLSTICK_BUTTON_2_ID);
  public static JoystickButton storeCargoButton = new JoystickButton(RobotIO.operatorStickBall, RobotSettings.BALLSTICK_BUTTON_3_ID);
  public static JoystickButton ballStickButton4 = new JoystickButton(RobotIO.operatorStickBall, RobotSettings.BALLSTICK_BUTTON_4_ID);
  public static JoystickButton grabCargoButton = new JoystickButton(RobotIO.operatorStickBall, RobotSettings.BALLSTICK_BUTTON_5_ID);
  //This button sucks balls
  public static JoystickButton ballStickButton6 = new JoystickButton(RobotIO.operatorStickBall, RobotSettings.BALLSTICK_BUTTON_6_ID);
  public static JoystickButton ballStickButton7 = new JoystickButton(RobotIO.operatorStickBall, RobotSettings.BALLSTICK_BUTTON_7_ID);
  public static JoystickButton ballStickButton8 = new JoystickButton(RobotIO.operatorStickBall, RobotSettings.BALLSTICK_BUTTON_8_ID);
  public static JoystickButton ballStickButton9 = new JoystickButton(RobotIO.operatorStickBall, RobotSettings.BALLSTICK_BUTTON_9_ID);
  public static JoystickButton ballStickButton10 = new JoystickButton(RobotIO.operatorStickBall, RobotSettings.BALLSTICK_BUTTON_10_ID);
  public static JoystickButton ballStickButton11 = new JoystickButton(RobotIO.operatorStickBall, RobotSettings.BALLSTICK_BUTTON_11_ID);
  public static JoystickButton ballStickButton12 = new JoystickButton(RobotIO.operatorStickBall, RobotSettings.BALLSTICK_BUTTON_12_ID);
  public static JoystickButton hatchStickButton1 = new JoystickButton(RobotIO.operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_1_ID);
  public static JoystickButton hatchStickButton2 = new JoystickButton(RobotIO.operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_2_ID);
  public static JoystickButton hatchStickButton3 = new JoystickButton(RobotIO.operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_3_ID);
  public static JoystickButton hatchStickButton4 = new JoystickButton(RobotIO.operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_4_ID);
  public static JoystickButton hatchStickButton5 = new JoystickButton(RobotIO.operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_5_ID);
  public static JoystickButton hatchStickButton6 = new JoystickButton(RobotIO.operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_6_ID);
  public static JoystickButton hatchStickButton7 = new JoystickButton(RobotIO.operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_7_ID);
  public static JoystickButton hatchStickButton8 = new JoystickButton(RobotIO.operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_8_ID);
  public static JoystickButton hatchStickButton9 = new JoystickButton(RobotIO.operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_9_ID);
  public static JoystickButton hatchStickButton10 = new JoystickButton(RobotIO.operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_10_ID);
  public static JoystickButton hatchStickButton11 = new JoystickButton(RobotIO.operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_11_ID);
  public static JoystickButton hatchStickButton12 = new JoystickButton(RobotIO.operatorStickHatch, RobotSettings.HATCHSTICK_BUTTON_12_ID);
  public OI()
  {
    
    frontClimbButton.whenPressed(new FrontClimber());
    backClimbButton.whenPressed(new BackClimber());
    frontClimbDownButton.whenPressed(new FrontClimberDown());
    backClimbDownButton.whenPressed(new BackClimberDown());
    grabCargoButton.whenPressed(new IntakeSuccTheBalls());




  }
}
