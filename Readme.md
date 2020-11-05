# Atividade Prática de POO

A atividade proposta aqui explora os conceitos iniciais trabalhados em sala de aula,
como Classe,Método, Objeto, Instância, Visibilidade e Herança. Todo o código deve ser
comentado e respeitaras boas práticas e o paradigma OO também discutido em aula.

A descrição abaixo não foi implementada até este momento. Pode ser que, eventualmente, falte
alguma definição relevante ou o código apresentado tenha algum erro. Utilize seu conhecimento,
bom senso e o Google para resolver problemas como estes.

Leia até o fim para entender o que está sendo proposto.

Implemente uma classe principal, tal como mostrado abaixo:

    public class EstruturasDeDadosLineares {
        public static void main(String[] args) {
        }
    }

O método main da classe mostrada acima deve realizar a instanciação e os devidos testes de
funcionamento das classes Filas e Pilhas, que devem ser implementadas com os seguintes métodos:

# Filas

    • int enqueue(Nodo n): insere um novo elemento na fila, retornando 0 em caso de erro, 1
    se OK.
    • int dequeue(): retira um elemento da fila, retornando null em caso de erro e o Nodo se
    OK;

# Pilhas

    • int push(Nodo n): insere um novo elemento na pilha, retornando 0 em caso de erro, 1 se
    OK.
    • Nodo pop(): retira um elemento da pilha, retornando null em caso de erro e o Nodo se
    OK;

As duas classes mencionadas acima devem ser subclasses da classe Lista, esta última deve conter os
seguintes métodos:

    • int insert(int posicao, Nodo n): insere um novo elemento na posicao apropriada e retorna
    0 em caso de erro, 1 se OK.
    • Nodo get(int posicao): retorna o Nodo para o elemento da lista de ordem posicao (ou
    NULL);
    • int delete(int posicao): apaga elemento em posicao, retornando 0 em caso de erro e 1 se
    OK;
    • int length(): retorna o comprimento da lista;

Os métodos insert e get da Lista devem ser usados pelas subclasses para a implementação de seus
métodos. Atenção: as subclasses não podem permitir o acesso aos métodos insert, delete e get da
superclasse Lista! 

Além disso, a classe Lista possui dois atributos: int tamanho e Vector elementos, que contém o
tamanho da lista e um vetor com os seus nodos, respectivamente. Esses atributos devem ser usados
nas subclasses.

Os nodos usados nas classes descritas até aqui utilizam a classe Nodo, mostrada abaixo:

    public class Nodo {
        //IMPLEMENTAR
    }

Bom trabalho!