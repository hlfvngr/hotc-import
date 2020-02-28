package com.hgits.hotc.utils;


import com.hgits.hotc.entity.BaseCount;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author liangshishun
 * @className BaseCountUtil
 * @Date 2019/8/7 14:56
 * @Description 合计数工具类
 */
public class BaseCountUtil {
    /**
     * 按车型合并的数量
     */
    public static final int TYPE_COUNT_NUM = 16;
    /**
     * 按车种合并的数量
     */
    public static final int CLASS_COUNT_NUM = 13;
    /**
     * 车型初始化
     */
    public static final String INIT_TYPE_COUNT = "0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0";
    /**
     * 车种初始化
     */
    public static final String INIT_CLASS_COUNT = "0|0|0|0|0|0|0|0|0|0";
    /**
     * 合并类型
     */
    public static final List<String> COUNT_TYPE =  Arrays.asList("selfCount", "waterCount", "laneCount", "stationCount", "manualCount");
    /**
     * 本类合并交易量
     */
    public static final String SELF_COUNT = "selfCount";
    /**
     * 流水合并交易量
     */
    public static final String WATER_COUNT = "waterCount";
    /**
     * 车道合并交易量
     */
    public static final String LANE_COUNT = "laneCount";
    /**
     * 站合并交易量
     */
    public static final String STATION_COUNT = "stationCount";
    /**
     * 补录交易量
     */
    public static final String MANUAL_COUNT = "manualCount";


    /**
     * 合并交易量(包括ETC车型\CPC车型\ETC车种\CPC车种)
     *
     * @param baseCount BaseCount对象
     */
    public static final void mergeAllCount(BaseCount baseCount) {
        if (Objects.nonNull(baseCount)) {
            mergeEtcTypeCount(baseCount);
            mergeEtcClassCount(baseCount);
            mergeCpcTypeCount(baseCount);
            mergeCpcClassCount(baseCount);
        }
    }

    /**
     * 拆分交易量(包括ETC车型\CPC车型\ETC车种\CPC车种)
     *
     * @param baseCount BaseCount对象
     */
    public static final void splitAllCount(BaseCount baseCount) {
        if (Objects.nonNull(baseCount)) {
            splitEtcTypeCount(baseCount);
            splitEtcClassCount(baseCount);
            splitCpcTypeCount(baseCount);
            splitCpcClassCount(baseCount);
        }
    }

    /**
     * 合并ETC车型交易量
     *
     * @param baseCount BaseCount对象
     * @author liangshishun
     * @Date 2019-08-01 16:45:05
     */
    public static final void mergeEtcTypeCount(BaseCount baseCount) {
        StringBuilder sb = new StringBuilder(16);
        Long coach1 = baseCount.getEtcTypeCountCoach1();
        Long coach2 = baseCount.getEtcTypeCountCoach2();
        Long coach3 = baseCount.getEtcTypeCountCoach3();
        Long coach4 = baseCount.getEtcTypeCountCoach4();
        Long truck1 = baseCount.getEtcTypeCountTruck1();
        Long truck2 = baseCount.getEtcTypeCountTruck2();
        Long truck3 = baseCount.getEtcTypeCountTruck3();
        Long truck4 = baseCount.getEtcTypeCountTruck4();
        Long truck5 = baseCount.getEtcTypeCountTruck5();
        Long truck6 = baseCount.getEtcTypeCountTruck6();
        Long special1 = baseCount.getEtcTypeCountSpecial1();
        Long special2 = baseCount.getEtcTypeCountSpecial2();
        Long special3 = baseCount.getEtcTypeCountSpecial3();
        Long special4 = baseCount.getEtcTypeCountSpecial4();
        Long special5 = baseCount.getEtcTypeCountSpecial5();
        Long special6 = baseCount.getEtcTypeCountSpecial6();

        sb.append(String.valueOf(coach1)).append("|");
        sb.append(String.valueOf(coach2)).append("|");
        sb.append(String.valueOf(coach3)).append("|");
        sb.append(String.valueOf(coach4)).append("|");
        sb.append(String.valueOf(truck1)).append("|");
        sb.append(String.valueOf(truck2)).append("|");
        sb.append(String.valueOf(truck3)).append("|");
        sb.append(String.valueOf(truck4)).append("|");
        sb.append(String.valueOf(truck5)).append("|");
        sb.append(String.valueOf(truck6)).append("|");
        sb.append(String.valueOf(special1)).append("|");
        sb.append(String.valueOf(special2)).append("|");
        sb.append(String.valueOf(special3)).append("|");
        sb.append(String.valueOf(special4)).append("|");
        sb.append(String.valueOf(special5)).append("|");
        sb.append(String.valueOf(special6));

        Long coachTotal = coach1 + coach2 + coach3 + coach4;
        Long truckTotal = truck1 + truck2 + truck3 + truck4 + truck5 + truck6;
        Long specialTotal = special1 + special2 + special3 + special4 + special5 + special6;

        baseCount.setEtcTypeCount(sb.toString());
        baseCount.setEtcTypeCountCoachTotal(coachTotal);
        baseCount.setEtcTypeCountTruckTotal(truckTotal);
        baseCount.setEtcTypeCountSpecialTotal(specialTotal);
        baseCount.setEtcTypeCountTotal(coachTotal + truckTotal + specialTotal);
    }

