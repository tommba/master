public class Main {
    public static void main(String[] args)
{
    Cow observable = new Cow();
    NewPlayer observer = new NewPlayer();
    observable.addObserver(observer);
    observable.setName("name");
    assertEquals(observer.getName(), "name");
}
}
