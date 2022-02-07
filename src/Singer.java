public class Singer {
    public String name;//поле
    public int age;// поле
    public int rating;// поле

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
