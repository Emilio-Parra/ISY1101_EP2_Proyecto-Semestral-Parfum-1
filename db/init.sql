CREATE DATABASE IF NOT EXISTS perfumeria_db;
USE perfumeria_db;

CREATE TABLE IF NOT EXISTS ventas_perfumes (
  id_venta BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombre_cliente VARCHAR(120) NOT NULL,
  perfume VARCHAR(120) NOT NULL,
  marca VARCHAR(120) NOT NULL,
  familia_olfativa VARCHAR(80),
  concentracion VARCHAR(40),
  mililitros INT NOT NULL,
  cantidad INT NOT NULL,
  direccion_compra VARCHAR(255) NOT NULL,
  valor_compra INT NOT NULL,
  fecha_compra DATE NOT NULL,
  despacho_generado BOOLEAN DEFAULT FALSE
);

CREATE TABLE IF NOT EXISTS despachos_perfumes (
  id_despacho BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  fecha_despacho DATE NOT NULL,
  transportista VARCHAR(120) NOT NULL,
  codigo_seguimiento VARCHAR(80),
  intento INT DEFAULT 0,
  id_compra BIGINT,
  direccion_compra VARCHAR(255) NOT NULL,
  valor_compra BIGINT,
  estado VARCHAR(40) DEFAULT 'Pendiente',
  despachado BOOLEAN DEFAULT FALSE
);

INSERT INTO ventas_perfumes
(id_venta, nombre_cliente, perfume, marca, familia_olfativa, concentracion, mililitros, cantidad, direccion_compra, valor_compra, fecha_compra, despacho_generado)
VALUES
(1, 'Camila Torres', 'Aura Nocturne', 'Parfum', 'Amaderada', 'Eau de Parfum', 100, 1, 'Av. Providencia 1250, Santiago', 58990, '2026-05-18', false),
(2, 'Diego Rivas', 'Flor de Ámbar', 'Parfum', 'Oriental floral', 'Parfum', 75, 2, 'Los Leones 450, Providencia', 89980, '2026-05-18', false),
(3, 'Valentina Soto', 'Citrus Élégance', 'Parfum', 'Cítrica', 'Eau de Toilette', 100, 1, 'Irarrázaval 3100, Ñuñoa', 39990, '2026-05-18', true)
ON DUPLICATE KEY UPDATE perfume = VALUES(perfume);

INSERT INTO despachos_perfumes
(id_despacho, fecha_despacho, transportista, codigo_seguimiento, intento, id_compra, direccion_compra, valor_compra, estado, despachado)
VALUES
(1, '2026-05-19', 'Aura Express', 'MA-3-1020', 1, 3, 'Irarrázaval 3100, Ñuñoa', 39990, 'En ruta', false)
ON DUPLICATE KEY UPDATE estado = VALUES(estado);
