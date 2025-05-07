# Tests unitaires en Java ☕️ 
Tu as plusieurs algos déjà écrits. Ton objectif va être d'en écrire les tests unitaires.

### Algo 1 : GuidedSum 
Consignes de tests :
1.	Tester un cas classique : safeAdd(2, 3) doit retourner 5
2.	Tester un cas limite sans overflow : safeAdd(Integer.MAX_VALUE - 1, 1)
3.	Tester un cas d’overflow attendu → exception
4.	Tester des entiers négatifs

### Algo 2 – EmailValidator
Consignes de tests :
1.	Tester un email valide classique
2.	Tester un email sans @
3.	Tester un email vide ou null
4.	Tester un domaine invalide


### Algo 3 – FizzBuzz 
Consignes de tests : à toi de savoir quoi écrire afin de bien tester ton algo !

### Algo 4 - DateUtils
Consignes de tests : à toi de savoir quoi écrire afin de bien tester ton algo !

### Algo 5 - TDD : PasswordStrength (à écrire en TDD)
Ici tu vas t'introduire gentiment au TDD. Tu dois :
1.	Lire 3 tests déjà présents
2.	Écrire le code métier minimal pour les faire passer
3.	Ajouter des tests complémentaires
4.	Évoluer le code par petits pas selon la logique TDD

Pour démarrer : tu dois écrire la méthode `evaluate(String password)` dans la classe `Algo5_PasswordStrength` pour faire passer ces 3 tests. Tu ne peux écrire que **le strict minimum** de code pour qu’ils passent

Étapes d’évolution proposées ensuite :
1.	Ajouter un test avec majuscules et chiffres → attente "STRONG"
2.	Ajouter un test avec caractères spéciaux → attente "VERY_STRONG"
3.	Ajouter un test avec 12+ caractères bien composés → "ULTRA_STRONG"

⚠️ Chaque test précède l’ajout du code correspondant. C'est la philosophie du TDD. Tu laisses ton code métier être guidé par tes tests. Tu travailles serein ! 🤓

