package pattern.proxy.staticProxy;

public class Agent implements Person {
    private Person singer;

    public Agent(Person singer) {
        this.singer = singer;
    }

    @Override
    public void sing() {
        System.out.println("卖门票....");
        singer.sing();
        System.out.println("清理会场");
    }
}
