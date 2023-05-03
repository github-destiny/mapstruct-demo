package cn.nero.service;

import cn.nero.converter.UserConverter;
import cn.nero.domain.UserBO;
import cn.nero.infrastructure.po.UserPO;
import cn.nero.infrastructure.utils.UserUtils;
import org.springframework.stereotype.Service;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @Date 2023/4/30
 */
@Service
public class UserService {

    public UserBO getOneUser(Long userId){
        UserPO userPo = UserUtils.getOneUser(userId);
        // todo mapstruct userPo -> userBo
        return UserConverter.INSTANCE.fromPO(userPo);
    }

}
