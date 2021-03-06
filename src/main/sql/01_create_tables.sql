CREATE TABLE `users` (
   `username` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
   `password` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
   `role` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
   `enabled` tinyint(1) NOT NULL,
   `id_famille` int(11) DEFAULT NULL,
   PRIMARY KEY (`username`),
   UNIQUE KEY `username_UNIQUE` (`username`),
   KEY `fk_user_famille` (`id_famille`),
   CONSTRAINT `fk_user_famille` FOREIGN KEY (`id_famille`) REFERENCES `familles` (`IDfamille`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
 
CREATE TABLE `parametres_web` (
   `id_parametre` int(11) NOT NULL ,
   `libelle_parametre` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
   `valeur_parametre` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
   PRIMARY KEY (`id_parametre`),
   UNIQUE KEY `id_parametre_UNIQUE` (`id_parametre`),
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
 
 