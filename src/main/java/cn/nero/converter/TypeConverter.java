package cn.nero.converter;

import cn.nero.domain.TypeBO;
import cn.nero.vo.TypeVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @Date 2023/4/30
 */
@Mapper
public interface TypeConverter {

    TypeConverter INSTANCE = Mappers.getMapper(TypeConverter.class);

    /**
     * xxx
     * @param bo bo
     * @return vo
     * yyyy-MM-dd HH:mm:ss
     */
    @Mapping(source = "bo.createTime", target = "createTime", dateFormat = "yyyy-MM-dd HH:mm:ss")
    TypeVO fromBO(TypeBO bo);

}
