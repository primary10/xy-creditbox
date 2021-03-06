package so.wwb.creditbox.model.enums.base;

import org.soul.commons.enums.ICodeEnum;

/**
 * 账單方式子枚举
 *
 * @author marz
 * @time 2018-01-21 09:29:14
 */
public interface IChildEnum extends ICodeEnum {

    ICodeEnum getParent();

}
