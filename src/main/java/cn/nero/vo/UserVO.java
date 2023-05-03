package cn.nero.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @Date 2023/4/30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class UserVO implements Serializable {

    private Long id;

    private String name;

    private Integer age;

    private String gender;

    private SchoolVO school;

    private String balance;

    private List<String> hobbies;



}
