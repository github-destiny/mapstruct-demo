package cn.nero.infrastructure.utils;

import cn.nero.infrastructure.po.UserPO;
import lombok.experimental.UtilityClass;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @Date 2023/4/30
 */
@UtilityClass
public class UserUtils {

    private static List<UserPO> db(){
        return List.of(
                new UserPO(1L, "张三", 18, 1, "{\"address\":\"盘各庄东街10号\",\"area\":\"大兴区\",\"city\":\"北京市\",\"id\":1,\"name\":\"盘各庄中学\",\"province\":\"北京市\"}", new BigDecimal("100.00"), "['唱', '跳', 'rapper', '练习']"),
                new UserPO(2L, "李四", 19, 0, "{\"address\":\"盘各庄东街10号\",\"area\":\"大兴区\",\"city\":\"北京市\",\"id\":1,\"name\":\"盘各庄中学\",\"province\":\"北京市\"}", new BigDecimal("200.00"), "['唱', '跳']"),
                new UserPO(3L, "王五", 20, 1, "{\"address\":\"盘各庄东街10号\",\"area\":\"大兴区\",\"city\":\"北京市\",\"id\":1,\"name\":\"盘各庄中学\",\"province\":\"北京市\"}", new BigDecimal("300.00"), "['跳', 'rapper', '练习']"),
                new UserPO(4L, "张二麻子", 21, 0, "{\"address\":\"盘各庄东街10号\",\"area\":\"大兴区\",\"city\":\"北京市\",\"id\":1,\"name\":\"盘各庄中学\",\"province\":\"北京市\"}", new BigDecimal("40.00"), "['唱', '跳', 'rapper', '练习']"),
                new UserPO(5L, "赵六", 22, 1, "{\"address\":\"盘各庄东街10号\",\"area\":\"大兴区\",\"city\":\"北京市\",\"id\":1,\"name\":\"盘各庄中学\",\"province\":\"北京市\"}", new BigDecimal("1000.00"), "['唱', '跳', 'rapper', '练习']")
        );
    }

    public static UserPO getOneUser(Long id){
        return db().stream().filter(it -> id.equals(it.getId())).findFirst().orElse(null);
    }

    public static List<UserPO> getUserList(){
        return db();
    }

}
