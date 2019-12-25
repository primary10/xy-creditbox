package so.wwb.creditbox.service.company.user;

import org.soul.commons.collections.CollectionTool;
import org.soul.commons.lang.string.StringTool;
import org.soul.commons.query.Criteria;
import org.soul.commons.query.enums.Operator;
import org.soul.commons.query.sort.Order;
import org.soul.data.datasource.DatasourceTool;
import org.soul.data.mapper.security.privilege.SysUserMapper;
import org.soul.data.support.DataContext;
import org.soul.model.passport.vo.PassportVo;
import org.soul.model.security.privilege.po.SysUser;
import org.soul.model.security.privilege.po.SysUserStatus;
import org.soul.model.security.privilege.vo.SysUserStatusVo;
import org.soul.service.support.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import so.wwb.creditbox.context.LotteryCommonContext;
import so.wwb.creditbox.data.company.user.CzUsersChildMapper;
import so.wwb.creditbox.data.manager.user.SysUserExtendMapper;
import so.wwb.creditbox.iservice.company.user.ICzUsersChildService;
import so.wwb.creditbox.model.bean.WebJson;
import so.wwb.creditbox.model.company.user.po.CzUsers;
import so.wwb.creditbox.model.company.user.po.CzUsersChild;
import so.wwb.creditbox.model.company.user.vo.CzUsersChildListVo;
import so.wwb.creditbox.model.company.user.vo.CzUsersChildVo;
import so.wwb.creditbox.model.manager.user.po.SysUserExtend;

import javax.sql.DataSource;
import java.util.List;


/**
 * 服务
 *
 * @author block
 * @time 2019-12-24 23:36:50
 */
//region your codes 1
public class CzUsersChildService extends BaseService<CzUsersChildMapper, CzUsersChildListVo, CzUsersChildVo, CzUsersChild, Integer> implements ICzUsersChildService {
    
//endregion your codes 1

    //region your codes 2

    @Override
    public CzUsersChild findByUsername(CzUsersChildVo czUsersVo) {
        if (StringTool.isBlank(czUsersVo.getSearch().getUname())) {
            throw new IllegalArgumentException("用户名不能为空！");
        }

        Criteria criteria = Criteria.add(CzUsersChild.PROP_UNAME, Operator.EQ, czUsersVo.getSearch().getUname());

        List<CzUsersChild> results = mapper.search(criteria, Order.asc(CzUsers.PROP_ID));
        if (CollectionTool.isEmpty(results))
            return null;

        return results.get(0);
    }
    //endregion your codes 2

}