package com.lovo.forestPrevention.service;

import com.lovo.forestPrevention.bean.dataBean1.SysSick;

import java.util.List;
import java.util.Map;

public interface ISysSickService {
    /**
     * 添加病害
     * @param sysSick 病害对象
     */
    public boolean addSysSick(SysSick sysSick);

    /**
     * 根据病害名称和发病症状模糊查询病害信息
     * @param map （病害名称（模糊），发病症状（模糊），分页起始行，分页显示行数）
     * @return SysSick 病害对象
     */
    public List<SysSick> getSysSick(Map<String, Object> map);

    /**
     * 获得总行数
     * @param map 显示总行数
     * @return 病害对象
     */
    public int getinquirSysSick(Map<String, Object> map);
    /**
     * 根据id查看病害详细信息
     * @param sickId 病害id
     * @return SysSick 病害对象
     */
    public SysSick inquireSysSick(int sickId);
}
