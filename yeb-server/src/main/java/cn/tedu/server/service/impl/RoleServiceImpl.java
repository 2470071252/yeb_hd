package cn.tedu.server.service.impl;

import cn.tedu.server.pojo.Role;
import cn.tedu.server.mapper.RoleMapper;
import cn.tedu.server.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
