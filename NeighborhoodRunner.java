import org.code.neighborhood.*;
public class NeighborhoodRunner {
  public static void main(String[] args) {

//makes a painter and does the stuff in Spiral.java
  Spiral thing = new Spiral();
  thing.moves();
    
/*
  makes a painter moves to the starting position 
  and does the stuff in Spira2.java
*/
  Spiral2 person = new Spiral2();
  person.moveFast();
  person.turnRight();
  person.moves2();
    
  }
}