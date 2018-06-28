package spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Pitcher on 2017/8/6 0006
 * Email:943990494@qq.com
 */
public class People {
    private String type;   //字符串类型
    private Hello hello;    //对象类型
    private List greedList;     //List类型
    private Map<String, String> gradeMap; //Map类型
    private Boolean flag = true;
    private Integer age;

    private Set favoriteSet;  //set类型

    public Set getFavoriteSet() {
        return favoriteSet;
    }

    public void setFavoriteSet(Set favoriteSet) {
        this.favoriteSet = favoriteSet;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Hello getHello() {
        return hello;
    }

    public List getGreedList() {
        return greedList;
    }

    public void setGreedList(List greedList) {
        this.greedList = greedList;
    }

    public void setHello(Hello hello) {
        this.hello = hello;
    }

    public Map<String, String> getGradeMap() {
        return gradeMap;
    }

    public void setGradeMap(Map<String, String> gradeMap) {
        this.gradeMap = gradeMap;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
