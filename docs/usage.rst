============
Usage
============

I. Utiliser l'application
Pour démarrer le programme

	./gradlew Bootrun
	Pour accèder à la page principale

	http://[host]:[port]/home
	Pour intérragir avec l'API :

	http://[host]:[port]/swagger-ui/index.html
	Pour ajouter une machine VL10 : le fichier Json doit avoir cette forme :

	{
    	"name": "nom de la machine",
    	"machineMode": "MANUAL",
    	"statusId": 3
	} 

	Sans id, car celui-ci se génère automatiquement et avec un statusId entre 1 et 12

	Pour accèder à la base de donnée :

	http://[host]:[port]/console
	avec l'identifiant sa et sans mot de passe. Celui-ci peut être modfier dans le fichier application.properties.
