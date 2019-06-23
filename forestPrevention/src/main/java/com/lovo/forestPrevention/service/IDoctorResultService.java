package com.lovo.forestPrevention.service;

import com.lovo.forestPrevention.bean.disasterBean2.SysEvent;
import com.lovo.forestPrevention.bean.specialistBean3.SysDoctor;

import java.util.Date;
import java.util.List;

public interface IDoctorResultService {
    /**
     * 添加会商记录
     * 添加专家会商结果表记录（专家会商对象）返回添加的专家会商对象
     * 循环专家集合获得专家对象添加会商专家记录
     * @param sysEvent  时间对象
     * @param doctorEventResult   会商结果
     * @param date  会商时间
     * @param list 专家集合
     * @return  会商记录ID
     */

    public int adddoctorResult(SysEvent sysEvent,String doctorEventResult , Date date, List<SysDoctor> list);
}
