package com.azhar.lottery.service.billservice;

import com.azhar.lottery.bean.mybills.Mybills;
import com.azhar.lottery.dao.billsdao.IMybillsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by azhar on 17/7/5.
 */
@Service
public class MybillsService {

    @Autowired
    private IMybillsDao mybillsDao;

    public void insertBills(Mybills mybills) throws Exception{

        mybillsDao.insertBills(mybills);
    }


    public List<Mybills> selectAllBills(String userID) throws Exception{
        return mybillsDao.selectAllBills(userID);
    }
}
