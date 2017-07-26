/**

     * private String gameTime;   //比赛时间
     private String gameType = "0";   // 比赛类型   0-联赛  1-杯赛   2-友谊赛   默认 0 ;
     private String westernLotteryCorporationsID;         // 西方博彩公司ID
     private String asiaLotteryCorporationsID;            //亚洲博彩公司
     private WesternGameLines westernGameLines;       // 西方胜负赔率;
     private AsiaGameLines asiaGameLines ;               // 亚盘盘口赔率
     private String userID;              //用户ID;
     private String handicap;             // 让球盘；
     private String homeTeam;                // 主队；
     private String visitingTeam;            //客队；
     private String corner;                  // 角球
     private String totalGoals;               //总进球
     private String halfTimeScore;           // 半场比分
     private String Overall;                 //全场比分
 */


CREATE TABLE `game_info`(

  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `gameTime` VARCHAR(16) NOT NULL,
  `gameType` VARCHAR(16) NOT NULL,
  `westernLotteryCorporationsID` VARCHAR(16) NOT NULL,
  `asiaLotteryCorporationsID` VARCHAR(16) NOT NULL,
  `userID` VARCHAR(16) NOT NULL,
  `handicap` VARCHAR(16) NOT NULL,
  `homeTeam` VARCHAR(16) NOT NULL,
  `visitingTeam` VARCHAR(16) NOT NULL,
  `corner` VARCHAR(16) NOT NULL,
  `totalGoals` VARCHAR(16) NOT NULL,
  `halfTimeScore` VARCHAR(16) NOT NULL,
  `Overall` VARCHAR(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE =InnoDB DEFAULT CHARSET =utf8;