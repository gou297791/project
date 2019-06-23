package com.lovo.forestPrevention.service;

import com.lovo.forestPrevention.bean.specialistBean3.SysDoctor;

import java.util.List;
import java.util.Map;

public interface IDoctorService {
    /**
     * 添加专家
     * @return
     */
    public  int addDoctor(SysDoctor sysDoctor);

    /**
     * 根据ID查询专家信息
     * @param doctorId 专家ID
     */
    public  void findDoctor(int doctorId);
    /**
     * 根据专家姓名查询专家
     * @param doctorName 专家姓名
     */
    public  void findDoctor(String doctorName);

    /**
     * 修改专家信息
     * @param doctorPost  专家职务
     * @param doctorTel   专家号码
     * @param doctorCompany   专家工作单位
     * @param doctorEmail  专家邮箱
     * @param doctorId   专家Id
     */
    public  void updateDoctor(String doctorPost, String doctorTel, String doctorCompany, String doctorEmail, int doctorId);

    /**
     * 删除专家
     * @param doctorId
     */
    public void removeDoction(int doctorId);
    /**
     * 分页查询专家
     * @param map
     * @return
     */
    public List<SysDoctor> itemFindDoctor(Map<String, Object> map);
    /**
     * 获得总行数
     * @param map
     * @return
     */
    public int getCheckCount(Map<String, Object> map);
}
