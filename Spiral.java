import org.code.neighborhood.*;
public class Spiral extends PainterPlus{
//is the amount the painter has to go so no lines over laps
  int width = 30;
//moves the painter width amount of times
  public void movement(){
    int ii = 0;
    while (width != ii) {
      ii++;
      paint("black");
      move();
    }
  }

/*
  turnWidth makes it so the next line does not touch another line
  It makes it look like a spiral
*/
  public void turnWidth() {
    turnRight();
    width--;
    int ii = 0;
  }
//turns the painter so it will be close to the wall next time
  public void turn() {
    turnRight();
    int ii = 0;
  }
//puts all the movement together to make it look cleaner
public void allMove() {
  movement();
  turnWidth();
  movement();
  turnWidth();
}

//puts everything together so the painter moves in the right way
public void moves() {
    int ii = 0;
    movement();
    turn();
    movement();
    turnWidth();
  
    allMove();
//make the loop only go 14 times
  while (ii < 14) {
    ii++;
    allMove();
    }
  paint("black");
  }
}