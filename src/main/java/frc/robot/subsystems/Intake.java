/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Intake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private Spark intakeRoller;
  public double intakeSpeed = 0.5;

  public Intake()
  {
    intakeRoller = new Spark(6);
    addChild("IntakeRoller", intakeRoller);
    intakeRoller.setInverted(false); 
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new IntakeBall());
  }

  public void takeBallIn()
  {
   intakeRoller.set(intakeSpeed);
  }

  public void unLoadBall()
  {
   intakeRoller.set(-intakeSpeed);
  }

  public void stop()
  {
   intakeRoller.set(0);
  }
}
