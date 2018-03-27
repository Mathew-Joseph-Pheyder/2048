import mayflower.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Grid extends World {
    private int[][] Bmap = new int[4][4];
    private LinkedList<Tile> tiles = new LinkedList<Tile>();

    public Grid() {
        for (int i = 0; i < Bmap.length; i++)
            for (int j = 0; j < Bmap[0].length; j++)
                addObject(new Background(), i * 65, j * 65);

        Random rand = new Random();
        int xPos = 0;
        int yPos = 0;

        tiles.add(new Tile(2));
        tiles.add(new Tile(4));
        for (int i = 0; i < tiles.size(); i++)
        {
            xPos = rand.nextInt(3) + 1;
            yPos = rand.nextInt(3) + 1;
            xPos = xPos*65;
            yPos = yPos*65;
            addObject(tiles.get(i), xPos, yPos);
        }

    }
    public void act()
    {
        if (Mayflower.isKeyPressed(Keyboard.KEY_UP) && (!Mayflower.isKeyDown(Keyboard.KEY_DOWN) && !Mayflower.isKeyDown(Keyboard.KEY_LEFT) && !Mayflower.isKeyDown(Keyboard.KEY_RIGHT)))
        {
            for (int i = 0; i < tiles.size(); i++)
            {
                while ((tiles.get(i).getY() > 0) && !tiles.get(i).hasTop())
                {
                    tiles.get(i).setLocation(tiles.get(i).getX(), tiles.get(i).getY() - 65);
                }
            }
        }

        if (Mayflower.isKeyPressed(Keyboard.KEY_DOWN) && (!Mayflower.isKeyDown(Keyboard.KEY_UP) && !Mayflower.isKeyDown(Keyboard.KEY_LEFT) && !Mayflower.isKeyDown(Keyboard.KEY_RIGHT)))
        {
            for (int i = 0; i < tiles.size(); i++)
            {
                while ((tiles.get(i).getY() < 132) && !tiles.get(i).hasBottom())
                {
                    tiles.get(i).setLocation(tiles.get(i).getX(), tiles.get(i).getY() + 65);
                }
            }
        }

        if (Mayflower.isKeyPressed(Keyboard.KEY_LEFT) && (!Mayflower.isKeyDown(Keyboard.KEY_DOWN) && !Mayflower.isKeyDown(Keyboard.KEY_UP) && !Mayflower.isKeyDown(Keyboard.KEY_RIGHT)))
        {
            for (int i = 0; i < tiles.size(); i++)
            {
                while ((tiles.get(i).getX() > 0)&& !tiles.get(i).hasLeft())
                {
                    tiles.get(i).setLocation(tiles.get(i).getX()- 65, tiles.get(i).getY() );
                }
            }
        }

        if (Mayflower.isKeyPressed(Keyboard.KEY_RIGHT) && (!Mayflower.isKeyDown(Keyboard.KEY_DOWN) && !Mayflower.isKeyDown(Keyboard.KEY_UP) && !Mayflower.isKeyDown(Keyboard.KEY_LEFT)))
        {
            for (int i = 0; i < tiles.size(); i++)
            {
                while ((tiles.get(i).getX() < 132)&& !tiles.get(i).hasRight())
                {
                    tiles.get(i).setLocation(tiles.get(i).getX()+ 65, tiles.get(i).getY() );
                }
            }
        }


    }
}
