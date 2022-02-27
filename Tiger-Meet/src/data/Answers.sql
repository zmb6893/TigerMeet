/**
* The table for all the potential answers to the questions.
* @author zmb6893
*/

CREATE TABLE Answers (
    Answer_ID primary key serial,
    Question_ID foreign key int,
    Answer text
);