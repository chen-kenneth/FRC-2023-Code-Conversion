package frc.robot.commands.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.intake.Intake;

public class IntakeCubeIn extends CommandBase {
    Intake intake;

    public IntakeCubeIn(Intake intake) {
        this.intake = intake;
    }

    @Override
    public void initialize() {
        intake.intakeCubeIn()
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {}

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        intake.intakeOff()
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }

}