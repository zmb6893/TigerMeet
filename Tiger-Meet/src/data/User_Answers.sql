/**
* The table for the each user's answers to each question
* @author zmb6893
*/

CREATE TABLE User_Answers (
    Answers_ID primary serial, /* Primary key */
    User_ID foreign key int, /* Foreign key */
    Q1,
    Q2,
    Q3,
    Q4,
    Q5,
    Q6,
    Q7
);