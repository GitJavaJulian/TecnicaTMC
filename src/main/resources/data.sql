CREATE TABLE prices (
  BRAND_ID INT NOT NULL,
  START_DATE TIMESTAMP NOT NULL,
  END_DATE TIMESTAMP NOT NULL,
  PRICE_LIST INT  NOT NULL,
  PRODUCT_ID INT NOT NULL,
  PRIORITY INT  NOT NULL,
  PRICE DECIMAL(20,2) NOT NULL,
  CURR VARCHAR(5) NOT NULL,
  PRIMARY KEY (PRICE_LIST)
);

INSERT INTO prices VALUES (1, '2020-06-14 00.00.00', '2020-12-31 23.59.59', 1, 35455, 0, 35.50, 'EUR');
INSERT INTO prices VALUES (1, '2020-06-14 15.00.00', '2020-06-14 18.30.00', 2, 35455, 1, 25.45, 'EUR');
INSERT INTO prices VALUES (1, '2020-06-15 00.00.00', '2020-06-15 11.00.00', 3, 35455, 1, 30.50, 'EUR');
INSERT INTO prices VALUES (1, '2020-06-15 16.00.00', '2020-12-31 23.59.59', 4, 35455, 1, 38.95, 'EUR');