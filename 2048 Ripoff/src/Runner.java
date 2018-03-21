import mayflower.*;

public class Runner extends Mayflower
{
    public void init()
    {

    }

    public Runner()
    {
        super("2048",786,808);
        Mayflower.setWorld(new Grid());
    }

    public static void main(String[] args)
    {
        Runner runner = new Runner();
    }
}
