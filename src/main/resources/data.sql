INSERT INTO MACHINE_STATUS(id, name, description, importance)
VALUES (1,'Eliminer défaut et réarmer machine','Le système est sous tension, déverrouiller les coups de poings d’arrêt d’urgence, et appuyer sur le réarmement du pupitre.', 'PRODUCT_MANAGEMENT_ERROR');
INSERT INTO MACHINE_STATUS(id, name, description, importance)
VALUES (2,'Machine réarmée','Attente du lancement du cycle de production ou de l’activation du mode manuel.', 'PAUSED');
INSERT INTO MACHINE_STATUS(id, name, description, importance)
VALUES (3,'Attente réarmement','Le système est sous tension, déverrouiller les coups de poings d’arrêt d’urgence, et appuyer sur le réarmement du pupitre.', 'EMERGENCY_STOP');
INSERT INTO MACHINE_STATUS(id, name, description, importance)
VALUES (4,'Initialisation en cours','La séquence d’initialisation est en cours d’exécution.','PAUSED');
INSERT INTO MACHINE_STATUS(id, name, description, importance)
VALUES (5,'Mode manuel en cours','Page du mode manuel active, le bouton « SORTIE » suggère une réinitialisation du système.','PAUSED');
INSERT INTO MACHINE_STATUS(id, name, description, importance)
VALUES (6,'Machine à l’arrêt','Le système est en attente d’une impulsion sur la touche Marche pour démarrer le cycle ou d’une utilisation en mode manuel.','EMERGENCY_STOP');
INSERT INTO MACHINE_STATUS(id, name, description, importance)
VALUES (7,'Cycle en cours','la machine est en fonctionnement et exécute une scrutation des zones de stockage, le pot détecté est pris et déposé sur le convoyeur d’évacuation.','IN_PRODUCTION');
INSERT INTO MACHINE_STATUS(id, name, description, importance)
VALUES (8,'Arrêt en fin de cycle','La machine s’arrêtera après la dépose du pot en cours.','PAUSED');
INSERT INTO MACHINE_STATUS(id, name, description, importance)
VALUES (9,'Axe en défaut réarmer le système','Etat après le blocage mécanique d’un des axes du système.','EMERGENCY_STOP');
INSERT INTO MACHINE_STATUS(id, name, description, importance)
VALUES (10,'Accumulation aval sur le convoyeur','la présence d’un pot devant la cellule en sortie du convoyeur met en pause la machine jusqu à la libération de la cellule.','PRODUCT_MANAGEMENT_ERROR');
INSERT INTO MACHINE_STATUS(id, name, description, importance)
VALUES (11,'Accumulation interne sur le convoyeur','la présence d’un pot devant la cellule en interne du convoyeur met en pause la machine jusqu à la libération de la cellule.','PRODUCT_MANAGEMENT_ERROR');
INSERT INTO MACHINE_STATUS(id, name, description, importance)
VALUES (12,'Défaut Présence Air','Vérifier la pression d’alimentation en air du système.','EMERGENCY_STOP');
INSERT INTO MACHINE_STATUS(id, name, description, importance)
VALUES (13,'Défaut convoyeur','Vérifier l’état du convoyeur et éventuellement le message d’erreur sur le variateur avant de redémarrer la machine.','EMERGENCY_STOP');

INSERT INTO MACHINE(TYPE_MACHINE, ID, NAME, state_id)
VALUES ('VL10',-1,'VL10',3);