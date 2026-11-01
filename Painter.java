public class Painter extends Fields {
    public static String formatClickMessage() {
        int colorIndex = 0;
        formattedBalance = dollarFormatter.format(balance);
        StringBuilder formattedText = new StringBuilder(mainPrefix + moneyPerClick + " (" + currency.get() + formattedBalance + " Total)\n");
        StringBuilder formattedTextColors = new StringBuilder();
        if (colorType.equals("Single")) {
            formattedText.insert(0, selectedColor);
            formattedTextColors.append(formattedText);
        } else if (colorType.equals("Multi")) {
            for (int i = 0; i < formattedText.length(); i++) {
                if (formattedText.charAt(i) != ' ') {
                    formattedTextColors.append(selectedColorScheme[colorIndex % selectedColorScheme.length]);
                    colorIndex++;
                }
                formattedTextColors.append(formattedText.charAt(i));
            }

        }
        selectedColorScheme = FIRE;
        formattedTextColors.insert(0, selectedFonts);
        formattedTextColors.append(RESET);
        return String.valueOf(formattedTextColors);

    }
}
