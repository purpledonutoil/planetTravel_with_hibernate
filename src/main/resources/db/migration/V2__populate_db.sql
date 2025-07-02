INSERT INTO client (name)
VALUES
    ('Albert Einstein'),
    ('Marie Curie'),
    ('Isaac Newton'),
    ('Nikola Tesla'),
    ('Galileo Galilei'),
    ('Charles Darwin'),
    ('Jane Goodall'),
    ('Rosalind Franklin'),
    ('James Watson'),
    ('Ada Lovelace');

INSERT INTO planet (id, name)
VALUES
    ('MER', 'Mercury'),
    ('VEN', 'Venus'),
    ('EAR', 'Earth'),
    ('MAR', 'Mars'),
    ('JUP', 'Jupiter'),
    ('SAT', 'Saturn'),
    ('URA', 'Uranus'),
    ('NEP', 'Neptune');


INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id)
VALUES
    ('2025-06-01 12:00:00', 1, 'EAR', 'MAR'),
    ('2025-06-02 08:30:00', 2, 'VEN', 'EAR'),
    ('2025-06-03 15:15:00', 3, 'MER', 'JUP'),
    ('2025-06-04 20:45:00', 4, 'SAT', 'NEP'),
    ('2025-06-05 11:10:00', 5, 'MAR', 'VEN'),
    ('2025-06-06 13:00:00', 6, 'URA', 'VEN'),
    ('2025-06-07 09:25:00', 7, 'EAR', 'SAT'),
    ('2025-06-08 17:40:00', 8, 'JUP', 'EAR'),
    ('2025-06-09 14:00:00', 9, 'NEP', 'URA'),
    ('2025-06-10 07:50:00', 10, 'VEN', 'MER');
