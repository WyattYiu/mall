package com.changgou.core.controller;

/**
 * 描述
 *
 * @author www.itheima.com
 * @version 1.0
 * @package com.changgou.core.controller *
 * @since 1.0
 */
public interface ICoreController<T>
        extends
        IInserController<T>,
        ISelectController<T>,
        IDeleteController<T>,
        IUpdateController<T>{

}
