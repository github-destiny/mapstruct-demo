package cn.nero.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @Date 2023/4/30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class TypeVO implements Serializable {

    private Long id;

    private String createTime;


}
