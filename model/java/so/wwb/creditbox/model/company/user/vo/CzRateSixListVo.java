package so.wwb.creditbox.model.company.user.vo;

import org.soul.commons.query.Criteria;
import org.soul.model.common.AbstractQuery;
import org.soul.model.common.BaseListVo;
import so.wwb.creditbox.model.company.user.po.CzRateSix;
import so.wwb.creditbox.model.company.user.so.CzRateSixSo;


/**
 * 列表页值对象
 *
 * @author block
 * @time 2019-12-19 23:20:39
 */
//region your codes 1
public class CzRateSixListVo extends BaseListVo<CzRateSix, CzRateSixSo, CzRateSixListVo.CzRateSixQuery> {
//endregion your codes 1

    //region your codes 5
    private static final long serialVersionUID = 8011013716448182992L;
    //endregion your codes 5

    /**
     *  列表查询逻辑
     */
    public static class CzRateSixQuery extends AbstractQuery<CzRateSixSo> {

        //region your codes 6
        private static final long serialVersionUID = 8021591945503172633L;
        //endregion your codes 6

        @Override
        public Criteria getCriteria() {
            //region your codes 2
            return null;
            //endregion your codes 2
        }


        //region your codes 3

        //endregion your codes 3
    }

    //region your codes 4

    //endregion your codes 4

}