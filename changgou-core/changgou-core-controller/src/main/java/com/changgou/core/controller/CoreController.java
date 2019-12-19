package com.changgou.core.controller;

import com.changgou.core.service.CoreService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 描述
 *
 * @author www.itheima.com
 * @version 1.0
 * @package com.changgou.core.controller *
 * @since 1.0
 */


public abstract class CoreController<T>
        implements
        ICoreController<T>,
        ISelectController<T> {

    @Autowired
    private CoreService<T> coreService;

    @PostMapping("/add")
    @Override
    public Result<T> add(T record) {
        int insert = coreService.insert(record);
        return new Result<T>(true, StatusCode.OK, "操作成功", insert);
    }

    @GetMapping("/findAll")
    @Override
    public Result<List<T>> findAll() {
        List<T> tList = coreService.selectAll();
        return new Result<List<T>>(true, StatusCode.OK, "操作成功", tList);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public Result<T> deleteById(@PathVariable(name = "id") Object id) {
        int i = coreService.deleteById(id);
        return new Result<T>(true, StatusCode.OK, "操作成功", null);
    }
    @PutMapping("/update/{id}")
    @Override
    public Result update(@RequestBody T record) {
        int i = coreService.updateByPrimaryKey(record);
        return new Result<T>(true, StatusCode.OK, "操作成功", null);
    }
}
