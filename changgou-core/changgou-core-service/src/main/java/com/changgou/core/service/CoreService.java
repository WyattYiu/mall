package com.changgou.core.service;

/**
 * 核心Core 实现CRUD
 *
 * @author www.itheima.com
 * @version 1.0
 * @package com.changgou.core *
 * @since 1.0
 */

public interface CoreService<T> extends
        DeleteService<T>,
        InsertService<T>,
        SelectService<T>,
        UpdateService<T>,
        PagingService<T> {
    /**
     * 批量上传
     * @param ids
     */
    void deleteByIds(Object[] ids);


}
