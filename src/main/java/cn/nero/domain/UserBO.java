package cn.nero.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @Date 2023/4/30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UserBO implements Serializable {

    private Long id;

    private String name;

    private Integer age;

    private GenderEnum gender;

    private SchoolBO school;

    private BigDecimal balance;

    private List<String> hobbies;

}
