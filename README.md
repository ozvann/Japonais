# Kanji Trainer
**Un outil en ligne de commande pour apprendre les kanji japonais.**

Ce projet est une application Java personnelle conçue pour m'aider à réviser les kanji japonais directement dans mon terminal Linux. L'objectif est de **créer une routine d'apprentissage automatique** à chaque ouverture de terminal, avec un suivi des progrès et des exercices adaptés.

---

## 🎯 Objectifs Principaux
1. **Afficher un kanji aléatoire** avec sa lecture et sa traduction.
2. **Demander à l'utilisateur** de saisir la réponse (traduction ou lecture).
3. **Vérifier la réponse** et fournir un feedback (correct/incorrect).
4. **Sauvegarder les statistiques** pour suivre les progrès.
5. **Lancer automatiquement** l'application à l'ouverture du terminal.

---

## 📌 Fonctionnalités Planifiées
### Phase 1 : Version Minimale (CLI)
- [ ] Charger les kanji depuis un fichier `kanji.csv`.
- [ ] Afficher un kanji aléatoire avec sa lecture et sa traduction.
- [ ] Demander une réponse à l'utilisateur et vérifier sa validité.
- [ ] Sauvegarder les statistiques dans un fichier `stats.json`.
- [ ] Intégrer l'application au terminal Linux via un alias ou un script.

### Phase 2 : Améliorations
- [ ] Ajouter des **couleurs** dans le terminal (avec Jansi).
- [ ] Implémenter un **mode révision ciblée** (kanji mal maîtrisés).
- [ ] Afficher des **exemples de phrases** pour chaque kanji.
- [ ] Ajouter un **système de niveaux** (par grade de kanji).

### Phase 3 : Optionnelle (GUI)
- [ ] Créer une interface graphique avec JavaFX.
- [ ] Afficher des **images** (ordre des traits pour écrire les kanji).
- [ ] Ajouter des **exercices interactifs** (glisser-déposer, quiz à choix multiples).

---

## 📂 Structure du Projet

