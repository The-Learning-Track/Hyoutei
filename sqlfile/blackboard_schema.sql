-- Drop all the tables if they exist
DROP TABLE IF EXISTS students CASCADE;
DROP TABLE IF EXISTS courses CASCADE;
DROP TABLE IF EXISTS studentsTakecourses CASCADE;
DROP TABLE IF EXISTS columns CASCADE;
DROP TABLE IF EXISTS grades CASCADE;

-- Drop all sequences if they exist
DROP SEQUENCE IF EXISTS Users_id_seq;
DROP SEQUENCE IF EXISTS Course_id_seq;
DROP SEQUENCE IF EXISTS Column_id_seq;

-- Create all Sequences
CREATE SEQUENCE Users_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

CREATE SEQUENCE Course_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

CREATE SEQUENCE Column_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

-- Create Tables
CREATE TABLE students
  ( 
	userid       INT NOT NULL DEFAULT nextval('Users_id_seq'), 
	username VARCHAR(255) NOT NULL,
	lastname VARCHAR(255) NOT NULL,
	firstname VARCHAR(255) NOT NULL,
	UNIQUE(username),
	CONSTRAINT users_pk PRIMARY KEY (userid)
  );

CREATE TABLE courses
  ( 
	courseid       INT NOT NULL DEFAULT nextval('Course_id_seq'), 
	coursename VARCHAR(255) NOT NULL,
	UNIQUE(coursename),
	CONSTRAINT courses_pk PRIMARY KEY (courseid)
  );

CREATE TABLE studentsTakecourses
  ( 
	userid INT REFERENCES students(userid),
	courseid INT REFERENCES courses(courseid),
	CONSTRAINT studentsTakecourses_pk PRIMARY KEY (userid,courseid)
  );

CREATE TABLE columns
  ( 
	possiblepoints DOUBLE PRECISION NOT NULL,
	columnid INT NOT NULL DEFAULT nextval('Column_id_seq'),
	assignmentname VARCHAR(255) NOT NULL,
	catagory VARCHAR(255) NOT NULL,
	courseid INT REFERENCES courses(courseid),
	UNIQUE(assignmentname),
	CONSTRAINT columns_pk PRIMARY KEY (columnid)
  );

CREATE TABLE grades
  ( 
	score DOUBLE PRECISION NOT NULL,
	columnid INT REFERENCES columns(columnid),
	userid INT REFERENCES students(userid),
	CONSTRAINT grades_pk PRIMARY KEY (columnid,userid)
  );

-- INSERT ONE USER
INSERT INTO students (username, lastname, firstname) VALUES('test01','first01','last01'); 
INSERT INTO students (username, lastname, firstname) VALUES('test02','first02','last02'); 
INSERT INTO students (username, lastname, firstname) VALUES('test03','first03','last03'); 
INSERT INTO students (username, lastname, firstname) VALUES('test04','first04','last04'); 
INSERT INTO students (username, lastname, firstname) VALUES('test05','first05','last05'); 
INSERT INTO students (username, lastname, firstname) VALUES('test06','first06','last06'); 
INSERT INTO students (username, lastname, firstname) VALUES('test07','first07','last07'); 
INSERT INTO students (username, lastname, firstname) VALUES('test08','first08','last08'); 
INSERT INTO students (username, lastname, firstname) VALUES('test09','first09','last09'); 
INSERT INTO students (username, lastname, firstname) VALUES('test10','first10','last10'); 
INSERT INTO students (username, lastname, firstname) VALUES('test11','first11','last11'); 
INSERT INTO students (username, lastname, firstname) VALUES('test12','first12','last12'); 
INSERT INTO students (username, lastname, firstname) VALUES('test13','first13','last13'); 
INSERT INTO students (username, lastname, firstname) VALUES('test14','first14','last14'); 
INSERT INTO students (username, lastname, firstname) VALUES('test15','first15','last15'); 
INSERT INTO students (username, lastname, firstname) VALUES('test16','first16','last16'); 
INSERT INTO students (username, lastname, firstname) VALUES('test17','first17','last17'); 
INSERT INTO students (username, lastname, firstname) VALUES('test18','first18','last18'); 
INSERT INTO students (username, lastname, firstname) VALUES('test19','first19','last19'); 
INSERT INTO students (username, lastname, firstname) VALUES('test20','first20','last20'); 
INSERT INTO students (username, lastname, firstname) VALUES('test21','first21','last21'); 
INSERT INTO students (username, lastname, firstname) VALUES('test22','first22','last22'); 
INSERT INTO students (username, lastname, firstname) VALUES('test23','first23','last23'); 
INSERT INTO students (username, lastname, firstname) VALUES('test24','first24','last24'); 
INSERT INTO students (username, lastname, firstname) VALUES('test25','first25','last25'); 
INSERT INTO students (username, lastname, firstname) VALUES('test26','first26','last26'); 
INSERT INTO students (username, lastname, firstname) VALUES('test27','first27','last27'); 
INSERT INTO students (username, lastname, firstname) VALUES('test28','first28','last28'); 
INSERT INTO students (username, lastname, firstname) VALUES('test29','first29','last29'); 
INSERT INTO students (username, lastname, firstname) VALUES('test30','first30','last30'); 


