/**
 * This class demonstrates the sequential search with an array of objects.
 *
 * @author Briana Berger
 * @version 04/11/18
 */

public class MusicTesterV1 {
    public static void main(String[] args)
    {
        Music[] playlist = new Music[10];
        
        playlist[0] = new Music("City of Stars", 2016, "La La Land Soundtrack");
        playlist[1] = new Music("Dangelion Hair", 2016, "Joe Brooks");
        playlist[2] = new Music("Hopeful", 2018, "Adam Barnes");
        playlist[3] = new Music("Atlas: Heart", 2016, "Sleeping At Last");
        playlist[4] = new Music("Let It Go", 2015, "James Bay");
        playlist[5] = new Music("White Summer Dress", 2017, "Taylor John Williams");
        playlist[6] = new Music("I Like You", 2017, "Olive James");
        playlist[7] = new Music("We Dance", 2014, "Cody Fry");
        playlist[8] = new Music("Wild Love", 2018, "James Bay");
        playlist[9] = new Music("Catch Me", 2009, "Demi Lovato");
 
        printPlaylist(playlist);
        
        System.out.println("\n\nSearching for 'White Summer Dress': ");
        findTitle(playlist, "White Summer Dress");
        
        System.out.println("\n\nSearching for 'Despacito': ");
        findTitle(playlist, "Despacito");
        
        System.out.println("\n\nSearching for 2016 Songs: ");
        findYear(playlist, 2016);
        
        System.out.println("\n\nSearching for 1999 Songs: ");
        findYear(playlist, 1999);
        
        System.out.println("\n\nSearching for James Bay songs: ");
        findArtist(playlist, "James Bay");
        
        System.out.println("\n\nSearching for Selena Gomez songs: ");
        findArtist(playlist, "Selena Gomez");
    }
   
    public static void printPlaylist(Music[] r)
    {
        System.out.println("Title                      Year        Artist");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < r.length; i++)
            System.out.println(r[i]);
    }
   
    public static void findTitle(Music[] r, String toFind)
    {
        int found = -1;

        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getTitle().compareTo(toFind) == 0)
            {
                found = i;
                break;   //terminates the for loop 
            }
        }
        
        if(found != -1)
        {  // we have found the title
            System.out.println("We found " + toFind + " in the playlist: ");
            System.out.println(r[found]);
        }
        else
            System.out.println(toFind + " is not in the playlist");
    }
   
    public static void findYear(Music[] r, int toFind)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getYear() == toFind)
            {
                System.out.println(r[i]);
                found++;
            }
        }
        
        if(found == 0)
        {   // we have not found the year
            System.out.println(toFind + " is not in the playlist");
        }
    }
    
    public static void findArtist(Music[] r, String toFind)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getArtist().compareTo(toFind) == 0)
            {
                System.out.println(r[i]);
                found++;
            }
        }
        
        if(found == 0)
        {   // we have not found the year
            System.out.println(toFind + " is not in the playlist");
        }
    }
}
