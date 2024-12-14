CREATE TABLE todo_item (
    todo_id VARCHAR(36) PRIMARY KEY,
    creation_time TIMESTAMP NOT NULL,
    description VARCHAR(255) NOT NULL,
    status TINYINT CHECK (status BETWEEN 0 AND 2)
);