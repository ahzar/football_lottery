package com.azhar.lottery.dao.gamadao;

import com.azhar.lottery.bean.game.GameInfo;
import com.azhar.lottery.bean.game.WesternGameLines;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by azhar on 17/6/29.
 */
@Repository
public interface IGameInfoDao {

    int insertGameInfo(GameInfo gameInfo);
    List<GameInfo> selectGameInfoByUserID(String userID);
    List<GameInfo> selectGameInfoByLinesAllForWestern(@Param("userID") String userID, @Param("lines") String lines);   // 根据某个赔率查询；
    void selectGameInfoByLinesAllForWestern(WesternGameLines lines);  // 根据欧赔查询；
    List<GameInfo> selectGameInfoByLinesAllForAsia(@Param("userID") String userID, @Param("lines") String lines);      //根据亚盘盘口查询；

}
