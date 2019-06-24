package com.lovo.forestPrevention.dao;


import com.lovo.forestPrevention.bean.dataBean1.SysPest;

import java.util.List;
import java.util.Map;

public interface ISysPestDao {
    /**
     * 添加虫害
     * @param sysPest 害虫对象
     */
    public int addSysPest(SysPest sysPest);

    /**
     * 根据害虫名和寄主模糊查询害虫信息
     * @param map 害虫名（模糊），寄主（模糊），分页起始行，分页显示行数
     * @return SysPest 害虫对象
     */
    public List<SysPest> getSysPest(Map<String, Object> map);

    /**
     * 获得总行数
     * @param map 显示总行数
     * @return 害虫对象
     */
    public int getinquSyspest(Map<String, Object> map);
    /**
     * 根据id查询害虫详细信息
     * @param pestId 害虫id
     * @return SysPest害虫对象
     */
    public SysPest inquireSysPest(int pestId);

}
