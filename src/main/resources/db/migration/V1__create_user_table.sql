CREATE TABLE packages (
  key varchar (100) PRIMARY KEY,
  ordernumber VARCHAR(100) not null ,
  receiver VARCHAR(64) NOT NULL,
  telephone VARCHAR(100) NOT NULL,
  weight  int NOT NULL,
  status varchar (64),
  ordertime varchar(64)
);