    /**
     * 合并ETC车种交易量
     *
     * @param baseCount BaseCount对象
     */
    public static final void mergeEtcClassCount(BaseCount baseCount) {
        StringBuilder sb = new StringBuilder(16);
        Long normal = baseCount.getEtcClassCountNormal();
        Long police = baseCount.getEtcClassCountPolice();
        Long urgency = baseCount.getEtcClassCountUrgency();
        Long etcClassCountFree = baseCount.getEtcClassCountFree();
        Long carGroup = baseCount.getEtcClassCountCarGroup();
        Long greenCar = baseCount.getEtcClassCountGreenCar();
        Long combine = baseCount.getEtcClassCountCombine();
        Long rescue = baseCount.getEtcClassCountRescue();
        Long container = baseCount.getEtcClassCountContainer();
        Long largeTransport = baseCount.getEtcClassCountLargeTransport();
        Long emergencyCar = baseCount.getEtcClassCountEmergencyCar();
        Long etcClassCountTrain = baseCount.getEtcClassCountTrain();

        sb.append(String.valueOf(normal)).append("|");
        sb.append(String.valueOf(police)).append("|");
        sb.append(String.valueOf(urgency)).append("|");
        sb.append(String.valueOf(etcClassCountFree)).append("|");
        sb.append(String.valueOf(carGroup)).append("|");
        sb.append(String.valueOf(greenCar)).append("|");
        sb.append(String.valueOf(combine)).append("|");
        sb.append(String.valueOf(rescue)).append("|");
        sb.append(String.valueOf(container)).append("|");
        sb.append(String.valueOf(largeTransport)).append("|");
        sb.append(String.valueOf(emergencyCar)).append("|");
        sb.append(String.valueOf(etcClassCountTrain));

        Long total = normal + police + urgency +etcClassCountFree+carGroup + greenCar + combine
                + rescue + container + largeTransport + emergencyCar+etcClassCountTrain;

        baseCount.setEtcClassCount(sb.toString());
        baseCount.setEtcClassCountTotal(total);
    }

