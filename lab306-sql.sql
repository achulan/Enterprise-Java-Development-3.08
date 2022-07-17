CREATE SCHEMA Lab308;
USE Lab308;

CREATE TABLE MEMBER (
	id INT AUTO_INCREMENT NOT NULL,
    NAME VARCHAR(255),
    STATUS VARCHAR(255),
    renewal_date DATE,
    PRIMARY KEY(id)
);

CREATE TABLE chapter (
	id INT AUTO_INCREMENT NOT NULL,
    NAME VARCHAR(255),
    district VARCHAR(255),
    president INT,
    PRIMARY KEY(id),
    FOREIGN KEY(president) REFERENCES MEMBER(id)
);

CREATE TABLE chapter_member (
	chapter_id INT,
    member_id INT,
    FOREIGN KEY(chapter_id) REFERENCES chapter(id),
    FOREIGN KEY(member_id) REFERENCES MEMBER(id)
);


