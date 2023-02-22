package cn.tedu.server.service.impl;

import cn.tedu.server.pojo.Department;
import cn.tedu.server.mapper.DepartmentMapper;
import cn.tedu.server.service.IDepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
