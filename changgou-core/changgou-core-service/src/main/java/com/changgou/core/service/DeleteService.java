package com.changgou.core.service;

/**
 * 删除相关
 *
 * @author www.itheima.com
 * @version 1.0
 * @package com.changgou.core *
 * @since 1.0
 */
public interface DeleteService<T> {

    /**
     *
     * @param record
     * @return
     */
    int delete(T record);

    /**
     *
     * @param id
     * @return
     */
    int deleteById(Object id);




}
