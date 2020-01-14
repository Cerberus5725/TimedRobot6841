
package frc.robot;

import frc.robot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import frc.robot.subsystems.*;

public class OI {

public JoystickButton inverseDriveTrain;
public JoystickButton revertDriveTrain;
public JoystickButton ballIntake;

public Joystick xBox;

    // OI Constructor
    public OI() {
    xBox = new Joystick(0);
    revertDriveTrain = new JoystickButton(xBox, 2);
    revertDriveTrain.whenPressed(new RevertDriveTrainCode());
    inverseDriveTrain = new JoystickButton(xBox, 3);
    inverseDriveTrain.whenPressed(new InverseDriveTrainCode());
    ballIntake = new JoystickButton(xBox, 1);
    ballIntake.whileHeld(new IntakeBall());
        // SmartDashboard Buttons
        SmartDashboard.putData("AutonomousCode", new AutonomousCode());
        SmartDashboard.putData("DriveTrainCode", new DriveTrainCode());
        SmartDashboard.putData("InverseDriveTrainCode", new InverseDriveTrainCode());
        SmartDashboard.putData("RevertDriveTrainCode", new RevertDriveTrainCode());
        SmartDashboard.putData("IntakeBall", new IntakeBall());
    }

    public Joystick getxBox() {
        return xBox;
    }

}

