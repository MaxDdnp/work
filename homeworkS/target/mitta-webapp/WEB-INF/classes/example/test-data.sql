INSERT INTO contact (id, hobby_id, place_id, first_name, last_name, birth_date) VALUES (1, 1, 2, 'John', 'Smith', '1986-02-28');
INSERT INTO contact (id, hobby_id, place_id, first_name, last_name, birth_date) VALUES (2, 2, 2, 'John', 'Konstantin', '1980-07-20');
INSERT INTO contact (id, hobby_id, place_id, first_name, last_name, birth_date) VALUES (3, 1, 1, 'Steve', 'McCqueen', '1988-01-01');


INSERT INTO hobby (id, title, description) VALUES (1, 'Soccer', 'Sportschool');
INSERT INTO hobby (id, title, description) VALUES (2, 'Violin', 'Musicschool');
INSERT INTO hobby (id, title, description) VALUES (3, 'Videogame', 'XBOX one');


INSERT INTO place(id, title, description) VALUES (1, 'Somewhere1', 'Opera');
INSERT INTO place(id, title, description) VALUES (2, 'Somewhere2', 'Cinematheater');
INSERT INTO place(id, title, description) VALUES (3, 'Somewhere3', 'Cafe');

INSERT INTO message(id, content, contact_from_id, contact_to_id) VALUES (1, 'First message', 2, 1);
INSERT INTO message(id, content, contact_from_id, contact_to_id) VALUES (2, 'Second message', 3, 1);
INSERT INTO message(id, content, contact_from_id, contact_to_id) VALUES (3, 'Third message', 1, 3);