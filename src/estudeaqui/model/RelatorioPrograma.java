package estudeaqui.model;

import estudeaqui.patterns.CommandRelatorio;

public class RelatorioPrograma implements CommandRelatorio {

    @Override
    public void exibirRelatorio(Relatorio relatorio) {
        System.out.println("Quantidade de Questoes Respondidas: " + relatorio.getQtde_respondidas());
        System.out.println("Quantidade de Acertos: " + relatorio.getQtde_acertos());
        System.out.println("Quantidade de Erros: " + relatorio.getQtde_erros());
    }

}
