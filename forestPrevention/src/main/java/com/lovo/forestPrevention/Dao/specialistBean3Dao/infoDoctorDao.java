package com.lovo.forestPrevention.Dao.specialistBean3Dao;

import com.lovo.forestPrevention.bean.disasterBean2.SysEvent;
import com.lovo.forestPrevention.bean.specialistBean3.SysDoctor;

import java.util.Date;
import java.util.List;

public interface infoDoctorDao {
    /**
     * 添加会商记录
     * @param sysEvent  事件ID
     * @param doctorEventResult 会商结果
     * @param date 会商事件
     * @param list  专家对象
     * @return
     */
   public int adddoctorResult(SysEvent sysEvent, String doctorEventResult , Date date, List<SysDoctor> list);
}
