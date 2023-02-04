DROP DATABASE IF EXISTS JEPOS;
CREATE DATABASE IF NOT EXISTS JEPOS;
SHOW DATABASES;
USE JEPOS;

DROP TABLE IF EXISTS Customer;
CREATE TABLE Customer
(
    id      VARCHAR(9)  NOT NULL,
    name    VARCHAR(45) NULL,
    address TEXT        NULL,
    salary  DOUBLE      NULL,
    CONSTRAINT PRIMARY KEY (id)
);

INSERT INTO Customer
VALUES ('C00-001', 'Pahasara', 'Wakwalla,Galle', 50000),
       ('C00-002', 'Manu', 'Bandaragama,Pandura', 25000);

SHOW TABLES;
DESCRIBE Customer;

DROP TABLE IF EXISTS Item;
CREATE TABLE Item
(
    code        VARCHAR(9)  NOT NULL,
    description VARCHAR(45) NULL,
    qtyOnHand   INT         NULL,
    unitPrice   DOUBLE      NULL,
    CONSTRAINT PRIMARY KEY (code)
);

INSERT INTO Item
VALUES ('I00-001', 'Pizza', 45, 999),
       ('I00-002', 'Fish Buns', 15, 70);

SHOW TABLES;
DESCRIBE Item;

DROP TABLE IF EXISTS Orders;
CREATE TABLE Orders
(
    oid      VARCHAR(9)  NOT NULL,
    date     DATE,
    cusId    VARCHAR(9)  NOT NULL,
    subTotal DOUBLE,
    discount INT,
    CONSTRAINT PRIMARY KEY (oid),
    CONSTRAINT FOREIGN KEY (cusId) REFERENCES Customer (id) ON DELETE CASCADE ON UPDATE CASCADE
);

SHOW TABLES;
DESCRIBE Orders;

DROP TABLE IF EXISTS OrderDetails;
CREATE TABLE OrderDetails
(
    oid         VARCHAR(9)  NOT NULL,
    id          VARCHAR(9)  NOT NULL,
    name        VARCHAR(45) NULL,
    code        VARCHAR(9)  NOT NULL,
    description VARCHAR(45) NULL,
    qty         INT,
    price       DOUBLE,
    CONSTRAINT PRIMARY KEY (oid),
    CONSTRAINT FOREIGN KEY (oid) REFERENCES Orders (oid) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT FOREIGN KEY (id) REFERENCES Customer (id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT FOREIGN KEY (code) REFERENCES Item (code) ON DELETE CASCADE ON UPDATE CASCADE
);

SHOW TABLES;
DESCRIBE OrderDetails;


SELECT oid
FROM Orders
ORDER BY oid DESC
LIMIT 1;
