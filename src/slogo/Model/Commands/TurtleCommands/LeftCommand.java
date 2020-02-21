package slogo.Model.Commands.TurtleCommands;

import slogo.Model.Commands.Command;
import slogo.Model.TurtleData;

/**
 * Subclass to create a LeftCommand
 *
 * @author Frank Tang
 */
public class LeftCommand extends Command {

  private TurtleData turtleObject;
  private double turtleHeading;
  private double angleChangeCCW;


  public LeftCommand(TurtleData turtle, double degreeAngleChange) {
    turtleObject = turtle;
    turtleHeading = turtleObject.getTurtleHeading();
    angleChangeCCW = degreeAngleChange;
  }

  /**
   * Rotates a turtle by a counterclockwise rotation of a degree amount.
   */
  public void execute() {
    System.out.println(turtleObject.getTurtleHeading());
    turtleObject.rotateTurtleHeading(angleChangeCCW);
    System.out.println(turtleObject.getTurtleHeading());
  }

}


