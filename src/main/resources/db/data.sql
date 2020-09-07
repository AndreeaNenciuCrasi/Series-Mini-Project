INSERT INTO SERIES (title, film_genres, number_of_seasons) VALUES
  ( 'Game of Thrones', 'FANTASY', 8),
  ( 'Big Little Lies', 'DRAMA', 2);

INSERT INTO SEASON (title, number_of_episodes, release_date, series_id) VALUES
('season 7', 7, '10.08.2017', 1),
('season 8', 6, '10.08.2019', 1),
('season 1', 7, '02.04.2017', 2),
('season 2', 7, '09.06.2019', 2);

INSERT INTO EPISODE(title, duration, season_id) VALUES
('Dragonstone', 52, 1),
('Stormborn', 53, 1),
('The Queens Justice', 56, 1),
('The Spoils of War', 60, 1),
('Eastwatch', 57, 1),
('Beyond the Wall', 54, 1),
('The Dragon and the Wolf', 52, 1),
('Winterfell', 52, 2),
('A Knight of the Seven Kingdoms', 53, 2),
('The Long Night', 56, 2),
('The Last of the Starks', 60, 2),
('The Bells', 57, 2),
('The Iron Throne', 54, 2),
('Somebodys Dead', 54, 3),
('Serious Mothering', 54, 3),
('Living the Dream', 54, 3),
('Push Comes to Shove', 54, 3),
('Once Bitten', 54, 3),
('Burning Love', 54, 3),
('You Get What You Need', 54, 3);