package com.azhar.lottery.web.bean;

import com.azhar.lottery.bean.game.GameInfo;
import com.azhar.lottery.service.gameinfoservice.GameInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by azhar on 17/6/30.
 */
@Controller
public class GameInfoController {

    @Autowired
    private GameInfoService gameInfoService;




    /**
     *
     * 保存前台传递的表单信息；
     * @param gameInfo    比赛信息实体类
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "gameinfo/add")
    public
    @ResponseBody
    GameInfo addGameInfo(@RequestBody GameInfo gameInfo) {

        if (gameInfo != null) {

            try {
                gameInfoService.addGameInfo(gameInfo);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return gameInfo;
    }


    /**
     * 根据用户的ID 查询所有该用户保存的数据
     * @param userID
     * @return
     */
    @RequestMapping(value = "gameinfo/getInfoByUserID",method = RequestMethod.GET)
    @ResponseBody
    public List<GameInfo> getGameInfoByUserID(String userID){
        List<GameInfo> gamaList = null;
        if(userID!=null){

            gamaList =gameInfoService.getInfoByUserID(userID);
        }

        return  gamaList;
    }


    /**
     * 根据用户ID  查询包含该欧赔参数的所有数据
     * @param userID  用户ID；
     * @param lines   欧赔指数；
     * @return
     */
    @RequestMapping(value = "gameinfo/getGameInfoBylinesWestern",method = RequestMethod.GET)
    @ResponseBody
    public List<GameInfo> getGameInfoBylinesWestern(String userID,String lines){
        List<GameInfo> gamaList = null;
        if(userID!=null){

            gamaList =gameInfoService.getGameInfoByLinesAllForWestern(userID,lines);
        }

        return  gamaList;
    }


    /**
     *
     * 根据用户ID 和盘口参数  查询所有符合的数据
     * @param userID  用户ID
     * @param lines   亚盘盘口
     * @return
     */
    @RequestMapping(value = "gameinfo/getGameInfoBylinesAsia",method = RequestMethod.GET)
    @ResponseBody
    public List<GameInfo> getGameInfoBylinesAsia(String userID,String lines){
        List<GameInfo> gamaList = null;
        if(userID!=null){

            gamaList =gameInfoService.getGameInfoByLinesAllForAsia(userID,lines);
        }

        return  gamaList;
    }


}
