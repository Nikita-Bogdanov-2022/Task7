package markup;

import java.util.List;

public class Emphasis extends Layout implements Markdown {

    protected Emphasis(List<Markdown> elements) {
        super(elements);
        symbol = "*";
    }

    @Override
    public void toMarkdown(StringBuilder stringBuilder) {
        super.toMarkdown(stringBuilder);
    }
}
