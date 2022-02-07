public class Album {
    public String title;//поле глобальное
    public int releaseYear;// поле глобальное
    public Singer singer;// поле глобальное

    public Album ( String title,int releaseYear,Singer singer){
        this.title=title;
        this.releaseYear=releaseYear;
        this.singer=singer;

    }
    public String toString (){
        return " Песня " + title  + " Год релиза " + releaseYear +  singer + " певец";
    }
}
