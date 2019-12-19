package com.changgou.core.service;

import java.util.List;

/**
 * 描述
 *
 * @author www.itheima.com
 * @version 1.0
 * @package com.changgou.core *
 * @since 1.0
 */
public interface SelectService<T> {

    public List<T> selectAll();

    public T findOne(Object id);

    public List<T> select(T record);
}
