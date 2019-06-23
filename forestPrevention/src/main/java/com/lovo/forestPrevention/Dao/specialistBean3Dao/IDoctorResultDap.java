package com.lovo.forestPrevention.Dao.specialistBean3Dao;

import com.lovo.forestPrevention.bean.disasterBean2.SysEvent;
import com.lovo.forestPrevention.bean.specialistBean3.SysDoctor;

public interface IDoctorResultDap {
    /**
     * 添加会商专家
     * @param sysEvent 会商结果对象
     * @param sysDoctor   专家对象
     * @return
     */
    public int addDoctorResult(SysEvent sysEvent, SysDoctor sysDoctor);
}
