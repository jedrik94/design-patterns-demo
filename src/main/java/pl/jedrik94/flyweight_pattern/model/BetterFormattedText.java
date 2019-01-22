package pl.jedrik94.flyweight_pattern.model;

import java.util.ArrayList;
import java.util.List;

public class BetterFormattedText {
    private String plainText;
    private List<TextRange> formatting = new ArrayList<>();

    public BetterFormattedText(String plainText) {
        this.plainText = plainText;
    }

    public TextRange getRange(int start, int end) {
        TextRange range = new TextRange(start, end);
        formatting.add(range);
        return range;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < plainText.length(); i++) {

            char c = plainText.charAt(i);
            for (TextRange range : formatting) {
                if (range.covers(i)) {
                    if (range.isCapitalize()) {
                        c = Character.toUpperCase(c);
                    }
                    if (range.isItalic()) {
                        c = c;
                    }
                    if (range.isBold()) {
                        c = c;
                    }
                }
            }
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }

    public class TextRange {
        private int start, end;
        private boolean capitalize, italic, bold;

        private TextRange(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean isCapitalize() {
            return capitalize;
        }

        public void setCapitalize(boolean capitalize) {
            this.capitalize = capitalize;
        }

        public boolean isItalic() {
            return italic;
        }

        public void setItalic(boolean italic) {
            this.italic = italic;
        }

        public boolean isBold() {
            return bold;
        }

        public void setBold(boolean bold) {
            this.bold = bold;
        }

        public boolean covers(int position) {
            return position >= start && position <= end;
        }
    }
}
