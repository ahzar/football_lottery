package com.azhar.lottery.service.gameinfoservice;

import com.azhar.lottery.bean.game.AsiaGameLines;
import com.azhar.lottery.dao.gamadao.AsiaGameLinesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by azhar on 17/6/30.
 * 亚盘盘口  水位
 */

@Service
public class AsiaGameLinesService {

    @Autowired
    private AsiaGameLinesDao asiaGameLinesDao;

    public String insertAsisLines(AsiaGameLines asiaGameLines){
        String code  = "";
        if(asiaGameLines!=null){

            try {
                asiaGameLinesDao.insertAsiaGameLines(asiaGameLines);
                code = "0";
            } catch (Exception e) {
                e.printStackTrace();
                code="1";
            }
        }else {
            code = "id为空了";
        }
        return code;
    }
}
