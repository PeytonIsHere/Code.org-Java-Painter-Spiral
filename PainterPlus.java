import org.code.neighborhood.*;

public class PainterPlus extends Painter{
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }
  public void moveFast() {
    while (canMove()){
    move();
    }
  }
  public void eatPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }
}