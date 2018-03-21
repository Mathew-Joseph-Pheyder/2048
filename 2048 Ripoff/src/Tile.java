import mayflower.Actor;
import mayflower.Keyboard;
import mayflower.Mayflower;

public class Tile extends Actor{
    private int value;
    private int[] controls;
    public Tile(int num){
        value = num;
        controls = new int[4];
        controls[0] = Keyboard.KEY_UP;
        controls[1] = Keyboard.KEY_DOWN;
        controls[2] = Keyboard.KEY_LEFT;
        controls[3] = Keyboard.KEY_RIGHT;
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
        if(Mayflower.isKeyPressed(Keyboard.KEY_UP) && !Mayflower.isKeyDown(Keyboard.KEY_DOWN) && !Mayflower.isKeyDown(Keyboard.KEY_LEFT) && !Mayflower.isKeyDown(Keyboard.KEY_RIGHT))
        {
            if(getY() > 0) setLocation(getX(), getY() - 65);

        }
        if(Mayflower.isKeyPressed(Keyboard.KEY_DOWN) && !Mayflower.isKeyDown(Keyboard.KEY_UP) && !Mayflower.isKeyDown(Keyboard.KEY_LEFT) && !Mayflower.isKeyDown(Keyboard.KEY_RIGHT))
        {
            if(getY() < 665) setLocation(getX(), getY() + 65);

        }
        if(Mayflower.isKeyPressed(Keyboard.KEY_LEFT) && !Mayflower.isKeyDown(Keyboard.KEY_DOWN) && !Mayflower.isKeyDown(Keyboard.KEY_UP) && !Mayflower.isKeyDown(Keyboard.KEY_RIGHT))
        {
            if(getX() > 0) setLocation(getX()-65,getY());
        }
        if(Mayflower.isKeyPressed(Keyboard.KEY_RIGHT) && !Mayflower.isKeyDown(Keyboard.KEY_DOWN) && !Mayflower.isKeyDown(Keyboard.KEY_LEFT) && !Mayflower.isKeyDown(Keyboard.KEY_UP))
        {
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
            setLocation(getX()+65,getY());
        }


    }
}
