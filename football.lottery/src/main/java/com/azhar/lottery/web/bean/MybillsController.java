package com.azhar.lottery.web.bean;

import com.azhar.lottery.bean.mybills.Mybills;
import com.azhar.lottery.service.billservice.MybillsService;
import com.azhar.lottery.utils.MyResult;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by azhar on 17/7/5.
 */
@Controller
public class MybillsController {

    @Autowired
    private MybillsService mybillsService;

    /**
     * 添加账单
     * @param mybills
     * @return
     */

    @RequestMapping(value = "/mybills/add",method = RequestMethod.POST)
    public @ResponseBody
    MyResult insertBills(Mybills mybills){
        MyResult result = new MyResult();

        if(mybills!=null){
            try {
                mybillsService.insertBills(mybills);
                result.setRusult("success");
                result.setMessage("插入成功");
            } catch (Exception e) {
                e.printStackTrace();
                result.setRusult("failure");
                result.setMessage("插入失败");
                return result;
            }
        }
        return result;
    }


    /**
     * 获取账单
     * @param userID  用户ID
     * @return
     */

    @RequestMapping(value = "mybills/getAll",method = RequestMethod.GET)
    @ResponseBody
    public List<Mybills> selectAllBills(String userID){
        System.out.println(userID);
        List<Mybills> mybills = null;
        if(userID!=null){
            try {
                mybills = mybillsService.selectAllBills(userID);
                System.out.println(mybills.toString());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return mybills;
    }
}
