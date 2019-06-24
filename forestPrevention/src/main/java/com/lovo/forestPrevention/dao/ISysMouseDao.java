package com.lovo.forestPrevention.dao;


import com.lovo.forestPrevention.bean.dataBean1.SysMouse;

import java.util.List;
import java.util.Map;

public interface ISysMouseDao {
    /**
     * 添加鼠害
     *
     * @param sysMouse 鼠害对象
     * @return int  判断名称是否存在
     */
    public void addSysMouse(SysMouse sysMouse);

    /**
     * 判断鼠害名是否存在相同,返回1存在，返回0不存在
     * @param mouseName 鼠害名
     * @return
     */
    public int SyseusName(String mouseName);
    /**
     * 根据名称模糊查询鼠害信息
     * @param map 鼠害名（模糊），分页起始行，分页显示行数
     * @return SysMouse 鼠害对象
     */
    public List<SysMouse> getSysMouse(Map<String, Object> map);

    /**
     * 获得总行数
     * @param map 显示总行数
     * @return SysMouse 鼠害对象
     */
    public int getSysuser(Map<String, Object> map);
    /**
     * 根据id查询鼠害详细信息
     * @param mouseId 鼠害id
     * @return SysMouse 鼠害对象
     */
    public SysMouse inquireSysMouse(int mouseId);

}
