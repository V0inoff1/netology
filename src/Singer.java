public class Singer {
    public static int maxRating = 0; //поле глобальное

    public String name;//поле глобальное
    public int age;// поле глобальное
    public int rating;// поле глобальное

    public Singer (String name,int age,int rating){//конструктор
        this.name = name;
        this.age = age;
        this.rating = rating;
        maxRating= Math.max(maxRating,rating);
    }
    //конструктор для ситуации, когда мы не ввели рейтинг, но хотим выводить по умолчанию рейтинг 3
    public Singer (String name,int age){
        this(name,age, 3 );// пишем, что мы передаем конструктору, какие поля
//        this.name = name;
//        this.age = age;
//        this.rating = 3;
    }

    public void sing (String verse){
        System.out.println(" Я," + name + ", пою тебе: "+ verse );
    }
    public boolean isTooYoung (){
        if (age < 10 ){
            return true;
        } else {
            return false;
        }
    }


    public String toString (){
        return "[" + rating + "]" + name + "( " + age + " лет)";
    }
}
