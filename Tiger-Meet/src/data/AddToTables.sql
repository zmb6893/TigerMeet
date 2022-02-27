/**
* Add all the initial values to the table.
* @author zmb6893
*/

/* Add all of the questions */
INSERT INTO Questions (Question)
    VALUES
        ("What is your gender?"),
        ("Are you deaf?"),
        ("What are you seeking?"),
        ("What gender should OP be?"),
        ("Are you in a club? If so, what?"),
        ("Where do you live?"),
        ("Are you a gamer? If so, what?"),
        ("Do you like the outside?"),
        ("Are you in greek life?"),
        ("What's your favorite study spot on campus?"),
        ("What's your favorite eatery on campus?"),
        ("Art? If so, what medium?"),
        ("Music? If so, what kind?"),
        ("Favorite animal?");

/* Add all of the possible answers to the questions */
INSERT INTO Answers (Question_ID, Answer)
    VALUES
        (1, "Nonbinary"),
        (1, "Female"), 
        (1, "Male"),
        (1, "Other"),
        (2, "Yes"),
        (2, "No"),
        (3, "Friend"),
        (3, "Partner"),
        (4, "Nonbinary"),
        (4, "Female"),
        (4, "Male"),
        (4, "Other"),
        (5, "WiC"),
        (5, "TBD"),
        (6, "On Campus"),
        (6, "Off Campus"),
        (6, "Out of State/Country"),
        (7, "Sandbox"),
        (7, "RTS"),
        (7, "FPS"),
        (7, "MOBA"),
        (7, "RPG"),
        (7, "Puzzles"),
        (8, "Yes"),
        (8, "No"),
        (9, "Yes"),
        (9, "No"),
        (10, "GCCIS"),
        (10, "GV"),
        (10, "KGCOE"),
        (10, "Eng Tech"),
        (10, "Sus"),
        (10, "Saunders"),
        (10, "Gosnell"),
        (10, "Library"),
        (10, "SAU"),
        (10, "Health Sciences and Tech"),
        (10, "Institute Hall"),
        (10, "Booth"),
        (10, "Gannett"),
        (11, "Midnight Oil"),
        (11, "Cantina and Gril"l),
        (11, "Crossroads"),
        (11, "Nathan's Soup and Salads"),
        (11, "Ben and Jerry's"),
        (11, "Ritz Sports Zone"),
        (11, "Brick City Cafe"),
        (11, "The Commons"),
        (11, "Gracies"),
        (11, "Beanz"),
        (11, "College Grind"),
        (11, "Artesanos"),
        (12, "Paint"),
        (12, "Sculpt"),
        (12, "Print"),
        (12, "Collage"),
        (12, "Etching"),
        (12, "Drawing"),
        (13, "Pop"),
        (13, "Country"),
        (13, "Rap"),
        (13, "Rock"),
        (13, "Classic"),
        (13, "Dance"),
        (13, "N/A"),
        (14, "Dog"),
        (14, "Cat");