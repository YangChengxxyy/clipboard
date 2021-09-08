package cn.yycccloud.system.entity

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import java.io.Serializable
/**
 * <p>
 * 
 * </p>
 *
 * @author YangChengxxyy
 * @since 2021-09-07
 */
class Text(var value: String?) : Serializable {

    @TableId(type = IdType.AUTO)
    var id: Int? = null

    override fun toString(): String {
        return "Board(value=$value, id=$id)"
    }
}
