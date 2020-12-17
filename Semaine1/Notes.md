- Une **Turtle** a un **nom** et peut être utilisée comme cible de plusieurs **Action** :

    - **Forward** (avec une longueur entière donnée)
    - **Rotate** (avec un angle de float donné)
    - **SetPen** (peut être l'un de UP ou DOWN) 
- Une **Choreography** est définie comme une séquence d'actions exécutées par la tortue.
- Une collection de tortues vit à l'intérieur d'une **Farm** nommée.
- Les **Turtle** jouent des **Choreography(ies)** sur une scène (**Stage**)
  - Avec une dimension donnée (height et width)
  - Il peut contenir plusieurs **Choreography(ies)**.
  - Les **Farm** sont partagées sur différentes **Stage**.
  - Une **Stage** peut être affichée à l'écran en exécutant une opération d'affichage **display**.
- Une **Color** est définie comme une combinaison de canaux rouge, vert et bleu ([0-255]), et un canal alpha.
  - Une **Stage** définit une **Color** d'arrière-plan
  - Une espèce évoluée de tortue (appelée tortue colorée **ColouredTurtle**) apporte une **Color**.


Dans la question 11 de l'exo1, quand vous dites "Pour comprendre le résultat de la question ??", le "??" est fait exprès ou c'est une erreur ? 