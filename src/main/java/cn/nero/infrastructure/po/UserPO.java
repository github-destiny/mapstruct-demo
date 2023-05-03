package cn.nero.infrastructure.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @Date 2023/4/30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class UserPO implements Serializable {

    private Long id;

    private String name;

    private Integer age;

    private Integer gender;

    private String school;

    private BigDecimal balance;

    private String hobbies;


}
