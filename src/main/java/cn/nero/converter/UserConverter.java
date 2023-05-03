package cn.nero.converter;

import cn.nero.domain.GenderEnum;
import cn.nero.domain.SchoolBO;
import cn.nero.domain.UserBO;
import cn.nero.infrastructure.po.UserPO;
import cn.nero.vo.UserVO;
import com.alibaba.fastjson2.JSON;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @Date 2023/4/30
 */
@Mapper(imports = {
        GenderEnum.class,
        JSON.class,
        SchoolBO.class,
        String.class
})
public interface UserConverter {

    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    /**
     * converter bo to vo
     * @param userBO bo
     * @return vo
     */
    @Mapping(target = "balance", numberFormat = "$#.00")
    @Mapping(target = "gender", expression = "java(userBO.getGender().getGender())")
    UserVO fromBO(UserBO userBO);

    /**
     * from po convert to bo
     * @param userPO po
     * @return bo
     */
    @Mapping(target = "gender", expression = "java(GenderEnum.fromCode(userPO.getGender()))")
    @Mapping(target = "school", expression = "java(JSON.parseObject(userPO.getSchool(), SchoolBO.class))")
    @Mapping(target = "hobbies", expression = "java(JSON.parseArray(userPO.getHobbies()).toJavaList(String.class))")
    UserBO fromPO(UserPO userPO);

}