    /**
     * 合并CPC车型交易量
     *
     * @param baseCount BaseCount对象
     * @author liangshishun
     * @Date 2019-08-01 16:45:05
     */
    public static final void mergeCpcTypeCount(BaseCount baseCount) {
        StringBuilder sb = new StringBuilder(16);
        Long coach1 = baseCount.getCpcTypeCountCoach1();
        Long coach2 = baseCount.getCpcTypeCountCoach2();
        Long coach3 = baseCount.getCpcTypeCountCoach3();
        Long coach4 = baseCount.getCpcTypeCountCoach4();
        Long truck1 = baseCount.getCpcTypeCountTruck1();
        Long truck2 = baseCount.getCpcTypeCountTruck2();
        Long truck3 = baseCount.getCpcTypeCountTruck3();
        Long truck4 = baseCount.getCpcTypeCountTruck4();
        Long truck5 = baseCount.getCpcTypeCountTruck5();
        Long truck6 = baseCount.getCpcTypeCountTruck6();
        Long special1 = baseCount.getCpcTypeCountSpecial1();
        Long special2 = baseCount.getCpcTypeCountSpecial2();
        Long special3 = baseCount.getCpcTypeCountSpecial3();
        Long special4 = baseCount.getCpcTypeCountSpecial4();
        Long special5 = baseCount.getCpcTypeCountSpecial5();
        Long special6 = baseCount.getCpcTypeCountSpecial6();

        sb.append(String.valueOf(coach1)).append("|");
        sb.append(String.valueOf(coach2)).append("|");
        sb.append(String.valueOf(coach3)).append("|");
        sb.append(String.valueOf(coach4)).append("|");
        sb.append(String.valueOf(truck1)).append("|");
        sb.append(String.valueOf(truck2)).append("|");
        sb.append(String.valueOf(truck3)).append("|");
        sb.append(String.valueOf(truck4)).append("|");
        sb.append(String.valueOf(truck5)).append("|");
        sb.append(String.valueOf(truck6)).append("|");
        sb.append(String.valueOf(special1)).append("|");
        sb.append(String.valueOf(special2)).append("|");
        sb.append(String.valueOf(special3)).append("|");
        sb.append(String.valueOf(special4)).append("|");
        sb.append(String.valueOf(special5)).append("|");
        sb.append(String.valueOf(special6));

        Long coachTotal = coach1 + coach2 + coach3 + coach4;
        Long truckTotal = truck1 + truck2 + truck3 + truck4 + truck5 + truck6;
        Long specialTotal = special1 + special2 + special3 + special4 + special5 + special6;

        baseCount.setCpcTypeCount(sb.toString());
        baseCount.setCpcTypeCountCoachTotal(coachTotal);
        baseCount.setCpcTypeCountTruckTotal(truckTotal);
        baseCount.setCpcTypeCountSpecialTotal(specialTotal);
        baseCount.setCpcTypeCountTotal(coachTotal + truckTotal + specialTotal);
    }

    /**
     * 合并CPC车种交易量
     *
     * @param baseCount BaseCount对象
     * @author liangshishun
     * @Date 2019-08-01 16:45:05
     */
    public static final void mergeCpcClassCount(BaseCount baseCount) {
        StringBuilder sb = new StringBuilder(16);
        Long normal = baseCount.getCpcClassCountNormal();
        Long police = baseCount.getCpcClassCountPolice();
        Long urgency = baseCount.getCpcClassCountUrgency();
        Long cpcClassCountFree = baseCount.getCpcClassCountFree();
        Long carGroup = baseCount.getCpcClassCountCarGroup();
        Long greenCar = baseCount.getCpcClassCountGreenCar();
        Long combine = baseCount.getCpcClassCountCombine();
        Long rescue = baseCount.getCpcClassCountRescue();
        Long container = baseCount.getCpcClassCountContainer();
        Long largeTransport = baseCount.getCpcClassCountLargeTransport();
        Long emergencyCar = baseCount.getCpcClassCountEmergencyCar();
        Long cpcClassCountTrain = baseCount.getCpcClassCountTrain();

        sb.append(String.valueOf(normal)).append("|");
        sb.append(String.valueOf(police)).append("|");
        sb.append(String.valueOf(urgency)).append("|");
        sb.append(String.valueOf(cpcClassCountFree)).append("|");
        sb.append(String.valueOf(carGroup)).append("|");
        sb.append(String.valueOf(greenCar)).append("|");
        sb.append(String.valueOf(combine)).append("|");
        sb.append(String.valueOf(rescue)).append("|");
        sb.append(String.valueOf(container)).append("|");
        sb.append(String.valueOf(largeTransport)).append("|");
        sb.append(String.valueOf(emergencyCar)).append("|");
        sb.append(String.valueOf(cpcClassCountTrain));

        Long total = normal + police + urgency +cpcClassCountFree+ carGroup + greenCar + combine
                + rescue + container + largeTransport + emergencyCar+cpcClassCountTrain;

        baseCount.setCpcClassCount(sb.toString());
        baseCount.setCpcClassCountTotal(total);
    }

