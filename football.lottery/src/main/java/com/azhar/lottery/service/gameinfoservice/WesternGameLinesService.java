package com.azhar.lottery.service.gameinfoservice;

import com.azhar.lottery.bean.game.WesternGameLines;
import com.azhar.lottery.dao.gamadao.WesternGameLinesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by azhar on 17/6/30.
 * 亚盘盘口  水位
 */

@Service
public class WesternGameLinesService {

    @Autowired
    private WesternGameLinesDao westernGameLinesDao;

    public String insertWesternGameLines(WesternGameLines westernGameLines){
        String code  = "";
        if(westernGameLines!=null){

            try {
                westernGameLinesDao.insertWesternGameLines(westernGameLines);
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
