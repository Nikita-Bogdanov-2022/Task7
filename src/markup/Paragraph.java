package markup;

import java.util.List;

public class Paragraph extends Layout implements Markdown {

    protected Paragraph(List<Markdown> elements) {
        super(elements);
        symbol = "";
    }

    @Override
    public void toMarkdown(StringBuilder stringBuilder) {
        super.toMarkdown(stringBuilder);
    }
}
