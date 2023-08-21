package frc.robot.commands.autonomous;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

import frc.robot.subsystems.DrivetrainSubsystem;
import frc.robot.subsystems.ElevatorSubsystem;
import frc.robot.subsystems.IntakeSubsystem;

import frc.robot.commands.drive.AutoEngage;
import frc.robot.commands.JoystickDrive;
import frc.robot.commands.elevator.ElevatorToMid;
import frc.robot.commands.intake.IntakeCubeIn;
import frc.robot.commands.intake.IntakeCubeStall;

import frc.robot.Constants;
import frc.robot.RobotContainer;

// Might be a good idea to add Commands with a HashMap inside a List approach
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Supplier;

public class AllAutos {
    // Might be a good idea to add Commands with a HashMap inside a List approach
    // private HashMap<String, Supplier<AutoChooserElement>> autonomousCommands = new HashMap<>();
    // private List<String> names = new ArrayList<>();
    // private Drivetrain drivetrain;
    // private Intake intake;
    // private Elevator elevator;

    // public AllAutos(Drivetrain drivetrain, Intake intake, Elevator, elevator) {

    // }
}