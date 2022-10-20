package markup;

import java.util.List;

abstract class Layout {
    protected String symbol;
    protected List<Markdown> elements;
    protected Layout(List<Markdown> elements) {
        this.elements = elements;
    }
    protected void toMarkdown(StringBuilder stringBuilder) {
        stringBuilder.append(symbol);
        for (Markdown elem : elements) {
            elem.toMarkdown(stringBuilder);
        }
        stringBuilder.append(symbol);
    }

}
