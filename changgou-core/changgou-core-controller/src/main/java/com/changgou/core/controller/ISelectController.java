package com.changgou.core.controller;

import entity.Result;

import java.util.List;

/**
 * 描述
 *
 * @author www.itheima.com
 * @version 1.0
 * @package com.changgou.core.controller *
 * @since 1.0
 */
public interface ISelectController<T> {

    Result<List<T>> findAll();
}
