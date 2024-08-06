-- Create sequence for author id
CREATE SEQUENCE author_id_seq START WITH 1 INCREMENT BY 1;

-- Create authors table
CREATE TABLE authors (
                         id BIGSERIAL PRIMARY KEY,
                         name VARCHAR(50) NOT NULL,
                         age INT NOT NULL,
                         description VARCHAR(255) NOT NULL,
                         image VARCHAR(255)
);

-- Create books table
CREATE TABLE books (
                       isbn VARCHAR(255) PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       description TEXT NOT NULL,
                       image VARCHAR(255) NOT NULL,
                       author_id BIGINT,
                       FOREIGN KEY (author_id) REFERENCES authors(id)
);