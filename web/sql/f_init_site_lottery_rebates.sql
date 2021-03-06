CREATE
OR REPLACE FUNCTION "f_init_site_lottery_rebates" (
	p_com_url TEXT,
	"siteid" int4,
	"t_hid" TEXT
) RETURNS "pg_catalog"."varchar" AS $BODY$ /*版本更新说明
  版本   时间        作者   内容
--v1.01  xxxx/xx/xx marz  创建
--v1.02  2018/06/12 Steady  调整调用方式
--v1.03  2018/07/17 Steady  增加新彩种的初始化开奖结果
--v1.04 2018/07/24 rambo	增加极速六合彩,极速快3
--v1.05 2018/08/2   marz	修复幸运飞艇开奖结果初始化错误
--v1.06 2018/08/5   steady	增加极速11选5自主彩
--v1.07 2018/08/7  rambo 增加pk10牛牛开奖结果初始化
--v1.08 2018/08/9  steady 增加pk10百家乐开奖结果初始化
--v1.09  2018/08/30 steady  创建商户初始化开奖结果主函数 		 (总控复制到商户)
*/CREATE OR REPLACE FUNCTION "lb-site-6"."f_init_site_lottery_rebates"("p_com_url" text, "siteid" int4, "t_hid" text)
    RETURNS "pg_catalog"."varchar" AS $BODY$ /*版本更新说明
    版本   时间        作者   内容
  --v1.01  xxxx/xx/xx marz  创建
  --v1.02  2018/06/12 Steady  调整调用方式
  --v1.03  2018/07/17 Steady  增加新彩种的初始化开奖结果
  --v1.04 2018/07/24 rambo	增加极速六合彩,极速快3
  --v1.05 2018/08/2   marz	修复幸运飞艇开奖结果初始化错误
  --v1.06 2018/08/5   steady	增加极速11选5自主彩
  --v1.07 2018/08/7  rambo 增加pk10牛牛开奖结果初始化
  --v1.08 2018/08/9  steady 增加pk10百家乐开奖结果初始化
  --v1.09  2018/08/30 steady  创建商户初始化开奖结果主函数 		 (总控复制到商户)
  */
  DECLARE
  BEGIN
  	INSERT INTO "site_lottery_rebates" (
  		"site_id",
  		"hid",
  		"code",
  		"bet_name",
  		"bet_code",
  		"play_code",
  		"bet_num",
  		"sort",
  		"sort_type",
  		"bet_sort",
  		"page_type",
  		"rebate_a",
  		"rebate_b",
  		"rebate_c",
  		"min_bet",
  		"max_bet",
  		"max_expect_bet",
  		"post_money",
  		"post_money_close",
  		"odd_close"
  	) SELECT
  		siteid,
  		t_hid,
  		*
  	FROM
  		dblink (
  			p_com_url,
  			'SELECT "code", "bet_name", "bet_code", "play_code", "bet_num", "sort", "sort_type", "bet_sort", "page_type", "rebate_a", "rebate_b", "rebate_c", "min_bet", "max_bet", "max_expect_bet", "post_money", "post_money_close", "odd_close" FROM lottery_rebates'
  		) AS lo (
  			"code" VARCHAR (32),
  			"bet_name" VARCHAR (32),
  			"bet_code" VARCHAR (128),
  			"play_code" VARCHAR (32),
  			"bet_num" VARCHAR (32) ,
  			"sort" int4,
  			"sort_type" VARCHAR (32),
  			"bet_sort" VARCHAR (32),
  			"page_type" VARCHAR (32),
  			"rebate_a" NUMERIC (20, 3),
  			"rebate_b" NUMERIC (20, 3),
  			"rebate_c" NUMERIC (20, 3),
  			"min_bet" int4,
  			"max_bet" int4,
  			"max_expect_bet" int4,
  			"post_money" NUMERIC (20, 3),
  			"post_money_close" VARCHAR (2),
  			"odd_close" bool

  		)
  WHERE
  		lo.bet_sort NOT IN (
  			SELECT
  				bet_sort
  			FROM
  				site_lottery_rebates
  			WHERE
  				hid = t_hid AND lo.code = code
  		) ; RETURN '' ;
  	END $BODY$
    LANGUAGE 'plpgsql' VOLATILE COST 100
  ;

  ALTER FUNCTION "lb-site-6"."f_init_site_lottery_rebates"("p_com_url" text, "siteid" int4, "t_hid" text) OWNER TO "postgres";
DECLARE
BEGIN
	INSERT INTO "site_lottery_rebates" (
		"site_id",
		"hid",
		"code",
		"bet_name",
		"bet_code",
		"play_code",
		"bet_num",
		"sort",
		"sort_type",
		"bet_sort",
		"page_type",
		"rebate_a",
		"rebate_b",
		"rebate_c",
		"min_bet",
		"max_bet",
		"max_expect_bet",
		"post_money",
		"post_money_close",
		"odd_close"
	) SELECT
		siteid,
		t_hid,
		*
	FROM
		dblink (
			p_com_url,
			'SELECT "code", "bet_name", "bet_code", "play_code", "bet_num", "sort", "sort_type", "bet_sort", "page_type", "rebate_a", "rebate_b", "rebate_c", "min_bet", "max_bet", "max_expect_bet", "post_money", "post_money_close", "odd_close" FROM lottery_rebates'
		) AS lo (
			"code" VARCHAR (32),
			"bet_name" VARCHAR (32),
			"bet_code" VARCHAR (128),
			"play_code" VARCHAR (32),
			"bet_num" VARCHAR (32) ,
			"sort" int4,
			"sort_type" VARCHAR (32),
			"bet_sort" VARCHAR (32),
			"page_type" VARCHAR (32),
			"rebate_a" NUMERIC (20, 3),
			"rebate_b" NUMERIC (20, 3),
			"rebate_c" NUMERIC (20, 3),
			"min_bet" int4,
			"max_bet" int4,
			"max_expect_bet" int4,
			"post_money" NUMERIC (20, 3),
			"post_money_close" VARCHAR (2),
			"odd_close" bool

		)
	WHERE
		t_hid NOT IN (
			SELECT
				hid
			FROM
				site_lottery_rebates
			WHERE
				hid = t_hid
		) ; RETURN '' ;
	END $BODY$ LANGUAGE 'plpgsql' VOLATILE COST 100;