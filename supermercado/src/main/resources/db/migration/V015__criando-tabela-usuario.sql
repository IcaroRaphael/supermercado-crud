CREATE TABLE usuario (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  login VARCHAR(255) NOT NULL,
  senha VARCHAR(255) NOT NULL,
  administrador TINYINT(1) DEFAULT 0
);