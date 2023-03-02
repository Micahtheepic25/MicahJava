package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.TimesliceRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;



public class Robot extends TimedRobot {
    public Robot() {
  }

    // Declare variables here
    WPI_TalonFX motorController = new WPI_TalonFX(11);
    AnalogInput sensor = new AnalogInput(0);
    private WPI_TalonSRX motor = new WPI_TalonSRX(11);


    // Runs once when the robot is first turned on
    @Override
    public void robotInit() {

    }

    @Override
    public void robotPeriodic() {
        CommandScheduler.getInstance().run();
    }

    // Runs once when robot is enabled
    @Override
    public void teleopInit() {
		
    }

    // Runs every 20 milliseconds
    @Override
    public void teleopPeriodic() {
      if (sensor.getValue() < 50)
        motorController.stopMotor();
      else
        motorController.set(0.3);
		
    }

    // Runs once when robot is disabled
    @Override
    public void disabledInit() {
        motorController.stopMotor();
    }
}