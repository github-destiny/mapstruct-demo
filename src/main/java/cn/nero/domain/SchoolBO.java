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
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SchoolBO implements Serializable {

    private Long id;

    private String name;

    private String city;

    private String province;

    private String area;

    private String address;

}
