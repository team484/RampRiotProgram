/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/**
 * Add your docs here.
 */
public class RobotIO {
    public static CANSparkMax leftMotor1 = new CANSparkMax(RobotSettings.LEFT_MOTOR_1_ID, MotorType.kBrushless);
    public static CANSparkMax leftMotor2 = new CANSparkMax(RobotSettings.LEFT_MOTOR_2_ID, MotorType.kBrushless);
    public static CANSparkMax leftMotor3 = new CANSparkMax(RobotSettings.LEFT_MOTOR_3_ID, MotorType.kBrushless);
    public static CANSparkMax rightMotor1 = new CANSparkMax(RobotSettings.RIGHT_MOTOR_1_ID, MotorType.kBrushless);
    public static CANSparkMax rightMotor2 = new CANSparkMax(RobotSettings.RIGHT_MOTOR_2_ID, MotorType.kBrushless);
    public static CANSparkMax rightMotor3 = new CANSparkMax(RobotSettings.RIGHT_MOTOR_3_ID, MotorType.kBrushless);
    public static Encoder leftEncoder = new Encoder(RobotSettings.LEFT_ENCODER_ID_A, RobotSettings.LEFT_ENCODER_ID_B);
    public static Encoder rightEncoder = new Encoder(RobotSettings.RIGHT_ENCODER_ID_A, RobotSettings.RIGHT_ENCODER_ID_B);
    public static Joystick driverStick = new Joystick(RobotSettings.DRIVER_STICK_PORT);
    public static Joystick operatorStickBall = new Joystick(RobotSettings.BALL_STICK_PORT);
    public static Joystick operatorStickHatch = new Joystick(RobotSettings.HATCH_STICK_PORT);
    public static DifferentialDrive difDrive = new DifferentialDrive(leftMotor1, rightMotor2);
    public static DoubleSolenoid frontSolenoid = new DoubleSolenoid(RobotSettings.FRONT_CLIMBER_SOLENOID_FORWARD_ID, RobotSettings.FRONT_CLIMBER_SOLENOID_REVERSE_ID);
    public static DoubleSolenoid backSolenoid = new DoubleSolenoid(RobotSettings.BACK_CLIMBER_SOLENOID_FORWARD_ID, RobotSettings.BACK_CLIMBER_SOLENOID_REVERSE_ID);
    public static AnalogInput intakeSensor = new AnalogInput(RobotSettings.INTAKE_SENSOR_CHANNEL);
    public static WPI_TalonSRX intakeMotor = new WPI_TalonSRX(RobotSettings.INTAKE_MOTOR_ID);
    public static AnalogInput shooterSensor = new AnalogInput(RobotSettings.SHOOTER_SENSOR_CHANNEL);
    public static WPI_TalonSRX shooterWheels = new WPI_TalonSRX(RobotSettings.SHOOTER_MOTOR_ID);
    public static DoubleSolenoid intakeSolenoid = new DoubleSolenoid(RobotSettings.INTAKE_SOLENOID_FORWARD_ID, RobotSettings.INTAKE_SOLENOID_BACKWARD_ID);
    public static CANSparkMax elevatorMotor1 = new CANSparkMax(RobotSettings.ELEVATOR_MOTOR_1_ID, MotorType.kBrushless);
    public static CANSparkMax elevatorMotor2 = new CANSparkMax(RobotSettings.ELEVATOR_MOTOR_2_ID, MotorType.kBrushless);
    public static DoubleSolenoid hatchGrabber = new DoubleSolenoid(RobotSettings.HATCH_GRABBER_EXTEND_ID, RobotSettings.HATCH_GRABBER_RETRACT_ID);
    public static DoubleSolenoid hatchGrabberArm = new DoubleSolenoid(RobotSettings.HATCH_GRABBER_ARM_EXTEND_ID, RobotSettings.HATCH_GRABBER_ARM_RETRACT_ID);
}


    
    
        