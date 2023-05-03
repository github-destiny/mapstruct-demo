package cn.nero.converter;

import cn.nero.domain.FieldDifferentBO;
import cn.nero.vo.FieldDifferentVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @Date 2023/4/30
 */
@Mapper
public interface FieldNameDifferentConverter {

    FieldNameDifferentConverter INSTANCE = Mappers.getMapper(FieldNameDifferentConverter.class);

    /**
     * convert bo to vo
     * @param bo bo
     * @return vo
     */
    @Mapping(source = "bo.name", target = "userName")
    FieldDifferentVO fromBO(FieldDifferentBO bo);

}
