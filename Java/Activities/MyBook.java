package activities;

public class MyBook extends Book{
    @Override
    void setTitle(String str) {
        title = str;
    }
    public static  void main(String[] args){
        MyBook newNovel = new MyBook();
        newNovel.setTitle("The Secret");
        System.out.println(newNovel.getTitle());
    }
}
