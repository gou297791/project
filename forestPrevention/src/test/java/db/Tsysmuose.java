package db;

import com.lovo.forestPrevention.bean.dataBean1.SysMouse;
import com.lovo.forestPrevention.service.ISysMouseService;
import com.lovo.forestPrevention.service.impl.SysMouseServiceImpl;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tsysmuose {
    @Test
    public void testmuso(){
        ISysMouseService service=new SysMouseServiceImpl();
        Map map=new HashMap();
        map.put("startNum",1);
        map.put("countPage",10);
        List<SysMouse>l=service.getSysMouse(map);
        System.out.printf(""+l.size());
    }
    @Test
    public void getsysoSou(){
        ISysMouseService service=new SysMouseServiceImpl();
        SysMouse sysMouse=service.inquireSysMouse(2);
        System.out.printf(sysMouse.getMouseName());
    }
}
