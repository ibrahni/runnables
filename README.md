## Score flow
```mermaid
  graph TD;
      Start["StartGame"] --> PlayerAFifteen["PlayerAFifteenLove"]
      Start --> PlayerBFifteen["LovePlayerBFifteen"]
  
      PlayerAFifteen --> PlayerAThirty["PlayerAThirtyLove"]
      PlayerAFifteen --> FifteenAll["FifteenAll"]
      PlayerBFifteen --> FifteenAll
      PlayerBFifteen --> PlayerBThirty["LovePlayerBThirty"]
  
      PlayerAThirty --> PlayerAForty["PlayerAFortyLove"]
      PlayerAThirty --> ThirtyAll["ThirtyAll"]
      FifteenAll --> ThirtyAll
      FifteenAll --> PlayerAThirty
      FifteenAll --> PlayerBThirty
      PlayerBThirty --> PlayerBForty["LovePlayerBForty"]
      PlayerBThirty --> ThirtyAll
  
      PlayerAForty --> PlayerAWins["PlayerAWins"]
      PlayerAForty --> Deuce["Deuce"]
      ThirtyAll --> PlayerAForty
      ThirtyAll --> PlayerBForty
      PlayerBForty --> PlayerBWins["PlayerBWins"]
      PlayerBForty --> Deuce
      
      Deuce --> PlayerAAdvantage["PlayerAAdvantage"]
      Deuce --> PlayerBAdvantage["PlayerBAdvantage"]
  
      PlayerAAdvantage --> PlayerAWins
      PlayerAAdvantage --> Deuce
      PlayerBAdvantage --> PlayerBWins
      PlayerBAdvantage --> Deuce
