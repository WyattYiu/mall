package com.changgou.core.controller;


import entity.Result;

/**
 * 描述
 *
 * @author www.itheima.com
 * @version 1.0
 * @package com.changgou.core.controller *
 * @since 1.0
 */
public interface IInserController<T> {

    Result<T> add(T record);
}
