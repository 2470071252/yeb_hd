package cn.tedu.server.service.impl;

import cn.tedu.server.pojo.Menu;
import cn.tedu.server.mapper.MenuMapper;
import cn.tedu.server.service.IMenuService;
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
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
