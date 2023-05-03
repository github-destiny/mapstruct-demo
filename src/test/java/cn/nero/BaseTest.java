package cn.nero;

import cn.nero.converter.BaseConverter;
import cn.nero.converter.NewBaseConverter;
import cn.nero.converter.TypeConverter;
import cn.nero.domain.BaseBO;
import cn.nero.domain.TypeBO;
import cn.nero.vo.BaseVO;
import cn.nero.vo.SchoolVO;
import cn.nero.vo.TypeVO;
import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @Date 2023/4/30
 */
@SpringBootTest
@Slf4j
public class BaseTest {

    @Test
    public void test1() {
        log.info(JSON.toJSONString(new SchoolVO(1L, "盘各庄中学", "北京市", "北京市", "大兴区", "盘各庄东街10号")));
    }

    @Test
    public void test2() {
        BaseBO baseBO = new BaseBO();
        baseBO.setId(1L)
                .setGender(true)
                .setName("张三")
                .setLength(Short.valueOf("18"))
                .setBalance(100.00d)
                .setAge(18)
                .setFootLength(42.5f)
                .setFirstCharacterForSurname('z')
                .setStatus(Byte.valueOf("1"));
        BaseVO baseVO = NewBaseConverter.INSTANCE.convertFrom(baseBO);
        log.info(JSON.toJSONString(baseVO));
    }

    @Test
    public void test3() {
        TypeBO bo = new TypeBO();
        bo.setId(1L).setCreateTime(LocalDateTime.now());
        TypeVO typeVO = TypeConverter.INSTANCE.fromBO(bo);
        log.info(JSON.toJSONString(typeVO));

    }

}
