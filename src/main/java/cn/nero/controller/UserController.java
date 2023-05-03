package cn.nero.controller;

import cn.nero.converter.UserConverter;
import cn.nero.domain.UserBO;
import cn.nero.service.UserService;
import cn.nero.vo.UserVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @Date 2023/4/30
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping("/get/{userId}")
    public UserVO getOneUser(@PathVariable("userId") Long userId){
        UserBO userBo = userService.getOneUser(userId);
        return UserConverter.INSTANCE.fromBO(userBo);
    }

}
