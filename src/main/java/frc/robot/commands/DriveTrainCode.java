package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DriveTrainCode extends Command {

    public void DriveWithJoysticks() {
        requires(Robot.driveTrain);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        frc.robot.Robot.driveTrain.driveWithJoysticks(Robot.oi.xBox.getX(), -Robot.oi.xBox.getY());
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        frc.robot.Robot.driveTrain.stop();
    }

    @Override
    protected void interrupted() {
        end();
    }
}
