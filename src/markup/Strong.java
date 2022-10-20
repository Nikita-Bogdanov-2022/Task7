package markup;

import java.util.List;

public class Strong extends Layout implements Markdown {

    protected Strong(List<Markdown> elements) {
        super(elements);
        symbol = "__";
    }

    @Override
    public void toMarkdown(StringBuilder stringBuilder) {
        super.toMarkdown(stringBuilder);
    }
}
