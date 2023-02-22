package cn.tedu.server.service.impl;

import cn.tedu.server.pojo.Employee;
import cn.tedu.server.mapper.EmployeeMapper;
import cn.tedu.server.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhang
 * @since 2023-02-22
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
