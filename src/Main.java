public class Main {
    public static void main (String [] args){

        Singer singer= new Singer ();
        singer.name ="Petya";
        singer.age = 8;
        singer.rating =3;
        singer.sing("God morning");

        System.out.println(singer);

        Singer singer2= new Singer ();
        singer2.name ="Anya";
        singer2.age = 24;
        singer2.rating = 5;

        System.out.println(singer2);






    }


}
