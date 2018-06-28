package spring;

/**
 * Created by pitcher on 2017/5/12.
 */
public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void say(){
        System.out.println("hello "+name);
    }
}
