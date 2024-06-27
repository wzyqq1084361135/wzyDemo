package cn.wolfcode.controller;

import cn.wolfcode.service.impl.IEmployeeService;
import cn.wolfcode.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeList;

    @RequestMapping("/list")
    public Result list() {
        return Result.success(employeeList.list());
    }
}
