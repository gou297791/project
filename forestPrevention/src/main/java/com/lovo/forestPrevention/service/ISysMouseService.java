package com.lovo.forestPrevention.service;

import com.lovo.forestPrevention.bean.dataBean1.SysMouse;

import java.util.List;
import java.util.Map;

public interface ISysMouseService {
    /**
     * 添加鼠害
     *
     * @param sysMouse 鼠害对象int
     * @return int  判断名称是否存在,1代表存在
     */
    public int addSysMouse(SysMouse sysMouse);

    /**
     * 根据名称模糊查询鼠害信息
     * @param map 鼠害名（模糊），分页起始行，分页显示行数
     * @return SysMouse 鼠害对象
     */
    public List<SysMouse> getSysMouse(Map<String, Object> map);

    /**
     * 获得总行数
     * @param map 名称，食物，主要危害
     * @return
     */
    public int getSysuser(Map<String, Object> map);
    /**
     * 根据id查询鼠害详细信息
     * @param mouseId 鼠害id
     * @return SysMouse 鼠害对象
     */
    public SysMouse inquireSysMouse(int mouseId);

}
