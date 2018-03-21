import mayflower.*;

import java.util.List;

public class Tile extends Actor{
    private int value;

    private Timer movementDelay = new Timer();


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
    public boolean canCombine(String direction){
        List<Tile> neighbors = getNeighbors(65,false,Tile.class);
        for(int i = 0; i < neighbors.size();i++){
            //if tile is to the right
            if(direction.toLowerCase().equals("right")) {
                if (this.getX() + 65 == neighbors.get(i).getX()) {
                    if (this.getValue() == neighbors.get(i).getValue()) {
                        return true;
                    }
                }
            }
            //if tile is to the left
            if(direction.toLowerCase().equals("left")) {
                if (this.getX() - 65 == neighbors.get(i).getX()) {
                    if (this.getValue() == neighbors.get(i).getValue()) {
                        return true;
                    }
                }
            }
            //if tile is below
            if(direction.toLowerCase().equals("down")) {
                if (this.getY() + 65 == neighbors.get(i).getY()) {
                    if (this.getValue() == neighbors.get(i).getValue()) {
                        return true;
                    }
                }
            }
            //if tile is above
            if(direction.toLowerCase().equals("up")) {
                if (this.getY() + 65 == neighbors.get(i).getY()) {
                    if (this.getValue() == neighbors.get(i).getValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public void act() {
        if(Mayflower.isKeyPressed(Keyboard.KEY_UP) && !Mayflower.isKeyDown(Keyboard.KEY_DOWN) && !Mayflower.isKeyDown(Keyboard.KEY_LEFT) && !Mayflower.isKeyDown(Keyboard.KEY_RIGHT))
        {
            while(getY() > 0)
            {

                movementDelay.set(10000);
                if(movementDelay.isDone())
                    setLocation(getX(), getY() - 65);
            }

        }
        if(Mayflower.isKeyPressed(Keyboard.KEY_DOWN) && !Mayflower.isKeyDown(Keyboard.KEY_UP) && !Mayflower.isKeyDown(Keyboard.KEY_LEFT) && !Mayflower.isKeyDown(Keyboard.KEY_RIGHT))
        {
            while(getY() < 665)
            {

                movementDelay.set(10000);
                if(movementDelay.isDone())
                    setLocation(getX(), getY() + 65);
            }

        }
        if(Mayflower.isKeyPressed(Keyboard.KEY_LEFT) && !Mayflower.isKeyDown(Keyboard.KEY_DOWN) && !Mayflower.isKeyDown(Keyboard.KEY_UP) && !Mayflower.isKeyDown(Keyboard.KEY_RIGHT))
        {
            while(getX() > 0)
            {

                movementDelay.set(10000);
                if(movementDelay.isDone())
                    setLocation(getX()-65,getY());
            }

        }
        if(Mayflower.isKeyPressed(Keyboard.KEY_RIGHT) && !Mayflower.isKeyDown(Keyboard.KEY_DOWN) && !Mayflower.isKeyDown(Keyboard.KEY_LEFT) && !Mayflower.isKeyDown(Keyboard.KEY_UP))
        {
            while(getX() < 665)
            {

                movementDelay.set(10000);
                if(movementDelay.isDone())
                    setLocation(getX()+65,getY());
            }
        }


    }

}
