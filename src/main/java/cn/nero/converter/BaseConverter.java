package cn.nero.converter;

import cn.nero.domain.BaseBO;
import cn.nero.vo.BaseVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @Date 2023/4/30
 */
@Mapper
public interface BaseConverter {

    BaseConverter INSTANCE = Mappers.getMapper(BaseConverter.class);

    /**
     * xxx
     * @param baseBO bo
     * @return vo
     */
    BaseVO fromBO(BaseBO baseBO);

}
