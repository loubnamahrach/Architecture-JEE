# Architecture JEE – Injection des dépendances avec Spring

##  Description

Ce projet a pour objectif de mettre en pratique les concepts fondamentaux de l’architecture logicielle moderne, notamment :

- la séparation en couches (DAO, Métier, Présentation)
- le principe du couplage faible
- l’injection des dépendances
- l’utilisation du conteneur IoC de Spring

L’application démontre comment la couche métier peut utiliser différentes sources de données sans modifier son code.

##  Architecture du projet

Le projet est structuré en plusieurs packages :

- `dao` : contient l’interface d’accès aux données et une implémentation locale
- `ext` : contient une implémentation alternative simulant un Web Service
- `metier` : contient l’interface métier et son implémentation
- `pres` : contient les classes de test et de présentation

Le fichier `config.xml` contient la configuration Spring utilisée pour l’injection XML.

##  Technologies utilisées

- Java
- Framework IoC : Spring
- Gestion de dépendances : Maven
- Gestion de version : GitHub

##  Principe de fonctionnement

###  Couche DAO

Une interface `Idao` définit la méthode `getData()` permettant de récupérer une donnée.

Deux implémentations existent :
- `DaoImpl` : simulation d’une base de données
- `DaoImplV2` : simulation d’un Web Service

###  Couche Métier

La classe `MetierImpl` dépend uniquement de l’interface `Idao`.

Elle récupère la donnée via DAO puis applique un traitement métier (calcul).

Grâce au couplage faible, l’implémentation DAO peut être remplacée sans modifier la logique métier.

###  Couche Présentation

Plusieurs classes permettent de tester les différents types d’injection :

- `pres` → injection manuelle (instanciation statique)
- `PresAvecSpringXml` → injection via fichier XML Spring
- `PressSpringAnnotation` → injection via annotations Spring

##  Injection des dépendances

Ce projet illustre trois méthodes :

###  Injection manuelle
Les objets sont instanciés directement dans le code. Cette méthode crée un couplage fort.

###  Injection dynamique
La dépendance peut être choisie à l’exécution, ce qui rend l’application plus flexible.

###  Injection avec Spring
Spring se charge de créer les objets et d’injecter leurs dépendances.

Deux approches sont utilisées :
- Configuration XML
- Annotations (`@Component`, `@Service`, `@Autowired`)

##  Exécution du projet

Compiler avec Maven :

mvn clean install

Tester l’injection XML :
Lancer la classe :
PresAvecSpringXml

Tester l’injection par annotations :
Lancer la classe :
PressSpringAnnotation

Réalisé par:
## Loubna Mahrach
Master M1 – SDIA
