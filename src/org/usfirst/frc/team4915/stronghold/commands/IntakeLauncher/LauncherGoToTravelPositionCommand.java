package org.usfirst.frc.team4915.stronghold.commands.IntakeLauncher;

import org.usfirst.frc.team4915.stronghold.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LauncherGoToTravelPositionCommand extends Command {

    public LauncherGoToTravelPositionCommand() {

    }

    protected void initialize() {
        Robot.intakeLauncher.launcherSetIntakePosition();
    }

    protected void execute() {

    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    
    }

    protected void interrupted() {
    
    }
}
