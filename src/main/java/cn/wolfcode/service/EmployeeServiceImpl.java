package cn.wolfcode.service;

import cn.wolfcode.dao.impl.IEmployeeDao;
import cn.wolfcode.pojo.Employee2;
import cn.wolfcode.service.impl.IEmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
//    @Autowired
    @Resource(name = "employeeDaoImpl")
    private IEmployeeDao employeeDao;

    @Override
    public List<Employee2> list() {
        List<Employee2> employee2List = employeeDao.selectAll();

        for (Employee2 employee2 : employee2List) {
            employee2.setImage("/imgs/" + employee2.getImage());
        }
        return employee2List;
    }
}
