package slogo.Model.Commands.ConcreteCommands;

import slogo.Model.CommandInfrastructure.CommandDatabase;
import slogo.Model.Commands.Command;

/**
 * Subclass to create a LeftCommand
 *
 * @author Frank Tang
 */
public class And extends Command {
  //moves turtle to an absolute screen position, where (0, 0) is the center of the screen
  //returns the distance turtle moved

  private double returnArgValue;
  private Number firstTerm;
  private Number secondTerm;
  private static final int argumentsNeeded = 2;
  private CommandDatabase database;

  public And(CommandDatabase data) {
    super(data);
    database = data;
  }

  /**
   * Rotates a turtle by a counterclockwise rotation of a degree amount.
   */
  @Override
  public Integer executeAndReturnValue() {
    firstTerm = database.getParameterStack().peek();
    secondTerm = database.getParameterStack().peek();

    if (!firstTerm.equals(0) && !secondTerm.equals(0)) {
      returnArgValue = 1;
    } else {
      returnArgValue = 0;
    }
    System.out.println(returnArgValue);
//    System.out.println("turtle Y " + turtleObject.getTurtleY());

    return (int) this.returnArgValue;
  }


  @Override
  public int getArgumentsNeeded(){
    return this.argumentsNeeded;
  }


}



