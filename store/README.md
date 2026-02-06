# Tp_Store_API

##  Description

`Tp_Store_API` est une API REST conçue pour la gestion d'une boutique en ligne (Store). Ce projet a été réalisé dans le cadre d'un TP (Travail Pratique) pour mettre en pratique les concepts de développement backend, de gestion de base de données et de manipulation de ressources via des points de terminaison (endpoints) API.

##  Fonctionnalités

* **Gestion des Produits** : CRUD complet (Création, Lecture, Mise à jour, Suppression).
* **Gestion des Catégories** : Organisation des produits par types.
* **Gestion des Utilisateurs** : Inscription et connexion (si authentification implémentée).
* **Panier / Commandes** : Gestion du processus d'achat.

##  Technologies Utilisées

* **Backend** : Node.js avec Express.js (ou framework similaire).
* **Base de données** : MongoDB / PostgreSQL / MySQL (à adapter selon ton choix).
* **Authentification** : JWT (JSON Web Tokens) - *si applicable*.
* **Documentation** : Swagger (optionnel).

##  Prérequis

Avant de commencer, assurez-vous d'avoir installé :

* [Node.js](https://www.google.com/search?q=https://nodejs.org/) (v14 ou supérieure)
* [npm](https://www.google.com/search?q=https://www.npmjs.com/) ou [yarn](https://www.google.com/search?q=https://yarnpkg.com/)
* Une instance de base de données active.

##  Installation et Configuration

1. **Cloner le projet**
```bash
git clone https://github.com/Redgakill/Tp_Store_API.git
cd Tp_Store_API

```


2. **Installer les dépendances**
```bash
npm install

```


3. **Configuration de l'environnement**
   Créez un fichier `.env` à la racine du projet et configurez vos variables :
```env
PORT=3000
DATABASE_URL=votre_lien_de_connexion
JWT_SECRET=votre_cle_secrete

```


4. **Lancer l'application**
```bash
# Mode production
npm start

# Mode développement (avec auto-reload)
npm run dev

```



##  Points de terminaison (Endpoints) principaux

| Méthode | Chemin | Description                           |
|-|-|---------------------------------------|
| GET     | `/article` | Récupérer tous les articles           |
| GET     | `/article/{id}` | Récupérer un article spécifique       |
| DELETE  | `/delete/{id}` | Supprimer un article                  |
| POST    | `/save` | Ajouter un nouveau article / Modifier |


