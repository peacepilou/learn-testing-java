# Exercices de Tests Unitaires (JUnit + Java)

Tu as plusieurs algos déjà écrits. Ton objectif va être d'en écrire les tests unitaires.


---

## Algo 1 – GuidedSum
Consignes de test : 
1.  Tester un cas classique : safeAdd(2, 3) doit retourner 5
2.	Tester un cas limite sans overflow : safeAdd(Integer.MAX_VALUE - 1, 1)
3.	Tester un cas d’overflow attendu → exception
4.	Tester avec des entiers négatifs

## Algo 2 – GuidedValidator
Consignes de tests :
1.	Un e-mail classique (toto@test.com) est valide
2.	Un e-mail sans @ est invalide
3.	Un e-mail sans domaine (toto@) est invalide
4.	Une chaîne vide ou null est invalide
5.	Un e-mail avec domaine incorrect (toto@.com) est invalide

##  Algo 3 – UnguidedFizzBuzz
À toi de réfléchir : quels cas doivent être testés pour valider cet algo ?

##  Algo 4 – UnguidedDateUtils
À toi de réfléchir : quels cas doivent être testés pour valider cet algo ?

## Algo 5 - PasswordStrength (TDD)
En TDD, tu vas devoir implémenter un code de prod.

Voici les spécifications : 
1. Si le mot de passe est trop court (moins de 6 caractères), retourner "WEAK".
2. Si le mot de passe contient uniquement des lettres, retourner "WEAK".
3. Si le mot de passe contient des lettres et des chiffres, retourner "MEDIUM".
4. Si le mot de passe contient des lettres, des chiffres et des caractères spéciaux, retourner "STRONG".
5. Si le mot de passe est vide ou null, retourner "INVALID".
6. Si le mot de passe contient des espaces, les ignorer dans l'évaluation.
7. Si le mot de passe contient des caractères non imprimables, retourner "INVALID".
8. Si le mot de passe dépasse une longueur maximale (par exemple, 128 caractères), retourner "INVALID".

