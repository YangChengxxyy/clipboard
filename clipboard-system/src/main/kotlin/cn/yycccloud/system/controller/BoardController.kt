package cn.yycccloud.system.controller;


import cn.yycccloud.system.entity.Board
import cn.yycccloud.system.mapper.BoardMapper
import cn.yycccloud.system.service.IBoardService
import cn.yycccloud.system.service.impl.BoardServiceImpl
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YangChengxxyy
 * @since 2021-09-07
 */
@RestController
@RequestMapping()
class BoardController {
    @Autowired
    private lateinit var iBoardService: BoardServiceImpl

    @RequestMapping("/test")
    fun test(): Page<Board> {
        return iBoardService.page(Page<Board>(0, 5))
    }
}
