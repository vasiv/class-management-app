CREATE TABLE IF NOT EXISTS `TestQuestion` (
    ID INT NOT NULL,
    TestID INT NOT NULL,
    QuestionID INT NOT NULL,
    PRIMARY KEY (ID),
    FOREIGN KEY TestID to Test(ID),
    FOREIGN KEY QuestionID to Question(ID)
)