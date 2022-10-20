package markup;

import java.util.List;

public class Strikeout extends Layout implements Markdown {

    protected Strikeout(List<Markdown> elements) {
        super(elements);
        symbol = "~";
    }

    @Override
    public void toMarkdown(StringBuilder stringBuilder) {
        super.toMarkdown(stringBuilder);
    }
}
