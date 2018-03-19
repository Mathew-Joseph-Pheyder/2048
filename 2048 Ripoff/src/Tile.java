import mayflower.*;
public class Tile extends Actor{
    public Tile(int num){
        if(num == 2){
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
    
    public void act() {

    }
}
