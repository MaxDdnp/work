DROP TABLE IF EXISTS CONTACT;
DROP TABLE IF EXISTS HOBBY;
DROP TABLE IF EXISTS PLACE;
DROP TABLE IF EXISTS MESSAGE;


CREATE TABLE CONTACT (
       ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY
     , HOBBY_ID INT FOREIGN KEY REFERENCES HOBBY(ID)
     , PLACE_ID INT FOREIGN KEY REFERENCES PLACE(ID)
     , FIRST_NAME VARCHAR(99) NOT NULL
     , LAST_NAME VARCHAR(99) NOT NULL
     , BIRTH_DATE DATE
);

CREATE TABLE HOBBY (
       ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY
     , TITLE VARCHAR(99) NOT NULL
     , DESCRIPTION VARCHAR(99)
);

CREATE TABLE PLACE (
       ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY
     , TITLE VARCHAR(99) NOT NULL
     , DESCRIPTION VARCHAR(99)
);

CREATE TABLE MESSAGE (
       ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY
     , CONTENT VARCHAR(1000) NOT NULL
     , CONTACT_FROM_ID INT NOT NULL FOREIGN KEY REFERENCES CONTACT(ID)
     , CONTACT_TO_ID INT NOT NULL FOREIGN KEY REFERENCES CONTACT(ID)
);