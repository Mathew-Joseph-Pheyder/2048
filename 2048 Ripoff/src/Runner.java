import mayflower.*;
import mayflower.core.MayflowerKeyboardListener;

public class Runner extends Mayflower
{
    public void init()
    {

    }

    public Runner()
    {
        super("2048",266,288);
        Mayflower.setWorld(new Grid());
        Mayflower.loadMusic("Jim-Yosef-Arrow-NCS-Release.mp3");
        Mayflower.playMusic("Jim-Yosef-Arrow-NCS-Release.mp3");
    }

    public static void main(String[] args)
    {
        Runner runner = new Runner();
    }
}
