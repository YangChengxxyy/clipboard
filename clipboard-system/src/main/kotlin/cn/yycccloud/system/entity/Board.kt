package cn.yycccloud.system.entity

import java.io.Serializable
/**
 * <p>
 * 
 * </p>
 *
 * @author YangChengxxyy
 * @since 2021-09-07
 */
class Board : Serializable {


    var value: String? = null
    var id: Int? = null
    override fun toString(): String {
        return "Board(value=$value, id=$id)"
    }
}
