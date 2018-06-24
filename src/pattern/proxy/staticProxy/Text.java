package pattern.proxy.staticProxy;

public class Text {
    public static void main(String[] args) {
        Person singer = new Singer();
        Person person = new Agent(singer);
        person.sing();
    }
}
