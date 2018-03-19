import mayflower.*;

public class Box extends Actor
{
    private int value =2;
    public Box()
    {
        setImage("images/blackBox.jpg");

    }

    public int getValue()
    {
        return value;
    }

    public void act()
    {
        if(Mayflower.isKeyPressed(Keyboard.KEY_UP))
        {
            setLocation(getX(),getY()-5);
        }
        if(Mayflower.isKeyPressed(Keyboard.KEY_DOWN))
        {
            setLocation(getX(),getY()+5);
        }
        if(Mayflower.isKeyPressed(Keyboard.KEY_LEFT))
        {
            setLocation(getX()-5,getY());
        }
        if(Mayflower.isKeyPressed(Keyboard.KEY_RIGHT))
        {
            setLocation(getX()+5,getY());
        }

        
    }
}
