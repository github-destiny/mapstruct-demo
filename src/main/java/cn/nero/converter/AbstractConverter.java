package cn.nero.converter;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @Date 2023/5/2
 */
public interface AbstractConverter <T1, T2> {

    T1 convertFrom(T2 t2);

    T2 convertTo(T2 t1);

}
