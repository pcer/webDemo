package spring;

import org.springframework.stereotype.Component;

/**
 * Created by Pitcher on 2017/9/3 0003
 * Email:943990494@qq.com
 * 自动注入
 */
@Component("autoDojo")
public class AutoDojo {
    private String a;
    public void auto(){
        System.out.println("auto");
    }
}
