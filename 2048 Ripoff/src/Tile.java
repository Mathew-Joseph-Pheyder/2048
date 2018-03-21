import mayflower.*;
public class Tile extends Actor{
    private int value;
<<<<<<< HEAD
=======
    private int[] controls;
<<<<<<< HEAD
>>>>>>> parent of 77804f2... boxes move to edge and theres a timer for movement now.
=======
>>>>>>> parent of 77804f2... boxes move to edge and theres a timer for movement now.
    public Tile(int num){
        value = num;
        if(num == 2){
            System.out.println("2 added");
            setImage("rsrc/2tile.png");
        }
        else if(num == 4){
            setImage("rsrc/4tile.png");
        }
        else if(num == 8){
            setImage("rsrc/8tile.png");
        }
        else if(num == 16){
            setImage("rsrc/16tile.png");
        }
        else if(num == 32){
            setImage("rsrc/32tile.png");
        }
        else if(num == 64){
            setImage("rsrc/64tile.png");
        }
        else if(num == 128){
            setImage("rsrc/128tile.png");
        }
        else if(num == 256){
            setImage("rsrc/256tile.png");
        }
        else if(num == 512){
            setImage("rsrc/512tile.png");
        }
        else if(num == 1024){
            setImage("rsrc/1024tile.png");
        }
    }
    public int getValue(){
        return value;
    }
    public void act() {
<<<<<<< HEAD
=======
        if(Mayflower.isKeyPressed(Keyboard.KEY_UP) && !Mayflower.isKeyDown(Keyboard.KEY_DOWN) && !Mayflower.isKeyDown(Keyboard.KEY_LEFT) && !Mayflower.isKeyDown(Keyboard.KEY_RIGHT))
        {
            if(getY() > 0) setLocation(getX(), getY() - 65);
<<<<<<< HEAD
>>>>>>> parent of 77804f2... boxes move to edge and theres a timer for movement now.
=======
>>>>>>> parent of 77804f2... boxes move to edge and theres a timer for movement now.

        if(Mayflower.isKeyPressed(Keyboard.KEY_UP))
        {
            setLocation(getX(),getY()-65);
        }
        if(Mayflower.isKeyPressed(Keyboard.KEY_DOWN))
        {
<<<<<<< HEAD
<<<<<<< HEAD
            setLocation(getX(),getY()+65);
=======
=======
>>>>>>> parent of 77804f2... boxes move to edge and theres a timer for movement now.
            if(getY() < 665) setLocation(getX(), getY() + 65);

>>>>>>> parent of 77804f2... boxes move to edge and theres a timer for movement now.
        }
        if(Mayflower.isKeyPressed(Keyboard.KEY_LEFT))
        {
<<<<<<< HEAD
<<<<<<< HEAD
            setLocation(getX()-65,getY());
=======
            if(getX() > 0) setLocation(getX()-65,getY());
>>>>>>> parent of 77804f2... boxes move to edge and theres a timer for movement now.
=======
            if(getX() > 0) setLocation(getX()-65,getY());
>>>>>>> parent of 77804f2... boxes move to edge and theres a timer for movement now.
        }
        if(Mayflower.isKeyPressed(Keyboard.KEY_RIGHT))
        {
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> parent of 77804f2... boxes move to edge and theres a timer for movement now.
            if(getX() < 665) setLocation(getX()+65,getY());
        }

        if(Mayflower.isKeyPressed(Keyboard.KEY_UP))
        {
            setLocation(getX(),getY()-65);
        }
        if(Mayflower.isKeyPressed(Keyboard.KEY_DOWN))
        {
            setLocation(getX(),getY()+65);
        }
        if(Mayflower.isKeyPressed(Keyboard.KEY_LEFT))
        {
            setLocation(getX()-65,getY());
        }
        if(Mayflower.isKeyPressed(Keyboard.KEY_RIGHT))
        {
<<<<<<< HEAD
>>>>>>> parent of 77804f2... boxes move to edge and theres a timer for movement now.
=======
>>>>>>> parent of 77804f2... boxes move to edge and theres a timer for movement now.
            setLocation(getX()+65,getY());
        }


    }
}
