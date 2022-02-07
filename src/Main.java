public class Main {
    public static void main (String [] args){
        System.out.println (" Макс рейтинг:" + Singer.maxRating);// так как maxRating у нас в статическом методе, нужно указывать его расположение Singer.


        Singer singer= new Singer ("Petya",8);//3);
//        singer.name ="Petya";
//        singer.age = 8;
//        singer.rating =3;
//        singer.sing("God morning");
        System.out.println(singer);
        System.out.println (" Макс рейтинг:" + Singer.maxRating);

//        Singer singer2= new Singer ();
//        singer2.name ="Anya";
//        singer2.age = 24;
//        singer2.rating = 5;
//
//        System.out.println(singer2);

        Singer singer2= new Singer ("Anya",5, 4);
        System.out.println(singer2);
        System.out.println (" Макс рейтинг:" + Singer.maxRating);

        Album album = new Album("Весна",2020,singer);
        System.out.println(album);
    }
}
