package com.azhar.lottery.dao.billsdao;

import com.azhar.lottery.bean.mybills.Mybills;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账单持久化
 * Created by azhar on 17/7/5.
 */

@Repository
public interface IMybillsDao {

    void insertBills(Mybills mybills) throws  Exception;           //插入账单
    List<Mybills> selectAllBills(String userID) throws Exception;        // 搜索账单

}
