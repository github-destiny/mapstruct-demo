package cn.nero.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @Date 2023/4/30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class BaseBO implements Serializable {

    private Byte status;

    private Short length;

    private Integer age;

    private Long id;

    private Float footLength;

    private Double balance;

    private Boolean gender;

    private Character firstCharacterForSurname;

    private String name;

}
