package cn.nero.domain;

import lombok.Getter;

import java.util.Arrays;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @Date 2023/4/30
 */
public enum GenderEnum {

    /**
     * 性别
     */
    MALE(1, "男"),
    FEMALE(0, "女")
    ;

    @Getter
    private Integer code;

    @Getter
    private String gender;

    GenderEnum(Integer code, String gender) {
        this.code = code;
        this.gender = gender;
    }

    public static GenderEnum fromCode(Integer code){
        return Arrays.stream(GenderEnum.class.getEnumConstants()).filter(it -> it.getCode().equals(code)).findFirst().orElse(null);
    }
}
