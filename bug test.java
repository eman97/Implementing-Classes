
public class BugTest
{
      public static void main(String args[])
      {
      
        Bug bugsy = new Bug(10);
        bugsy.move(); // Now the position is 11
        bugsy.turn();
        bugsy.move(); // Now the position is 10
        System.out.println("The Position is " + bugsy.getPosition());
        
    }
}
