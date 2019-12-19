package com.changgou.core.service;

/**
 * 描述
 *
 * @author www.itheima.com
 * @version 1.0
 * @package com.changgou.core *
 * @since 1.0
 */
public interface InsertService<T> {
    /**
     * 添加
     * @param record
     * @return
     */
    int insert(T record);

}
