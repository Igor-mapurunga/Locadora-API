CREATE TABLE locadora3 (
    id BIGINT NOT NULL AUTO_INCREMENT,
    marca VARCHAR(255) NOT NULL,
    modelo VARCHAR(255) NOT NULL,
    ano INT NOT NULL,
    cor VARCHAR(50),
    combustivel VARCHAR(50),
    numeroDePortas INT,
    PRIMARY KEY (id)
);
