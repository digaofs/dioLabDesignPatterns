# Design patterns com java / spring - Exemplo de algumas aplicações através de endpoints de geração de cartão virtual

## Proposta da aplicação
Os endpoints disponibilizados permitem a manipulação de duas entidades:  
**Person** - representa uma pessoa  
**Card** - representa um cartão virtual, contendo a pessoa que é dona do mesmo, uma imagem baseada no animal favorito dessa pessoa e uma frase aleatória

Um card é pedido baseado no id de person, previamente cadastrado. Se um card for pedido duas vezes para o mesmo id, será sobrescrito no banco, com uma nova imagem aleatória, baseada no animal favorito de person.

## Patterns aplicados:

**Singleton** em injeções Autowired do spring  
**Iterator** através da interface Iterable do java, presente nos controllers
**Strategy** em CardService, ao usar getImageUrl, de interface genérica que chama diferentes endpoints dependendo do animal favorito de person

### TODOS conhecidos
- Possibilidade de inclusão de mais de um card por person
- Atualização de person
- Quote está hardcoded "Uma frase bonita", deveria bater em outra API com frases motivacionais  
- Forma de seleção de interfaces usando o próprio spring para obter o bean correto, ao invés de usar um switch case no valor armazenado em person