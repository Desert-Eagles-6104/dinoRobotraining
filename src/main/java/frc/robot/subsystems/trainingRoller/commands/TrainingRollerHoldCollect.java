package frc.robot.subsystems.trainingRoller.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;
import frc.robot.constants.Constants.TrainingRollerConstants;
import frc.robot.subsystems.trainingRoller.TrainingRoller;

public class TrainingRollerHoldCollect extends Command {
	private final TrainingRoller roller;

	public TrainingRollerHoldCollect() {
		this.roller = RobotContainer.getInstance().trainingRoller.orElseThrow();
		addRequirements(roller);
	}

	@Override
	public void execute() {
		roller.setPercentOutput(TrainingRollerConstants.TRAINING_OUTPUT, false);
	}

	@Override
	public void end(boolean interrupted) {
		roller.disableMotors();
	}
}
