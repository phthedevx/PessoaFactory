import java.util.ArrayList;
import java.util.List;

public class PessoaFactory {
    private final List<Pessoa> pessoasCriadas;

    public PessoaFactory() {
        this.pessoasCriadas = new ArrayList<>();
    }

    public Pessoa criarPessoa(String nome, int idade) {
        int novoId = pessoasCriadas.size(); // calcula o ID baseado no tamanho da lista
        Pessoa p = new Pessoa(novoId, nome, idade);
        pessoasCriadas.add(p);
        return p;
    }
}
