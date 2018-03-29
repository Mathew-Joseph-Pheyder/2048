import mayflower.*;

import java.util.List;

public class Tile extends Actor{
    private int value;
    private String n;
    int curX;
    int curY;
    public Tile(int num)
    {
        this(num,"");
    }
    public Tile(int num, String name){
        n=name;
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




    public boolean hasRight ()
    {
        List<Tile> r = getWorld().getObjectsAt(getX() + 65, getY(), Tile.class);
        if (r.isEmpty())
                return false;
            else
                return true;
    }

    public boolean hasLeft() {
        List<Tile> r = getWorld().getObjectsAt(getX() - 65, getY(), Tile.class);
        if (r.isEmpty())
            return false;
        else
            return true;
    }

    public boolean hasTop() {
        List<Tile> r = getWorld().getObjectsAt(getX(), getY() - 65, Tile.class);
        if (r.isEmpty())
            return false;
        else
            return true;
    }

    public boolean hasBottom() {
        List<Tile> r = getWorld().getObjectsAt(getX(), getY() + 65, Tile.class);
        if (r.isEmpty())
            return false;
        else
            return true;
    }
    


    public void act() {


        /*if (Mayflower.isKeyPressed(Keyboard.KEY_UP)) {
            System.out.println(n);
            //setLocation(getX(),getY()-65);
            while (!hasTop()) {
                if (getY() <= 1) {
                    System.out.println("break");
                    break;
                }
                setLocation(getX(), getY() - 65);
                System.out.println("top");
                System.out.println(getY());
            }

        }
        if (Mayflower.isKeyPressed(Keyboard.KEY_DOWN)) {
            //setLocation(getX(),getY()+65);
            while (!hasBottom()) {
                if (getY() >= 196) {
                    System.out.println("break");
                    break;
                }
                setLocation(getX(), getY() + 65);
                System.out.println("bottom");
                System.out.println("  current x value " + getX());
                System.out.println("  current y value " + getY());
                System.out.println("---------------------------");
            }
        }
        if (Mayflower.isKeyPressed(Keyboard.KEY_LEFT)) {
            //setLocation(getX()-65,getY());
            while (!hasLeft()) {
                if (getX() <= 1) {
                    System.out.println("break");
                    break;
                }
                setLocation(getX() - 65, getY());
                System.out.println("bottom");
                System.out.println("  current x value " + getX());
                System.out.println("  current y value " + getY());

                System.out.println("---------------------------");
            }
        }
        if (Mayflower.isKeyPressed(Keyboard.KEY_RIGHT)) {
            //setLocation(getX()+65,getY());
            while (!hasRight()) {
                if (getX() >= 196) {
                    System.out.println("break");
                    break;
                }
                setLocation(getX() + 65, getY());
                System.out.println("bottom");
                System.out.println("  current x value " + getX());
                System.out.println("  current y value " + getY());
                System.out.println("---------------------------");
            }


        }*/
    }
}




