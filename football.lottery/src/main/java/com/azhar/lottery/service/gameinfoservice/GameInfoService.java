package com.azhar.lottery.service.gameinfoservice;

import com.azhar.lottery.bean.game.AsiaGameLines;
import com.azhar.lottery.bean.game.GameInfo;
import com.azhar.lottery.bean.game.WesternGameLines;
import com.azhar.lottery.dao.gamadao.IGameInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by azhar on 17/6/29.
 *
 */



@Service
public class GameInfoService {

    @Autowired
    private IGameInfoDao gameInfoDao;

    @Autowired
    AsiaGameLinesService asiaGameLinesService;

    @Autowired
    WesternGameLinesService westernGameLinesService;


    /**
     *
     * 保存前台传递的表单信息；
     * @param gameInfo    比赛信息实体类
     * @return
     * @throws Exception
     */

    public String addGameInfo(GameInfo gameInfo) throws Exception{
        gameInfoDao.insertGameInfo(gameInfo);
        long gamaId = gameInfo.getId();
        for (AsiaGameLines asigl:gameInfo.getAsiaGameLines()) {
            asigl.setGameID(gamaId);
            asiaGameLinesService.insertAsisLines(asigl);
        }

        for (WesternGameLines westgl : gameInfo.getWesternGameLines()) {
            westgl.setGameID(gamaId);
            westernGameLinesService.insertWesternGameLines(westgl);
        }
        return "0";
    }


    /**
     * 根据用户的ID 查询所有该用户保存的数据
     * @param userID
     * @return
     */
    public List<GameInfo> getInfoByUserID(String userID){
        List<GameInfo> gameList = gameInfoDao.selectGameInfoByUserID(userID);
        return gameList;
    }


    /**
     * 根据用户ID  查询包含该欧赔参数的所有数据
     * @param userID  用户ID；
     * @param lines   欧赔指数；
     * @return
     */
    public List<GameInfo> getGameInfoByLinesAllForWestern(String userID,String lines){
        List<GameInfo> gameList = gameInfoDao.selectGameInfoByLinesAllForWestern(userID,lines);
        return gameList;
    }

    /**
     *
     * 根据用户ID 和盘口参数  查询所有符合的数据
     * @param userID  用户ID
     * @param lines   亚盘盘口
     * @return
     */
    public List<GameInfo> getGameInfoByLinesAllForAsia(String userID,String lines){
        List<GameInfo> gameList = gameInfoDao.selectGameInfoByLinesAllForAsia(userID,lines);
        return gameList;
    }
}
