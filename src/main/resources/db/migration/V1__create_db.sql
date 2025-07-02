CREATE TABLE client (
    ID IDENTITY PRIMARY KEY,
    name VARCHAR(200) NOT NULL CHECK (LENGTH(name) >= 3 AND LENGTH(name) <= 200)
);

CREATE TABLE planet (
    ID VARCHAR(3) NOT NULL CHECK (ID IN ('MER', 'VEN', 'EAR', 'MAR', 'JUP', 'SAT', 'URA', 'NEP')),
    name VARCHAR(500) NOT NULL CHECK (LENGTH(name) >= 1 AND LENGTH(name) <= 500),
    PRIMARY KEY (ID)
);

CREATE TABLE ticket (
    ID IDENTITY  PRIMARY KEY,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    client_id BIGINT NOT NULL,
    from_planet_id VARCHAR(3) NOT NULL,
    to_planet_id VARCHAR(3) NOT NULL,
    CONSTRAINT fk_client FOREIGN KEY (client_id) REFERENCES client(ID),
    CONSTRAINT fk_from_planet FOREIGN KEY (from_planet_id) REFERENCES planet(ID),
    CONSTRAINT fk_to_planet FOREIGN KEY (to_planet_id) REFERENCES planet(ID)
);