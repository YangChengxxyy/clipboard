package cn.yycccloud.system.service.impl;

import cn.yycccloud.system.entity.Text;
import cn.yycccloud.system.mapper.TextMapper;
import cn.yycccloud.system.service.ITextService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YangChengxxyy
 * @since 2021-09-07
 */
@Service
open class TextServiceImpl : ServiceImpl<TextMapper, Text>(), ITextService {

}
