// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.Constants;
import frc.robot.subsystems.DrivetrainSubsystem;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  private final Joystick JOYSTICK = new Joystick(0);
  private final Joystick JOYSTICK2 = new Joystick(1);
  // The robot's subsystems and commands are defined here...
  private Drivetrain m_DrivetrainSubsystem = new DrivetrainSubsystem();


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }
  // Configure the button bindings
  private void configureButtonBindgins() {

    if (JOYSTICK.getRawButton(1)) {
      
    }


    if (JOYSTICK2.getRawButton(1)) {
      mid = true;
      elevatortimer.reset();
      elevatortimer.start();
    } 
    
    if (JOYSTICK2.getRawButtonPressed(4) && up == false) { // elevator down
      if (Constants.toggle) {
        timer.reset();
        timer.start();
        if (timer.get() < 0.3) {
          m_elevator.set(0.2/2);
        }
        System.out.println("Yes");
        up = false;
      }
      else { // elevator up
        m_elevator.set(-1.2/2);
        System.out.println("no");
        up = true;
      }
    }
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */

  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
