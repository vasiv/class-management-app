CREATE TABLE IF NOT EXISTS `Answer` (
    ID INT NOT NULL,
    Value TEXT NOT NULL,
    isCorrect BOOLEAN NOT NULL,
    QuestionID INT,
    PRIMARY KEY (id),
    FOREIGN KEY (QuestionID) REFERENCES Question(ID)
)