    /**
     * 拆分ETC车型交易量
     *
     * @param baseCount BaseCount列表对象
     * @return BaseCount列表对象
     * @author liangshishun
     * @Date 2019-08-01 16:45:05
     */
    public static final void splitEtcTypeCount(BaseCount baseCount) {
        String etcTypeCount = baseCount.getEtcTypeCount();
        if (StringUtils.isBlank(etcTypeCount)) {
            etcTypeCount = BaseCountUtil.INIT_TYPE_COUNT;
            baseCount.setEtcTypeCount(etcTypeCount);
        }

        String[] split = etcTypeCount.split("\\|");
        if (split.length == BaseCountUtil.TYPE_COUNT_NUM) {
            baseCount.setEtcTypeCountCoach1(Long.valueOf(split[0]));
            baseCount.setEtcTypeCountCoach2(Long.valueOf(split[1]));
            baseCount.setEtcTypeCountCoach3(Long.valueOf(split[2]));
            baseCount.setEtcTypeCountCoach4(Long.valueOf(split[3]));
            baseCount.setEtcTypeCountTruck1(Long.valueOf(split[4]));
            baseCount.setEtcTypeCountTruck2(Long.valueOf(split[5]));
            baseCount.setEtcTypeCountTruck3(Long.valueOf(split[6]));
            baseCount.setEtcTypeCountTruck4(Long.valueOf(split[7]));
            baseCount.setEtcTypeCountTruck5(Long.valueOf(split[8]));
            baseCount.setEtcTypeCountTruck6(Long.valueOf(split[9]));
            baseCount.setEtcTypeCountSpecial1(Long.valueOf(split[10]));
            baseCount.setEtcTypeCountSpecial2(Long.valueOf(split[11]));
            baseCount.setEtcTypeCountSpecial3(Long.valueOf(split[12]));
            baseCount.setEtcTypeCountSpecial4(Long.valueOf(split[13]));
            baseCount.setEtcTypeCountSpecial5(Long.valueOf(split[14]));
            baseCount.setEtcTypeCountSpecial6(Long.valueOf(split[15]));

            Long coachTotal = Arrays.stream(split).limit(4).map(count -> Long.valueOf(count)).reduce(0L, Long::sum);
            Long truckTotal = Arrays.stream(split).skip(4).limit(6).map(count -> Long.valueOf(count)).reduce(0L, Long::sum);
            Long specialTotal = Arrays.stream(split).skip(10).map(count -> Long.valueOf(count)).reduce(0L, Long::sum);

            baseCount.setEtcTypeCountCoachTotal(coachTotal);
            baseCount.setEtcTypeCountTruckTotal(truckTotal);
            baseCount.setEtcTypeCountSpecialTotal(specialTotal);
            baseCount.setEtcTypeCountTotal(coachTotal + truckTotal + specialTotal);
        }
    }

