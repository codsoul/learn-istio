DROP TABLE IF EXISTS user_member;

CREATE TABLE user_member (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              user_name VARCHAR(250) NOT NULL
);

INSERT INTO user_member (user_name) VALUES
('Aliko'),
('Bill'),
('Folrunsho');