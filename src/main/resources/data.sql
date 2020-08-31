-- DROP TABLE IF EXISTS stock;
--
-- 	CREATE TABLE stock (
-- 	  id INT AUTO_INCREMENT  PRIMARY KEY,
-- 	  symbol VARCHAR(250),
-- 	  name VARCHAR(250),
-- 	  price DOUBLE,
-- 	  exchange VARCHAR(250),
-- 	  time_stamp VARCHAR(250)
-- 	);

DROP TABLE IF EXISTS filter;

	CREATE TABLE filter (
	  id INT AUTO_INCREMENT  PRIMARY KEY,
	  symbol VARCHAR(250)
	);
	INSERT INTO filter (symbol) VALUES
	  ('SPY'),
	  ('CMCSA'),
	  ('KMI'),
	  ('FG');