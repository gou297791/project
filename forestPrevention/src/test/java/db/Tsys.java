package db;

import com.lovo.forestPrevention.bean.dataBean1.SysMouse;
import com.lovo.forestPrevention.dao.ISysMouseDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Tsys {
   SqlSession session;
   ISysMouseDao iSysMouseDao;
   @Before
public void before(){
      session=GetSession.creatSession();
       iSysMouseDao=session.getMapper(ISysMouseDao.class);
    }
    @Test
    public void addsysMouse(){
        SysMouse s=new SysMouse();
        s.setMouseName("蝎家鼠");
        s.setMouseFood("各种谷类，肉食");
        s.setMouseBreed("一年6-8胎，每胎7-10只");
        s.setMouseEnemy("蛇");
        s.setMouseMethod("放养蛇，猫头鹰等天地");
        s.setMouseHarm("破坏植被及电缆");
        iSysMouseDao.addSysMouse(s);
//        iSysMouseDao.SyseusName("s");
        System.out.printf(""+s.getMouseId());
    }
    @Test
//    public void cheSysous(){
//       SysMouse m=new SysMouse();
//       m.setMouseId(2);
//       iSysMouseDao.inquireSysMouse();
//        System.out.printf(""+m.getMouseName());
//    }

    @After
    public void after(){
        session.commit();
        session.close();
    }
}
