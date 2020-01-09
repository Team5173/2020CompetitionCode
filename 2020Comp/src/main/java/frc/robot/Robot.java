package frc.robot;

//WPILib imports FRC
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.XboxController;

//Rev Robotics Imports
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;;

public class Robot extends TimedRobot {
  private DifferentialDrive Robot;
  private XboxController controller;

  private CANSparkMax left;
  private CANSparkMax right;

  public void robotInit() {
    left = new CANSparkMax(1, MotorType.kBrushless);
    right = new CANSparkMax(2, MotorType.kBrushless);

    Robot = new DifferentialDrive(left, right);
    controller = new XboxController(0);
  }

  public void teleopPeriodic() {
    Robot.tankDrive(controller.getRawAxis(0), controller.getRawAxis(1));
  }
}
