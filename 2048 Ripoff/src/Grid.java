import mayflower.*;

public class Grid extends World
{
    int[][]Bmap = new int[4][4];
    public Grid()
    {
        for(int i=0;i<Bmap.length;i++)
            for(int j=0;j<Bmap[0].length;j++)
                addObject(new Background(),i*65,j*65);

      addObject(new Tile(2,"two"),66 ,66);
      addObject(new Tile(4,"four"),66 ,196);

    }

    public void act()
    {

    }

}
