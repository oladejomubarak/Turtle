
package turtle;

import static turtle.Direction.*;

public class Turtle {
    private Direction currentDirection = EAST;
    private TurtlePosition currentPosition = new TurtlePosition(0,0);

    private boolean isPenUp;
    public void penUp() {
        isPenUp = true;
    }

    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if(currentDirection == EAST) face(SOUTH);
        else if(currentDirection == SOUTH) face(WEST);
        else if(currentDirection == WEST) face(NORTH);
        else if(currentDirection == NORTH) face(EAST);
    }

    private void face(Direction newDirection) {
        currentDirection = newDirection;
    }

    public void turnLeft() {
        if(currentDirection == EAST) face(NORTH);
        else if(currentDirection == NORTH) face(WEST);
        else if(currentDirection == WEST) face(SOUTH);
        else if(currentDirection == SOUTH) face(EAST);
    }

    public TurtlePosition getCurrentPosition() {
        return currentPosition;
    }

    public void move(int numberOfSteps) {
        if(currentDirection == EAST){
            currentPosition.setColumn(currentPosition.getColumn() + numberOfSteps);
        }
    }

}

