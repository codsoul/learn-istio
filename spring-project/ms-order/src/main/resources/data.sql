DROP TABLE IF EXISTS user_order;

CREATE TABLE user_order (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              name VARCHAR(250) NOT NULL,
                              member_id BIGINT NOT NULL,
                              description VARCHAR(250) NOT NULL
);

INSERT INTO user_order (name, member_id, description) VALUES
('A0001', 1, 'Breakfast'),
('A0002', 1, 'Lunch'),
('A0003', 1, 'Dinner'),

('B0001', 2, 'TB'),
('B0002', 2, 'JD'),
('B0003', 2, 'PDD'),

('C0001', 3, ''),
('C0002', 3, ''),
('C0003', 3, '');