DROP Table if exists Customer;


CREATE TABLE Customer( 
   id INT auto_INcrement primary key, 
   name VARCHAR(50) NOT NULL, 
   password VARCHAR(20) NOT NULL
);