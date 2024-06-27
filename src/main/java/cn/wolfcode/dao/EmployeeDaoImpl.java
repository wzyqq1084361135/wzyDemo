package cn.wolfcode.dao;

import cn.wolfcode.dao.impl.IEmployeeDao;
import cn.wolfcode.pojo.Employee2;
import cn.wolfcode.utils.XmlParserUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {
    @Override
    public List<Employee2> selectAll() {
        String file = this.getClass().getClassLoader().getResource("emps.xml").getFile();

        List<Employee2> employeeList = XmlParserUtils.parse(file, Employee2.class);

        return employeeList;
    }
}
