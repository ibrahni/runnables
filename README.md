## Score flow
```mermaid
  graph TD;
      Start["0-0"] --> A15["15-0"]
      Start --> B15["0-15"]
      
      A15 --> A30["30-0"]
      A15 --> AB15["15-15"]
      B15 --> AB15
      B15 --> B30["0-30"]
      
      A30 --> A40["40-0"]
      A30 --> AB30["30-30"]
      AB15 --> AB30
      AB15 --> A30
      AB15 --> B30
      B30 --> B40["0-40"]
      B30 --> AB30
      
      A40 --> AWin["Player A wins"]
      A40 --> Deuce["Deuce"]
      AB30 --> A40
      AB30 --> B40
      B40 --> BWin["Player B wins"]
      B40 --> Deuce
      
      Deuce --> AAdv["Player A Advantage"]
      Deuce --> BAdv["Player B Advantage"]
      
      AAdv --> AWin
      AAdv --> Deuce
      BAdv --> BWin
      BAdv --> Deuce
