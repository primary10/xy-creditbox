package so.wwb.creditbox.model.enums.message;

import org.soul.commons.ienums.ICodeEnum;

/**
 *
 * Created by jeremy on 18-5-4.
 */
public enum SystemAnnouncementSendTypeEnum implements ICodeEnum {
    POP_UP("0","弹窗"),
    NON_POP_UP("1","不弹窗");
    private String code;
    private String trans;

    SystemAnnouncementSendTypeEnum(String code, String trans){
        this.code = code;
        this.trans = trans;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getTrans() {
        return trans;
    }
}
