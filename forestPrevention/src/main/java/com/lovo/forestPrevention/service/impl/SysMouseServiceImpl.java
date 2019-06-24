package com.lovo.forestPrevention.service.impl;


import com.lovo.forestPrevention.bean.dataBean1.SysMouse;
import com.lovo.forestPrevention.dao.ISysMouseDao;
import com.lovo.forestPrevention.service.ISysMouseService;
import db.GetSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class SysMouseServiceImpl implements ISysMouseService {
    @Override
    public int addSysMouse(SysMouse sysMouse) {
        SqlSession session= GetSession.creatSession();
      int Sysmou = session.getMapper(ISysMouseDao.class).SyseusName("mouseName");
        session.commit();
        session.close();
        if (Sysmou>0){
            return 1;
        }else {
            session.getMapper(ISysMouseDao.class).addSysMouse(sysMouse);
            return 0;
        }
    }


    @Override
    public List<SysMouse> getSysMouse(Map<String, Object> map) {
        SqlSession session=GetSession.creatSession();
     List<SysMouse>list=  session.getMapper(ISysMouseDao.class).getSysMouse(map);
        session.close();
        return list;
    }

    @Override
    public int getSysuser(Map<String, Object> map) {
       SqlSession session=GetSession.creatSession();
       int sysuer=  session.getMapper(ISysMouseDao.class).getSysuser(map);
       session.close();
       return sysuer;
    }

    @Override
    public SysMouse inquireSysMouse(int mouseId) {
      SqlSession session=GetSession.creatSession();
      SysMouse sysMouse= session.getMapper(ISysMouseDao.class).inquireSysMouse(mouseId);
        session.close();
        return sysMouse;
    }
}
