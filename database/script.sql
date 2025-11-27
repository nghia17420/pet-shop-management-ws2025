CREATE SCHEMA PETSHOP;

USE PETSHOP;

CREATE TABLE Person (
pid INT PRIMARY KEY AUTO_INCREMENT,
fullName VARCHAR(100),
gender VARCHAR(10),
birthDate DATE,
phone CHAR(10),
email VARCHAR(100),
role VARCHAR(50)
);

CREATE TABLE Employee (
eid INT PRIMARY KEY,
department VARCHAR(50),
payRate INT, 
employeeType VARCHAR(50),
FOREIGN KEY (eid) REFERENCES Person(pid) 
); 

CREATE TABLE Manager (
mid INT PRIMARY KEY,
department VARCHAR(50),
payRate INT, 
FOREIGN KEY (mid) REFERENCES Person(pid) 
); 

INSERT INTO Person (fullName, gender, birthDate, phone, email, role) 
VALUES
('Tran Trung Nghia', 'Male', '2002-07-10', '0111111111', 'nghia@email.com', 'Manager'),
('Au Hoang Minh Duy', 'Male', '2004-01-01', '0222222222', 'duy@email.com', 'Security'),
('Nguyen Van Huy Minh', 'Male', '2003-11-24', '0333333333', 'hminh@email.com', 'Customer'),
('Nguyen Cong Minh', 'Male', '2002-08-07', '0444444444', 'cminh@email.com', 'House Keeper'),
('Peng Tianyu', 'Male', '2001-05-24', '0555555555', 'peng@email.com', 'Groomer'),
('Nguyen Son Minh', 'Male', '2003-01-01', '0666666666', 'sminh@email.com', 'Staff');

INSERT INTO Manager (mid, department, payRate)
VALUES
(1, 'Security', 300000); 

INSERT INTO Employee (eid, department, payRate, employeeType)
VALUES
(2, 'Security', 100000, 'Fulltime'),
(4, 'House Keeper', 50000, 'Parttime'),
(5, 'Groomer', 200000, 'Fulltime'),
(6, 'Staff', 50000, 'Parttime');

COMMIT;

CREATE TABLE Entity (
enid INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(100),
category VARCHAR(50),
availability BOOL,
price DOUBLE,
description VARCHAR(500)
);

CREATE TABLE Product (
proid INT PRIMARY KEY,
brand VARCHAR(50),
inStock INT,
FOREIGN KEY (proid) REFERENCES Entity(enid) 
);

CREATE TABLE Service (
sid INT PRIMARY KEY,
duration TIME,
FOREIGN KEY (sid) REFERENCES Entity(enid) 
);

CREATE TABLE Pet (
peid INT PRIMARY KEY,
species VARCHAR(50),
breed VARCHAR(50),
birthDate DATE,
gender VARCHAR(10),
color VARCHAR(50),
weight DOUBLE,
FOREIGN KEY (peid) REFERENCES Entity(enid) 
);

CREATE TABLE Ownership (
    petId INT,
    petName VARCHAR(50),
    ownerId INT,
    ownerName VARCHAR(100),
    PRIMARY KEY (petId, ownerId),
    FOREIGN KEY (ownerId) REFERENCES Person(pid),
    FOREIGN KEY (petId) REFERENCES Pet(peid)
);

COMMIT;