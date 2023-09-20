import org.code.neighborhood.*;
public class Spiral2 extends Spiral{
//is the amount the painter has to go so no lines over laps
int width = 31;
//moves the painter width amount of times
  public void movement2(){
    int ii = 0;
    while (width != ii) {
      ii++;
      paint("white");
      move();
    }
  }
/*
  turnWidth2 makes it so the next line does not touch another line
  It makes it look like a spiral
*/
  public void turnWidth2() {
    turnRight();
    width--;
    int ii = 0;
  }
  //turns right without removing the width
  public void turn2() {
    turnRight();
    int ii = 0;
  }
//puts all the movement together to make it look cleaner
public void allMove2() {
  movement2();
  turnWidth2();
  movement2();
  turnWidth2();
}
//Puts everything together to make the painter go in the right order
public void moves2() {
  
    int ii = 0;
    movement2();
    turn2();
    movement2();
    turnWidth2();

    allMove2();
//makes the loop only go seven times
  while (ii < 14) {
    ii++;
    allMove2();
  }
  paint("white");
  }

}