    /**
     * 拆分CPC车型交易量
     *
     * @param baseCount BaseCount列表对象
     * @return BaseCount列表对象
     * @author liangshishun
     * @Date 2019-08-01 16:45:05
     */
    public static final void splitCpcTypeCount(BaseCount baseCount) {
        String cpcTypeCount = baseCount.getCpcTypeCount();
        if (StringUtils.isBlank(cpcTypeCount)) {
            cpcTypeCount = BaseCountUtil.INIT_TYPE_COUNT;
            baseCount.setCpcTypeCount(cpcTypeCount);
        }

        String[] split = cpcTypeCount.split("\\|");
        if (split.length == BaseCountUtil.TYPE_COUNT_NUM) {
            baseCount.setCpcTypeCountCoach1(Long.valueOf(split[0]));
            baseCount.setCpcTypeCountCoach2(Long.valueOf(split[1]));
            baseCount.setCpcTypeCountCoach3(Long.valueOf(split[2]));
            baseCount.setCpcTypeCountCoach4(Long.valueOf(split[3]));
            baseCount.setCpcTypeCountTruck1(Long.valueOf(split[4]));
            baseCount.setCpcTypeCountTruck2(Long.valueOf(split[5]));
            baseCount.setCpcTypeCountTruck3(Long.valueOf(split[6]));
            baseCount.setCpcTypeCountTruck4(Long.valueOf(split[7]));
            baseCount.setCpcTypeCountTruck5(Long.valueOf(split[8]));
            baseCount.setCpcTypeCountTruck6(Long.valueOf(split[9]));
            baseCount.setCpcTypeCountSpecial1(Long.valueOf(split[10]));
            baseCount.setCpcTypeCountSpecial2(Long.valueOf(split[11]));
            baseCount.setCpcTypeCountSpecial3(Long.valueOf(split[12]));
            baseCount.setCpcTypeCountSpecial4(Long.valueOf(split[13]));
            baseCount.setCpcTypeCountSpecial5(Long.valueOf(split[14]));
            baseCount.setCpcTypeCountSpecial6(Long.valueOf(split[15]));

            Long coachTotal = Arrays.stream(split).limit(4).map(count -> Long.valueOf(count)).reduce(0L, Long::sum);
            Long truckTotal = Arrays.stream(split).skip(4).limit(6).map(count -> Long.valueOf(count)).reduce(0L, Long::sum);
            Long specialTotal = Arrays.stream(split).skip(10).map(count -> Long.valueOf(count)).reduce(0L, Long::sum);

            baseCount.setCpcTypeCountCoachTotal(coachTotal);
            baseCount.setCpcTypeCountTruckTotal(truckTotal);
            baseCount.setEtcTypeCountSpecialTotal(specialTotal);
            baseCount.setCpcTypeCountTotal(coachTotal + truckTotal + specialTotal);
        }
    }

    /**
     * 拆分ETC车种交易量
     *
     * @param baseCount BaseCount列表对象
     * @return BaseCount列表对象
     * @author liangshishun
     * @Date 2019-08-01 16:45:05
     */
    public static final void splitEtcClassCount(BaseCount baseCount) {
        String etcClassCount = baseCount.getEtcClassCount();
        if (StringUtils.isBlank(etcClassCount)) {
            etcClassCount = BaseCountUtil.INIT_CLASS_COUNT;
            baseCount.setEtcClassCount(etcClassCount);
        }

        String[] split = etcClassCount.split("\\|");
        if (split.length == BaseCountUtil.CLASS_COUNT_NUM) {
            baseCount.setEtcClassCountNormal(Long.valueOf(split[0]));
            baseCount.setEtcClassCountPolice(Long.valueOf(split[1]));
            baseCount.setEtcClassCountUrgency(Long.valueOf(split[2]));
            baseCount.setEtcClassCountFree(Long.valueOf(split[3]));
            baseCount.setEtcClassCountCarGroup(Long.valueOf(split[4]));
            baseCount.setEtcClassCountGreenCar(Long.valueOf(split[5]));
            baseCount.setEtcClassCountCombine(Long.valueOf(split[6]));
            baseCount.setEtcClassCountRescue(Long.valueOf(split[7]));
            baseCount.setEtcClassCountContainer(Long.valueOf(split[8]));
            baseCount.setEtcClassCountLargeTransport(Long.valueOf(split[9]));
            baseCount.setEtcClassCountEmergencyCar(Long.valueOf(split[10]));
            baseCount.setEtcClassCountTrain(Long.valueOf(split[11]));
            Long total = Arrays.stream(split).map(count -> Long.valueOf(count)).reduce(0L, Long::sum);
            baseCount.setEtcClassCountTotal(total);
        }
    }

