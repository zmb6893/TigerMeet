/**
* Matches for each user
* @author zmb6893
*/

CREATE TABLE UserMatches (
    UserID foreign key int,
    Matching_TableID foreign key int
);