import mayflower.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Grid extends World {
    private int[][] Bmap = new int[4][4];
    private LinkedList<Tile> tiles = new LinkedList<Tile>();

    private int[][] tileMap = new int[4][4];

    public Grid() {
        for (int i = 0; i < Bmap.length; i++)
            for (int j = 0; j < Bmap[0].length; j++)
                addObject(new Background(), i * 65-1, j * 65-1);


        Random rand = new Random();
        Random rand1 = new Random();
        int xPos = 0;
        int yPos = 0;

        //this.addObject(new Tile(2),66,66);
        //this.addObject(new Tile(4),66,131);
        //this.addObject(new Tile(8),131,66);
        tiles.add(new Tile(2));
        tiles.add(new Tile(4));
        tiles.add(new Tile(8));


        for(int i=0; i<tiles.size();i++)
        {
            xPos = rand.nextInt(3) + 1;
            yPos = rand1.nextInt(3) + 1;
            addObject(tiles.get(i),xPos*65,yPos*65);
            tileMap[yPos][xPos]=1;
        }

        //1 -> added tile


        print2D();
    }

    public void update2D()
    {
        for (int i = 0; i < Bmap.length; i++)
            for (int j = 0; j < Bmap[0].length; j++)
                tileMap[i][j]=0;

        int [] locX = new int[tiles.size()];
        int [] locY = new int[tiles.size()];
        for (int i = 0; i < tiles.size(); i++)
        {
            locX[i]=tiles.get(i).getX()/65;
            locY[i]=tiles.get(i).getY()/65;
            tileMap[locY[i]][locX[i]]=1;
        }
    }
    public void print2D()
    {
        System.out.println("-------------------------------");
        for(int i = 0; i<tileMap.length; i++)
        {
            for(int j = 0; j<tileMap[0].length; j++)
            {
                System.out.print(tileMap[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
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
            update2D();
            print2D();
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
            update2D();
            print2D();
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
            update2D();
            print2D();
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
            update2D();
            print2D();

        }


    }
}
