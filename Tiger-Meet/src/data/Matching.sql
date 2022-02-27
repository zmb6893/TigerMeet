/**
* Matches between two users.
* @author zmb6893
*/

CREATE TABLE Matching (
    Matching_id primary serial,
    User1 int,
    User2 int,
    Matching_Percent
);