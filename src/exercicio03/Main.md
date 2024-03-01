public A() { ... } em A:

Isso é um construtor. Não há sobrecarga ou sobrescrita aqui, pois os construtores não são herdados. Cada classe tem seus próprios construtores.
public A( int x ) { ... } em A:

Isso é uma sobrecarga de construtores na classe A, pois há um construtor adicional com um parâmetro int.
public void m1() { ... } em A:

Isso é um método na classe A.
public void m1(int h) { ... } em A:

Isso é uma sobrecarga do método m1 na classe A, pois há um método adicional com um parâmetro int.
public B() { ... } em B:

Isso é um construtor na classe B.
public void m1() { ... } em B:

Isso é uma sobrescrita do método m1 na classe B. A assinatura é a mesma que o método m1 em A, indicando uma substituição do comportamento.
public void m1( double x, double y) { ... } em B:

Isso é uma sobrecarga do método m1 na classe B, pois há um método adicional com dois parâmetros double.
public void m2() { ... } em B:

Isso é um método na classe B.
A linha public void m1( double x, double y) { ... } em B é um exemplo de sobrecarga. Isso ocorre porque o método m1 na classe B tem uma lista de parâmetros diferente do método m1 correspondente na classe A. Em sobrescrita, os métodos têm a mesma assinatura, mas na sobrecarga, os métodos têm assinaturas diferentes.