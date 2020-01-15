package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.DriveTrainCode;

public class DriveTrain extends Subsystem {

private Spark leftMotorFront;
private Spark rightMotorFront;
private Spark leftMotorBack;
private Spark rightMotorBack;

public Boolean inverted = false;
private Double dSpeed = 0.85;

public DriveTrain() {

leftMotorFront = new Spark(0);
addChild("LeftMotorFront",leftMotorFront);
leftMotorFront.setInverted(false);
        
rightMotorFront = new Spark(2);
addChild("RightMotorFront",rightMotorFront);
rightMotorFront.setInverted(false);

leftMotorBack = new Spark(1);
addChild("LeftMotorBack",leftMotorBack);
leftMotorBack.setInverted(false);
        
rightMotorBack = new Spark(3);
addChild("RightMotorBack",rightMotorBack);
rightMotorBack.setInverted(false);
}

    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new DriveTrainCode());
    }


    public void driveWithJoysticks(double joystickX, double joystickY)
	{
        double motorLeft;
        double motorRight;
        if (!inverted)
        {
        motorLeft = (joystickX + joystickY) *dSpeed;
        motorRight = (-joystickX + joystickY) *dSpeed;
        if(motorLeft >= 1.0)
        {
            motorLeft = 1.0;
        }
        if(motorRight >= 1.0)
        {
            motorRight = 1.0;
        }
        leftMotorFront.set(motorLeft);
        rightMotorFront.set(motorRight);
        //leftMotorBack.set(motorLeft);
        //rightMotorBack.set(motorRight);
        System.out.println("Motor Left: " + motorLeft);
        System.out.println("Motor Right: " + motorRight);
        }
        else
        {
            //TODO:  Code inverted code here.
            
        }

    }
    
    public void stop()
    {
        rightMotorFront.set(0);
        leftMotorFront.set(0);
        rightMotorBack.set(0);
        leftMotorBack.set(0);
    }

}
