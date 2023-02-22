package cn.tedu.server.service.impl;

import cn.tedu.server.pojo.Nation;
import cn.tedu.server.mapper.NationMapper;
import cn.tedu.server.service.INationService;
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
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
