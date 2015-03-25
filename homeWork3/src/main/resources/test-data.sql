insert into contact (id, hobby_id, place_id, first_name, last_name, birth_date) values (1, 1, 2, 'John', 'Smith', '1986-02-28');
insert into contact (id, hobby_id, place_id, first_name, last_name, birth_date) values (2, 2, 2, 'John', 'Konstantin', '1980-07-20');
insert into contact (id, hobby_id, place_id, first_name, last_name, birth_date) values (3, 1, 1, 'Steve', 'McCqueen', '1988-01-01');


insert into hobby (id, title, description) values (1, 'Soccer', 'Sportschool');
insert into hobby (id, title, description) values (2, 'Violin', 'Musicschool');
insert into hobby (id, title, description) values (3, 'Videogame', 'XBOX one');


insert into place(id, title, description) values (1, 'Somewhere1', 'Opera');
insert into place(id, title, description) values (2, 'Somewhere2', 'Cinematheater');
insert into place(id, title, description) values (3, 'Somewhere3', 'Cafe');

insert into message(id, content, contact_from_id, contact_to_id) values (1, 'First message', 2, 1);
insert into message(id, content, contact_from_id, contact_to_id) values (2, 'Second message', 3, 1);
insert into message(id, content, contact_from_id, contact_to_id) values (3, 'Third message', 1, 3);


