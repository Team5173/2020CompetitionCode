package frc.robot;

//WPILib imports FRC
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.XboxController;

//Rev Robotics Imports
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;;

public class Robot extends TimedRobot {
  //Declaration of the drive 
  private DifferentialDrive Robot;

  //Declaration of the XBOX controller
  private XboxController controller;

  //Declaration of the Spark Max's
  private CANSparkMax left;
  private CANSparkMax right;

  public void robotInit() {

    //Implementation of the Spark Max's
    left = new CANSparkMax(1, MotorType.kBrushless);
    right = new CANSparkMax(2, MotorType.kBrushless);

    //Implementation of the drive
    Robot = new DifferentialDrive(left, right);

    //Implementation of the Xbox Controller
    controller = new XboxController(0);
    
  }

  public void teleopPeriodic() {
    /*How the robot uses the joystick inputs
    To change the speed, change or add a decimal number after the () * by doing something like this: Robot.tankDrive(controller.getRawAxis(0) * 0.7, controller.getRawAxis(1) * 0.7);
    To invert the direction of your forward and backwards, do the same thing but make the decimal negative: Robot.tankDrive(controller.getRawAxis(0) * -0.7, controller.getRawAxis(1) * -0.7);
    */

    Robot.tankDrive(controller.getRawAxis(0), controller.getRawAxis(1));

  }
}
