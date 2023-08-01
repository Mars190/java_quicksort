# java_quicksort

# Start
i = 1. Iterator; j = 2. Iterator; p = Pivot;\
p startet ganz hinten (länge - 1); i startet index 0; j startet index p - 1\

# Vorgehen
i läuft nach rechts, bis zahl > p\
j läuft nach links, bis zahl < p\
Wenn i, j jeweils Zahl gefunden tauschen die Zahlen ihren Platz\
Weiter bis Überkreuzung, iterierung zuende\

# Besonderes
wenn i & j sich gekreuzt haben = iterierung ende -> check ob [i] > [p], dann plätze tauschen\
pivot nach iterierung = sortiert\
einzelnes element in der teilliste = sortiert\
