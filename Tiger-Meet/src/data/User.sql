/**
* The table for the user.
* @author zmb6893
*/

CREATE TABLE User (
    User_ID primary serial, /* Primary key*/
    Username text,
    GoogleID int, 
    User_Answers_ID foreign key int, /* Foreign Key to the user answer ids*/
    Birthdate date
);