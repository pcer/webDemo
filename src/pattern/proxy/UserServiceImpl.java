package pattern.proxy;

/**
 * 目标对象
 */
public class UserServiceImpl implements IUserService {
    @Override
    public void add() {
        System.out.println("--------------------add---------------");
    }
}
