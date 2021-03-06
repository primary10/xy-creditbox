package so.wwb.creditbox.model.enums.lottery;

import java.util.HashMap;
import java.util.Map;

/**
 * 下注playCode与betCode关系验证
 * @author devin
 */
public class LotteryCodeCheckMap {

    public static Map<String,String> codeMap = new HashMap<>();

    static {
        codeMap.put("one_digital","hundred,one,ten,ten_thousand,thousand");
        codeMap.put("one_big_small","hundred,one,ten,ten_thousand,thousand");
        codeMap.put("one_single_double","hundred,one,ten,ten_thousand,thousand");
        codeMap.put("one_prime_combined","hundred,one,ten,ten_thousand,thousand");
        codeMap.put("one_combination","one_after_three,one_all_five,one_first_three,one_in_three");
        codeMap.put("two_digital","hundred_one,hundred_ten,ten_one,ten_thousand_hundred,ten_thousand_one,ten_thousand_ten,ten_thousand_thousand,thousand_hundred,thousand_one,thousand_ten");
        codeMap.put("two_combination","two_after_three,two_first_three,two_in_three");
        codeMap.put("three_digital","hundred_ten_one,ten_thousand_hundred_one,ten_thousand_hundred_ten,ten_thousand_ten_one,ten_thousand_thousand_hundred,ten_thousand_thousand_one,ten_thousand_thousand_ten,thousand_hundred_one,thousand_hundred_ten,thousand_ten_one");
        codeMap.put("five_sum_big_small","dragon_tiger_tie,five_sum");
        codeMap.put("five_sum_single_double","five_sum");
        codeMap.put("dragon_tiger_tie","dragon_tiger_tie,hundred_one,hundred_ten,ten_one,ten_thousand_hundred,ten_thousand_one,ten_thousand_ten,ten_thousand_thousand,thousand_hundred,thousand_one,thousand_ten");
        codeMap.put("group_three","group3_after_three,group3_first_three,group3_in_three");
        codeMap.put("group_six","group6_after_three,group6_first_three,group6_in_three");
        codeMap.put("span","span_after_three,span_first_three,span_in_three");
        codeMap.put("ssc_wuxing_zhixuan","ssc_wuxing_zhixuan_ds,ssc_wuxing_zhixuan_fs");
        codeMap.put("ssc_sixing_zhixuan","ssc_sixing_zhixuan_ds,ssc_sixing_zhixuan_fs");
        codeMap.put("ssc_sanxing_zhixuan","ssc_sanxing_zhixuan_hsds,ssc_sanxing_zhixuan_hsfs,ssc_sanxing_zhixuan_hshz,ssc_sanxing_zhixuan_hskd,ssc_sanxing_zhixuan_hszh,ssc_sanxing_zhixuan_qsds,ssc_sanxing_zhixuan_qsfs,ssc_sanxing_zhixuan_qshz,ssc_sanxing_zhixuan_qskd,ssc_sanxing_zhixuan_qszh");
        codeMap.put("ssc_sanxing_zuxuan","ssc_sanxing_zuxuan_hshhzx,ssc_sanxing_zuxuan_hsz3ds,ssc_sanxing_zuxuan_hsz3fs,ssc_sanxing_zuxuan_hsz6ds,ssc_sanxing_zuxuan_hsz6fs,ssc_sanxing_zuxuan_hszxbd,ssc_sanxing_zuxuan_hszxhz,ssc_sanxing_zuxuan_qshhzx,ssc_sanxing_zuxuan_qsz3ds,ssc_sanxing_zuxuan_qsz3fs,ssc_sanxing_zuxuan_qsz6ds,ssc_sanxing_zuxuan_qsz6fs,ssc_sanxing_zuxuan_qszxbd,ssc_sanxing_zuxuan_qszxhz");
        codeMap.put("ssc_sanxing_teshu","ssc_sanxing_zuxuan_hshzws,ssc_sanxing_zuxuan_hsts,ssc_sanxing_zuxuan_qshzws,ssc_sanxing_zuxuan_qsts");
        codeMap.put("ssc_erxing_zhixuan","ssc_erxing_zhixuan_qeds,ssc_erxing_zhixuan_qefs,ssc_erxing_zhixuan_qehz,ssc_erxing_zhixuan_qekd");
        codeMap.put("ssc_erxing_zuxuan","ssc_erxing_zuxuan_qebd,ssc_erxing_zuxuan_qeds,ssc_erxing_zuxuan_qefs,ssc_erxing_zuxuan_qehz");
        codeMap.put("ssc_yixing","ssc_yixing_dwd");
        codeMap.put("ssc_budingwei_wuxing","ssc_budingwei_wxem,ssc_budingwei_wxsm");
        codeMap.put("ssc_budingwei_sixing","ssc_budingwei_h4em,ssc_budingwei_h4ym,ssc_budingwei_q4em,ssc_budingwei_q4ym");
        codeMap.put("ssc_budingwei_sanxing","ssc_budingwei_h3em,ssc_budingwei_h3ym,ssc_budingwei_q3em,ssc_budingwei_q3ym");
        codeMap.put("pk10_digital","champion,eighth_place,fifth_place,fourth_place,ninth_place,runner_up,seventh_place,sixth_place,tenth_place,third_runner");
        codeMap.put("pk10_big_small","champion,eighth_place,fifth_place,fourth_place,ninth_place,runner_up,seventh_place,sixth_place,tenth_place,third_runner");
        codeMap.put("pk10_single_double","champion,eighth_place,fifth_place,fourth_place,ninth_place,runner_up,seventh_place,sixth_place,tenth_place,third_runner");
        codeMap.put("pk10_dragon_tiger","champion,eighth_place,fifth_place,fourth_place,ninth_place,runner_up,seventh_place,sixth_place,tenth_place,third_runner");
        codeMap.put("champion_up_34","champion_up_sum");
        codeMap.put("champion_up_56","champion_up_sum");
        codeMap.put("champion_up_78","champion_up_sum");
        codeMap.put("champion_up_910","champion_up_sum");
        codeMap.put("champion_up_alone_11","champion_up_sum");
        codeMap.put("champion_up_alone_34","champion_up_sum");
        codeMap.put("champion_up_alone_56","champion_up_sum");
        codeMap.put("champion_up_alone_78","champion_up_sum");
        codeMap.put("champion_up_alone_910","champion_up_sum");
        codeMap.put("champion_up_big_small","champion_up_sum");
        codeMap.put("champion_up_single_double","champion_up_sum");
        codeMap.put("champion_up_half","champion_up_sum");
        codeMap.put("pk10_qy_zhixuan","pk10_zhixuan_qyfs");
        codeMap.put("pk10_qe_zhixuan","pk10_zhixuan_qeds,pk10_zhixuan_qefs");
        codeMap.put("pk10_qs_zhixuan","pk10_zhixuan_qsds,pk10_zhixuan_qsfs");
        codeMap.put("pk10_yixing","pk10_yixing_dwd");
        codeMap.put("special_digital","special");
        codeMap.put("special_big_small","special");
        codeMap.put("special_single_double","special");
        codeMap.put("special_half","special");
        codeMap.put("special_sum_big_small","special");
        codeMap.put("special_sum_single_double","special");
        codeMap.put("special_mantissa","special");
        codeMap.put("special_mantissa_big_small","special");
        codeMap.put("special_colour","special");
        codeMap.put("seven_sum_big_small","seven_sum");
        codeMap.put("seven_sum_single_double","seven_sum");
        codeMap.put("positive_digital","positive");
        codeMap.put("positive_special_digital","positive_fifth,positive_first,positive_fourth,positive_second,positive_sixth,positive_third");
        codeMap.put("positive_big_small","positive_fifth,positive_first,positive_fourth,positive_second,positive_sixth,positive_third");
        codeMap.put("positive_single_double","positive_fifth,positive_first,positive_fourth,positive_second,positive_sixth,positive_third");
        codeMap.put("positive_colour","positive_fifth,positive_first,positive_fourth,positive_second,positive_sixth,positive_third");
        codeMap.put("positive_sum_big_small","positive_fifth,positive_first,positive_fourth,positive_second,positive_sixth,positive_third");
        codeMap.put("positive_sum_single_double","positive_fifth,positive_first,positive_fourth,positive_second,positive_sixth,positive_third");
        codeMap.put("positive_mantissa_big_small","positive_fifth,positive_first,positive_fourth,positive_second,positive_sixth,positive_third");
        codeMap.put("lhc_half_colour_big_small","lhc_half_colour");
        codeMap.put("lhc_half_colour_single_double","lhc_half_colour");
        codeMap.put("special_zodiac","special");
        codeMap.put("lhc_one_zodiac","lhc_one_zodiac");
        codeMap.put("lhc_four_all_in","lhc_four_all_in");
        codeMap.put("lhc_three_all_in","lhc_three_all_in");
        codeMap.put("lhc_three_in_two","lhc_three_in_two");
        codeMap.put("lhc_two_all_in","lhc_two_all_in");
        codeMap.put("lhc_two_in_special","lhc_two_in_special");
        codeMap.put("lhc_special_strand","lhc_special_strand");
        codeMap.put("lhc_sum_zodiac","lhc_eight_zodiac,lhc_eleven_zodiac,lhc_five_zodiac,lhc_four_zodiac,lhc_nine_zodiac,lhc_seven_zodiac,lhc_six_zodiac,lhc_ten_zodiac,lhc_three_zodiac,lhc_two_zodiac");
        codeMap.put("lhc_two_zodiac_link","lhc_two_zodiac_link");
        codeMap.put("lhc_three_zodiac_link","lhc_three_zodiac_link");
        codeMap.put("lhc_four_zodiac_link","lhc_four_zodiac_link");
        codeMap.put("lhc_five_zodiac_link","lhc_five_zodiac_link");
        codeMap.put("lhc_two_mantissa_link","lhc_two_mantissa_link");
        codeMap.put("lhc_three_mantissa_link","lhc_three_mantissa_link");
        codeMap.put("lhc_four_mantissa_link","lhc_four_mantissa_link");
        codeMap.put("lhc_five_mantissa_link","lhc_five_mantissa_link");
        codeMap.put("lhc_five_no_in","lhc_five_no_in");
        codeMap.put("lhc_six_no_in","lhc_six_no_in");
        codeMap.put("lhc_seven_no_in","lhc_seven_no_in");
        codeMap.put("lhc_eight_no_in","lhc_eight_no_in");
        codeMap.put("lhc_nine_no_in","lhc_nine_no_in");
        codeMap.put("lhc_ten_no_in","lhc_ten_no_in");
        codeMap.put("lhc_eleven_no_in","lhc_eleven_no_in");
        codeMap.put("lhc_twelve_no_in","lhc_twelve_no_in");
        codeMap.put("points_big_small","points");
        codeMap.put("points_single_double","points");
        codeMap.put("points_417","points");
        codeMap.put("points_516","points");
        codeMap.put("points_615","points");
        codeMap.put("points_714","points");
        codeMap.put("points_813","points");
        codeMap.put("points_912","points");
        codeMap.put("points_1011","points");
        codeMap.put("armed_forces","armed_forces");
        codeMap.put("dice","dice_full_dice");
        codeMap.put("full_dice","dice_full_dice");
        codeMap.put("long_card","long_card");
        codeMap.put("short_card","short_card");
        codeMap.put("k3_same_num","k3_danxuan_ertong,k3_danxuan_santong,k3_fuxuan_ertong,k3_tongxuan_santong");
        codeMap.put("k3_diff_num","k3_erbutong,k3_sanbutong");
        codeMap.put("k3_three_straight","k3_tongxuan_sanlian");
        codeMap.put("sfc_digital","sfc_eighth,sfc_fifth,sfc_first,sfc_fourth,sfc_second,sfc_seventh,sfc_sixth,sfc_third");
        codeMap.put("sfc_big_small","sfc_eighth,sfc_fifth,sfc_first,sfc_fourth,sfc_second,sfc_seventh,sfc_sixth,sfc_third");
        codeMap.put("sfc_single_double","sfc_eighth,sfc_fifth,sfc_first,sfc_fourth,sfc_second,sfc_seventh,sfc_sixth,sfc_third");
        codeMap.put("sfc_mantissa_big_small","sfc_eighth,sfc_fifth,sfc_first,sfc_fourth,sfc_second,sfc_seventh,sfc_sixth,sfc_third");
        codeMap.put("sfc_sum_single_double","sfc_eighth,sfc_fifth,sfc_first,sfc_fourth,sfc_second,sfc_seventh,sfc_sixth,sfc_third");
        codeMap.put("sfc_sum8_big_small","sfc_sum8");
        codeMap.put("sfc_sum8_single_double","sfc_sum8");
        codeMap.put("sfc_sum8_mantissa_big_small","sfc_sum8");
        codeMap.put("sfc_dragon_tiger","sfc_dragon_tiger_12,sfc_dragon_tiger_13,sfc_dragon_tiger_14,sfc_dragon_tiger_15,sfc_dragon_tiger_16,sfc_dragon_tiger_17,sfc_dragon_tiger_18,sfc_dragon_tiger_23,sfc_dragon_tiger_24,sfc_dragon_tiger_25,sfc_dragon_tiger_26,sfc_dragon_tiger_27,sfc_dragon_tiger_28,sfc_dragon_tiger_34,sfc_dragon_tiger_35,sfc_dragon_tiger_36,sfc_dragon_tiger_37,sfc_dragon_tiger_38,sfc_dragon_tiger_45,sfc_dragon_tiger_46,sfc_dragon_tiger_47,sfc_dragon_tiger_48,sfc_dragon_tiger_56,sfc_dragon_tiger_57,sfc_dragon_tiger_58,sfc_dragon_tiger_67,sfc_dragon_tiger_68,sfc_dragon_tiger_78");
        codeMap.put("keno_selection_one","keno_selection");
        codeMap.put("keno_selection_two","keno_selection");
        codeMap.put("keno_selection_three","keno_selection");
        codeMap.put("keno_selection_four","keno_selection");
        codeMap.put("keno_selection_five","keno_selection");
        codeMap.put("keno_sum20_big_small","keno_sum20");
        codeMap.put("keno_sum20_single_double","keno_sum20");
        codeMap.put("keno_sum20_elements","keno_sum20");
        codeMap.put("keno_up_down","keno_number");
        codeMap.put("keno_odd_even","keno_number");
        codeMap.put("xy28_sum3_big_small","xy28_sum3");
        codeMap.put("xy28_sum3_single_double","xy28_sum3");
        codeMap.put("xy28_sum3_half","xy28_sum3");
        codeMap.put("xy28_sum3_extreme","xy28_sum3");
        codeMap.put("xy28_sum3_colour","xy28_sum3");
        codeMap.put("xy28_three_same","xy28_sum3");
        codeMap.put("xy28_sum3_digital","xy28_sum3");
        codeMap.put("xy28_sum3_digital_three","xy28_sum3");
        codeMap.put("pl3_one_digital","pl3_hundred,pl3_one,pl3_ten");
        codeMap.put("pl3_one_big_small","pl3_hundred,pl3_one,pl3_ten");
        codeMap.put("pl3_one_single_double","pl3_hundred,pl3_one,pl3_ten");
        codeMap.put("pl3_one_prime_combined","pl3_hundred,pl3_one,pl3_ten");
        codeMap.put("pl3_two_digital","pl3_hundred_one,pl3_hundred_ten,pl3_ten_one");
        codeMap.put("pl3_three_digital","pl3_hundred_ten_one");
        codeMap.put("pl3_one_combination","pl3_all_three");
        codeMap.put("pl3_two_combination","pl3_two_different,pl3_two_same");
        codeMap.put("pl3_three_combination","pl3_three_group3,pl3_three_group6,pl3_three_same");
        codeMap.put("pl3_sum2_digital","pl3_hundred_one_sum,pl3_hundred_ten_sum,pl3_ten_one_sum");
        codeMap.put("pl3_sum2_single_double","pl3_hundred_one_sum,pl3_hundred_ten_sum,pl3_ten_one_sum");
        codeMap.put("pl3_sum2_mantissa","pl3_hundred_one_sum,pl3_hundred_ten_sum,pl3_ten_one_sum");
        codeMap.put("pl3_sum2_mantissa_big_small","pl3_hundred_one_sum,pl3_hundred_ten_sum,pl3_ten_one_sum");
        codeMap.put("pl3_sum2_mantissa_prime_combined","pl3_hundred_one_sum,pl3_hundred_ten_sum,pl3_ten_one_sum");
        codeMap.put("pl3_sum3_digital","pl3_hundred_ten_one_sum");
        codeMap.put("pl3_sum3_mantissa","pl3_hundred_ten_one_sum");
        codeMap.put("pl3_sum3_big_small","pl3_hundred_ten_one_sum");
        codeMap.put("pl3_sum3_single_double","pl3_hundred_ten_one_sum");
        codeMap.put("pl3_sum3_mantissa_big_small","pl3_hundred_ten_one_sum");
        codeMap.put("pl3_sum3_mantissa_prime_combined","pl3_hundred_ten_one_sum");
        codeMap.put("pl3_group_three","pl3_group3");
        codeMap.put("pl3_group_six","pl3_group6");
        codeMap.put("pl3_span","pl3_span");
        codeMap.put("pl3_sanxing_zhixuan","pl3_sanxing_zhixuan_ds,pl3_sanxing_zhixuan_fs,pl3_sanxing_zhixuan_hz");
        codeMap.put("pl3_sanxing_zuxuan","pl3_sanxing_zuxuan_hhzx,pl3_sanxing_zuxuan_z3ds,pl3_sanxing_zuxuan_z3fs,pl3_sanxing_zuxuan_z6ds,pl3_sanxing_zuxuan_z6fs,pl3_sanxing_zuxuan_zxhz");
        codeMap.put("pl3_erxing_zhixuan","pl3_erxing_zhixuan_heds,pl3_erxing_zhixuan_hefs,pl3_erxing_zhixuan_qeds,pl3_erxing_zhixuan_qefs");
        codeMap.put("pl3_erxing_zuxuan","pl3_erxing_zuxuan_heds,pl3_erxing_zuxuan_hefs,pl3_erxing_zuxuan_qeds,pl3_erxing_zuxuan_qefs");
        codeMap.put("pl3_yixing","pl3_yixing_dwd");
        codeMap.put("pl3_budingwei_sanxing","pl3_budingwei_sxym");

    }


}