    /**
     * 拆分CPC车种交易量
     *
     * @param baseCount BaseCount列表对象
     * @return BaseCount列表对象
     * @author liangshishun
     * @Date 2019-08-01 16:45:05
     */
    public static final void splitCpcClassCount(BaseCount baseCount) {
        String cpcClassCount = baseCount.getCpcClassCount();
        if (StringUtils.isBlank(cpcClassCount)) {
            cpcClassCount = BaseCountUtil.INIT_CLASS_COUNT;
            baseCount.setCpcClassCount(cpcClassCount);
        }

        String[] split = cpcClassCount.split("\\|");
        if (split.length == BaseCountUtil.CLASS_COUNT_NUM) {
            baseCount.setCpcClassCountNormal(Long.valueOf(split[0]));
            baseCount.setCpcClassCountPolice(Long.valueOf(split[1]));
            baseCount.setCpcClassCountUrgency(Long.valueOf(split[2]));
            baseCount.setCpcClassCountFree(Long.valueOf(split[3]));
            baseCount.setCpcClassCountCarGroup(Long.valueOf(split[4]));
            baseCount.setCpcClassCountGreenCar(Long.valueOf(split[5]));
            baseCount.setCpcClassCountCombine(Long.valueOf(split[6]));
            baseCount.setCpcClassCountRescue(Long.valueOf(split[7]));
            baseCount.setCpcClassCountContainer(Long.valueOf(split[8]));
            baseCount.setCpcClassCountLargeTransport(Long.valueOf(split[9]));
            baseCount.setCpcClassCountEmergencyCar(Long.valueOf(split[10]));
            baseCount.setCpcClassCountTrain(Long.valueOf(split[11]));

            Long total = Arrays.stream(split).map(count -> Long.valueOf(count)).reduce(0L, Long::sum);
            baseCount.setCpcClassCountTotal(total);
        }
    }


    /**
     * 重新构造交易量(包括ETC车型\CPC车型\ETC车种\CPC车种)
     *
     * @param baseCount BaseCount对象
     * @author liangshishun
     * @Date 2019-08-01 16:45:05
     */
    public static final void rebuildAllCount(BaseCount baseCount) {
        if (Objects.isNull(baseCount)) {
            return;
        }

        String etcTypeCount = baseCount.getEtcTypeCount();
        etcTypeCount = sumCountStr(etcTypeCount, ";");
        baseCount.setEtcTypeCount(etcTypeCount);

        String cpcTypeCount = baseCount.getCpcTypeCount();
        cpcTypeCount = sumCountStr(cpcTypeCount, ";");
        baseCount.setCpcTypeCount(cpcTypeCount);

        String etcClassCount = baseCount.getEtcClassCount();
        etcClassCount = sumCountStr(etcClassCount, ";");
        baseCount.setEtcClassCount(etcClassCount);

        String cpcClassCount = baseCount.getCpcClassCount();
        cpcClassCount = sumCountStr(cpcClassCount, ";");
        baseCount.setCpcClassCount(cpcClassCount);
    }

    /**
     * 合计车道合并以特定分隔符分隔的交易量
     *
     * @param countStr 车道合并以特定分隔符分隔的交易量
     * @return 交易量
     * @author liangshishun
     * @Date 2019-08-01 16:45:05
     */
    public static final String sumCountStr(String countStr, String regex) {
        if (StringUtils.isBlank(countStr)) {
            return "";
        }

        String[] splitArr = countStr.split(regex);
        String sumStr = splitArr[0];
        // 仅有一个时，直接返回
        if (splitArr.length == 1) {
            return sumStr;
        }

        // 存在多个，则前后相加
        for (int i = 0; i < splitArr.length - 1; i++) {
            String[] currentSumSplit = sumStr.split("\\|");
            String[] nextSplit = splitArr[i+1].split("\\|");
            if (currentSumSplit.length != nextSplit.length) {
                return "";
            }

            StringBuilder sb = new StringBuilder(16);
            for (int j = 0; j < currentSumSplit.length; j++) {
                Long sumCount = Long.valueOf(currentSumSplit[j]) + Long.valueOf(nextSplit[j]);
                sb.append(sumCount).append("|");
            }

            sumStr = sb.substring(0, sb.length()-1);
        }

        return sumStr;
    }
}
