package cn.yycccloud.system.controller;


import cn.yycccloud.system.entity.Text
import cn.yycccloud.system.service.impl.TextServiceImpl
import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YangChengxxyy
 * @since 2021-09-07
 */
@RestController
@RequestMapping("/text")
class TextController {
    @Autowired
    private lateinit var textService: TextServiceImpl

    @RequestMapping(value = ["/page/{current}/{size}"], method = [RequestMethod.GET])
    fun page(@PathVariable current: Long, @PathVariable size: Long): Page<Text> {
        return textService.page(Page(current, size))
    }

    @RequestMapping(value = ["/{text}"], method = [RequestMethod.POST])
    fun addText(@PathVariable text: String): Boolean {
        return textService.save(Text(text))
    }

    @RequestMapping(value = ["/{id}"], method = [RequestMethod.DELETE])
    fun deleteText(@PathVariable id: String): Boolean {
        return textService.removeById(id)
    }
}
