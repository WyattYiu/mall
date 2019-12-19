package com.changgou.core.controller;

import entity.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 描述
 *
 * @author www.itheima.com
 * @version 1.0
 * @package com.changgou.core.controller *
 * @since 1.0
 */
public interface IUpdateController<T> {
    /**
     *
     * @param record 更新的对象注意需要有主键才可以更新
     * @return
     */
    public Result update(T record);
}
