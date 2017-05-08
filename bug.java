

public class bug
 {

    int initialPosition; 
    int currentPosition;
      // initialPosition + 1 makes a move to right and initialPosition - 1  makes a move to lift .
    public bug(int initialPosition)
    {
        initialPosition = initialPosition + 1;
    }

    public void turn() 
    {
        System.out.println("Current Position: " + currentPosition);
    }

    public void move()
    {
        currentPosition = initialPosition++;
    }

    public int getPosition()
    {
        return currentPosition;
    }
}
