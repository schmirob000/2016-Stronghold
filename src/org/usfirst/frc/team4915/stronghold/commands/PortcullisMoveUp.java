package org.usfirst.frc.team4915.stronghold.commands;

import org.usfirst.frc.team4915.stronghold.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PortcullisMoveUp extends Command {

    public PortcullisMoveUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        //have arms initialize up 
        while (!RobotMap.portcullisSwitchTop.get()){
            RobotMap.portcullisLeftMasterMotor.set(.6);
        }
        RobotMap.portcullisLeftMasterMotor.set(0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
       
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
