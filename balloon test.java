
public class BallooonTest_P3
{
    public static void main(String args[]) {
      
    Balloon_P3 bal = new Balloon_P3();

     bal.inflate(1);
     bal.inflate(2);
     bal.inflate(3);
     
    double vol= bal.getVolume();
    System.out.println("The Balloon Volumee is " + vol);

    }
}

