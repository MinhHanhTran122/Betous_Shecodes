Create database shecodes2023;
go
CREATE TABLE DangNhap (
    Username VARCHAR(50) PRIMARY KEY,
    Password VARCHAR(30)
);
	CREATE TABLE DangKy (
    Username VARCHAR(50) PRIMARY KEY,
    Email VARCHAR(70) UNIQUE NOT NULL,
    Password VARCHAR(50) NOT NULL
);
INSERT INTO DangNhap(Username, Password) VALUES
('user1', 'password1'),
('user2', 'password2'),
('user3', 'password3'),
('user4', 'password4'),
('user5', 'password5'),
('user6', 'password6'),
('user7', 'password7'),
('user8', 'password8'),
('user9', 'password9'),
('user10', 'password10');
INSERT INTO DangKy (Username, Email, Password) VALUES
('user1', 'user1@gmail.com', 'password1'),
('user2', 'user2@gmail.com', 'password2'),
('user3', 'user3@gmail.com', 'password3'),
('user4', 'user4@gmail.com', 'password4'),
('user5', 'user5@gmail.com', 'password5'),
('user6', 'user6@gmail.com', 'password6'),
('user7', 'user7@gmail.com', 'password7'),
('user8', 'user8@gmail.com', 'password8'),
('user9', 'user9@gmail.com', 'password9'),
('user10', 'user10@gmail.com', 'password10');

SELECT *FROM DangNhap;
SELECT *FROM DangKy;
CREATE TABLE BacSi (
    ID VARCHAR(10) PRIMARY KEY,
	Name VARCHAR(50),
	Age INTEGER,
	Phonenumber VARCHAR(11)
);
	CREATE TABLE ThongTinDat (
	Patientname VARCHAR(50) PRIMARY KEY,
	Doctorname VARCHAR(50)
);


INSERT INTO BacSi(ID, Name, Age, Phonenumber) VALUES
('ID1', 'name1', 26, 'phonenumber1'),
('ID2', 'name2', 28, 'phonenumber2'),
('ID3', 'name3', 25, 'phonenumber3'),
('ID4', 'name4', 25, 'phonenumber4'),
('ID5', 'name5', 26, 'phonenumber5'),
('ID6', 'name6', 28, 'phonenumber6'),
('ID7', 'name7', 27, 'phonenumber7'),
('ID8', 'name8', 23, 'phonenumber8'),
('ID9', 'name9', 29, 'phonenumber9'),
('ID10', 'name10', 27, 'phonenumber10');

INSERT INTO ThongTinDat(Patientname, Doctorname) VALUES
('benhnhan1', 'bacsi1'),
('benhnhan2', 'bacsi2'),
('benhnhan3', 'bacsi3'),
('benhnhan4', 'bacsi4'),
('benhnhan5', 'bacsi5'),
('benhnhan6', 'bacsi6'),
('benhnhan7', 'bacsi7'),
('benhnhan8', 'bacsi8'),
('benhnhan9', 'bacsi9'),
('benhnhan10', 'bacsi10');

SELECT *FROM BacSi;
SELECT *FROM ThongTinDat;
