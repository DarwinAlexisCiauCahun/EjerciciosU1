hombre(fabricio).
hombre(gustavo).
hombre(roberto).
hombre(andres).

espadre(fabricio,gustavo).
espadre(gustavo,roberto).
espadre(roberto,andres).

esabuelo(X,Y):-
espadre(X,A),espadre(A,Y).
