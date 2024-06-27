package cn.wolfcode.controller;

import cn.wolfcode.pojo.Employee;
import cn.wolfcode.utils.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ResponseController {

    @RequestMapping("/list")
    public String list(Model model) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L,"will","123","will@qq.com",17 ));
        employees.add(new Employee(2L,"alex","123","alex@qq.com",18 ));
        model.addAttribute("employees", employees);
        return "list";
    }




    @RequestMapping("/hello111")
    @ResponseBody
    public Result str(){
        return Result.success("hello");
    }

    @RequestMapping("/resp")
    @ResponseBody
    public Result resp(){
        return Result.success(new Employee(1L,"zs","123","123@qq.com",18));
    }

    @RequestMapping("/resp2")
    @ResponseBody
    public Result resp2(){
        return Result.success();
    }

    @RequestMapping("/resp3")
    @ResponseBody
    public Result resp3(){
        List<Object> list = new ArrayList<>();
        list.add(new Employee(1L, "will", "123", "wilssl@qq.com", 12));
        list.add(new Employee(12L, "w22ill", "123", "widdll@qq.com", 12));
        list.add(new Employee(123L, "wiewll", "123", "wddill@qq.com", 12));
        return Result.success(list);
    }







}
