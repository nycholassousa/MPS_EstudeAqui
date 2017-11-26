package estudeaqui.model;

import estudeaqui.patterns.CommandRelatorio;
import com.gnostice.pdfone.PdfDocument;
import com.gnostice.pdfone.PdfException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RelatorioPDF implements CommandRelatorio {

    @Override
    public void exibirRelatorio(Relatorio relatorio) {
        PdfDocument doc = new PdfDocument();
        try {
            doc.writeText("Quantidade de Questoes respondidas: " + relatorio.getQtde_respondidas());
            doc.writeText("Quantidade de Acertos: " + relatorio.getQtde_acertos());
            doc.writeText("Quantidade de Erros: " + relatorio.getQtde_erros());
            // Write changes to output file
            doc.save("relatorio.pdf");
            doc.close();
        } catch (IOException | PdfException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
