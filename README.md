# Interface Web de Pilotage d'une ligne de production
Ce programme est un outil de démonstration pour une interface web permettant la supervision et le contrôle d'une ligne de production.

## I. Utiliser l'application

Pour démarrer le programme

    ./gradlew run

Pour accèder à la page principale

    https://[host]:[port]/home

Pour intérragir avec l'API :

    https://[host]:[port]/swagger-ui/index.html

Pour accèder à la base de donnée :

    https://[host]:[port]/console


## II. Les différentes vues
L'application se divise en différentes vues: 
- Une page principale
- Des pages machines (dans se projet, une seule est développée en détail)
- Des pages paramètres, mode manuel et de contrôle des variables pour chaque machine
## III. Fonctionnalités des différentes vues
Toutes les vues contiennent:
- Un bandeau d'alerte permettant d'être informé en temps direct
des évènements occurants sur la ligne de production. 
Celles-ci varient en importance (indiquée par un code couleur) 
et donnent accès aux pages pertinentes.
- Un lien vers la page principale.

### III.1. Page principale
Cette page contient une liste des machines informant de leurs états et des liens pour accéder aux pages correspondantes.

### III.2 Page machine
Cette page contient les informations et actions relatives à une machine spécifique. Permet d'accéder aux pages paramètres, mode manuel et vue des variables de ladite machine.

### III.3 Paramètres
Page permettant de régler les paramètres de fonctionnement d'une machine.

### III.4 Mode manuel
Page offrant un contrôle manuel d'une machine. 

### III.5 Vue des variables
Page listant l'état des variables relatives à une machine.
