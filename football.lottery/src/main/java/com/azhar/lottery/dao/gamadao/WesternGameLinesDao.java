package com.azhar.lottery.dao.gamadao;

import com.azhar.lottery.bean.game.GameInfo;
import com.azhar.lottery.bean.game.WesternGameLines;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by azhar on 17/6/29.
 */

@Repository
public interface WesternGameLinesDao {


    void insertWesternGameLines(WesternGameLines gameLines) throws Exception;
    List<GameInfo> selectGameInfoByLinesAllForWestern(WesternGameLines lines) throws Exception;      //根据欧赔查询；
    List<GameInfo> selectGameInfoByLines(String lines) throws Exception;     //根据欧赔某个赔率项进行查询；
}
