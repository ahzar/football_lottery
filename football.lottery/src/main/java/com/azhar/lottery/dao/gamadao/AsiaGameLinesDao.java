package com.azhar.lottery.dao.gamadao;

import com.azhar.lottery.bean.game.AsiaGameLines;
import com.azhar.lottery.bean.game.GameInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by azhar on 17/6/29.
 */

@Repository
public interface AsiaGameLinesDao {


    int insertAsiaGameLines(AsiaGameLines gameLines) throws Exception;
    List<GameInfo> selectGameInfoByLinesAllForAsia(AsiaGameLines lines) throws Exception;      //根据亚盘盘口查询；
    List<GameInfo> selectGameInfoByLines(String lines) throws Exception;

}
