import java.util.ArrayList;

public class albums {

    public static void main(String[] args) {
//        ***THIS IS MY ORIGINAL ARRAY THAT IS THE BASE FOR MY ARRAYLIST***

//        String [] artists = {"Drake", "SZA", "Cassie", "Kendrick Lamar"};
//        String[] albums = {"'Honestly,Nevermind'", "'Ctrl'", "'Cassie'", "'Mr. Morale and the Big Steppers'"};
//        System.out.println("My favorite album is "+albums[3]+ " by " +artists[3]+ "!");

        ArrayList<String>albums = new ArrayList<String>();
        albums.add("'Honestly,Nevermind'");
        albums.add("'Ctrl'");
        albums.add("'Cassie");
        albums.add("'Mr.Morale and the Big Steppers'");

        ArrayList<String>artists = new ArrayList<String>();
        artists.add("Drake");
        artists.add("SZA");
        artists.add("Cassie");
        artists.add("Kendrick Lamar");
        

        System.out.println("My favorite albums are " +albums);
        System.out.println("My artists are " +artists);

    }
}