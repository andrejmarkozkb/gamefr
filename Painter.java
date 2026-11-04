package ClickerGame;

public class Painter extends Fields {
    public static String formatClickMessage() {
        int colorIndex = 0;
        formattedBalance = dollarFormatter.format((double) balance.get() / 100);
        StringBuilder formattedText = new StringBuilder(mainPrefix + currency.get() + (int) moneyPerClick / 100 + " [+" + comboAddTo * comboMultiplier + "% BONUS!] " + "│ " + comboCounter + "x COMBO!" + " │ (" + currency.get() + formattedBalance + " Total)\n");
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
                formattedTextColors.append(formattedText.charAt(i)).append(RESET);
            }

        }
        selectedColorScheme = FIRE;
        formattedTextColors.insert(0, selectedFonts);
        formattedTextColors.append(RESET);
        return String.valueOf(formattedTextColors);

    }
}
