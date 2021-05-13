DROP TABLE IF EXISTS user_product;

CREATE TABLE user_product (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              name VARCHAR(250) NOT NULL,
                              member_id BIGINT NOT NULL,
                              region VARCHAR(250) NOT NULL
);

INSERT INTO user_product (name, member_id, region) VALUES
('Apple', 1, 'HK'),
('Banana', 1, 'HK'),
('Orange', 1, 'HK'),

('Apple2', 2, 'SG'),
('Banana2', 2, 'SG'),
('Orange2', 2, 'SG'),

('Apple2', 3, 'SG'),
('Banana2', 3, 'SG'),
('Orange2', 3, 'SG');