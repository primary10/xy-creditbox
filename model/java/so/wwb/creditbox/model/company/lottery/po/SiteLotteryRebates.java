package so.wwb.creditbox.model.company.lottery.po;

import org.soul.commons.bean.IEntity;
import org.soul.model.common.Sortable;


/**
 * 实体
 *
 * @author block
 * @time 2019-11-12 0:36:34
 */
//region your codes 1
public class SiteLotteryRebates implements IEntity<Integer> {
//endregion your codes 1

	//region your codes 3
	private static final long serialVersionUID = 3098885399576700267L;
	//endregion your codes 3

	//region property name constants
	public static final String PROP_ID = "id";
	public static final String PROP_CODE = "code";
	public static final String PROP_SITE_ID = "siteId";
	public static final String PROP_HID = "hid";
	public static final String PROP_BET_NAME = "betName";
	public static final String PROP_BET_CODE = "betCode";
	public static final String PROP_PLAY_CODE = "playCode";
	public static final String PROP_BET_NUM = "betNum";
	public static final String PROP_BET_SORT = "betSort";
	public static final String PROP_REBATE_A = "rebateA";
	public static final String PROP_REBATE_B = "rebateB";
	public static final String PROP_REBATE_C = "rebateC";
	public static final String PROP_MIN_BET = "minBet";
	public static final String PROP_MAX_BET = "maxBet";
	public static final String PROP_MAX_EXPECT_BET = "maxExpectBet";
	public static final String PROP_POST_MONEY = "postMoney";
	public static final String PROP_POST_MONEY_CLOSE = "postMoneyClose";
	//endregion
	
	
	//region properties
	/**  */
	private Integer id;
	/** 彩种代号 */
	private String code;
	/** 站点id */
	private Integer siteId;
	/** 用户唯一标示 */
	private String hid;
	/**  */
	private String betName;
	/** 玩法代号 */
	private String betCode;
	/**  */
	private String playCode;
	/** 号码 */
	private String betNum;
	/** 玩法唯一标示 */
	private Integer betSort;
	/** A盤水位 */
	private Double rebateA;
	/** B盤水位 */
	private Double rebateB;
	/** C盤水位 */
	private Double rebateC;
	/** 最低下注额 */
	private Double minBet;
	/** 单注限额 */
	private Double maxBet;
	/** 单期限额 */
	private Double maxExpectBet;
	/** 起补金额 */
	private Double postMoney;
	/** 是否开启，1开启、0关闭 */
	private String postMoneyClose;
	//endregion

	
	//region constuctors
	public SiteLotteryRebates(){
	}

	public SiteLotteryRebates(Integer id){
		this.id = id;
	}
	//endregion


	//region getters and setters
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer value) {
		this.id = value;
	}
	public String getCode() {
		return this.code;
	}

	public void setCode(String value) {
		this.code = value;
	}
	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer value) {
		this.siteId = value;
	}
	public String getHid() {
		return this.hid;
	}

	public void setHid(String value) {
		this.hid = value;
	}
	public String getBetName() {
		return this.betName;
	}

	public void setBetName(String value) {
		this.betName = value;
	}
	public String getBetCode() {
		return this.betCode;
	}

	public void setBetCode(String value) {
		this.betCode = value;
	}
	public String getPlayCode() {
		return this.playCode;
	}

	public void setPlayCode(String value) {
		this.playCode = value;
	}
	public String getBetNum() {
		return this.betNum;
	}

	public void setBetNum(String value) {
		this.betNum = value;
	}
	public Integer getBetSort() {
		return this.betSort;
	}

	public void setBetSort(Integer value) {
		this.betSort = value;
	}
	public Double getRebateA() {
		return this.rebateA;
	}

	public void setRebateA(Double value) {
		this.rebateA = value;
	}
	public Double getRebateB() {
		return this.rebateB;
	}

	public void setRebateB(Double value) {
		this.rebateB = value;
	}
	public Double getRebateC() {
		return this.rebateC;
	}

	public void setRebateC(Double value) {
		this.rebateC = value;
	}
	public Double getMinBet() {
		return this.minBet;
	}

	public void setMinBet(Double value) {
		this.minBet = value;
	}
	public Double getMaxBet() {
		return this.maxBet;
	}

	public void setMaxBet(Double value) {
		this.maxBet = value;
	}
	public Double getMaxExpectBet() {
		return this.maxExpectBet;
	}

	public void setMaxExpectBet(Double value) {
		this.maxExpectBet = value;
	}
	public Double getPostMoney() {
		return this.postMoney;
	}

	public void setPostMoney(Double value) {
		this.postMoney = value;
	}
	public String getPostMoneyClose() {
		return this.postMoneyClose;
	}

	public void setPostMoneyClose(String value) {
		this.postMoneyClose = value;
	}
	//endregion

	//region your codes 2

	//endregion your codes 2

}